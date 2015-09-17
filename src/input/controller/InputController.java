package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration
	//Class members private
	
	private Scanner myInput;
	
	//Constructors go here

	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	//Methods
	
	public void start()
	{
		questions();
	}
	private void questions()
	{
		System.out.println("What is your name?");
		String input;
		input = myInput.nextLine();
		System.out.println("Hi my name is " + input +",");
		System.out.println("What is your name");
		String fullName = myInput.nextLine();
		System.out.println("My name is, " + fullName);
		System.out.println("your age please");
		int myAge = myInput.nextInt();
		System.out.println("Wow " + input + "you are " + myAge + " years old.");
	}
	
	
}