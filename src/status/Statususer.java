/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class Statususer
{
    public enum Solution {
        PLUS,
        MINUS, 
        DIVIDE, 
        TIMES;

        double calculate(int i1, int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    private Solution c;
    public double x,y;
   
    double calculate(double x, double y) 
    {

       System.out.println("Result here: ");
       
        
       
        switch (c.PLUS) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown Solution " + this);
        }
    }
   
}
