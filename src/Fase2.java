import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase2 {

	public static void main(String[] args) {
		// 
		String[] menu = new String[5];
		int[] price = new int[5];
		
		int five = 5;
		int ten = 10;
		int twenty = 20;
		int fifty = 50;
		int hundred = 100;
		int fivehundred = 500;		
		
	// Fill menu
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < menu.length; i++) {
			System.out.println("Add a meal to the menu: ");
			menu[i] = scan.nextLine();
		}
//		menu[0] = "Sauerkraut";
//		menu[1] = "Pasta";
//		menu[2] = "Pizza";
//		menu[3] = "Salad";
//		menu[4] = "Hamburger";
		
	// Fill price array
		for (int i = 0; i < price.length; i++) {
			System.out.println("Add a price for the "+(i+1)+". meal: ");
			price[i] = scan.nextInt();
			// 'consume' scan.nextLine in order to not fuck up in the next pass
			scan.nextLine();
		}
//		price[0] = 12;
//		price[1] = 6;
//		price[2] = 77;
//		price[3] = 99;
//		price[4] = 3;
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println("\t"+menu[i]+": "+price[i]);
		}
		
		List<String> chosen_meal = new ArrayList<String>();
		
		int hungry = 1;
		while(hungry > 0) {
			System.out.println("Please order a dish:");
			String current_meal = scan.nextLine().trim();
			chosen_meal.add( current_meal );
			
			// ask if still hungry, if not exit
			System.out.println("Are you still hungry?");
			hungry = scan.nextInt();
			// 'Consume' nextLine to not duck in the pass
			scan.nextLine();
		}
		
		System.out.println(chosen_meal);
	}

}
