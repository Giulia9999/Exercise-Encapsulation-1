package it.develhope.encapsulation;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;


    public void printData(){
        System.out.printf("The address is %s %n",address);
        System.out.printf("The number of floors is %d %n",floorsNumber);

        for(String residents : residentsNames){
            System.out.printf("The name of the resident is %s %n", residents);
        }
    }



    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

}
