package com.bridgelab.tictoetoe;

import java.util.Scanner;

public class TicTacToeGame {
    static  Scanner scan = new Scanner(System.in); // create scanner object class
    static char[] bord = new char[10]; // bord size 10
    public static char playerSymbol;
    public static char computerPlayerSymbol;


    public static void main(String[] args) {
        createBoard(); // calling method
        System.out.println("Select the Letter  you want\n Press 1 . Choose x \n Press 2 . Choose o \n  \nEnter your Choice : "   );

        Scanner scan = new Scanner(System.in); // creat Scanner object
        int choice = scan.nextInt();
        createBoard();
        allowPlayer(choice);
        choiceToss();
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
     /* create amethod to allow player
        input x or o and call from main
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
       /* write amthod showBoard() {
           display current board
        */
       public static void showBoard() {
           System.out.println("Tic Tac Toe Board");
           System.out.println("Board Display\n");
           System.out.println(" | " + bord[1] + " | " +bord[2] + " | " +bord[3] + " |");
           System.out.println(" |---------| ");
           System.out.println(" | " + bord[4] + " | " +bord[5] + " | " +bord[6] + " |");
           System.out.println("|----------");
           System.out.println(" | " + bord[7] + " | " +bord[8] + " | " +bord[9] + " |");


       }
       /* Ability for use to make
        a move to a desired
        location in board
        */
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

       }    /*
            Ability to check for the
            free space before
            making the desired
            */
      static void move() {
          boolean played = false;
          while (!played) {
              int playMove = (int) (Math.random() * 10) % 9 + 1;
              if (playMove >0 && playMove < 10) {
                  if (bord[playMove] == ' ') {
                      bord[playMove] = computerPlayerSymbol;
                      played = true;

                  }
              }
          }
          showBoard();
      }
       static void choiceToss() {
          int win = (int) ( Math.random() * 10 ) %2;
           System.out.println("Choosen \n 0. Heads\n 1. Tails\n Enter your choice [0-1");
           Scanner sc = new Scanner(System.in);
           int tossChoices = sc.nextInt();
           if (tossChoices == win) {
               System.out.println("Plater won the toss, enter your first move");
               choicesLocation();
               move();

           }
           else {
               System.out.println("Computer won the toss, enter the firstmove");
               move();
               choicesLocation();
           }
       }
        public static char playerWon(char[] bord) {
          int[][] game = {{1,2,3,},{4,5,6},{7,8,9}, {1,5,9} ,{3,5,7},{1,4,7},{2,5,8},{3,6,9}};
          char wgon = 'w';
          for (int i=0; i<game.length; i++){
              if (bord[game[i][0]] ==bord[game[i][1]] && bord[game[i][1]] == bord[game[i][2]]) {
                  if (bord[game[i][0]]!= ' ' ) {
                      won = bord[game[i][0]];
                      break;
                  }
              }
          }
          return won;
        }
        //check for empty spaces on game bord
         public static boolean BoardFilled(char[] bord) {
          boolean filled = true;
          for (int i=11; i<bord.length; i++) {
              if (bord[i]== ' ') {
                  filled = false;
                  break;
              }
          }
          return filled;

         }
         // check game state
          public static char getGamesState(char[] bord,char user ,char computer, char current) {
             char won = playerWon(bord);
             char tie = ' ', state = ' ';
             if (current == user) {
                 tie = computer;
                 {
                     else if {
                         tie = user ;

                 }
                     switch (won) {
                         case 'F':
                             state = tie;
                             break;
                         case 'X':
                             System.out.println("X has won the game");
                             state = 'E'
                             break;
                         case 'o':
                             System.out.println("o has won the game");
                             state = 'E'
                             break;
                     }
                      if (BoardFilled(bord)) {
                          state = 'E';

                     }
                      return state
                 }
             }
          }



}
