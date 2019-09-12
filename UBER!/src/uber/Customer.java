/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author husnain
 */
public class Customer extends person {
    
    String startlocation;
    String endlocation;
    
    String Ride;
    Customer(String x,int y,char z,String sloc,String eloc,String r)
    {
        super(x,y,z);
        startlocation=sloc;
        endlocation=eloc;
        Ride=r;
    }
    void Calfare(int option) throws InterruptedException
    {
        int fare=0;
        if(option==1)
        {long startTime = System.nanoTime();

         System.out.println("Your ride has started press 3 to endride"); 
         Scanner input = new Scanner(System.in);
         int numb = input.nextInt();
         long endTime   = System.nanoTime();
         long totalTime = (endTime - startTime);
         totalTime=(long) (totalTime/ 1_000_000_000.0);
         System.out.println("Total Journey Time ="+totalTime);
         System.out.println("Calcuating Fare");
         double x = (int)(Math.random()*((20000-5000)+1))+5000;
         Thread.sleep((long) x);
         fare=(int) (totalTime*20);
         System.out.println("Your total fare was  "+fare+"$");
        }
        else
            System.out.println("Your total fare was 10$");
            
    }
    
    void findRide(Customer c,List<driver>d) throws InterruptedException
    {
      
        for(int i=0;i<d.size();i++)
        {
            if(d.get(i).currentlocation==c.startlocation)
            {
                System.out.println("Please Wait,searching for drivers in your area");
                double x = (int)(Math.random()*((20000-5000)+1))+5000;
                Thread.sleep((long) x);
                System.out.println(d.get(i).name+"   "+d.get(i).carModel+"("+d.get(i).regNum+")"+"   is coming to your location ");
                x = (int)(Math.random()*((30000-5000)+1))+5000;
                Thread.sleep((long) x);
                System.out.println("Captain has reached your location,press one to start ride,press 2 to cancel ride and exit uber");
                return ;
            }
            
        }
       
    
        System.out.println("No active drivers in your area");
        double x = (int)(Math.random()*((20000-5000)+1))+5000;
        Thread.sleep((long) x);
    }
    public String getridetype()
    {
        return Ride ;
    }
    public String getstartloc()
    {
        return startlocation;
    }
    public String getendtloc()
    {
        return endlocation;
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
