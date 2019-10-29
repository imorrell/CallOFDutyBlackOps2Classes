/* The ninja class is for players who prefer to steath kill opponents and to
 * basically be unseen by the enemie 
 */
package call_of_duty_soldier_class_app;


public class Ninja extends Soldier
{
    //Constructor
    public Ninja()
    {
        codeName = "The Ninja";
        primaryWeapon = "PDW-57";
        primaryAttachments = "Suppressor";
        secondaryWeapons = "Ballistic Knife" ;
        lethal = "Claymore (X2)";
        tactical = "Shock Charge";
        perks = "Ghost, Cold Blooded, and Extreme Conditioning ";
        wildCard = "Danger Close";
        scoreStreaks = "UAV, Counter-UAV, and Hellstorm Missile";
    }
    
    @Override
    public void soldierDescription()
    {
        System.out.println("Many players consider the PDW-57 the best gun in Black ops 2." + "\n"
                + "It’s merit is backed up by its ability in close quarter combat" + "\n"
                + "and early unlock level. If you want to take the stealthy" + "\n"
                + "approach then this is the weapon for you, especially" + "\n"
                + "if you attach the Suppressor." + "\n");
        
        System.out.println("To keep people from hearing downing enemies, the Ballistic" + "\n"
                + "Knife is a great companion to your primary weapon, allowing sneaky" + "\n"
                + "kills from up close and afar if you know how to use it. Using the" + "\n"
                + "Shock Charge and Claymores together can be more than lethal, shocking" + "\n"
                + "the enemy and not allowing them to get out of dodge before the Claymore" + "\n"
                + "goes off, easy way to pick up points when off around the map being a ninja." + "\n");
        
        System.out.println("Using the Ghost and Cold-Blooded perks will add to the" + "\n"
                + "already stealthy line-up, keeping you dark to those high-tech optics" + "\n"
                + "and well… We all know what Ghost does! The Scorestreaks will allow" + "\n"
                + "you to keep on the move and use the map to your advantage, they can’t" + "\n"
                + "see you and they can’t hear you, you’re a winner!" + "\n");  
                
    }
    
   
}
