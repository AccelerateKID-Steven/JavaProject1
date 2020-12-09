//checkout project
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
class checkout
{
   public static void main (String[] args)
   {
      String Systeminput;
      //input list
      JOptionPane.showMessageDialog(null ,"type done whenever your done");
      ArrayList<String> PriceList = new ArrayList<String>( );
      ArrayList<String> shoppingList = new ArrayList<String>( );
      float x, price;
      
      do{
      //user input
      Systeminput = JOptionPane.showInputDialog(null, "type the name of the item");
      System.out.println(shoppingList);
      //ifs
      if(Systeminput.equals("done"))
      {
      x = 2;
      }
      else
      {
      shoppingList.add(Systeminput);
      x = 1;
      Systeminput = JOptionPane.showInputDialog(null, "type the price of the item");
      PriceList.add(Systeminput);
      System.out.println(PriceList);  
      }
      
     //validaton
     }while(x < 2);
      
      
      
      
      
      
      //output list
      
      
   }



}
