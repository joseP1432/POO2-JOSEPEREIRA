
/**
 * Write a description of class PiraoDeQueijo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PiraoDeQueijo extends MenuComponent
{
    public PiraoDeQueijo(){        
    }
    
    public String getName(){
        return "Pirao de Queijo";
    }
    
    public String getDescription(){
        return "dos Nogueira";
    }
    
    public double getPrice(){
        return 27;
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
