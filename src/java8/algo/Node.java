package java8.algo;

import com.sun.istack.internal.*;

import java.util.*;
import java.util.stream.*;

/**
 * Binary Tree Node
 */
public class Node {
    private Node left;
    private Node right;
    private String label;

    public Node(@Nullable Node left, @Nullable Node right, @NotNull String label) {
        this.left = left;
        this.right = right;
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public List<Node> getChildren() {
        return Stream.of(left, right)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public List<Node> searchByDepth() {
        List<Node> visitedNodes = new LinkedList<>();
        List<Node> unvisitedNodes = new LinkedList<>();
        unvisitedNodes.add(this);

        while (!unvisitedNodes.isEmpty()) {
            Node currentNode = unvisitedNodes.remove(0);

            List<Node> newNodes = currentNode.getChildren()
                    .stream()
                    .filter(node -> !visitedNodes.contains(node))
                    .collect(Collectors.toList());

            unvisitedNodes.addAll(newNodes);
            visitedNodes.add(currentNode);
        }

        return visitedNodes;
    }

    public List<Node> searchNyBreadth() {
        List<Node> visitedNodes = new LinkedList<>();
        List<Node> unvisitedNodes = Arrays.asList(this);

        while (!unvisitedNodes.isEmpty()) {
            List<Node> newNodes = unvisitedNodes
                    .stream()
                    .map(node -> node.getChildren()) // Or .map(Node::getChildren)
                    .flatMap(List::stream)
                    .filter(node -> !visitedNodes.contains(node))
                    .collect(Collectors.toList());

            visitedNodes.addAll(unvisitedNodes);
            unvisitedNodes = newNodes;
        }
        return visitedNodes;
    }
}
