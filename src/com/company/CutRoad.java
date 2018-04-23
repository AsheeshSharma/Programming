package com.company;

import static sun.swing.MenuItemLayoutHelper.max;

public class CutRoad {
    public static void main(String[] args) {

    }
    private static void cutRoad(int price[],int n) {
        int val[] = new int[n + 1];
        val[0] = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1; i<= n; i++) {
            for(int j = 0; j < i; j++) {
                maxValue = max(maxValue, price[j] + val[i - j - 1]);
            }
            val[i] = maxValue;
        }
        System.out.println(val[n]);
    }
}
