/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class submini {
     public static void sub(int number[]) {

        for (int i = 0; i < number.length; i++) {
                int sum =0;

            for (int j = 0; j <=i; j++) {

                
              System.out.print(number[j] + " ");
               sum = sum + number[j];
//            System.out.print(" sum = " + sum);

            }

            System.out.println("sum = " + sum);

        }
                System.out.println("");

    }

    public static void main(String[] args) {
        int number[] = {1,5, 3, 4, 5, 6, 7, 8, 9};
        sub(number);

    }
}




