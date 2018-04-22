package com.company;

import static java.lang.Integer.min;

public class BinomialDP {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        calculateBinomial(7, 3);
    }
    private static void calculateBinomial(int n, int k) {
        int ck[][] = new int[n + 1][k + 1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= min(i , k); j++) {
                if(j == 0 || j == i) {
                    ck[i][j] = 1;
                }else {
                    ck[i][j] = ck[i - 1][j - 1] + ck[i - 1][j];
                }
            }
        }
        System.out.println(ck[n][k]);
    }
}
