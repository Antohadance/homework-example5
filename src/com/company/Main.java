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
        int [] month = new int [12];
        month [0] = 30;
        float novemberMonth = month[11];
        System.out.println(novemberMonth);
        System.out.println(month[0]);
        System.out.println(month[11]);
        int november = 11;
        System.out.println(month[november]);
        for (int i = 11; i < month.length; i++) {
            System.out.println(month[i]);
        }
        //Задание №2
        float [] weigh = {1,2,3,1.57f,7.654f,9.986f,0,30,0,0,0};
        System.out.println(weigh[0]+ " , " + weigh[1]+ " , " + weigh[2]);
        System.out.println(weigh[3]+ " , " + weigh[4]+ " , " + weigh[5]);
        System.out.println(weigh[6]+ " , " + weigh[7]+ " , " + weigh[8] + " , " + weigh[9]+ " , " + weigh[10]);
        //Задание №3
        System.out.println(weigh[2]+ " , " + weigh[1]+ " , " + weigh[0]);
        System.out.println(weigh[5]+ " , " + weigh[4]+ " , " + weigh[3]);
        System.out.println(weigh[10]+ " , " + weigh[9]+ " , " + weigh[8] + " , " + weigh[7]+ " , " + weigh[6]);
        //Задание №4
        int [] number = new int[10];
        number[0] = 1+1;
        number[1] = 2;
        number[2] = 3+1;
        System.out.println(number[0]+ " , " + number[1]+ " , " + number[2]);
    }
    }

