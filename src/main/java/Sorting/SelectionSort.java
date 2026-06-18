/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class SelectionSort {
    
    public static void  printtt( int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    
    
    public static  void sort( int arr[]){
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] +"");
int mini=i; 
            for (int j = i+1; j < arr.length; j++) {
                if(arr[mini]> arr[j]){
                    mini =j;
                }
                
            }
            int tem =arr[mini];
arr[mini]=arr[i];
arr[i]=tem;
        }
    }
        
    
    
    public static void main(String[] args) {
        int arr[]=  {11,8,4,6,5,6};
        sort(arr);
        printtt(arr);
}
}   