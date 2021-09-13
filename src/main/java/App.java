/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("How many people? ");
        int peopleCount = s.nextInt();
        System.out.println("How many pizzas do you have? ");
        int pizzaCount = s.nextInt();
        System.out.println("How many slices per pizza? ");
        int slicesPerPizza = s.nextInt(),
                totalPizzaSlices = pizzaCount * slicesPerPizza;

        double maxSlicesPerPerson = Math.floor((1.00 * totalPizzaSlices) / peopleCount);
        int leftOverPizzaSlices = totalPizzaSlices % peopleCount;


        System.out.println(String.format("%d people with %d pizzas (%d slices)", peopleCount, pizzaCount, totalPizzaSlices));
        System.out.println(String.format("Each person gets %.0f pieces of pizza.\nThere are %d leftover pieces.", maxSlicesPerPerson, leftOverPizzaSlices));

    }
}