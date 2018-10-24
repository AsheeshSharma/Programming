package com.company;

import java.util.Scanner;

public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int m = s.length();
        int n = p.length();

        while(i < m && j < n) {
            if((s.charAt(i) == s.charAt(j)) || p.charAt(i) == '?') {
                i++;
                j++;
                continue;
            }
            if(p.charAt(j) == '*') {
                if(p.charAt(j + 1) == s.charAt(i)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        }

        if(i == m && j == n) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        isMatch(a,b);
    }
}