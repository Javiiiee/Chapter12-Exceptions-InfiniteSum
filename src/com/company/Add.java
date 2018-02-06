package com.company;
import java.util.Scanner;

public class Add {

    public static  double value = 1.0, sum = 0.0;
    public static String stringValue = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number to add");
            stringValue = sc.next();
            try {
                sum = Add.sum(stringValue,sum);
            } catch (NumberFormatException e) {
                System.out.println("Input must be a number");
            }
        }
        while (!stringValue.equals("="));
        System.out.println(sum);
    }

    public static double sum (String StringValue, double currentSum){
        value = Double.parseDouble(stringValue);
        currentSum += value;
        return currentSum;
    }
}
