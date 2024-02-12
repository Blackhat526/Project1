import java.util.Scanner;
import java.util.Collection;

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
				for(int i=0;i<Question1.Length;i++)
				{
					System.out.println(Question1[i]);
				}
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
					for(int i=0;i<Question2.Length;i++)
					{
						System.out.println(Question2[i]);
					}
					res2 = Questions.question2();
				}
				if(validate(res2))
				{
					for(int i=0;i<Question3.Length;i++)
					{
						System.out.println(Question3[i]);
					}
					res3=Questions.question3();
				}
				if(validate(res3))
				{
					for(int i=0;i<Question4.Length;i++)
					{
						System.out.println(Question4[i]);
					}
					res4=Questions.question4();
				}
				if(validate(res4))
				{
					for(int i=0;i<Question5.Length;i++)
					{
						System.out.println(Question5[i]);
					}
					res5=Questions.question5();
				}
				if(validate(res5))
				{
					for(int i=0;i<Question6.Length;i++)
					{
						System.out.println(Question6[i]);
					}
					res6=Questions.question6();
				}
				if(validate(res6))
				{
					for(int i=0;i<Question7.Length;i++)
					{
						System.out.println(Question7[i]);
					}
					res7=Questions.question7();
				}
				if(validate(res7))
				{
					for(int i=0;i<Question8.Length;i++)
					{
						System.out.println(Question8[i]);
					}
					res8=Questions.question8();
				}
				if(validate(res8))
				{
					for(int i=0;i<Question9.Length;i++)
					{
						System.out.println(Question9[i]);
					}
					res9=Questions.question9();
				}
				if(validate(res9))
				{
					for(int i=0;i<Question10.Length;i++)
					{
						System.out.println(Question10[i]);
					}
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
