/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author husnain
 */
public class Voters extends Person{
    private String tehsil;
    private int UcNumber;
    private boolean status;
    private String leader;
    private String message;
    Voters(String l,int c,char p,String teh,int num)
    {
        super(l,c,p);
        tehsil=teh;
        UcNumber=num;
        status=false;
        message="Voting time has been completed";
    }
    public void castvote(String lead,List<Candidates>candy)
    {
        leader=lead;
          for(int i=0;i<candy.size();i++)
        {
            if(candy.get(i).name==lead&&candy.get(i).getUcNumber()==UcNumber)
            {
                status=true;
                System.out.println("your Vote has been casted succesfully"+name);
                candy.get(i).incVote();
                return;
                
            }
            
            
        
        }
                System.out.println("Failed to cast vote "+name);
    }
    public void displaymessage()
    {
        System.out.println(getname()+" of tehsil "+getTehsil()+" "+message);
              
    }
  
    public String getTehsil() {
        return tehsil;
    }

    public int getUcNumber() {
        return UcNumber;
    }
    
}
