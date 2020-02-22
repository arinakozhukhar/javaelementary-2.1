package com.company.lesson1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int b = 1;
        do {
            System.out.print(b + " ");
            b++;
        } while (b <= 10);
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        boolean stop = false;
        String input = scanner.next();
        if (input.equals("stop")) {
            stop = true;
            System.out.println(summ);
        }
        while (stop == false) {
            summ += Integer.parseInt(input);
            input = scanner.next();
            if (input.equals("stop")) {
                stop = true;
                System.out.println(summ);
            }
        }
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        int[] myArray = new int[100];
        for(int i = 0; i<= myArray.length - 1; i++){
            myArray[i] = i+1;
            System.out.println(myArray[i]);
        }*/
        System.out.println(fact(7));

    }
    public static int fact(int n){
        int result = 1;
        if (n ==1 || n ==0){
            return result;
        }
        result = n * fact(n-1);
        return result;
    }
}
