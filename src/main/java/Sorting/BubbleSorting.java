/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

//     int arr[]={5,6,7,4,2,1,8,6,1,19};

public class BubbleSorting {
         public static  void bb( int arr[]){
    for(int i=0; i<arr.length-1; i++){
        for (int j = 0; j < arr.length-1-i; j++) {
          if(arr[j]>arr[j+1]){
//               arr[i]=arr[i]+arr[j];
//                arr[j]=arr[i]-arr[j];
//                arr[i]=arr[i]-arr[j];
int tem =arr[j];
arr[j]=arr[j+1];
arr[j+1]=tem;
            }   
        }   
    } 
    }
    
   
    
    
  
   
    public static void print1( int arr[]){
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.print("");
        
    }
    public static void main(String[] args) {

     int arr[]={5,6,7,4,2,1,8,6,1,19};
        bb(arr);
        print1(arr);
    }
}
