
import java.util.Scanner;
public class Main {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int clubPoints = 0;
    int sportsPoints = 0;
    int historyPoints = 0;
    int roomPoints = 0;
    int servicePoints = 0;
    int iSportsPoints = 0;

    //starting here the user will input their
    // information.

    System.out.print("Welcome to the Housing Calculator");
    System.out.print("Please answer the following");
    System.out.println(" series of questions :");

    // here the user will input their GPA
    // and see how many priority points
    // it translates too.

    System.out.print("***NOTE*** the scale is from 0.0");
    System.out.print(" to 4.0");
    System.out.println(" [example: 3.25]");
    System.out.println("Please enter your current GPA: ");

    // here is where the user's GPA
    // translates to points

    answer answer= new answer();
    double GPA = input.nextDouble();
    answer.gpa(GPA);

    // here the user will input their club
    // information and see how many priority
    // points it translates too.

    System.out.print("Please enter the amount of clubs");
    System.out.print(" you are involved in: [example: '0");
    System.out.println("' to '10']");

    // here is where the the user's input
    // gets determined whether or not the
    // next series of questions are asked
    // based on their input

    double clubs = input.nextDouble();
    clubs club = new clubs();
    club.clubs(clubs);

      // if the user's input was greater than 0
      // then their input will be calculated here
      // and translated into priority points

      String ans = input.next();
      if (ans.equals("yes")){
        System.out.println(clubs * 2 +" points");
        clubPoints += clubs * 2;
      }
      else{
        System.out.println(clubs * 1 +" point");
        clubPoints += clubs * 1;
      }

      // here the user will input their 
      // and see how many priority points
      // it translates too.

      System.out.println("Please enter 'yes' or 'no' to the "
          + "following question");
      System.out.println("Were you the President/Vice "
          + "President/Secretary or Treasurer?: ");
      String PosAnswer = input.next();
      if (PosAnswer.equals("yes")){
        System.out.println(3 +" points");
        clubPoints += 3;
      }
      else{
        System.out.println(0 +" points");
        clubPoints += 0;
      }
    
    // here the user will answer whether or
    // not they are in a sport. Based on their
    // answer it will determine whether or not
    // the next series of questions are executed.

    System.out.println("Please enter 'yes' or 'no' to the "
        + "following question");
    System.out.println("Are you involved in Marist College's"
        + " Athletics?: ");

    // here is where the users input will be
    // calculated and translated into priority
    // points

    String SportsAnswer = input.next();
    if (SportsAnswer.equals("yes")){
      System.out.println("How many sports?");
      double sports = input.nextDouble();
      System.out.println(sports * 2 +" points");
      sportsPoints += sports * 2;
    }
    else{
      System.out.println(0 +" points");
      sportsPoints += 0;
    }

    // here the user will answer whether or
    // not they are in an intramural. Based on their
    // answer it will determine whether or not
    // the next series of questions are executed.

    System.out.println("Please enter 'yes' or 'no' to "
        + "the following question");
    System.out.println("Are you involved in Marist "
        + "College's Intramurals?: ");

    // here is where the users input will be
    // calculated and translated into priority
    // points

    String iSportsAnswer = input.next();
    if (iSportsAnswer.equals("yes")){
      System.out.println("How many sports?");
      double isports = input.nextDouble();
      System.out.println(isports * 2 +" points");
      iSportsPoints += isports * 2;
    }
    else{
      System.out.println(0 +" points");
      iSportsPoints += 0;
    }

    // here the user will answer whether or
    // not they were involved with Marist's 
    // disciplinary punishments. 

    System.out.println("Please enter 'yes' or 'no'"
        + " to the following question");
    System.out.println("Do you have a Discipline History"
        + " with Marist College this semster?");

    // here is where the users input will be
    // calculated and translated into priority
    // points

    String historyAnswer = input.next();
    if (historyAnswer.equals("yes")){
      System.out.println(0 +" points");
      historyPoints += 0;
    }
    else{
      System.out.println(6 +" points");
      historyPoints += 6;
    }

    // here the user will input their answer
    // to how their room condition is.

    System.out.println("Please enter 'good' or 'bad' "
        + "to the following question");
    System.out.println("In what condition was your"
        + " room?");

    // here is where the users input will be
    // calculated and translated into priority
    // points

    String roomAnswer = input.next();
    if (roomAnswer.equals("good")){
      System.out.println(4 +" points");
      roomPoints += 4;
    }
    else{
      System.out.println(0 +" points");
      roomPoints += 0;
    }

    // here the user will input whether or
    // not they participated in community
    // service and based on their answer 
    // another series of questions will be
    // executed

    System.out.println("Please enter 'yes' or 'no'"
        + " to the following question");
    System.out.println("Did you participate in any"
        + " Service activities?");

    // here is where the users input will be
    // calculated and translated into priority
    // points based on their input

    String serviceAnswer = input.next();
    if (serviceAnswer.equals("yes")){
      System.out.println("How many hours?");
      double hours = input.nextDouble();
      System.out.println(hours * 1 +" points");
      servicePoints += hours * 1;
    }
    else{
      System.out.println(0 +" points");
      servicePoints += 0;
    }

    // here is where all those questions points
    // will be calculated to find the result
    

    double totalAverage = (answer.priorityPoints + clubPoints 
        +sportsPoints + historyPoints+roomPoints
        +servicePoints+ iSportsPoints); 

    // here is where the result will be shown

    System.out.println("Your total priority points is:"
        + " " + totalAverage);

    // here is where based on the users input
    // will determine what their housing options are

    System.out.println("Please enter your classificaition:"
        + " [example: 'Sophmore']");

    // this is where the housing options will be printed
    // and executed based on the input
    HousingChoices HousingChoices= new HousingChoices();
    String ClassAnswer = input.next();
    HousingChoices.ClassAnswer(ClassAnswer);
    
    //String AvgAverage = input.next();
    //HousingChoice.AvgAnswer(AvgAverage);
    
  }
}

