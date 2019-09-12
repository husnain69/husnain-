/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

/**
 *
 * @author husnain
 */
public abstract class Person {
    String name;
    private int age;
    private char gender;
     Person()
    {
        
    }
    Person(String naam,int x,char y)
    {
        name=naam;
        age=x;
        gender=y;
    }
    public void display()
    {
   
    }

    public void incVote()
    {
        
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

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
}
