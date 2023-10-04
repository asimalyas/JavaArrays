/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package occurence;

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class Occurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int[] arr= {7,10,11,5,2,5,5,7,11,8,9};
int[] check= new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==0){
                continue;
            }
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    if(j>i){
                        arr[j]=0;
                    }
                }
            }
            check[i]=count;
        }
     
        for (int i = 0; i < check.length; i++) {
            for (int j = i; j < check.length; j++) {
                if(check[i]<check[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    
                }
               if(check[i]==check[j]){
                   if(arr[i]<arr[j]){
                       int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                   }
               }
            }
            
        } 
     
        Scanner input = new Scanner(System.in);
        System.out.println("enter the Kth :");
        int k =input.nextInt();
        System.out.println("the order of occrence:");
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
         
    }
}