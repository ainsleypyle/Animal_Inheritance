/**
 * 
 *
 * @summary Eagle subclass extending bird wit ICarnivore interface
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:37:08 
 * Last modified  : 2023-10-16 19:37:31
 */


public class Eagle extends Bird implements ICarnivore{
        private int m_talons;
        public Eagle(int age){
        super ("Aquila");
        m_age = age;
    }

        public boolean isHunter() {
    System.out.println("The eagle is a hunter: true");
      return true;
    }
      public boolean eatsMeat() {
        System.out.println("The eagle eats meat: true");
       return true;
    }
    public void setTalons(int talons){
        m_talons=talons;
    }
    public int getTalons(){
        System.out.println("Talon count: "+m_talons);
        return m_talons;

    }
    public void Eagle_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isHunter();
        eatsMeat();
        getTalons();
        getFeatherCount();
        canFly();
       
 
    }
}

