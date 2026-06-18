/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class ggk {


    public static void sub(int number[]) {

              int maxsum =  number[0];
        for (int i = 0; i < number.length; i++) {
                int sum = 0;
            for (int j = i; j < number.length; j++) {

                    sum = sum + number[j];
                    if( sum  > maxsum){
                   maxsum= sum;    
                  
                    }  
                    
                }

            System.out.println(maxsum);
               
            }
        

        
    }

    public static void main(String[] args) {
        int number[] = {1,5, 3, 4, 5, 6, 7, 8, 9};
        sub(number);

}

}
