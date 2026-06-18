/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
public class BinarySeRCH {
    public static int Binary(int num[],int check){
        int start =0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start + end)/2;
            
            if(num[mid]==check){
               return mid;
               
            }
            else if(num[mid]<check){
                start =mid+1;
            }
            else{
                end= mid-1;
            }
        }
        
return -1;
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7};
        int check=61;
      
        
        System.out.println("index of num="+ Binary(num, check));   
          
      if(Binary(num, check)==-1){
          System.out.println("vo index nhi h is array me");
      }
}
    
}
