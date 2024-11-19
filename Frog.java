/**
 * 
 *
 * @summary Frog subclass of Amphibian with carnivore interface
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:38:04 
 * Last modified  : 2023-10-16 19:38:22
 */


public class Frog extends Amphibian implements ICarnivore{
    private int m_legs;
        public Frog(int age){
        super ("Anura");
        m_age = age;
    }

        public boolean isHunter() {
    System.out.println("The frog is a hunter: true");
      return true;
    }
      public boolean eatsMeat() {
        System.out.println("The frog eats meat: true");
       return true;
    }
    public void setLegs(int Legs){
        m_legs=Legs;
    }
    public int getLegs(){
        System.out.println("Leg count: "+m_legs);
        return m_legs;

    }
    public void Frog_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isHunter();
        eatsMeat();
        getLegs();
        getColor();
        Cutaneous();
       
 
    }


}