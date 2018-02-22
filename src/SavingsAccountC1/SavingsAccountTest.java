package SavingsAccountC1;
import java.util.Scanner;
public class SavingsAccountTest {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		SavingsAccount s1=new SavingsAccount("J",244757,3500);

		SavingsAccount s2=new SavingsAccount("B",244758,2500);

		SavingsAccount s3=new SavingsAccount("A",244759,1500);


		System.out.println(s1.usern);
		System.out.println(s1.pin);
		System.out.println(s1.balance);

		System.out.println(s2.usern);
		System.out.println(s2.pin);
		System.out.println(s2.balance);

		System.out.println(s3.usern);
		System.out.println(s3.pin);
		System.out.println(s3.balance);



		System.out.println("What account are you using?");
		int a=scanner.nextInt();

		if(a==s1.pin){

			System.out.println("Hi " + s1.usern + ", do you want to withdraw or deposit? 1 for withdraw, 2 for deposit.");
			int wd=scanner.nextInt();

			System.out.println("How much money?");
			double money=scanner.nextDouble(); 

			if(wd==1){

				double w= s1.balance-money;
				System.out.println(w);
			}
		
			if(wd==2){

				double d= s1.balance+money;
				System.out.println(d);
			}
		}


		if(a==s2.pin){

			System.out.println("Hi " + s2.usern + ", do you want to withdraw or deposit? 1 for withdraw, 2 for deposit.");
			int wd=scanner.nextInt();

			System.out.println("How much money?");
			double money=scanner.nextDouble(); 

			if(wd==1){

				double w2= s2.balance-money;
				System.out.println(w2);
			}

			if(wd==2){

				double d2= s2.balance+money;
				System.out.println(d2);
			}
		}
		if(a==s3.pin){

			System.out.println("Hi " + s3.usern + ", do you want to withdraw or deposit? 1 for withdraw, 2 for deposit.");
			int wd=scanner.nextInt();
			
			System.out.println("How much money?");
			double money=scanner.nextDouble(); 

			if(wd==1){

				double w3= s3.balance-money;
				System.out.println(w3);
			}

			if(wd==2){

				double w4= s3.balance+money;
				System.out.println(w4);

			}
		}
		
		else 

		{

			while(a!=s1.pin && a!=s2.pin && a!=s3.pin ){
				
				System.out.println("This is an invalid pin, please try again");
				scanner.nextInt();
			}
			
				
		}

	}
}
