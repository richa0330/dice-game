import java.util.Random;
import java.util.Scanner;

class ex03{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Random ra = new Random();

	System.out.println("What is your name?");
	System.out.print("> ");

	String name= sc.nextLine();

	System.out.println("Hello, " + name + "!");

	int die1 = ra.nextInt(6) + 1;
	int die2 = ra.nextInt(6) + 1;
	int total = die1 + die2;

	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);
	System.out.println("Total value: " + total);

	if(total>7){
	    System.out.println(name + " won!");
	}
	else{
	    System.out.println(name + " lost!");
	}

	sc.close();
    }
}
	
