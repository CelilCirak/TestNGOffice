package com.testNGOfis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Q01DenemeArray {

    public static void main(String[] args) {



        int[] arr1 = {65, 73, 27, 40, 82, 38, 4};
        int[] arr = {9, 25, 83, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);

        int sum = arr[arr.length-1] + arr[0];
        System.out.println(sum);

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        int dif = arr1[arr1.length-1] - arr1[0];
        System.out.println(dif);
    }


}