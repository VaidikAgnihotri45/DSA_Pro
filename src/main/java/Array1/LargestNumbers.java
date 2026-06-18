/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class LargestNumbers {
   
    public static int lar(int numbers[]) {
        
    
        int a=0;
        for (int i = 0; i <numbers.length; i++) {
            if(a<numbers[i]){
               a=numbers[i];
               
            }
        }
        return a;
    }
 public static void main(String[] args) {
                int numbers[]={4,5,66,71,1,4};
     System.out.println(lar(numbers));
     System.out.println(numbers);
    }

}

