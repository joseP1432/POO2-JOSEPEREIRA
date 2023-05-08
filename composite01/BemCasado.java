
/**
 * Escreva uma descrição da classe BemCasado aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BemCasado extends MenuComponent
{
    public BemCasado()
    {
    }

    public String getName(){
        return "Doce Bem Casado";
    }
    
    public String getDescription(){
        return "Doce feito com ingredientes especiais que exploram o sabor do beijinho e o chocolate unidos em um único prato";
    }
    
    public double getPrice(){
        return 25.99;
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
