import java.util.Scanner;
import java.util.Collection;

public class Questions {
	public static int lifelines =2;
	public static int audiancepol =1;
	public static int fiftyfifty=1;
	
	ArrayList Question1=new ArrayList();
	Question1.add("Question No 1:");
	Question1.add("Which is the captial of India :");
	Question1.add("1.Dhaka ");
	Question1.add("2.Colombo ");
	Question1.add("3.New Delhi ");
	Question1.add("4.Istanbul ");
	Question1.add("5.Quit ");
	Question1.add("6.Lifelines ");
	
	ArrayList Question2=new ArrayList();
	Question2.add("Question No 2:");
	Question2.add("Which is the highest mountain peak in the world :");
	Question2.add("1.Swiss Alpes ");
	Question2.add("2.Himalayas ");
	Question2.add("3.Mount Tabu ");
	Question2.add("4.Western Ghats ");
	Question2.add("5.Quit ");
	Question2.add("6.Lifelines ");
	
	ArrayList Question3=new ArrayList();
	Question3.add("Question No 3:");
	Question3.add("Which is the full form of WHO :");
	Question3.add("1.World Health Organization ");
	Question3.add("2.World Human Organization ");
	Question3.add("3.Womens Housing Organization ");
	Question3.add("4.William Home Openings ");
	Question3.add("5.Quit ");
	Question3.add("6.Lifelines ");
	
	ArrayList Question4=new ArrayList();
	Question4.add("Question No 4:");
	Question4.add("Which is the biggest District in Karnataka State :");
	Question4.add("1.Bengalore ");
	Question4.add("2.Mysore ");
	Question4.add("3.Mangalore ");
	Question4.add("4.Belgaum ");
	Question4.add("5.Quit ");
	Question4.add("6.Lifelines ");
	
	ArrayList Question5=new ArrayList();
	Question5.add("Question No 5:");
	Question5.add("Which state is the highest producer of coffee in India :");
	Question5.add("1.Kerela ");
	Question5.add("2.Tamil Nadu  ");
	Question5.add("3.Karnataka ");
	Question5.add("4.Andhra Pradesh  ");
	Question5.add("5.Quit ");
	Question5.add("6.Lifelines ");
	
	ArrayList Question6=new ArrayList();
	Question6.add("Question No 6:");
	Question6.add("Who is the Prime Minister of India :");
	Question6.add("1.Narendra Modi  ");
	Question6.add("2.Rahul Gandhi ");
	Question6.add("3.Sonia Gandhi ");
	Question6.add("4.Arvind Kejriwal ");
	Question6.add("5.Quit ");
	Question6.add("6.Lifelines ");
	
	ArrayList Question7=new ArrayList();
	Question7.add("Question No 7:");
	Question7.add("Who is the chief minister of Karnataka :");
	Question7.add("1.Basavaraj Bommai ");
	Question7.add("2.H D Kumaraswamy");
	Question7.add("3.D K Shivakumar ");
	Question7.add("4.Siddaramaiah ");
	Question7.add("5.Quit ");
	Question7.add("6.Lifelines ");
	
	ArrayList Question8=new ArrayList();
	Question8.add("Question No 8:");
	Question8.add("Which among the four is an Indian car manufacturing company :");
	Question8.add("1.Toyota ");
	Question8.add("2.Ford ");
	Question8.add("3.Tata ");
	Question8.add("4.Lexus ");
	Question8.add("5.Quit ");
	Question8.add("6.Lifelines ");
	
	ArrayList Question9=new ArrayList();
	Question8.add("Question No 9:");
	Question8.add("Who among the four operates on human bodies and performs surgeries :");
	Question8.add("1.Doctor ");
	Question8.add("2.Engineer ");
	Question8.add("3.Teacher ");
	Question8.add("4.Barber ");
	Question8.add("5.Quit ");
	Question8.add("6.Lifelines ");
	
	ArrayList Question10=new ArrayList();
	Question8.add("Question No 10:");
	Question8.add("Who won the gold medal for India in the Olympics for javlin throw :");
	Question8.add("1.P V Sindhu  ");
	Question8.add("2.Nirav Chopra ");
	Question8.add("3.Virat Kolhi ");
	Question8.add("4.Rohit Sharma ");
	Question8.add("5.Quit ");
	Question8.add("6.Lifelines ");
	

