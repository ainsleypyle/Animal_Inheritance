/**
 * 
 *
 * @summary Mammal subclass of Animals
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:39:48 
 * Last modified  : 2023-10-16 19:40:07
 */


public class Mammal extends Animals{

    public Mammal(String genus){
        super(genus);
    }

    public void hasHair(){
        System.out.println("This animal has hair.");
    }

    public void hasMilk(){
        System.out.println("This animal has milk. ");
    }


}