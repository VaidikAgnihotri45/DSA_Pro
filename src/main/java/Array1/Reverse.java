/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class Reverse {
    public static void reverseArr( int number[]){
        int f=0;int l=number.length-1;
        
        while (f<l) {
int temp=number[l];
number[l]=number[f];
number[f]=temp;
f++;
l--;

            
        }
        
    }
    public static void main(String[] args) {
        int number[]={4,8,9,4,12,13};
        reverseArr(number);
        for (int i = 0; i <number.length ; i++) {
            System.out.print("" +number[i]+" ");
            
        }
    }
    
}
