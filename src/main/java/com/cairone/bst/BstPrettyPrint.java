package com.cairone.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BstPrettyPrint {

    public static void prettyPrint(BstNode root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<BstNode> nodes = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();
        nodes.offer(root);
        levels.offer(1);

        int currentLevel = 1;
        while (!nodes.isEmpty()) {
            BstNode currentNode = nodes.poll();
            int level = levels.poll();

            if (level > currentLevel) {
                System.out.println();
                currentLevel = level;
            }

            System.out.print(currentNode.getValue() + " ");

            if (currentNode.getLeftNode() != null) {
                nodes.offer(currentNode.getLeftNode());
                levels.offer(level + 1);
            }
            if (currentNode.getRightNode() != null) {
                nodes.offer(currentNode.getRightNode());
                levels.offer(level + 1);
            }
        }
        System.out.println();
    }
}
