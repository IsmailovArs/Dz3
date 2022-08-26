package com.company;

public class Main {

    public static void main(String[] args) {

        double[]nams  = { 2.1, 5.8, -1.7 , 7.6 , 8.9 ,-4.2 , 9.3 , 6.6 , 5.3 ,-6.8 ,-3.9 , 7.7 ,9.7 , -3.6 , 5.8};

        boolean fpNamber = false;
        double boss = 0;
        int y = 0;
        for (double nam : nams) {

            if (!fpNamber && nam < 0) {
                fpNamber = true;
                continue;
            }
            if (fpNamber && nam >0){
                boss += nam ;
                y++;

            }
        }
            System.out.println("количество " + y);
            System.out.println("сумма " + boss);
            System.out.println("среднее арифметическое число " + boss / y);
        ;

        }


    }

