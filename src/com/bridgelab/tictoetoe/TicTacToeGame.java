package com.bridgelab.tictoetoe;

public class TicTacToeGame {
    static char[] bord = new char[10]; // bord size 10

    public static void main(String[] args) {
        createBoard(); // calling method
        System.out.println("Welcome to Tic Tac Toe Game");

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



}
