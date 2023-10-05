 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gametargetoftwoplayers;

/**
 *
 * @author dell
 */
import java.util.Scanner;
import java.util.Random;
public class GameTargetOfTwoPlayers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Random random = new Random();
         int randomInt;

        int score1=0,score2=0;
        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("________________________________________________");
            System.out.println("\n1st player attempt:");
            input.nextLine();
            randomInt =1+ random.nextInt(6);
            System.out.println("The Dice Rotation Number is :   "+randomInt);
           score1 +=randomInt;
           
            System.out.println("1st Player Total Marks  :    "+score1);
            System.out.println("---------------------------------------------------"
                    + "");
             if(score1>=20){
                    System.out.println("Congrulation : player 1 you win the game");
                    break;
                }
            System.out.println("___________________________________________________");
           System.out.println("\n2nd player Attempt");
           input.nextLine();
           randomInt =1+ random.nextInt(6);
           score2 += randomInt;
            System.out.println("The Dice Rotation Number is :   "+randomInt); 
           System.out.println("2nd Player Total Marks :  "+score2);
             if(score2>=20){
                    System.out.println("Congrulation : player 1 you win the game");
                    break;
                }
            }
            System.out.println("______________________________________________");
            System.out.println("-----------------------------------------------");
            
        }
        
    }   
      
