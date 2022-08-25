package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        Calculator calculator = new Calculator();
        int sum = calculator.addTwoInts(2, 5);
        int substract = calculator.substractTwoInts(10, 6);
        System.out.printf("Wynik dodawania 2 + 5 = " + sum + ", Wynik odejmowania 10 - 6 = " + substract);

    }

}
