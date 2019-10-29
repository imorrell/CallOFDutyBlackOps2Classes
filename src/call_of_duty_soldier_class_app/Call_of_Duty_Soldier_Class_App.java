/*
 * Project: HandOut Project- Your Class 
 * Professor: Tedd Sperling
 * Course: Introduction to JAVA - (72636)
 * Programmer: Ivoire Morrell
 * This program lets the user select a pre-made soilder class for black ops 2
 * These classes are defined within their own classes and inherit their attributes
 * and methods from a super solider class. The user is also able to create their 
 * own class
 */
package call_of_duty_soldier_class_app;

// import scanner class
import java.util.Scanner;

public class Call_of_Duty_Soldier_Class_App
{

    public static void main(String[] args)
    {
        //Create variables
        double kills = 0;
        double deaths = 0;
        int userSelection = 0;
        boolean ok = true;
        Scanner sc = new Scanner(System.in);

        //Display welcome message
        System.out.println("Welcome to the Black Ops 2 Soldier class Selector!!!" + "\n");

        //Use wHile loop to process user selcetion
        while (ok)
        {
            System.out.println("Please select your class from the following menu" + "\n");

            //Display menu
            System.out.println("Black Ops 2: Class Selector");
            System.out.println("------------------------------");
            System.out.println("1. The Heavy" + "\n"
                    + "2. The Ninja" + "\n"
                    + "3. The PathFinder" + "\n"
                    + "4. The Speedster" + "\n"
                    + "5. The Camper" + "\n");
            //Make user selection
            userSelection = MyValidation.getIntWithinRange(sc, "Select a Class", 0, 6);

            System.out.println("");

            //Use switch loop to process user selection
            switch (userSelection)
            {
                case 1:
                    //Create a heavy object
                    Heavy h = new Heavy();

                    //Display class weapons and attributes
                    h.displayClassLayout();

                    //Display class description
                    h.soldierDescription();

                    //Tell user to test the class and record their kills and deaths
                    //so that they can see their kill death ratio

                    System.out.println("Go to your Black Ops 2 Class layout out," + "\n"
                            + "enter these attributes in your class, and play a" + "\n"
                            + "online game to test the class efficientcy" + "\n");

                    //Ask user for amount of kills that recieved using this class
                    kills = MyValidation.getInt(sc, "How many kill did you get using " + h.codeName
                            + " class?");

                    System.out.println("");

                    //Ask the user for the amount of deaths
                    deaths = MyValidation.getInt(sc, "How many deaths did you accumulate using " + h.codeName
                            + " class?");

                    System.out.println("");

                    //Sent the kills and deaths to the set kills, and set deaths
                    //methods in the soldier class. Calculate the kill/death ratio
                    //and display the results

                    h.setKills(kills);
                    h.setDeaths(deaths);

                    h.killDeathRatio(kills, deaths);

                    h.displayStats();
                    break;

                case 2:
                    //create a ninja object
                    Ninja n = new Ninja();

                    //Display class layout
                    n.displayClassLayout();

                    //display description
                    n.soldierDescription();

                    //Tell user to test the class and record their kills and deaths
                    //so that they can see their kill death ratio

                    System.out.println("Go to your Black Ops 2 Class layout out," + "\n"
                            + "enter these attributes in your class, and play a" + "\n"
                            + "online game to test the class efficientcy" + "\n");

                    //Ask user for amount of kills that recieved using this class
                    kills = MyValidation.getInt(sc, "How many kill did you get using " + n.codeName
                            + " class?");

                    System.out.println("");

                    //Ask the user for the amount of deaths
                    deaths = MyValidation.getInt(sc, "How many deaths did you accumulate using " + n.codeName
                            + " class?");

                    System.out.println("");

                    //Sent the kills and deaths to the set kills, and set deaths
                    //methods in the soldier class. Calculate the kill/death ratio
                    //and display the results

                    n.setKills(kills);
                    n.setDeaths(deaths);

                    n.killDeathRatio(kills, deaths);

                    n.displayStats();
                    break;

                case 3:
                    //Create a pathfinder object
                    PathFinder path = new PathFinder();

                    //Display class layout
                    path.displayClassLayout();

                    //Display class description
                    path.soldierDescription();

                    //Tell user to test the class and record their kills and deaths
                    //so that they can see their kill death ratio

                    System.out.println("Go to your Black Ops 2 Class layout out," + "\n"
                            + "enter these attributes in your class, and play a" + "\n"
                            + "online game to test the class efficientcy" + "\n");

                    //Ask user for amount of kills that recieved using this class
                    kills = MyValidation.getInt(sc, "How many kill did you get using " + path.codeName
                            + " class?");

                    System.out.println("");

                    //Ask the user for the amount of deaths
                    deaths = MyValidation.getInt(sc, "How many deaths did you accumulate using " + path.codeName
                            + " class?");

                    System.out.println("");

                    //Sent the kills and deaths to the set kills, and set deaths
                    //methods in the soldier class. Calculate the kill/death ratio
                    //and display the results

                    path.setKills(kills);
                    path.setDeaths(deaths);

                    path.killDeathRatio(kills, deaths);

                    path.displayStats();
                    break;

                case 4:
                    //Create a speedster object
                    Speedster speed = new Speedster();

                    //Display class layout
                    speed.displayClassLayout();

                    //Display class description
                    speed.soldierDescription();

                    //Tell user to test the class and record their kills and deaths
                    //so that they can see their kill death ratio

                    System.out.println("Go to your Black Ops 2 Class layout out," + "\n"
                            + "enter these attributes in your class, and play a" + "\n"
                            + "online game to test the class efficientcy" + "\n");

                    //Ask user for amount of kills that recieved using this class
                    kills = MyValidation.getInt(sc, "How many kill did you get using " + speed.codeName
                            + " class?");

                    System.out.println("");

                    //Ask the user for the amount of deaths
                    deaths = MyValidation.getInt(sc, "How many deaths did you accumulate using " + speed.codeName
                            + " class?");

                    System.out.println("");

                    //Sent the kills and deaths to the set kills, and set deaths
                    //methods in the soldier class. Calculate the kill/death ratio
                    //and display the results

                    speed.setKills(kills);
                    speed.setDeaths(deaths);

                    speed.killDeathRatio(kills, deaths);

                    speed.displayStats();
                    break;

                case 5:
                    //create a camper object
                    Camper camp = new Camper();

                    //display class layour
                    camp.displayClassLayout();

                    //display class description
                    camp.soldierDescription();

                    //Tell user to test the class and record their kills and deaths
                    //so that they can see their kill death ratio

                    System.out.println("Go to your Black Ops 2 Class layout out," + "\n"
                            + "enter these attributes in your class, and play a" + "\n"
                            + "online game to test the class efficientcy" + "\n");

                    //Ask user for amount of kills that recieved using this class
                    kills = MyValidation.getInt(sc, "How many kill did you get using " + camp.codeName
                            + " class?");

                    System.out.println("");

                    //Ask the user for the amount of deaths
                    deaths = MyValidation.getInt(sc, "How many deaths did you accumulate using " + camp.codeName
                            + " class?");

                    System.out.println("");

                    //Sent the kills and deaths to the set kills, and set deaths
                    //methods in the soldier class. Calculate the kill/death ratio
                    //and display the results

                    camp.setKills(kills);
                    camp.setDeaths(deaths);

                    camp.killDeathRatio(kills, deaths);

                    camp.displayStats();
                    break;
            }
            //Would user like to try another class?
            ok = MyValidation.getContinue();
            System.out.println("");
        }
        //End of program
        System.out.println("Program Ended. User accessed " + Soldier.soldierCount()
                + " soldier classes.");




    }
}
