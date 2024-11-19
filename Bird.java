/**
 * 
 *
 * @summary Bird Subclass 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:33:58 
 * Last modified  : 2023-10-16 19:34:13
 */


public class Bird extends Animals{
    int m_feathers;

    public Bird(String genus){
     super(genus);
    }
    public int getFeatherCount(){
        System.out.println("The Bird has this amount of feathers: "+m_feathers);
        return m_feathers;
    }
    public void setFeatherCount(int feathers){
        m_feathers=feathers;
    }
    public void canFly(){
        System.out.println("This animal can fly.");
    }

}