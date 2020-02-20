import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
		// 
		String[] menu = new String[5];
		int[] price = new int[5];
		
	// Fill menu
		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println("Add a meal to the menu: ");
//			menu[i] = scan.nextLine();
//		}
		menu[0] = "Sauerkraut";
		menu[1] = "Pasta";
		menu[2] = "Pizza";
		menu[3] = "Salad";
		menu[4] = "Hamburger";
		
	// Fill price array
//		for (int i = 0; i < price.length; i++) {
//			System.out.println("Add a price for the "+(i+1)+". meal: ");
//			price[i] = scan.nextInt();
//			// 'consume' scan.nextLine in order to not fuck up in the next pass
//			scan.nextLine();
//		}
		price[0] = 5;
		price[1] = 20;
		price[2] = 15;
		price[3] = 5;
		price[4] = 10;
		
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
		
		//System.out.println(chosen_meal);

		
		int total_price = 0;
		
		for (int i = 0; i < chosen_meal.size(); i++) {
			boolean exists = false;
			for (int j = 0; j < menu.length; j++) {
				if (chosen_meal.get(i).equals(menu[j])) {
					total_price = total_price + price[j];
					exists = true;
				}
			}
			if(exists == false) {System.out.println("The dish " + chosen_meal.get(i) + " doesnt exist on the menu!");}
		}
		
		System.out.println("You have to pay: " + total_price);
	}

}
