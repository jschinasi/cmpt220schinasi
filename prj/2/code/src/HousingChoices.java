import java.util.Scanner;

public class HousingChoices {

	public void ClassAnswer (String ClassAnswer) {
	
		if (ClassAnswer.equals("Sophmore")) {
			System.out.println("Your housing options are:");
		    System.out.println("Midrise Hall");
		    System.out.println("Foy Townhouses (A-C)");
		    System.out.println("New Townhouses (H-M)");
		    System.out.println("Lower West Cedar St Townhouses (N-S)");
		    System.out.println("Upper West Cedar St Townhouses (T-Y");
			
			if (ClassAnswer.equals("Junior")) {
				
				System.out.println("Your housing options are:");
			    System.out.println("Building A");
			    System.out.println("New Fulton Townhouses");
			    System.out.println("Fulton Street Townhouses");
			    System.out.println("Talmadge Court");
				
			}
		}
			else if (ClassAnswer.equals("Senior")) {
				System.out.println("Your housing options are:");
				System.out.println("Fulton Street");
				System.out.println("McCormik Hall");
				System.out.println("O'Shea Hall");
				System.out.println("New Fulton Townhouses");
				System.out.println("Lavelle Hall");
				System.out.println("Ward Hall");
			}	
				else {
				
					 System.out.println("Please enter 'yes' or 'no' to"
						     + " the following question");
					 System.out.println("Would you like to calulate you"
							 + " and 3 others priority points average?");
				

			}
	}
	
	
	
	
}


