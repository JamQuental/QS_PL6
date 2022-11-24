package org.example;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean isPrime(int number){

        if (number <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean isMultiple(int number, int divisor){
        if(number%divisor==0)
            return true;
        else
            return false;
    }
}