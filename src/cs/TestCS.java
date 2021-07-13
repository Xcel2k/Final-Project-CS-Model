package cs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TestCS {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WelcomeScreen.loading();
		TimeUnit.SECONDS.sleep(1);
		LoadingScreenWithOptions.options();
		Instructions.userManual();
		Scanner input  = new Scanner(System.in);
		Terrorists t = new Terrorists();
		CounterTerrorists ct = new CounterTerrorists();
		System.out.println("1 for Terrorists");
		System.out.println("2 for Counter-Terrorists");
		int a = input.nextInt();
		switch (a) {
		//runtime polymorphism
		case 1: t.chooseCharacter();
				t.choosePistol();
				t.chooseAssaultRifle();
     			t.chooseEquipment();
     			TimeUnit.SECONDS.sleep(1);
     			System.out.println("\n");
				System.out.println("\t\t Round Start");
				t.plantBomb(); 
				ct.defuseBomb();
				break;
		case 2: ct.chooseCharacter();
				ct.choosePistol();
				ct.chooseAssaultRifle();
				ct.chooseEquipment();
				System.out.println("\n");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("\t\t Round Start");
				t.plantBomb();
				ct.defuseBomb();
				break;
		default: System.out.println("Invalid Entry");	 
		}
		
	}

}
