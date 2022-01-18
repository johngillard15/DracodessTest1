package com.careerdevs;

import com.careerdevs.bst.BinaryTree;
import com.careerdevs.car.HondaCity;
import com.careerdevs.car.InnovaCrysta;
import com.careerdevs.car.WagonR;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Last and Second-Last");
        Solutions.lastAndSecondLast("APPLE");

        System.out.println("\nFizzBuzz");
        Solutions.fizzBuzz(15);

        System.out.println("\nCounting Closed Paths");
        Solutions.closedPaths(649578);

        System.out.println("\nValid Email Addresses");
        Solutions.validEmailAddress("julia@hackerrank.com");
        Solutions.validEmailAddress("julia_@hackerrank.com");
        Solutions.validEmailAddress("julia_0@hackerrank.com");
        Solutions.validEmailAddress("julia0_@hackerrank.com");
        Solutions.validEmailAddress("julia@gmail.com");

        System.out.println("\nPrice Check");
        Solutions.priceCheck(
                new String[]{"eggs", "milk", "cheese"},
                new String[]{"2.89", "3.29", "5.79"},
                new String[]{"eggs", "eggs", "cheese", "milk"},
                new float[]{2.89f, 2.99f, 5.97f, 3.29f}
        );

        System.out.println("\nPoints and Lines");
        Solutions.pointsAndLines(
                4,
                new int[][]{
                        {3, 8, 13, 4},
                        {8, 4, 3, 12},
                        {-7, -4, 17, 6},
                        {7, 3, 1, 2}
                },
                new int[]{8, 4}
        );

        System.out.println("\nConnected Groups");
        Solutions.connectedGroups(
                new ArrayList<>() {
                    {
                        add("1100");
                        add("1110");
                        add("0110");
                        add("0001");
                    }
                }
        );
        Solutions.connectedGroups(
                new ArrayList<>() {
                    {
                        add("10000");
                        add("01000");
                        add("00100");
                        add("00010");
                        add("00001");
                    }
                }
        );

        System.out.println("\nCar Inheritance");
        System.out.println(new WagonR(22));
        System.out.println(new HondaCity(31));
        System.out.println(new InnovaCrysta(17));

        System.out.println("\nBinary Tree Search");

        int[] values = new int[]{20, 10, 30, 8, 12, 25, 40, 6, 11, 13, 23};
        BinaryTree bt = new BinaryTree();
        for (int value : values) bt.add(value);

        Solutions.binaryTreeSearch(bt.root, new int[]{30, 10, 12, 15});
    }
}
