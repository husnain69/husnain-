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
public class person {
    String name;
    int age;
    char gender;
    person()
    {
        
    }
    person(String naam,int x,char y)
    {
        name=naam;
        age=x;
        gender=y;
    }
    public void display()
    {
        System.out.println(name);
        System.out.print(age);
        System.out.println(gender);
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
