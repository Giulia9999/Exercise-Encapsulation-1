package it.develhope.encapsulation;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public House(int floorsNumber, String address, String[]residentNames){
        this.floorsNumber = floorsNumber;
        this.address = address;
        this.residentsNames = residentNames;
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