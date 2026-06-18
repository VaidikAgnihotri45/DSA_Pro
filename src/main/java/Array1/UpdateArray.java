/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

// passing array as argument 
public class UpdateArray {
    public static void  udateArr( int marks[]){
        for (int i = 0; i <marks.length; i++) {
           marks[i]=marks[i]+4;
            System.out.println(marks[i]);
           
        }
        System.out.println("");
    }

    public static void main(String[] args) {
      int marks[]={115,5,5};
        
udateArr(marks);
for (int i = 0; i <marks.length; i++) {
    System.out.println(marks[i]);           
        }


        
    }

}