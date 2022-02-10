package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задание №1
        int [] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]+ " , " + weight[1]+ " , " + weight[2]);
        //2.
        float[] weights = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.println(weights[i]);
        }
        //3.
        float [] weigth = {1.233f, 2.33f, 4.111f,33f};
        for (int i = 0; i < 4; i++) {
            System.out.println(weigth[i]);
        }
        //Задание №2
        float [] weigths = {1,2,3,1.57f,7.654f,9.986f,1.233f, 2.33f, 4.111f,33f};
        for (int i = 0; i < weigths.length; i++) {
            System.out.print(weigths[0] + " , " + weigths[1] + " , " + weigths[2]);
            System.out.print(weigths[3] + " , " + weigths[4] + " , " + weigths[5]);
            System.out.print(weigths[6] + " , " + weigths[7] + " , " + weigths[8] + " , " + weigths[9]);
        //Задание №3
            System.out.print(weigths[2] + " , " + weigths[1] + " , " + weigths[0]);
            System.out.print(weigths[5] + " , " + weigths[4] + " , " + weigths[3]);
            System.out.print(weigths[9] + " , " + weigths[8] + " , " + weigths[7] + " , " + weigths[6]);
        }
        //Задание №4
        int [] number = new int[10];
        number[0] = 1+1;
        number[1] = 2;
        number[2] = 3+1;
        for (int i = 1; i <= number.length; i++)
        System.out.print(number[0]+ " , " + number[1]+ " , " + number[2]);
    }
    }

