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
     
     
      //Output
      while(x < 2);
      
      String tempstring = "Items List\n";
      for(String shoplist : shoppingList)
      {
         tempstring += shoplist + " Price: " + PriceList + "\n";
      }
     
      float sum = 0;
      for(int i=0; i < PriceList.size(); i++)
      {
         sum = sum + Float.parseFloat(PriceList.get(i));
      }
      
      //calculate and show taxes
      String tempstring1 = "";
      if(sum > 0)
      {
         double totalPrice = sum * 0.06 + sum;  //totalPrice is total price with tax of 6%
         //System.out.println(totalPrice);
         tempstring1 = Double.toString(totalPrice);
      }
      
      JOptionPane.showMessageDialog(null, tempstring + "\n$" + sum + " is your total price" + 
      "\n" + tempstring1 + " is your total price including tax)");
      
   }



}


