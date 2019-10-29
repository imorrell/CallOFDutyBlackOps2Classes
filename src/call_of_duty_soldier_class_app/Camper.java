/*This class is for campers. Find your corner, load your gun, and shoot whoever
 *is on your camp ground
 * 
 */
package call_of_duty_soldier_class_app;


public class Camper extends Soldier
{
   public Camper() 
   {
     codeName = "The Camper";
     primaryWeapon = "Scar-H";
     secondPrimary = "MP7";
     lethal = "Claymore(X2";
     wildCard = "Danger Close and OverKill";
     scoreStreaks = "Hellstorm Missile, Lightning Strike, and LodeStar";
   }
   
   @Override
   public void soldierDescription()
   {
       System.out.println("Ahh the Camper….. The thorn in our side. You may be asking" + "\n"
               + "why the hell we would put together a class that would help annoy" + "\n"
               + "thousands, well we’re a community site and we have to help the community" + "\n"
               + "whatever their gaming background is." + "\n");
       
       System.out.println("If you decide to camp in a comfy little corner then it’s" + "\n"
               + "best to equip an Assault Rifle with a Suppressor, keeping the map" + "\n"
               + "from giving away your position and deal heavy damage. Having Hardline" + "\n"
               + "equipped will get the Scorestreak going and if you have the bottle to" + "\n"
               + "survive then the Lodestar will be a nice little reward." + "\n");
       
       System.out.println("The Claymores will keep the pests from getting at you, having" + "\n"
               + "two will keep the front and back doors secure, while Tactical Mask stops" + "\n"
               + "flashbangs, shock charges and stun grenades spoiling the party." + "\n");
   }
}
