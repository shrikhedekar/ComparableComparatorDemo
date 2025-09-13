package com.comparablecomparatordemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

// This class covers primitive data type sorting
public class PrimitiveSorting {

    public static void main(String [] args) {

        int [] intArray = {7,5,8,1,19};
        char [] strArray = {'e','o','a','u','i'};

        System.out.println("Original Array :"+Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Array :"+ Arrays.toString(intArray));

        System.out.println("Original Array :"+Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted Array :"+ Arrays.toString(strArray));

    }

}
