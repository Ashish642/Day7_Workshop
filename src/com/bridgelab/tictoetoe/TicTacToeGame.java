package com.bridgelab.tictoetoe;

import java.util.Scanner;

public class TicTacToeGame {
    public static char playerSymbol;
    public static char computerPlayerSymbol;
    static char[] bord = new char[10]; // bord size 10

    public static void main(String[] args) {
        createBoard(); // calling method
        System.out.println("Select the Letter  you want\n Press 1 . Choose x \n Press 2 . Choose o \n  \nEnter your Choice : "   );

        Scanner scan = new Scanner(System.in); // creat Scanner object
        int choice = scan.nextInt();

        TicTacToeGame.allowPlayer(choice);
        TicTacToeGame.showBoard();

        scan.close();

    }
     /*
        why this method use:
        in method data is character
        And using for loop to iteration from 1 to 9 by ignoring 0
      */
     public static void createBoard() {
         for (int index = 1; index < bord.length; index++){
             bord[index] = ' ';
         }
     }
      /*
       define method to allow the player in tictactoe game and by using switch
       you want to choice you can directly choice it
       */
       public static void  allowPlayer(int choice) {
           switch (choice) {
               case 1: {
                   playerSymbol = 'x';
                   computerPlayerSymbol = 'o';
                   break;
               }
               case 2: {
                   playerSymbol = '0';
                   computerPlayerSymbol = 'x';
                   break;

               } default:{
                   System.out.println("Invalid choice so please retry again");
                   return;
               }
           }
       }
       public static void showBoard() {
           System.out.println("Board Display\n");
           System.out.println(" | " + bord[1] + " | " +bord[2] + " | " +bord[3] + " |\n");
           System.out.println(" | " + bord[4] + " | " +bord[5] + " | " +bord[6] + " |\n");
           System.out.println(" | " + bord[7] + " | " +bord[8] + " | " +bord[9] + " |\n");

       }



}
