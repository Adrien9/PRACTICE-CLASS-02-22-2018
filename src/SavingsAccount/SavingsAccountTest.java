package SavingsAccount;

import java.util.Scanner;

public class SavingsAccountTest {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);


		System.out.println("What is the user's username, pin, and balance?");

		SavingsAccount s1=new SavingsAccount(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
	
		scanner.nextLine();

		System.out.println("What is the user's username, pin, and balance?");

		SavingsAccount s2=new SavingsAccount(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());

		scanner.nextLine();

		System.out.println("What is the user's username, pin, and balance?");

		SavingsAccount s3=new SavingsAccount(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());


		System.out.println(s1.usern);
		System.out.println(s1.pin);
		System.out.println(s1.balance);
		
		System.out.println(s2.usern);
		System.out.println(s2.pin);
		System.out.println(s2.balance);
		
		System.out.println(s3.usern);
		System.out.println(s3.pin);
		System.out.println(s3.balance);
		
		scanner.nextLine();

		System.out.println("What account are you using? 1 for account 1, 2 for account 2, and 3 for account 3.");
		double a=scanner.nextDouble();

		System.out.println("Do you want to withdraw or deposit? 1 for withdraw, 2 for deposit.");
		double wd=scanner.nextDouble();

		System.out.println("How much money?");
		double money=scanner.nextDouble(); 

		if(a==1){


			if(wd==1){

				double w= s1.balance-money;
				System.out.println(w);
			}

			if(wd==2){

				double d= s1.balance+money;
				System.out.println(d);
			}
		}
		

			if(a==2){


				if(wd==1){

					double w2= s2.balance-money;
					System.out.println(w2);
				}

				if(wd==2){

					double d2= s2.balance+money;
					System.out.println(d2);
				}
			}
				if(a==3){


					if(wd==1){

						double w3= s3.balance-money;
						System.out.println(w3);
					}

					if(wd==2){

						double w4= s3.balance+money;
						System.out.println(w4);
				}
			}
		}
	}