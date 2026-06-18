/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class SubArray {

    public static void sub(int number[]) {
 
        for (int i = 0; i < number.length; i++) {

            int start = i;
            for (int j = i; j < number.length; j++) {

                int sum = 0;
                int end =    j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.println("" + "sum = " + sum);

            }
        System.out.println("");

        }
    } 

    public static void main(String[] args) {
        int number[] = {1,5, 3, 4, 5, 6, 7, 8, 9};
        sub(number);

    }
}


