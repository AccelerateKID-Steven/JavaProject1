//checkout project
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
class checkout
{
   public static void main (String[] args)
   {
      //call keyboard
      Scanner keyboard = new Scanner(System.in);
      //variable for if statement
      String shopping;
      shopping = JOptionPane.showInputDialog("Are you sure you want to shop?");
      
      //if statement
      if (shopping.equals("yes"))
      {
         JOptionPane.showMessageDialog(null ,"Thank you for choosing Walmart");
      }
      else if (shopping.equals("no"))
      {
         JOptionPane.showMessageDialog(null ,"Goodbye");
      }
      else
      {
         JOptionPane.showMessageDialog(null ,"Please answer with yes or no");      
      }   

      
      
      
      String Systeminput;
      //input list
      JOptionPane.showMessageDialog(null ,"type done whenever your done");
      ArrayList<Float> PriceList = new ArrayList<Float>( );
      ArrayList<String> shoppingList = new ArrayList<String>( );
      float x, price;
      
      do{
      //user input
      Systeminput = JOptionPane.showInputDialog(null, "type the name of the item");
      //ifs
      if(Systeminput.equals("done"))
      {
      x = 2;
      }
      else
      {
         shoppingList.add(Systeminput);
         System.out.println(shoppingList);
         x = 1;
         Systeminput = JOptionPane.showInputDialog(null, "type the price of the item");
         if(Systeminput.equals("done"))
         {
            x = 2;
         }
         else
         {
            PriceList.add(Float.parseFloat(Systeminput));
            System.out.println(PriceList);  
         }
         }

      
     //validaton
     }while(x < 2);
                  System.out.println(PriceList);  

      
      
      
      
      
      //output list
      
      
   }



}


