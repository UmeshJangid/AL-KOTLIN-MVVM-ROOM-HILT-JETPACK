package com.samplekmmuj.mysamplekotlincoroutines;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        int value =sockMerchant(9,integers);
        System.out.println("args = " + value);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int counter = 0; // For pairs
        if(n>0 && ar.size()>0){
            for(int i=0;i<ar.size();i++){
                for(int j=i+1;j<ar.size();j++){
                    if(ar.get(i) == ar.get(j)){
                        counter+=1;
                    }else{
                        // Nothing to do.
                    }
                }
            }
            return counter;
        }else{
            return 0;
        }
    }
}
