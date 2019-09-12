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
public class Candidates extends Person{
    private String party;
    private String tehsil;
    private int UcNumber;
    private int numOfVotes;
    Candidates(String l,int c,char p,String par,String teh,int num)
    {
        super(l,c,p);
        party=par;
        tehsil=teh;
        UcNumber=num;
        numOfVotes=0;
    }
   public void display()
    {
        System.out.println(getname()+" candidate of"+getParty()+"  of tehsil"+getTehsil()+" got"+getnumOfVotes()+" votes");
                // System.out.println(+getParty()+getTehsil()+getnumOfVotes());
    }
    public void incVote()
    {
        numOfVotes=numOfVotes+1;
        
    }
    public String getParty() {
        return party;
    }

    public String getTehsil() {
        return tehsil;
    }

    public int getUcNumber() {
        return UcNumber;
    }
    

    public int getnumOfVotes() {
        return numOfVotes ;
    }

 
    
}
