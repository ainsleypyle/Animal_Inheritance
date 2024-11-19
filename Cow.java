/**
 * 
 *
 * @summary Cow subclass from mammal implementing IHerbivore
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:34:58 
 * Last modified  : 2023-10-16 19:36:11
 */


public class Cow extends Mammal implements IHerbivore{
        private int m_weight;
        public Cow(int age){
        super ("Bos");
        m_age = age;
        }
        public boolean eatsPlants() {
        System.out.println("The cow eats plants: true");
      return true;
    }
      public boolean isScavenger() {
        System.out.println("The cow is a scavenger: true");
       return true;
    }
        public int getWeight(){
            System.out.println("Cow weight: "+m_weight);
            return m_weight;

        }
        public void setWeight(int weight){
            m_weight=weight;
        }
           public void cow_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isScavenger();
        eatsPlants();
        hasHair();
        hasMilk();
        getWeight();
 
    }

    }