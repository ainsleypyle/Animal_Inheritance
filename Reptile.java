/**
 * 
 *
 * @summary Reptile subclass from Animals 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:40:12 
 * Last modified  : 2023-10-16 19:40:12 
 */


public class Reptile extends Animals{
    String m_SkinType;

    public Reptile(String genus){
        super(genus);
    }
        public String getSkinType(){
        System.out.println("The Reptile's skintype is:"+m_SkinType);
        return m_SkinType;
    }
    public void setSkinType(String SkinType){
        m_SkinType=SkinType;
    }
    public void ColdBlooded(){
        System.out.println("This animal is cold blooded");
    }


}