package it.develhope.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert address: ");
        house.setAddress(scanner.nextLine().trim());
        house.stringValidation(house.getAddress());


        System.out.print("Insert floor numbers: ");
        if(scanner.hasNextInt()){
            house.setFloorsNumber(scanner.nextInt());
        }else{
            System.out.println("Not a number");
            return;
        }


        Scanner arrayScanner = new Scanner(System.in);

        System.out.print("Insert the number of residents: ");

        house.setResidentsNames(new String[arrayScanner.nextInt()]);
        System.out.println("Enter the name of the residents:");
        arrayScanner.nextLine();
        for(int i=0; i<house.getResidentsNames().length; i++)
        {
            house.getResidentsNames()[i] = arrayScanner.nextLine();
        }
        house.stringArrayValidation(house.getResidentsNames());


        house.getData(house.getFloorsNumber(),house.getAddress(), house.getResidentsNames());
        house.setData();

    }
}
