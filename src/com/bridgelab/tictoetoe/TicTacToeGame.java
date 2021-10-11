package com.bridgelab.tictoetoe;

import java.util.Scanner;

public class TicTacToeGame {
    static  Scanner scan = new Scanner(System.in); // create scanner object class
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
        choicesLocation();
        scan.close();


    }
     /*
        Method use :
        in method data is character
        using for loop to iteration from 1 to 9
      */
     public static void createBoard() {
         for (int index = 1; index < bord.length; index++){
             bord[index] = ' ';
         }
     }

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
       static void choicesLocation() {
           System.out.println("Enter box index(1-9) to set your game move" );
           int Moveuser = scan.nextInt();
           switch (Moveuser) {
               case 1:
                    if (bord[1] == ' ') {
                        bord[1] = playerSymbol;
                    }
                    break;
               case 2:
                   if (bord[2] == ' ') {
                       bord[2] = playerSymbol;
                   }
                   break;
               case 3:
                    if (bord[3] == ' ') {
                        bord[3] = playerSymbol;
                    }
                    break;
               case 4:
                   if (bord[4] == ' ') {
                       bord[4] = playerSymbol;
                   }
                   break;
               case 5:
                   if (bord[5] == ' ') {
                       bord[5] = playerSymbol;
                   }
                   break;
               case 6:
                   if (bord[6] == ' ') {
                       bord[6] = playerSymbol;
                   }
                   break;
               case 7:
                   if (bord[7] == ' ') {
                       bord[7] = playerSymbol;
                   }
                   break;
               case 8:
                   if (bord[8] == ' ') {
                       bord[8] = playerSymbol;
                   }
                   break;
               case 9:
                   if (bord[9] == ' ') {
                       bord[9] = playerSymbol;
                   }
                   break;
               default:
                   System.out.println("Invalid Move");
           }
            showBoard();
       }



}
