/*This is a run and gun class players who hate camping and want fast paced action
 * 
 */
package call_of_duty_soldier_class_app;


public class Speedster extends Soldier
{
    public Speedster()
    {
        codeName = "The Speedster";
        primaryWeapon = "Vector";
        primaryAttachments = " Extended Mag, Quickdraw Handle,and Reflex Sight";
        secondaryWeapons = "Tac-45";
        lethal = "Semtex";
        wildCard = "Primary Gunfighter";
        perks = "LightWeight, Scavenger, and Extreme Conditioning";
        scoreStreaks = "UAV, Counter UAV , and Orbital VSAT"; 
    }
    
    @Override
    public void soldierDescription()
    {
        System.out.println("Another common type of gamer in Call of Duty titles" + "\n"
                + "is the run and gunner, always on the move, always flanking the" + "\n"
                + "enemy.  To be as efficient as possible while running around the" + "\n"
                + "map at speed, it’s best to roll out with one of the many Sub-Machine" + "\n"
                + "Guns, making you lighter on your feet. The Vector has the highest" + "\n"
                + "fire-rate of the SMGs, giving you the edge when you come into" + "\n"
                + "one-on-one situations." + "\n"); 
        
        System.out.println("Having Lightweight and Extreme Conditioning equipped" + "\n"
                + "will make you hard to hit when you sprint around corners, with" + "\n"
                + "scavenger keeping them bullets coming out of your gun. The Reflex" + "\n"
                + "Sight will allow quick targeting of enemies and Fast Mag to reload" + "\n"
                + "as quickly as possible, giving the SMG’s high rate of fire.\n");
        
        System.out.println("As for the Scorestreaks, it’s all about knowing where" + "\n"
                + "the enemy is, giving that you will be around the map quickly," + "\n"
                + "you need to watch out for those spawn points working against you." + "\n");
    }
}
