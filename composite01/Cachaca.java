
/**
 * Write a description of class Cachaca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cachaca extends MenuComponent
{
    
    public Cachaca(){        
    }
    
    public String getName(){
        return "Cachaca";
    }
    
    public String getDescription(){
        return "Rainha 50%alc";
    }
    
    public double getPrice(){
        return 20;
    }
    
    public boolean isVegetarian(){
        return true;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}
