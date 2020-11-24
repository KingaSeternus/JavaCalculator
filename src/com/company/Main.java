package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int first_n;
	int second_n;
	char sign;
	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        first_n = scanner.nextInt();
        System.out.println("Enter the second number:");
        second_n = scanner.nextInt();

        System.out.println("Adding two numbers - press +");
        System.out.println("Subtracting two numbers - press -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dividing two numbers - press /");
        System.out.println("Modulo operation - press%");

        sign = scanner.next().charAt(0);
        switch(sign) {
            case '+': {
                System.out.println(first_n + second_n);
                break;
            }
            case '-': {
                System.out.println(first_n - second_n);
                break;
            }
            case '*': {
                System.out.println(first_n * second_n);
                break;
            }
            case '/': {
                if(second_n !=0) {
                    System.out.println(first_n / second_n + "and the rest:" + first_n % second_n);
                }
                else{
                    System.out.println("We don't divide by zero!");
                }
                break;
            }
            case '%': {
                if(second_n !=0) {
                    System.out.println(first_n % second_n);
                }
                else {
                    System.out.println("We don't divide by zero!");
                }
            }
        }
    }
}
