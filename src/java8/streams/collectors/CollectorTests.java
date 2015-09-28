package java8.streams.collectors;

import java8.streams.food.Dish;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * Created by sgholve on 9/28/15.
 */
public class CollectorTests {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishMenu();

        // Count the number of Dishes in the menu for each type, by passing the counting
        // collector as a second argument to the groupingBy collector
        Map<Dish.Type, Long> typeCounts =
                menu.stream()
                .collect(groupingBy(Dish::getType, counting()));
        System.out.println(typeCounts);

        // Find the highest-calorie dish in the menu, but now classified by the type of dish
        Map<Dish.Type, Optional<Dish>> mostCaloriesByType =
                menu.stream()
                .collect(groupingBy(Dish::getType,
                        maxBy(Comparator.comparing(Dish::getCalories))));
        System.out.println(mostCaloriesByType);

        // Finding the highest-calorie Dish in each subgroup
        Map<Dish.Type, Dish> mostCaloriesByType1 =
                menu.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(
                                maxBy(Comparator.comparingInt(Dish::getCalories)),
                                Optional::get)));
        System.out.println(mostCaloriesByType1);

        // Sum the calories of all the dishes ain the menu, but this time for each group of Dishes:
        Map<Dish.Type, Integer> totalCaloriesByType =
                menu.stream().collect(groupingBy(Dish::getType,
                        summingInt(Dish::getCalories)));
        System.out.println(totalCaloriesByType);

        // Find out which CaloriesLevels are available in the menu for each type of Dish.
        Map<Dish.Type, Set<Dish.CaloricLevel>> caloriesLevelsByType =
                menu.stream().collect(
                        groupingBy(Dish::getType, mapping(
                                dish -> {
                                    if (dish.getCalories() <= 400)
                                        return Dish.CaloricLevel.DIET;
                                    else if (dish.getCalories() <= 700)
                                        return Dish.CaloricLevel.NORMAL;
                                    else
                                        return Dish.CaloricLevel.FAT;},
                                toSet() )));
        System.out.println(caloriesLevelsByType);

        // Partitioning: Partitioning the menu into vegetarian and nonvegetarian dishes:
        Map<Boolean,  List<Dish>> partitionedMenu =
                menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println("Veg Menu: " + partitionedMenu.get(true));
        System.out.println("Nonveg Menu: " + partitionedMenu.get(false));

        // Partitioning: Partitioning the menu into vegetarian and non-vegetarian dishes, and the group by types:
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegDishesByType =
                menu.stream().collect(partitioningBy(Dish::isVegetarian,
                        groupingBy(Dish::getType)));
        System.out.println("Veg Menu: " + vegDishesByType.get(true));
        System.out.println("Nonveg Menu: " + vegDishesByType.get(false));

        // Partitioning: Finding most caloric dish among both vegetarian and non-vegetarian dishes:
        Map<Boolean, Dish> mostCaloricPartitionedByVegNonVeg =
                menu.stream().collect(
                        partitioningBy(Dish::isVegetarian,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(Dish::getCalories)),
                                        Optional::get)));
        System.out.println("Most caloric Veg item: " + mostCaloricPartitionedByVegNonVeg.get(true));
        System.out.println("Most caloric Nonveg item: " + mostCaloricPartitionedByVegNonVeg.get(false));

        // Partitioning the numbers into the Prime and Non Prime
        Map<Boolean, List<Integer>> primeNums = partitionPrimes(50);
        System.out.println("Prime Numbers: " + primeNums.get(true));
        System.out.println("Non Prime Numbers: " + primeNums.get(false));

    }

    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(partitioningBy(candidate -> isPrime(candidate)));
    }
}
