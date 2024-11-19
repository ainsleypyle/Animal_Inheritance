/**
 * 
 *
 * @summary Goose subclass extends Bird with herbivore interface
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:38:32 
 * Last modified  : 2023-10-16 19:39:15
 */


public class Goose extends Bird implements IHerbivore{
     private int m_weight;
        public Goose(int age){
        super ("Anser");
        m_age = age;
        }
        public boolean eatsPlants() {
        System.out.println("The Goose eats plants: true");
      return true;
    }
      public boolean isScavenger() {
        System.out.println("The Goose is a scavenger: true");
       return true;
    }
        public int getWeight(){
            System.out.println("Goose weight: "+m_weight);
            return m_weight;

        }
        public void setWeight(int weight){
            m_weight=weight;
        }
           public void Goose_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isScavenger();
        eatsPlants();
        getWeight();
        getFeatherCount();
        canFly();
 
    }

}
