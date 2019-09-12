/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author husnain
 */
public class UBER {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        List<driver> drivers = new ArrayList<>();
        driver a;
        a = new driver("Shakeel",69,'M',"mandi","Suzuki FX","GO","LPC-699");
        
        driver b;
        b = new driver("ArslanAwan",12,'M',"FAST NU","Vespa","Rickshaw","LEC-420");
        
        driver c;
        c = new driver("ali iqbal",21,'F',"New Delhi","WagonR","GO","LEU-6996");
        drivers.add(a);
        drivers.add(b);
        drivers.add(c);
        Customer me=new Customer("Husnain",22,'m',"FAST NU","gulberg","Rickshaw");
        
        me.findRide(me,drivers);
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        me.Calfare(number);
        
        
        

        
        
    }
    
    
    
    
}
