/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class pairsoArray {
    public static void pairs(int number[]){
            
    
        for (int i = 0; i <number.length; i++) {
            int c=number[i];
            for (int j = i+1; j <number.length; j++) {
                System.out.print( " ("+c + ",  "  + number[j]+")");
                
            }
            System.out.println("");
            
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8 };
        pairs(number);
    }    
                
    
}
