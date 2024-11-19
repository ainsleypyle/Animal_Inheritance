/**
 * 
 *
 * @summary Salamander subclass of amphibian with carnivore interface
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:40:35 
 * Last modified  : 2023-10-16 19:41:05
 */


public class Salamander extends Amphibian implements ICarnivore{
    private int m_tail;
        public Salamander(int age){
        super ("Urodela");
        m_age = age;
    }

        public boolean isHunter() {
    System.out.println("The Salamander is a hunter: true");
      return true;
    }
      public boolean eatsMeat() {
        System.out.println("The Salamander eats meat: true");
       return true;
    }
    public void setTail(int tail){
        m_tail=tail;
    }
    public int getTail(){
        System.out.println("Tail length in inches: "+m_tail);
        return m_tail;

    }
    public void Salamander_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isHunter();
        eatsMeat();
        getTail();
        getColor();
        Cutaneous();
       
 
    }

}
