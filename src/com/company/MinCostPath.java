package com.company;

import static java.lang.Integer.min;

public class MinCostPath {
    public static void main(String[] args) {
        minCost();
    }
    private static void minCost() {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};


        // To reach at position 2,2

        int temp[][] = new int[3][3];
        temp[0][0] = cost[0][0];
        for(int i = 1 ; i<= 2; i++) {
            temp[i][0] = temp[i-1][0] + cost[i][0];
        }
        for(int j = 1; j <= 2; j++) {
            temp[0][j] = temp[0][j - 1] + cost[0][j];
        }

        for(int i = 1; i <= 2; i++) {
            for(int j = 1; j <= 2; j++){
                temp[i][j] = min(temp[i - 1][j - 1], min(temp[i-1][j], temp[i][j - 1])) + cost[i][j];
            }
        }

        System.out.println(temp[2][2]);
    }
}
