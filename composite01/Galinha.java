
public class Galinha extends MenuComponent
{
    public Galinha(){        
    }
    
    public String getName(){
        return "Galinha";
    }
    
    public String getDescription(){
        return "Caipira de Timbauba";
    }
    
    public double getPrice(){
        return 70;
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
