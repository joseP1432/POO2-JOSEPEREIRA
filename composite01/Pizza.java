public class Pizza extends MenuComponent
{
    public Pizza(){
        
    }
    
    public String getName(){
        return "Pizza de Chocolate";
    }
    
    public String getDescription(){
        return "Pizza sabor chocolate ao leite, com queijo.";
    }
    
    public double getPrice(){
        return 50;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String toString(){
        return " # " + getName() + " " + getDescription() + " - R$ " + getPrice() + " " + (isVegetarian()?"(v)":"");
    }
    
    public void print(){
        System.out.print(" #  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", R$ "+getPrice());
        System.out.print("     --  "+getDescription());
    }
}
