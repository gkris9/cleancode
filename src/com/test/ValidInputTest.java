package com.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

import com.java.InputData;
import com.java.ValidInputs;

import junit.framework.TestCase;

public class ValidInputTest extends TestCase{

	String Rock_Wins = "Rock crushes Scissors ----> Rock Wins";
	String Paper_Wins = "paper covers rock ----> Paper Wins";
	String Scissor_Wins = "scissors cut paper ----> Scissor Wins";
	String Tie = "Same Object";
	ValidInputs validInput = new ValidInputs();
	InputData inputdata;

	@Test
	public void rockTest() {
		String winner = validInput.findWinner(inputdata.ROCK.toString(), inputdata.SCISSOR.toString());
		assertEquals(Rock_Wins, winner);
	}

	@Test
	public void paperTest() {
		String winner = validInput.findWinner(inputdata.ROCK.toString(), inputdata.PAPER.toString());
		assertEquals(Paper_Wins, winner);
	}

	@Test
	public void scissorTest() {
		String winner = validInput.findWinner(inputdata.PAPER.toString(), inputdata.SCISSOR.toString());
		assertEquals(Scissor_Wins, winner);
	}

	@Test

	public void tieTest() {
		String winner = validInput.findWinner(inputdata.PAPER.toString(), inputdata.PAPER.toString());
		assertEquals(Tie, winner);
	}

	@Test

	public void nullTest() {
		String winner = validInput.findWinner("", "");
		assertNull("NO Data", winner);
	}
}
