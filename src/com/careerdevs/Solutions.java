package com.careerdevs;

import com.careerdevs.bst.Node;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solutions {

    public static void lastAndSecondLast(String str){
        String newStr = str.charAt(str.length() - 1) + " " + str.charAt(str.length() - 2);
        System.out.println(newStr);
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= 15; i++){
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public static void closedPaths(int number){
        int closedPaths = 0;

        do{
            int digit = number % 10;

            closedPaths += switch (digit) {
                case 0, 4, 6, 9 -> 1;
                case 8 -> 2;
                default -> 0;
            };

            number /= 10;
        }while(number > 0);

        System.out.println(closedPaths);
    }

    public static void validEmailAddress(String email){
        Pattern regex = Pattern.compile("[a-z]{1,6}_*\\d{0,4}@hackerrank.com");
        Matcher matcher = regex.matcher(email);

        System.out.println(matcher.matches());
    }

    public static void priceCheck(String[] products, String[] productPrices, String[] productsSold, float[] soldPrice){
        int errors = 0;

        for(int i = 0; i < productsSold.length; i++){
            int iProduct = Arrays.asList(products).indexOf(productsSold[i]);

            if(soldPrice[i] != Float.parseFloat(productPrices[iProduct]))
                errors++;

        }

        System.out.println(errors);
    }

    public static void pointsAndLines(int n, int[][] lines, int[] start){
        int longestLine = 0;
        List<int[]> lineMatches = new ArrayList<>();

        for(int[] line : lines){
            int lineLength =
                    (int) Math.sqrt( (line[2] - line[0])*(line[2] - line[0]) + (line[3] - line[1])*(line[3] - line[1]) );

            if(lineLength > longestLine)
                longestLine = lineLength;

            if(line[0] == start[0] && line[1] == start[1])
                lineMatches.add(line);
        }

        System.out.println("Longest line: " + longestLine);
        System.out.println("Lines that start from (" + start[0] + ", " + start[1] + "):");
        for(int[] line : lineMatches){
            System.out.printf("Start: (%d, %d) End: (%d, %d)", start[0], start[1], line[2], line[3]);
        }
    }

    public static void connectedGroups(List<String> related){
        int groups = 0;
        Set<Integer> peopleVisited = new HashSet<>();

        for(int person = 0; person < related.size(); person++){
            if(!peopleVisited.contains(person)){
                groups++;
                checkRelations(related, person, peopleVisited);
            }
        }

        System.out.println("Groups: " + groups);
    }

    private static void checkRelations(List<String> related, int person, Set<Integer> peopleVisited){
        for(int friend = 0; friend < related.size(); friend++){
            if(related.get(person).charAt(friend) == '1' && !peopleVisited.contains(friend)){
                peopleVisited.add(friend);
                checkRelations(related, friend, peopleVisited); // changed from person to friend
            }
        }
    }

    public static void binaryTreeSearch(Node root, int[] val){
        for(int n : val)
            System.out.println(isPresent(root, n) ? 1 : 0);
    }

    private static boolean isPresent(Node node, int value){
        if(node == null)
            return false;

        if(node.value == value)
            return true;

        return value < node.value ? isPresent(node.left, value) : isPresent(node.right, value);
    }
}
