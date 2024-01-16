package com.package1;
import java.util.Scanner;

public class MainApp {
	public static Participant participant;
	public static void main(String args[])
	{
		try {
			Scanner scan= new Scanner(System.in);
			participant= new Participant();
			System.out.println("Welcome to the Quiz ");
			System.out.println("Please enter the Name of the Participent : ");
			participant.name=scan.nextLine();
			System.out.println("Please enter the Age of the Participent : ");
			participant.age=scan.nextInt();
			System.out.println("Please enter the Place from where the Participent hails from : ");
			participant.place=scan.next();
			System.out.println("Please enter the City from where the Participent hails from : ");
			participant.city=scan.next();
			System.out.println("==============================================================");
			System.out.println("Lets begin the Game ......Are you ready");
			System.out.println("1.Yes                       2.No");
			int sAns=scan.nextInt();
			if(sAns==2)
			{
				//Terminate;
				System.out.println("Thank you for your participation");
				System.exit(0);
			}
			else if(sAns==1) {
				DisplayRules();
				boolean res1 = Questions.question1();
				boolean res2=false;
				boolean res3=false;
				boolean res4=false;
				boolean res5=false;
				boolean res6=false;
				boolean res7=false;
				boolean res8=false;
				boolean res9=false;
				boolean res10=false;
				if(validate(res1))
				{
					res2 = Questions.question2();
				}
				if(validate(res2))
				{
					res3=Questions.question3();
				}
				if(validate(res3))
				{
					res4=Questions.question4();
				}
				if(validate(res4))
				{
					res5=Questions.question5();
				}
				if(validate(res5))
				{
					res6=Questions.question6();
				}
				if(validate(res6))
				{
					res7=Questions.question7();
				}
				if(validate(res7))
				{
					res8=Questions.question8();
				}
				if(validate(res8))
				{
					res9=Questions.question9();
				}
				if(validate(res9))
				{
					res10=Questions.question10();
				}
				if(validate(res10))
				{
					System.out.println("Congratulations!!......You won the game");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Invalid Option");
			}
		}
		catch(Exception Ex){
			System.out.println(Ex.getMessage());
		}
	}

	public static void DisplayRules()
	{
		try {
			System.out.println("==============================================================");
			System.out.println("Here are the rules of the Game :");
			System.out.println("1.There will be 10 Questions in this game.");
			System.out.println("2.Each question will yield 10 points.");
			System.out.println("3.The participant will get 4 options to choose from.");
			System.out.println("4.If the participant chooses a wrong answer he/she will be terminated form the game.");
			System.out.println("5.The participant will have 2 lifelines which will be terminated once used.");
			System.out.println("6.The user can leave the game when ever he wises to.");
			System.out.println("7.The winning points will be displayed when the game ends.");
			System.out.println("==============================================================");
		}
		catch(Exception ex){
			throw ex;
		}
	}
	public static boolean validate(boolean Result)
	{
	 try {
		if(Result ==true)
		{
			return true;
		}
		else
		{
			System.out.println("Thank you for your participation");
			System.exit(0);
		}
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
	return Result;
	}
}
