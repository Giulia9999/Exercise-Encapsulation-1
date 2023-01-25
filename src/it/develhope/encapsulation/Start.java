package it.develhope.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert address: ");
        house.setAddress(scanner.nextLine().trim());
        stringValidation(house.getAddress());

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
        stringArrayValidation(house.getResidentsNames());

        house.printData();

    }
    public static String stringValidation(String getSomething){
        try {
            int i = Integer.parseInt(getSomething);
            System.out.println(i + " is not a string");
            System.exit(0);
        }catch (NumberFormatException e){
            return getSomething;
        }
        return null;
    }

    public static String[] stringArrayValidation(String[] getSomething){
        try {
            for(int j = 0; j<getSomething.length; j++){
                getSomething[j] = String.valueOf(Integer.parseInt(getSomething[j]));
                System.out.println(getSomething[j] + " is not a string");
            }
            System.exit(0);
        }catch (NumberFormatException e){
            return getSomething;
        }
        return null;
    }

}
