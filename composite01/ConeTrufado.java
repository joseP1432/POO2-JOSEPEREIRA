
/**
 * Escreva uma descrição da classe ConeTrufado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConeTrufado extends MenuComponent
{
    public ConeTrufado()
    {
    }
    
    public String getName(){
        return "Cone Trufado";
    }
    
    public String getDescription(){
        return "Doce gelado trufado com chocolate ao leite!";
    }
    
    public double getPrice(){
        return 10.99;
    }
    
    public String toString(){
        return "# " + getName() + " - R$ " + getPrice() + "  " + getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        System.out.print(", R$ "+getPrice());
        System.out.print("     --  "+getDescription());
    }
}
