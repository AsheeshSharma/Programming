package com.company;

import java.util.*;

// ABEF CADE
public class CommonSubsequence {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        for(int i = 0; i < n; i++) {
            String a, b;
            a = scanner.nextLine();
            b = scanner.nextLine();
            boolean isSub = false;
            Set<Character> set = new HashSet<Character>();
            for(Character c : a.toCharArray()) {
                set.add(c);
            }
            for(Character c : b.toCharArray()) {
                if(set.contains(c)) {
                    System.out.println(1);
                    isSub = true;
                    break;
                }
            }
            if(!isSub){
                System.out.println(0);
            }
        }
    }
}
