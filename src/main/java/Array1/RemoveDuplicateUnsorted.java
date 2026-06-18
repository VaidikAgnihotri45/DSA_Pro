/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padhowithpratush;

/**
 *
 * @author VAIDIK AGNIHOTRI
 */
    public class RemoveDuplicateUnsorted {

        public static void main(String[] args) {
            
        
        int arr[] = {1,2,2,3,3,6,1,8,8,8,6,6,7,5,3};

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {

                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {

                System.out.print(arr[i] + " ");
            }
        }
    }


}