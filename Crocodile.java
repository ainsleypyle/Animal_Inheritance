/**
 *
 *
 * @summary Crocodile Class extending reptile implementing ICarnivore
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:36:17 
 * Last modified  : 2023-10-16 19:36:37
 */


public class Crocodile extends Reptile implements ICarnivore{
    private int m_teeth;
        public Crocodile(int age){
        super ("Crocodylus");
        m_age = age;
    }

        public boolean isHunter() {
    System.out.println("The crocodile is a hunter: true");
      return true;
    }
      public boolean eatsMeat() {
        System.out.println("The crocodile eats meat: true");
       return true;
    }
    public void setTeeth(int teeth){
        m_teeth=teeth;
    }
    public int getTeeth(){
        System.out.println("Teeth: "+m_teeth);
        return m_teeth;

    }
    public void Crocodile_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isHunter();
        eatsMeat();
        getTeeth();
        getSkinType();
       
 
    }
}