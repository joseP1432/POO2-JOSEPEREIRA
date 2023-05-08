
public class Linguica extends MenuComponent
{
   public Linguica(){        
   }
    
   public String getName(){
       return "Linguica 3G";
   }
    
   public String getDescription(){
       return "de porco e artesanal";
   }
    
   public double getPrice(){
       return 30;
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
