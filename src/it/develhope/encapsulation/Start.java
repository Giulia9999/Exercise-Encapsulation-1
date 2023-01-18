package it.develhope.encapsulation;

public class Start {
    public static void main(String[] args) {
        House house = new House(5,"Via principessa di Piemonte", new String[]{"Paolo", "Marco", "Luca"});

        System.out.printf("The number of floors is %d %n",house.getFloorsNumber());
        System.out.printf("The address is %s %n",house.getAddress());

        for(String residents : house.getResidentsNames()){
            System.out.printf("Resident name is %s %n", residents);
        }

    }
}
