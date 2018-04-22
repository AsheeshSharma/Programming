package com.company;

import static sun.swing.MenuItemLayoutHelper.max;

public class LargestContiguosSum {
    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = -2;
        arr[1] = -3;
        arr[2] = 4;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 1;
        arr[6] = 5;
        arr[7] = -3;
        LargestSum(arr);
    }
    private static void LargestSum(int arr[]) {
        int n = arr.length;
        int max_so_far = arr[0];
        int cur_max = arr[0];
        for(int i = 1; i < n; i++) {
            cur_max = max(arr[i], arr[i] + cur_max);
            max_so_far = max(max_so_far, cur_max);
        }
        System.out.println(max_so_far);
    }
}
