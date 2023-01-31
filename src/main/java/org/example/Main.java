package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car auto = new Car(123, "BMW", 120);
        Bicylce rad = new Bicylce(124, "Cube", 20);
        System.out.println("Wähle aus 'Cube' oder 'BMW'!");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Du hast " + str + " eingetippt!");


        if (str.contains("Cube")) {
            System.out.println("Du hast das Fahrrad ausgewählt. \nWähle ob du bremsen oder beschleunigen willst. \nSchreibe zum Bremsen 'break' und zum beschleunigen eine Zahl.");
            String action = scanner.nextLine();
            if (action.contains("break")) {
                rad.brake();
            }
            else if ((Integer.parseInt(action) > 0)){
                rad.accelerate(Integer.parseInt(action));
            }
            else{
                System.out.println("Wrong word!");
                System.exit(0);
            }

        } else if (str.contains("BMW")) {
            System.out.println("Du hast das Auto ausgewählt. \nWähle ob du bremsen oder beschleunigen willst. \nSchreibe zum Bremsen 'break' und zum beschleunigen eine Zahl.");
            String action = scanner.nextLine();
            if (action.contains("break")) {
                auto.brake();
            }
            else if ((Integer.parseInt(action) > 0)){
                auto.accelerate(Integer.parseInt(action));
            }
            else{
                System.out.println("Wrong word!");
                System.exit(0);
            }
        } else {
            System.out.println("Du hast falsch gewählt");
            System.exit(0);
        }


    }
}