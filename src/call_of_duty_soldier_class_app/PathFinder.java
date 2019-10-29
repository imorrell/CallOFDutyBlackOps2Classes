/*The pathfinder class is one for snipers who are looking to deal some damage
 * from long range
 * 
 */
package call_of_duty_soldier_class_app;


public class PathFinder extends Soldier 
{
    public PathFinder()
    {
     codeName = "The PathFinder";
     primaryWeapon = "DSR 50";
     primaryAttachments = "Ballistics CPU";
     secondaryWeapons = "KAP-40";
     lethal = "Bouncing Betty";
     tactical = "Shock Charge";
     wildCard = "Perk 3 Greed";
     perks = "Ghost, Fast Hands, Dexterity, and Extreme Conditioning";
     scoreStreaks = "UAV, Hunter Killer, Lightning Storm";
    }
    
    @Override
    public void soldierDescription()
    {
        System.out.println("Every online shooter needs a sniper class, taking down" + "\n"
                + "enemies from a safe distance has always been a stable diet within" + "\n"
                + "Call of Duty. In Black Ops 2 sniping is rather popular, with quickscoping" + "\n"
                + "running rife and many liking how good a one shot kill feels." + "\n");
        
        System.out.println("The DSR 50 unfortunately is bolt-action but makes up" + "\n"
                + "for the reload time with one shot kills to most of the upper body." + "\n"
                + "Having the Kap-40 as your secondary will give you more security" + "\n"
                + "if you miss your shots up close and even more effective when having" + "\n"
                + "Fast Hands as a perk, allowing you to switch to your secondary quicker." + "\n"
                + "The Bouncing Betty and Shock Charge combination will keep unwanted company" + "\n"
                + "out of your immediate area and Ghost will also keep them from knowing" + "\n"
                + "where you’re located." + "\n");
        
        System.out.println("With the lack of running involved when using a Sniper" + "\n"
                + "class, having the Hunter Killer and Lighting Storm Storestreaks" + "\n"
                + "equipped will give you no reason to leave what ever location you" + "\n"
                + "set up in." + "\n");
    }
}
