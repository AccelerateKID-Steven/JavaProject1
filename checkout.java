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
      ArrayList<String> PriceList = new ArrayList<String>( );
      ArrayList<String> shoppingList = new ArrayList<String>( );
      float x, price;
      
      do
      {
      
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
               PriceList.add(Systeminput);
               System.out.println(PriceList);  
            }
         }
     
      }
     
     
      //validaton
      while(x < 2);
      for(int z = 0; z < shoppingList.size(); z++)
      {
         JOptionPane.showMessageDialog(null,shoppingList.get(z) + " Price: " + PriceList.get(z));
      }
     
      int sum = 0;
      for(int i=0; i < PriceList.size(); i++)
      {
         sum = sum + Integer.parseInt(PriceList.get(i));
      }

      JOptionPane.showMessageDialog(null, sum + "$ is your total price");
      
      
      //output list
      
      //calculate and show taxes
      if(sum > 0)
      {
         JOptionPane.showMessageDialog(null, (sum * 0.06) + sum + "$ is your total price (including tax)");
         double totalPrice = sum * 0.06 + sum;  //totalPrice is total price with tax of 6%
         //System.out.println(totalPrice);
      
      }
      
   }



}


