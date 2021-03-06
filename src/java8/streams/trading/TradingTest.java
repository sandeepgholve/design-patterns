package java8.streams.trading;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sgholve on 9/25/15.
 */
public class TradingTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // #1: Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("#1: Find all transactions in the year 2011 and sort them by value (small to high).");
        transactions
                .stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");

        // #2: What are all the unique cities where the traders work?
        System.out.println("#2: What are all the unique cities where the traders work?");
        Arrays.asList(raoul, mario, alan, brian)
                .stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");

        // #3: Find all traders from Cambridge and sort them by name.
        System.out.println("#3: Find all traders from Cambridge and sort them by name.");
        Arrays.asList(raoul, mario, alan, brian)
                .stream()
                .filter(t -> t.getCity().equalsIgnoreCase("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");

        // #4: Return a string of all traders’ names sorted alphabetically.
        System.out.println("#4: Return a string of all traders’ names sorted alphabetically.");
        Arrays.asList(raoul, mario, alan, brian)
                .stream()
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");

        // #5: Are any traders based in Milan?
        System.out.println("#5: Are any traders based in Milan? = " +
                Arrays.asList(raoul, mario, alan, brian)
                        .stream()
                        .anyMatch(t -> t.getCity().equalsIgnoreCase("Milan")));
        System.out.println("----------------------------------------------------------------------------------");

        // #6: Print all transactions’ values from the traders living in Cambridge.
        System.out.println("#6: Print all transactions’ values from the traders living in Cambridge.");
        System.out.println("----------------------------------------------------------------------------------");

        // #7: What’s the highest value of all the transactions?
        System.out.println("#7: What’s the highest value of all the transactions?");
        System.out.println("----------------------------------------------------------------------------------");

        // #8: Find the transaction with the smallest value.
        System.out.println("#8: Find the transaction with the smallest value.");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
