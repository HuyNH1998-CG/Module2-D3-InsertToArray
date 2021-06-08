package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        System.out.println("Input X to add");
        int X = input.nextInt();
        System.out.println("Input Index to add to");
        int index = input.nextInt();
        if (index >= array.length - 1) {
            System.out.println("Can't");
        }
//        for (int i = array.length-1; i > index; i--) {
//            array[i] = array[i-1];
//        }
        if (array.length - 1 - index >= 0) System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
        array[index] = X;
        for (int i : array) {
            System.out.println(i);
        }
    }
}
