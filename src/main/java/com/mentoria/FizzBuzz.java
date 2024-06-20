package com.mentoria;

public class FizzBuzz {
    public void loopFizzBuzz(int fim) {
        for (int i = 1; i <= fim; i++) {
            System.out.println(validaFizzBuzz(i));
        }
    }

    public String validaFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
