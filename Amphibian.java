/**
 * 
 *
 * @summary Sub Class Amphibian
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:33:12 
 * Last modified  : 2023-10-16 19:33:12 
 */


public class Amphibian extends Animals{
    String m_skinColor;

    public Amphibian(String genus){
     super(genus);
    }
 public String getColor(){
        System.out.println("The amphibian's skin color is: "+m_skinColor);
        return m_skinColor;
    }
    public void setColor(String SkinColor){
        m_skinColor=SkinColor;
    }
    public void Cutaneous(){
        System.out.println("This animal has cutaneous skin to help it breathe.");
    }

}