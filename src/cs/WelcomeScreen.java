package cs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class WelcomeScreen {
public static void loading () {
	Scanner values = new Scanner(System.in);
	System.out.println("\tWelcome to an OOP Model of Counter Strike");
	System.out.println("--------------------------------------------------------------");
	System.out.println("\n");
	System.out.println("\tA Project by Muhammad Osama (356270)");
	int var = 0;
	
	System.out.println("Please Select an option to tell the program how it should proceed");
	System.out.println("1 will launch the game ");
	System.out.println("2 will exit the game ");
	var = values.nextInt();
	if (var==1)
	{
		System.out.println("Welcome to an OOP Model of CS, the output of which is strictly console based!!!");
	}
	if (var==2) 
	{
		System.exit(var);
	}
}
}
