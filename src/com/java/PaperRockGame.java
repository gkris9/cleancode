package com.java;

import java.util.Scanner;

public class PaperRockGame {
	public static void main(String[] args) {
		ValidInputs input = new ValidInputs();
		Scanner sc = new Scanner(System.in);
		String player1 = sc.nextLine();
		String player2 = sc.nextLine();
		input.findWinner(player1, player2);
		System.out.println("end of the message");
	}

}
