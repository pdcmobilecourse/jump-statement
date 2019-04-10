/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump.statement;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ararays {
    void function(){
        int no=0;
        int sum=0;
        while(no>=0){
            System.out.println("enter a number");
            Scanner scn=new Scanner(System.in);
            no=scn.nextInt();
            if (no<0)
                break;
            sum=sum+no;
        }
        System.out.println("The sum of all the number is" + sum);
        //Datatype[]Refevarray;
        //Refvararray=new Datatype(Arraysize);
        //Datatype[]Refvararray=new Datatype(Arraysize);
        // Data[]Refvararray=(10,20,30);
    }
}
