/**
 * Inheritance lab where the parent class is animals with different sub classes for types of animals and their objects.
 *
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-02 11:55:11 
 * Last modified  : 2023-10-16 19:42:30
 */

public class UserDefinedClasses{
    public static void main(String[] args)
    {
         //Mammal Instantiated Classes
         System.out.println("Ted the dog:");
         Dog ted=new Dog(12);
         ted.setBreed("Poodle");
         ted.setSpots(33);
         ted.dog_info();
 
          System.out.println();
         System.out.println("Timmy the cow:");
         Cow timmy=new Cow(2);
         timmy.setWeight(400);
         timmy.cow_info();
 
         //Reptile Instanstiated Classes
         System.out.println();
         System.out.println("Carrie the Crocodile");
         Crocodile Carrie=new Crocodile(3);
         Carrie.setSkinType(" Rough");
         Carrie.setTeeth(150);
         Carrie.Crocodile_info();
          System.out.println();
 
         System.out.println("Sally the Snake");
         Snake Sally=new Snake(5);
         Sally.setSkinType("Scaley");
         Sally.setLength(10);
         Sally.Snake_info();
          System.out.println();
 
         //Fish instantiated classes
         System.out.println("Simon the Shark");
         Shark Simon=new Shark(40);
         Simon.setScaleColor("grey");
         Simon.setTeeth(200);
         Simon.Shark_info();
         System.out.println();
 
         System.out.println("Cole the Clownfish");
         ClownFish Cole= new ClownFish(1);
         Cole.setScaleColor("orange and white");
         Cole.setStripes(4);
         Cole.Clownfish_info();
         System.out.println();
 
         //Bird Instantiated Classes
         System.out.println("Edgar the Eagle");
         Eagle Edgar=new Eagle(6);
         Edgar.setFeatherCount(50);
         Edgar.setTalons(6);
         Edgar.Eagle_info();
         System.out.println();
 
         System.out.println("Gary the Goose");
         Goose Gary=new Goose(7);
         Gary.setFeatherCount(43);
         Gary.setWeight(10);
         Gary.Goose_info();
         System.out.println();
 
         //Amphibian Instatiated Classes
         System.out.println("Fred the Frog");
         Frog Fred= new Frog(14);
         Fred.setColor("green");
         Fred.setLegs(4);
         Fred.Frog_info();
         System.out.println();
 
         System.out.println("Sam the Salamander");
         Salamander Sam= new Salamander(2);
         Sam.setColor("Orange");
         Sam.setTail(3);
         Sam.Salamander_info();
         System.out.println();
  
    }
}

