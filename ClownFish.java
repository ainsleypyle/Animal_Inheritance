/**
 * 
 *
 * @summary Clownfish subclass from Fish and implementing IHerbivore
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:34:19 
 * Last modified  : 2023-10-16 19:34:38
 */



public class ClownFish extends Fish implements IHerbivore{
    private int m_StripeCount;
        public ClownFish(int age){
        super ("Amphiprion");
        m_age = age;
        }
        public boolean eatsPlants() {
        System.out.println("The clownfish eats plants: true");
      return true;
    }
      public boolean isScavenger() {
        System.out.println("The clownfish is a scavenger: true");
       return true;
    }
        public int getStripes(){
            System.out.println("Number of Stripes: "+m_StripeCount);
            return m_StripeCount;

        }
        public void setStripes(int stripes){
            m_StripeCount=stripes;
        }
        public void Clownfish_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isScavenger();
        eatsPlants();
        getStripes();
        breatheUnderWater();
        getScaleColor();
       
 
    }

}
