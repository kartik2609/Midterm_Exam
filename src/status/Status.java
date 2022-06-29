/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;
import status.Statususer.Solution;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        Statususer s = new Statususer();
        Scanner in= new Scanner(System.in);
        int i= in.nextInt();
        int i1= in.nextInt();
        double result = s.calculate(i1,i);
        System.out.println("result :" +result); 
    
    }
}
