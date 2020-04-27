
import java.util.Scanner;


public class total {
    
    
    public void ClassAnswer(String ClassAnswer)
    {
        if (ClassAnswer.equals("freshman")){
      System.out.println("Your housing options are:");
      System.out.println("Leo Hall");
      System.out.println("Champagnat Hall");
      System.out.println("Marian Hall");
      System.out.println("Sheahan Hall");
    }
    if (ClassAnswer.equals("sophomore")){
      System.out.println("Your housing options are:");
      System.out.println("Midrise Hall");
      System.out.println("Foy Townhouses (A-C)");
      System.out.println("New Townhouses (H-M)");
      System.out.println("Lower West Cedar St Townhouses (N-S)");
      System.out.println("Upper West Cedar St Townhouses (T-Y");
    }
    else{
      System.out.println("Your housing options are:");
      System.out.println("Building A");
      System.out.println("New Fulton Townhouses");
      System.out.println("Fulton Street Townhouses");
      System.out.println("Talmadge Court");
    }

    // here the users input will determine whether or
    // not additional calculations will take place to 
    // find the average

    System.out.println("Please enter 'yes' or 'no' to"
        + " the following question");
    System.out.println("Would you like to calulate you"
        + " and 3 others priority points average?");

    // here is where the user will input 4 people's
    // priority points to be averaged

    }
    public void avganswer(String AvgAnswer)
    {
            Scanner input = new Scanner(System.in);

        if (AvgAnswer.equals("yes")){
      System.out.println("Please enter the 4 priority points");
      double avg = input.nextDouble();
      double avg2 = input.nextDouble();
      double avg3 = input.nextDouble();
      double avg4 = input.nextDouble(); 

      // here is where the average will be calculated.      

      double AvgAverage = ((avg + avg2 + avg3 + avg4) / 4);
      System.out.println(AvgAverage);
    }
    else{
      System.out.println("okay then! Thank you for using "
          + "Jake's Housing App!");
    }
    }
    
}