	public static boolean question1()
	{
		try {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Question No 1:");
//		System.out.println("Which is the captial of India :");
//		System.out.println("1.Dhaka ");
//		System.out.println("2.Colombo ");
//		System.out.println("3.New Delhi ");
//		System.out.println("4.Istanbul ");
//		System.out.println("5.Quit ");
//		System.out.println("6.Lifelines ");
		int ans=scan.nextInt();
		if(ans==3)
		{
			System.out.println("Your answer is correct");
			MainApp.participant.amount+=10;
			System.out.println("Your amount is "+MainApp.participant.amount);
			System.out.println("==============================================================");
			return true;
		}
		else if(ans==5)
		{
			System.out.println("Your amount is "+MainApp.participant.amount);
			System.out.println("Thank you for your participation");
			System.out.println("==============================================================");
			System.exit(0);
		}
		else if(ans==6)
		{
			System.out.println("There are "+lifelines+" lifelines available:");
			if(lifelines==2)
			{
				System.out.println("1. Audiance Poll");
				System.out.println("2. 50/50");
				int Lifelineno=scan.nextInt();
				if(Lifelineno==1)
				{
					boolean lifelineres1=audiancepollq1();
					//MainApp.validate(lifelineres1);
					lifelines--;
					audiancepol--;
					return lifelineres1;
				}
				else if(Lifelineno==2)
				{
					boolean lifelineres1=fiftyfiftyq1();
					//MainApp.validate(lifelineres1);
					lifelines--;
					fiftyfifty--;
					return lifelineres1;
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
			else if(audiancepol==1 && fiftyfifty==0)
			{
				System.out.println("1. Audiance Poll");
				int anslifeline=scan.nextInt();
				if(anslifeline==1)
				{
					boolean lifelineres1=audiancepollq1();
					//MainApp.validate(lifelineres1);
					lifelines--;
					audiancepol--;
					return lifelineres1;
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
			else if(fiftyfifty==1 && audiancepol==0)
			{
				System.out.println("1. 50/50");
				int anslifeline=scan.nextInt();
				if(anslifeline==1)
				{
					boolean lifelineres1=fiftyfiftyq1();
					//MainApp.validate(lifelineres1);
					lifelines--;
					fiftyfifty--;
					return lifelineres1;
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
			else if(lifelines<=0)
			{
				System.out.println("Would like to quit the game?");
				System.out.println("1.Yes");
				System.out.println("2.No");
				int quit=scan.nextInt();
				if(quit==1)
				{
					System.out.println("Your amount is "+MainApp.participant.amount);
					System.out.println("Thank you for participation");
					System.exit(0);
				}
				else if(quit==2)
				{
					boolean resq=question1();
					return resq;
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
		}
		else
		{
			System.out.println("Your answer is wrong");
			System.out.println("Your amount is "+MainApp.participant.amount);
			return false;
		}
		//System.out.println("==============================================================");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return false;
	}
	public static boolean question2()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 2:");
//			System.out.println("Which is the highest mountain peak in the world :");
//			System.out.println("1.Swiss Alpes ");
//			System.out.println("2.Himalayas ");
//			System.out.println("3.Mount Tabu ");
//			System.out.println("4.Western Ghats ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres2=audiancepollq2();
						//MainApp.validate(lifelineres2);
						lifelines--;
						audiancepol--;
						return lifelineres2;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres2=fiftyfiftyq2();
						//MainApp.validate(lifelineres2);
						lifelines--;
						fiftyfifty--;
						return lifelineres2;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres2=audiancepollq2();
						//MainApp.validate(lifelineres2);
						lifelines--;
						audiancepol--;
						return lifelineres2;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres2=fiftyfiftyq2();
						//MainApp.validate(lifelineres2);
						lifelines--;
						fiftyfifty--;
						return lifelineres2;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question2();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question3()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 3:");
//			System.out.println("Which is the full form of WHO :");
//			System.out.println("1.World Health Organization ");
//			System.out.println("2.World Human Organization ");
//			System.out.println("3.Womens Housing Organization ");
//			System.out.println("4.William Home Openings ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres3=audiancepollq3();
						//MainApp.validate(lifelineres3);
						lifelines--;
						audiancepol--;
						return lifelineres3;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres3=fiftyfiftyq3();
						//MainApp.validate(lifelineres3);
						lifelines--;
						fiftyfifty--;
						return lifelineres3;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres3=audiancepollq3();
						//MainApp.validate(lifelineres3);
						lifelines--;
						audiancepol--;
						return lifelineres3;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres3=fiftyfiftyq3();
						//MainApp.validate(lifelineres3);
						lifelines--;
						fiftyfifty--;
						return lifelineres3;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question3();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question4()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 4:");
//			System.out.println("Which is the biggest District in Karnataka State :");
//			System.out.println("1.Bengalore ");
//			System.out.println("2.Mysore ");
//			System.out.println("3.Mangalore ");
//			System.out.println("4.Belgaum ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==4)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres4=audiancepollq4();
						//MainApp.validate(lifelineres4);
						lifelines--;
						audiancepol--;
						return lifelineres4;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres4=fiftyfiftyq4();
						//MainApp.validate(lifelineres4);
						lifelines--;
						fiftyfifty--;
						return lifelineres4;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres4=audiancepollq4();
						//MainApp.validate(lifelineres4);
						lifelines--;
						audiancepol--;
						return lifelineres4;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres4=fiftyfiftyq4();
						//MainApp.validate(lifelineres4);
						lifelines--;
						fiftyfifty--;
						return lifelineres4;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question4();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question5()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 5:");
//			System.out.println("Which state is the highest producer of coffee in India :");
//			System.out.println("1.Kerela ");
//			System.out.println("2.Tamil Nadu ");
//			System.out.println("3.Karnataka ");
//			System.out.println("4.Andhra Pradesh ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==3)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres5=audiancepollq5();
						//MainApp.validate(lifelineres5);
						lifelines--;
						audiancepol--;
						return lifelineres5;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres5=fiftyfiftyq5();
						//MainApp.validate(lifelineres5);
						lifelines--;
						fiftyfifty--;
						return lifelineres5;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres5=audiancepollq5();
						//MainApp.validate(lifelineres5);
						lifelines--;
						audiancepol--;
						return lifelineres5;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres5=fiftyfiftyq5();
						//MainApp.validate(lifelineres5);
						lifelines--;
						fiftyfifty--;
						return lifelineres5;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question5();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question6()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 6:");
//			System.out.println("Who is the Prime Minister of India :");
//			System.out.println("1.Narendra Modi ");
//			System.out.println("2.Rahul Gandhi ");
//			System.out.println("3.Sonia Gandhi ");
//			System.out.println("4.Arvind Kejriwal ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres6=audiancepollq6();
						//MainApp.validate(lifelineres6);
						lifelines--;
						audiancepol--;
						return lifelineres6;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres6=fiftyfiftyq6();
						//MainApp.validate(lifelineres6);
						lifelines--;
						fiftyfifty--;
						return lifelineres6;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres6=audiancepollq6();
						//MainApp.validate(lifelineres6);
						lifelines--;
						audiancepol--;
						return lifelineres6;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres6=fiftyfiftyq6();
						//MainApp.validate(lifelineres6);
						lifelines--;
						fiftyfifty--;
						return lifelineres6;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question6();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question7()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 7:");
//			System.out.println("Who is the chief minister of Karnataka :");
//			System.out.println("1.Basavaraj Bommai ");
//			System.out.println("2.H D Kumaraswamy");
//			System.out.println("3.D K Shivakumar ");
//			System.out.println("4.Siddaramaiah ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==4)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres7=audiancepollq7();
						//MainApp.validate(lifelineres7);
						lifelines--;
						audiancepol--;
						return lifelineres7;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres7=fiftyfiftyq7();
						//MainApp.validate(lifelineres7);
						lifelines--;
						fiftyfifty--;
						return lifelineres7;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres7=audiancepollq7();
						//MainApp.validate(lifelineres7);
						lifelines--;
						audiancepol--;
						return lifelineres7;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres7=fiftyfiftyq7();
						//MainApp.validate(lifelineres7);
						lifelines--;
						fiftyfifty--;
						return lifelineres7;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question7();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question8()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 8:");
//			System.out.println("Which among the four is an Indian car manufacturing company :");
//			System.out.println("1.Toyota ");
//			System.out.println("2.Ford ");
//			System.out.println("3.Tata ");
//			System.out.println("4.Lexus ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==3)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres8=audiancepollq8();
						//MainApp.validate(lifelineres8);
						lifelines--;
						audiancepol--;
						return lifelineres8;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres8=fiftyfiftyq8();
						//MainApp.validate(lifelineres8);
						lifelines--;
						fiftyfifty--;
						return lifelineres8;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres8=audiancepollq8();
						//MainApp.validate(lifelineres8);
						lifelines--;
						audiancepol--;
						return lifelineres8;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres8=fiftyfiftyq1();
						//MainApp.validate(lifelineres1);
						lifelines--;
						fiftyfifty--;
						return lifelineres8;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question8();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question9()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 9:");
//			System.out.println("Who among the four operates on human bodies and performs surgeries :");
//			System.out.println("1.Doctor ");
//			System.out.println("2.Engineer ");
//			System.out.println("3.Teacher ");
//			System.out.println("4.Barber ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres9=audiancepollq9();
						//MainApp.validate(lifelineres9);
						lifelines--;
						audiancepol--;
						return lifelineres9;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres9=fiftyfiftyq9();
						//MainApp.validate(lifelineres9);
						lifelines--;
						fiftyfifty--;
						return lifelineres9;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres9=audiancepollq9();
						//MainApp.validate(lifelineres9);
						lifelines--;
						audiancepol--;
						return lifelineres9;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres9=fiftyfiftyq9();
						//MainApp.validate(lifelineres9);
						lifelines--;
						fiftyfifty--;
						return lifelineres9;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question9();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			//System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}
	public static boolean question10()
	{
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.println("Question No 10:");
//			System.out.println("Who won the gold medal for India in the Olympics for javlin throw :");
//			System.out.println("1.P V Sindhu ");
//			System.out.println("2.Nirav Chopra ");
//			System.out.println("3.Virat Kolhi ");
//			System.out.println("4.Rohit Sharma ");
//			System.out.println("5.Quit ");
//			System.out.println("6.Lifelines ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("Thank you for your participation");
				System.out.println("==============================================================");
				System.exit(0);
			}
			else if(ans==6)
			{
				System.out.println("There are "+lifelines+" lifelines available:");
				if(lifelines==2)
				{
					System.out.println("1. Audiance Poll");
					System.out.println("2. 50/50");
					int Lifelineno=scan.nextInt();
					if(Lifelineno==1)
					{
						boolean lifelineres10=audiancepollq10();
						//MainApp.validate(lifelineres10);
						lifelines--;
						audiancepol--;
						return lifelineres10;
					}
					else if(Lifelineno==2)
					{
						boolean lifelineres10=fiftyfiftyq10();
						//MainApp.validate(lifelineres10);
						lifelines--;
						fiftyfifty--;
						return lifelineres10;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(audiancepol==1 && fiftyfifty==0)
				{
					System.out.println("1. Audiance Poll");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres10=audiancepollq10();
						//MainApp.validate(lifelineres10);
						lifelines--;
						audiancepol--;
						return lifelineres10;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(fiftyfifty==1 && audiancepol==0)
				{
					System.out.println("1. 50/50");
					int anslifeline=scan.nextInt();
					if(anslifeline==1)
					{
						boolean lifelineres10=fiftyfiftyq10();
						//MainApp.validate(lifelineres10);
						lifelines--;
						fiftyfifty--;
						return lifelineres10;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				else if(lifelines<=0)
				{
					System.out.println("Would like to quit the game?");
					System.out.println("1.Yes");
					System.out.println("2.No");
					int quit=scan.nextInt();
					if(quit==1)
					{
						System.out.println("Your amount is "+MainApp.participant.amount);
						System.out.println("Thank you for participation");
						System.exit(0);
					}
					else if(quit==2)
					{
						boolean resq=question10();
						return resq;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			System.out.println("==============================================================");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return false;
	}

	
	

	public static boolean audiancepollq1()
	{
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Which is the captial of India :");
			System.out.println("1.Dhaka  5%");
			System.out.println("2.Colombo 10%");
			System.out.println("3.New Delhi 80%");
			System.out.println("4.Istanbul 5%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==3)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq2()
	{
		try {
			Scanner scan = new Scanner(System.in);
			//System.out.println("Question No 2:");
			System.out.println("Which is the highest mountain peak in the world :");
			System.out.println("1.Swiss Alpes 10%");
			System.out.println("2.Himalayas  75%");
			System.out.println("3.Mount Tabu 5%");
			System.out.println("4.Western Ghats 10%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq3()
	{
		try {
			Scanner scan = new Scanner(System.in);
			//System.out.println("Question No 3:");
			System.out.println("Which is the full form of WHO :");
			System.out.println("1.World Health Organization  80%");
			System.out.println("2.World Human Organization 10%");
			System.out.println("3.Womens Housing Organization 5%");
			System.out.println("4.William Home Openings 5%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq4()
	{
		try {
			Scanner scan = new Scanner(System.in);
			//System.out.println("Question No 4:");
			System.out.println("Which is the biggest District in Karnataka State :");
			System.out.println("1.Bengalore 30%");
			System.out.println("2.Mysore 25%");
			System.out.println("3.Mangalore 10%");
			System.out.println("4.Belgaum 35%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==4)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq5()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which state is the highest producer of coffee in India :");
			System.out.println("1.Kerela 10%");
			System.out.println("2.Tamil Nadu 15%");
			System.out.println("3.Karnataka 65%");
			System.out.println("4.Andhra Pradesh 10%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==3)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq6()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who is the Prime Minister of India :");
			System.out.println("1.Narendra Modi 90%");
			System.out.println("2.Rahul Gandhi 5%");
			System.out.println("3.Sonia Gandhi 0%");
			System.out.println("4.Arvind Kejriwal 5%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq7()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who is the chief minister of Karnataka :");
			System.out.println("1.Basavaraj Bommai 25%");
			System.out.println("2.H D Kumaraswamy 10%");
			System.out.println("3.D K Shivakumar 25%");
			System.out.println("4.Siddaramaiah 40%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==4)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq8()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which among the four is an Indian car manufacturing company :");
			System.out.println("1.Toyota 5%");
			System.out.println("2.Ford 5%");
			System.out.println("3.Tata 90%");
			System.out.println("4.Lexus 0%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==3)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq9()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who among the four operates on human bodies and performs surgeries :");
			System.out.println("1.Doctor 100%");
			System.out.println("2.Engineer 0%");
			System.out.println("3.Teacher 0%");
			System.out.println("4.Barber 0%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean audiancepollq10()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who won the gold medal for India in the Olympics for javlin throw :");
			System.out.println("1.P V Sindhu 15%");
			System.out.println("2.Nirav Chopra 50%");
			System.out.println("3.Virat Kolhi 15%");
			System.out.println("4.Rohit Sharma 20%");
			System.out.println("5.Quit ");
			int ans=scan.nextInt();
			if(ans==5)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	
	
	

	public static boolean fiftyfiftyq1()
	{
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Which is the captial of India :");
			//System.out.println("1.Dhaka  5%");
			System.out.println("1.Colombo ");
			System.out.println("2.New Delhi ");
			//System.out.println(".Istanbul 5%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq2()
	{
		try {
			Scanner scan = new Scanner(System.in);
			//System.out.println("Question No 2:");
			System.out.println("Which is the highest mountain peak in the world :");
			System.out.println("1.Swiss Alpes ");
			System.out.println("2.Himalayas ");
			//System.out.println("3.Mount Tabu 5%");
			//System.out.println("4.Western Ghats 10%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
				
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq3()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which is the full form of WHO :");
			System.out.println("1.World Health Organization ");
			System.out.println("2.World Human Organization ");
			//System.out.println("3.Womens Housing Organization 5%");
			//System.out.println("4.William Home Openings 5%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
				
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq4()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which is the biggest District in Karnataka State :");
			System.out.println("1.Bengalore ");
			//System.out.println("2.Mysore 25%");
			//System.out.println("3.Mangalore 10%");
			System.out.println("2.Belgaum ");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
				
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq5()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which state is the highest producer of coffee in India :");
			//System.out.println("1.Kerela 10%");
			System.out.println("1.Tamil Nadu ");
			System.out.println("2.Karnataka ");
			//System.out.println("4.Andhra Pradesh 10%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq6()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who is the Prime Minister of India :");
			System.out.println("1.Narendra Modi ");
			//System.out.println("2.Rahul Gandhi 5%");
			//System.out.println("3.Sonia Gandhi 0%");
			System.out.println("2.Arvind Kejriwal ");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq7()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who is the chief minister of Karnataka :");
			System.out.println("1.Basavaraj Bommai ");
			//System.out.println("2.H D Kumaraswamy 10%");
			//System.out.println("3.D K Shivakumar 25%");
			System.out.println("2.Siddaramaiah ");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq8()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which among the four is an Indian car manufacturing company :");
			System.out.println("1.Toyota ");
			//System.out.println("2.Ford 5%");
			System.out.println("2.Tata ");
			//System.out.println("4.Lexus 0%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==1)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==2)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq9()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who among the four operates on human bodies and performs surgeries :");
			System.out.println("1.Doctor ");
			System.out.println("2.Engineer ");
			//System.out.println("3.Teacher 0%");
			//System.out.println("4.Barber 0%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}
	public static boolean fiftyfiftyq10()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Who won the gold medal for India in the Olympics for javlin throw :");
			//System.out.println("1.P V Sindhu 15%");
			System.out.println("1.Nirav Chopra ");
			System.out.println("2.Virat Kolhi ");
			//System.out.println("4.Rohit Sharma 20%");
			System.out.println("3.Quit ");
			int ans=scan.nextInt();
			if(ans==2)
			{
				System.out.println("Your answer is wrong");
				System.out.println("Your amount is "+MainApp.participant.amount);
				return false;
			}
			else if(ans==1)
			{
				System.out.println("Your answer is correct");
				MainApp.participant.amount+=10;
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.out.println("==============================================================");
				return true;
			}
			else if(ans==3)
			{
				System.out.println("Your amount is "+MainApp.participant.amount);
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return false;
	}

}

