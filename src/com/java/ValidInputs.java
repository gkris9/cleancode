package com.java;

public class ValidInputs {
	public String findWinner(String player1, String player2) {
		String result = "";
		String Rock_Wins = "Rock crushes Scissors";
		String Paper_Wins = "paper covers rock";
		String Scissor_Wins = "scissors cut paper";
		String Tie = "Same Object";

		if (player1.equals("") && player2.equals("")) {
			result = null;
		}

		else if (player1.equals(player2)) {
			result = Tie;
		}

		else if ((InputData.ROCK).toString().equalsIgnoreCase(player1)
				&& (InputData.SCISSOR.toString()).equalsIgnoreCase(player2)
				|| (InputData.ROCK).toString().equalsIgnoreCase(player2)
						&& (InputData.SCISSOR.toString()).equalsIgnoreCase(player1)) {
			result = Rock_Wins;
		}

		else if ((InputData.SCISSOR).toString().equalsIgnoreCase(player1)
				&& (InputData.PAPER.toString()).equalsIgnoreCase(player2)
				|| (InputData.SCISSOR).toString().equalsIgnoreCase(player2)
						&& (InputData.PAPER.toString()).equalsIgnoreCase(player1)) {
			result = Scissor_Wins;
		} else if ((InputData.PAPER).toString().equalsIgnoreCase(player1)
				&& (InputData.ROCK.toString()).equalsIgnoreCase(player2)
				|| (InputData.PAPER).toString().equalsIgnoreCase(player2)
						&& (InputData.ROCK.toString()).equalsIgnoreCase(player1)) {
			result = Paper_Wins;
		}
		System.out.println(result);
		return result;

	}

}
