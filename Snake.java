/**
 * 
 *
 * @summary Snake subclass of reptile with carnivore interface
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:41:54 
 * Last modified  : 2023-10-16 19:42:14
 */


public class Snake extends Reptile implements ICarnivore{
     private int m_length;
        public Snake(int age){
        super ("Serpentes");
        m_age = age;
    }

        public boolean isHunter() {
    System.out.println("The snake is a hunter: true");
      return true;
    }
      public boolean eatsMeat() {
        System.out.println("The snake eats meat: true");
       return true;
    }
    public void setLength(int length){
        m_length=length;
    }
    public int getLength(){
        System.out.println("Length in ft: "+m_length);
        return m_length;

    }
    public void doesSlither(){
        System.out.println("This reptile slithers");
    }
    public void Snake_info(){
        System.out.println("Age: "+ m_age);
        System.out.println("Genus: "+m_genus);
        isHunter();
        eatsMeat();
        getLength();
        getSkinType();
        doesSlither();
        
       
 
    }

}
