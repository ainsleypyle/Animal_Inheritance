/**
 * 
 *
 * @summary Fish subclass from Animals
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:37:36 
 * Last modified  : 2023-10-16 19:37:58
 */


public class Fish extends Animals{
    String m_color;

    public Fish(String genus){
     super(genus);
    }
    public String getScaleColor(){
        System.out.println("The fish's scale color is: "+m_color);
        return m_color;
    }
    public void setScaleColor(String ScaleColor){
        m_color=ScaleColor;
    }
    public void breatheUnderWater(){
        System.out.println("This animal can breathe under water.");
    }
}