/**
 * 
 *
 * @summary Parent class animals 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-10-16 19:33:32 
 * Last modified  : 2023-10-16 19:33:32 
 */


public class Animals{
    int m_age;
    String m_genus;
    public Animals(String genus){
        m_genus=genus;
    }
 
    public String getGenus(){
        return m_genus;
        
    }
    public int getAge(){
        return m_age;
        
    }
    public void setAge(int age){
        m_age=age;
    }
    }
