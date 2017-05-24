/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicerolls;
 /**
  * Dice are rolled and the outcome of each roll is counted.
  */
 
 import java.util.Scanner;
 import java.util.Random;
 
 public class DiceRolls {

	public static void main(String[] args) {
		int[] outcomes = new int[13];		//array with indices 0 through 12
		Scanner input = new Scanner(System.in);		
		int numRolls;
		Random rand = new Random();
		int outcome;
		
		/* prompt user for number of rolls */
		System.out.print("How many rolls? ");
		numRolls = input.nextInt();
		
		/* roll dice and add up outcomes */
		for (int roll = 0; roll < numRolls; roll++) {
			outcome = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
			outcomes[outcome] += 1;
		}
		
		/* show counts of outcomes */
		for (int i = 2; i <= 12; i++) {
			System.out.println(i + ": " + outcomes[i]);
		}
	}
}
