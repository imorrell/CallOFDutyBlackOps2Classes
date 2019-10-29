/*This is the main super parent class soldier. This class is the blueprint for
 * the other soldier sub-classes. 
 */
package call_of_duty_soldier_class_app;

import java.text.NumberFormat;

public class Soldier
{
    //Create instant variables for class
    public String codeName = "";
    public String primaryWeapon = "";
    public String secondPrimary = "None";
    public String primaryAttachments = "None";
    public String secondaryWeapons = "None";
    public String secondaryAttachments = "None";
    public String lethal = "None";
    public String tactical = "None";
    public String wildCard = "None";
    public String perks = "None";
    public String scoreStreaks = "";
    public double kills = 0;
    public double deaths = 0;
    private String kdRatio;
    
    public static int getSoldierCount = 0;
    
    //Constructor
    public Soldier ()
    {
        getSoldierCount ++;
    }

    //Getters and setters
    public String getCodeName()
    {
        return codeName;
    }

    public void setCodeName(String codeName)
    {
        this.codeName = codeName;
    }

    public String getPrimaryWeapon()
    {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(String primaryWeapon)
    {
        this.primaryWeapon = primaryWeapon;
    }

    public String getSecondPrimary()
    {
        return secondPrimary;
    }

    public void setSecondPrimary(String secondPrimary)
    {
        this.secondPrimary = secondPrimary;
    }
    
    public String getPrimaryAttachments()
    {
        return primaryAttachments;
    }

    public void setPrimaryAttachments(String primaryAttachments)
    {
        this.primaryAttachments = primaryAttachments;
    }

    public String getSecondaryWeapons()
    {
        return secondaryWeapons;
    }

    public void setSecondaryWeapons(String secondaryWeapons)
    {
        this.secondaryWeapons = secondaryWeapons;
    }

    public String getSecondaryAttachments()
    {
        return secondaryAttachments;
    }

    public void setSecondaryAttachments(String secondaryAttachments)
    {
        this.secondaryAttachments = secondaryAttachments;
    }
    
    public String getLethal()
    {
        return lethal;
    }

    public void setLethal(String lethal)
    {
        this.lethal = lethal;
    }

    public String getTactical()
    {
        return tactical;
    }

    public void setTactical(String tactical)
    {
        this.tactical = tactical;
    }

    public String getWildCard()
    {
        return wildCard;
    }

    public void setWildCard(String wildCard)
    {
        this.wildCard = wildCard;
    }
    
    public String getPerks()
    {
        return perks;
    }

    public void setPerks(String perks)
    {
        this.perks = perks;
    }

    public String getScoreStreaks()
    {
        return scoreStreaks;
    }

    public void setScoreStreaks(String scoreStreaks)
    {
        this.scoreStreaks = scoreStreaks;
    }

    public double getKills()
    {
        return kills;
    }

    public void setKills(double kills)
    {
        this.kills = kills;
    }

    public double getDeaths()
    {
        return deaths;
    }

    public void setDeaths(double deaths)
    {
        this.deaths = deaths;
    }

    //Create a method that gives a description of the soldier class selected
    public void soldierDescription()
    {
        System.out.println("");
    }
    
    //Create a method that modifies the kill death ratio
    private String formatNumber(double x)
    {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        String getFormat = number.format(x);
        return getFormat;
    }
    
    //Create a method that calculates the kill death ratio
    public String killDeathRatio(double kill, double death)
    {
        double kD = kill/death;
        kdRatio = formatNumber(kD);
        return kdRatio;
    }
    
    //Create a method that diplays the users COD class layout
    public void displayClassLayout()
    {
        System.out.println("Call of Duty Soldier Class");
        System.out.println("----------------------------");
        System.out.println("Code Name: " + this.codeName + "\n" +
                           "Primary Weapon: " + this.primaryWeapon + "\n" +
                           "Primary Attachments: " + this.primaryAttachments + "\n" +
                           "Second Primary: " + this.secondPrimary + "\n" +
                           "Secondary Weapon: " + this.secondaryWeapons + "\n" +
                           "Secondary Attachments: " + this.secondaryAttachments + "\n" +
                           "Lethal: " + this.lethal + "\n" +
                           "Tactical: " + this.tactical + "\n" +
                           "Perks: " + this.perks + "\n" +
                           "Wildcard: " + this.wildCard + "\n" +
                           "Score Streaks: " + this.scoreStreaks + "\n");
    }
    
    //Display the kills and death from using the class along with the kd ratio
    public void displayStats()
    {
        System.out.println("Using this class, you killed " + this.kills +
                " soilders and accumulated " + this.deaths + " deaths." + "\n");
        System.out.println("Your kill death ratio was " + this.kdRatio + "\n");
    }
    
    // create method that counts soldier objects
    public static int soldierCount()
    {
        return getSoldierCount;
    }
    
}
