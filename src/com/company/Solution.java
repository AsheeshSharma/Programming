package com.company;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int sum = 0;
        int i = 0, j = 0;
        boolean traverse = true;
        while(i < a.length && j < b.length && traverse) {
            sum = sum + Math.min(a[i], b[j]);
            if(sum > x) {
                sum = sum - Math.min(a[i], b[j]);
                traverse = false;
            }
            i = i + 1;
            j = j + 1;
        }
        if(traverse && i < a.length) {
            sum = sum + a[i];
            if(sum > x) {
                sum = sum - a[i];
                traverse = false;
            }
            i = i + 1;
        }
        if(traverse && j < b.length) {
            sum = sum + b[j];
            if(sum > x) {
                sum = sum - b[j];
                traverse = false;
            }
            j = j + 1;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
