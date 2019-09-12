/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

/**
 *
 * @author husnain
 */
public class driver extends person{
    String currentlocation;
     String carModel;
     String regNum;
     String rideType;
    
    String Ride;
    driver(String x,int y,char z,String currloc,String carmodel,String ridetype,String registration)
    {
        super(x,y,z);
        currentlocation=currloc;
        carModel=carmodel;
        rideType=ridetype;
        regNum=registration;
    }
   

    public String getCurrentlocation() {
        return currentlocation;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getRideType() {
        return rideType;
    }

    public String getRide() {
        return Ride;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
   public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }
    public char getgender()
    {
        return gender;
    }
    
}
