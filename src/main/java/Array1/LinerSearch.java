/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class LinerSearch {
   public static int  linersear( int num[], int foundN){
       for (int i = 0; i < num.length; i++) {
           if(num[i]==foundN){
               
               System.out.println(num[i]);
           }
           
       }
       return -1;
       
   }
   
    public static void main(String[] args) {
        int num[] ={1,5,5,5,5,5,5,45,56};
     int    foundN= 56;
     int index=linersear(num, foundN);
    if(index==-1){
        System.out.println("index not found");
    }
    else{
        System.out.println("index found sucessfully = "+  index);
        
    }
    }
}


