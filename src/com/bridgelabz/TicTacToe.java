package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

import utility.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u = new Utility();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!!!");
        int check = 0;
		boolean play = false;
		Random ran=new Random();
		char[][] game = new char[3][3]; 
		for(int i=0;i<game.length;i++)
		{
			for(int j=0;j<game.length;j++)
			{
				game[i][j] = '-';
			}
		}
		u.print(game);
		do
		{
			if(play == true)
			{
				int m = ran.nextInt(3);
				int n = ran.nextInt(3);
				if(game[m][n] == '-')
				{
					System.out.println("Computer played..");
					game[m][n]='O';
					System.out.println();
					u.print(game);
					check++;
					play=false;
				}
				if ((game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O') ||
		    		    (game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O') ||
		    			(game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O') ||
		    			(game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O') ||
		    			(game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O') ||
		    			(game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O') ||
		    			(game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O') ||
		   				(game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O'))
		    		{
					    System.out.println("Computer won...");
					    break;
		    		}
			}
			if(play == false && check < 8)
			{
				System.out.println("It's Your turn...Enter the row(<=2):");
				int p = sc.nextInt();
				System.out.println("Enter the column(<=2):");
				int q = sc.nextInt();
				if(game[p][q] == '-')
				{
					game[p][q]='X';
		            System.out.println();
				    u.print(game);
				    check++;
				    play=true;
				}
				if ((game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X') ||
		    		    (game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X') ||
		    			(game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X') ||
		    			(game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X') ||
		    			(game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X') ||
		    			(game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X') ||
		    			(game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X') ||
		   				(game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X'))
		    		{
					    System.out.println("Yay!! You won...");
					    break;
		    		}
			 }
		   }while(check != 9);
		if(check == 9)
		{
			System.out.println("...Game Draw...");
		}
	}

}
