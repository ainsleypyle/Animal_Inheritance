/**
 * 
 *
 * @summary Dog subclass from mammal implementing ICarnivore
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:36:43 
 * Last modified  : 2023-10-16 19:37:02
 */



public class Dog extends Mammal implements ICarnivore{
  private int m_spots;
  private String m_breed;
  //Constructor
   public Dog (int age){
      super ("Canine");
      m_age = age;
  }

  public boolean isHunter() {
  System.out.println("The dog is a hunter: true");
    return true;
  }
    public boolean eatsMeat() {
      System.out.println("The dog eats meat: true");
     return true;
  }
  public void setSpots(int spots){
      m_spots=spots;
  }
  public int getSpots(){
      System.out.println("Spots: "+m_spots);
      return m_spots;
  }
  public String getBreed(){
      System.out.println("The dog breed is: "+m_breed);
      return m_breed;
  }
  public void setBreed(String breed){
      m_breed=breed;
  }
  public void dog_info(){
      System.out.println("Age: "+ m_age);
      System.out.println("Genus: "+m_genus);
      isHunter();
      eatsMeat();
      hasHair();
      hasMilk();
      getBreed();
      getSpots();

  }
}