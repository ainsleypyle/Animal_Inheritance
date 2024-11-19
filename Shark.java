/**
 * 
 *
 * @summary Shark subclass of fish with carnivore interface 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:41:12 
 * Last modified  : 2023-10-16 19:41:47
 */


public class Shark extends Fish implements ICarnivore{
    private int m_teeth;
       public Shark(int age){
       super ("Chondricthyes");
       m_age = age;
   }

   public boolean isHunter() {
   System.out.println("The shark is a hunter: true");
     return true;
   }
     public boolean eatsMeat() {
       System.out.println("The shark eats meat: true");
      return true;
   }
   public void setTeeth(int teeth){
       m_teeth=teeth;
   }
   public int getTeeth(){
       System.out.println("Teeth: "+m_teeth);
       return m_teeth;

   }
   public void Shark_info(){
       System.out.println("Age: "+ m_age);
       System.out.println("Genus: "+m_genus);
       isHunter();
       eatsMeat();
       getTeeth();
       breatheUnderWater();
       getScaleColor();
   }

}