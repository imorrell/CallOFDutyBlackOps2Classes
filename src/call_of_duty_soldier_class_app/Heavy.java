/*
 * The heavy class is a subclass that inherits from soilder. This class is for 
 * players who prefer heavy duty combat (more ammo, resources) with more stationary
 * battle then running and gunning.
 */
package call_of_duty_soldier_class_app;

//Class inherits the Soldier class
public class Heavy extends Soldier
{
    //Constructor that defines attributes of soilder Class
    public Heavy()
    {
        codeName = "The Heavy";
        primaryWeapon = "HAMR";
        primaryAttachments = "Target Finder and Quickdraw";
        secondaryWeapons = "B23R";
        secondaryAttachments = "Akimbo";
        lethal = "Bouncing Betty";
        tactical = "Flashbang Grenade";
        perks = "Flak Jacket, Toughness, and Engineer";
        scoreStreaks = "UAV, Guardian , and Sentry Gun";  
    }
    
   @Override 
   public void soldierDescription()
   {
       System.out.println("This class will fit well with those who would" + "\n"
               + "rather wait for their enemy to peek round a corner and then" + "\n"
               + "open-fire like a modern-day Rambo. The HAMR has a very fast" + "\n"
               + "rate of fire from the get go but slows in seconds, but most of" + "\n"
               + "the damage is always done in the first few shots anyway and also" + "\n"
               + "has a very fast reload speed compared to other LMG’s. With the" + "\n"
               + "Target Finder equipped, setting up shop near a window and taking" + "\n"
               + "out enemies at long-range is a lot easier and combining that with" + "\n"
               + "Quickdraw will give you that extra edge." + "\n");
       
       System.out.println("Having the Bouncing Betty in your class will give you" + "\n"
               + "extra level of safety when your hold up in one place, allowing you" + "\n"
               + "to serve more time looking for enemies to kill than turning around" + "\n"
               + "to check your six every five seconds. The Flak Jacket perk will" + "\n"
               + "stop those incoming grenades ruining your Scorestreak, even more" + "\n"
               + "so when in a tight space." + "\n");
       
       System.out.println("The UAV will get your streak going and if you manage" + "\n"
               + "to pick up the Guardian and Sentry Gun , you can turn a small" + "\n"
               + "area or house into your own little domain." + "\n");
   }
    
}
