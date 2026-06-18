/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class LargestNumber {
    public static void main(String[] args) {
        int a=0;
        int numbers[]={4,5,66,71,1,14};
        for (int i = 0; i <numbers.length; i++) {
            if(a<numbers[i]){
               a=numbers[i];
            }
            
            System.out.println(a);
           
            
        }
             System.out.println(" largest number"+a);

        
}
}
