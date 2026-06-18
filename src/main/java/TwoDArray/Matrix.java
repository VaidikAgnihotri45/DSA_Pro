/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoDArray;

import java.util.Scanner;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class Matrix {
    public static void main(String[] args) {
                int Matrix [][]=new  int [3][3];

        int n=Matrix[0].length;
        int m=Matrix.length;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               Matrix[i][j]=sc.nextInt();
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print( Matrix[i][j]  + " " );
                
            }
            System.out.println();
        } 
        
    }
}
