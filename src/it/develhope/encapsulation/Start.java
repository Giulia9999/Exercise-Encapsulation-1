package it.develhope.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert address: ");
        house.setAddress(scanner.nextLine().trim());


        System.out.print("Insert floor numbers: ");
        if(scanner.hasNextInt()){
            house.setFloorsNumber(scanner.nextInt());
        }else{
            System.out.println("Not a number");
            return;
        }


        Scanner arrayScanner = new Scanner(System.in);

        System.out.println("Enter the name of the residents:");
        house.setResidentsNames(arrayScanner.nextLine().split(","));

        house.printData();

    }
}
