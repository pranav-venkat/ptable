package com.example.table;

import java.util.Random;

public class random_pair {

    public static int[] random_pair(int max, int min){

        Random rand = new Random();

        int rn= rand.nextInt((max - min) + 1) + min;
         int rn2 = rand.nextInt((max - min) + 1) + min;
         int rn3 = rand.nextInt((max - min) + 1) + min;
         int rn4 = rand.nextInt((max - min) + 1) + min;


             while (rn == rn2 ){
                 rn2 = rand.nextInt((max - min) + 1)+ min;
             }
            while (rn == rn3 ){
            rn3 = rand.nextInt((max - min) + 1)+ min;
            }
            while (rn == rn4 ){
            rn4 = rand.nextInt((max - min) + 1)+ min;
            }
            while (rn2 == rn3 ){
            rn3 = rand.nextInt((max - min) + 1)+ min;
            }
            while (rn2 == rn4 ){
            rn4 = rand.nextInt((max - min) + 1)+ min;
            }
            while (rn3 == rn4 ){
            rn4 = rand.nextInt((max - min) + 1)+ min;
            }


          int[] pair = {rn, rn2, rn3, rn4};
         return pair;
    }


}
