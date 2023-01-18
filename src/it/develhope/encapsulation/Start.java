package it.develhope.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert address");
        house.setAddress(scanner.nextLine());


        System.out.print("Insert floor numbers");
        house.setFloorsNumber(scanner.nextInt());


        Scanner arrayScanner = new Scanner(System.in);

        System.out.print("Insert resident names");
        house.setResidentsNames(new String[]{arrayScanner.nextLine()});


        System.out.printf("The address is %s %n",house.getAddress());
        System.out.printf("The number of floors is %d %n",house.getFloorsNumber());

        for(String residents : house.getResidentsNames()){
            System.out.printf("The names of the residents are %s %n", residents);
        }


    }
}
