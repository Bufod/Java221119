package com.company;

import java.util.Scanner;

public class Main {

    public static int[] remove(int[] arr, int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num) {
                count++;
            }
        int[] arr2 = new int[arr.length-count];
        for(int i = 0, j = 0; i < arr.length; i++)
            if (arr[i] != num) {
                arr2[j] = arr[i];
                j++;
            }
        return arr2;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        int del = in.nextInt();
        arr = remove(arr, del);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
