/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author husnain
 */
public class Voting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
         
       List<Candidates> myList = new ArrayList<>();
       Candidates a;
               a=new Candidates("Altaf Hussain",100,'f',"MQM","karachi",66);
               Candidates b=new Candidates("Zardari",10,'f',"PPP","karachi",69);
        
       myList.add(a);
       myList.add(b);
       
       Voters ali=new Voters("ali iqbal",22,'m',"karachi",66);
       Voters husnain=new Voters("husnain",22,'m',"karachi",69);
       ali.castvote("Altaf Hussain",myList);
       
       husnain.castvote("Altaf Hussain",myList);
       
       ali.displaymessage();
       husnain.displaymessage();
       
       
    }
    
}
