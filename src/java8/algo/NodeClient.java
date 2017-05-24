package java8.algo;

import java.util.*;
import java.util.function.BiFunction;

/**
 * Testing BFS and DFS
 */
public class NodeClient {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sandeep", "Anita", "Aarohi", "Rihan");

        String greetings = names
                .stream()
                .map(name -> name + " ")
                .reduce("Welcome ", (acc, name) -> acc + name);
        System.out.println(greetings + "!");

        testBFSAndDFS();
    }

    private static void testBFSAndDFS() {
        // Rihan
        Node rihan =  new Node("Rihan");
        // Aarohi
        Node aarohi = new Node("Aarohi");
        // Anvi
        Node anvi = new Node("Anvi");
        // Sandeep parent of Rihan and Aarohi
        Node sandeep = new Node(aarohi, rihan, "Sandeep");
        // Milind parent of Rihan and Aarohi
        Node milind = new Node(anvi, null, "Milind");
        // Kundlik is parent of Sandeep and Milind
        Node kundlik = new Node(milind, sandeep, "Kundlik");
        // Nitin
        Node nitin = new Node("Nitin");
        // Sachin
        Node sachin = new Node("Sachin");
        // Mulidhar is parent of Nitin and Sachin
        Node murlidhar = new Node(nitin, sachin, "Murlidhar");
        // Ganpat is parent of Murlidhar and Kundlik
        Node ganpat = new Node(murlidhar, kundlik, "Ganpat");


        System.out.println("Seachy By Depth: " + ganpat.searchByDepth());
        System.out.println("Seachy By Breadth: " + ganpat.searchByBreadth());
    }
}
