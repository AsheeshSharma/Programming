package com.company;

import static sun.swing.MenuItemLayoutHelper.max;

public class LongestRepeatedDP {
    public static void main(String[] args) {
        longestRepeated("AABEBCDD","AABEBCDD");
    }
    private static void longestRepeated(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int longestDP[][] = new int[n + 1][m + 1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j<= m; j++) {
                    longestDP[i][j] = 0;
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if (text.charAt(i - 1) == pattern.charAt(j - 1) && i!= j) {
                    longestDP[i][j] = 1 + longestDP[i - 1][j - 1];
                }else {
                    longestDP[i][j] = max(longestDP[i-1][j], longestDP[i][j - 1]);
                }
            }
        }
        int i = n;
        int j = m;
        StringBuilder res = new StringBuilder();
        while(i > 0 && j > 0) {
            if(longestDP[i][j] == longestDP[i - 1][j-1] + 1) {
                res.append(text.charAt(i - 1));
                i--;
                j--;
            }else if(longestDP[i][j] == longestDP[i - 1][j]) {
                i--;
            }else {
                j--;
            }
        }
        // Reverse required
        System.out.println(res.toString());
    }
}
