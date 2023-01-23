package it.develhope.encapsulation;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;


    public void setData(){
        System.out.printf("The address is %s %n",address);
        System.out.printf("The number of floors is %d %n",floorsNumber);

        for(String residents : residentsNames){
            System.out.printf("The name of the resident is %s %n", residents);
        }
    }


    public String stringValidation(String getSomething){
        try {
            int i = Integer.parseInt(getSomething);
            System.out.println(i + " is not a string");
            System.exit(0);
        }catch (NumberFormatException e){
            return getSomething;
        }
        return null;
    }

    public String[] stringArrayValidation(String[] getSomething){
        try {
            for(int j = 0; j<getSomething.length; j++){
                getSomething[j] = String.valueOf(Integer.parseInt(getSomething[j]));
                System.out.println(getSomething[j] + " is not a string type");
            }
            System.exit(0);
        }catch (NumberFormatException e){
            return getSomething;
        }
        return null;
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
