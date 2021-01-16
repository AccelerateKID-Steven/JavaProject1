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
      if (shopping.equals("yes") || shopping.equals ("Yes"))
      {
         JOptionPane.showMessageDialog(null ,"Thank you for choosing Walmart");
         
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
            
               if(Systeminput.equals("done") || Systeminput.equals("Done"))
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
         
         int j = 0;
         String tempstring = "Items List\n";
         for(String shoplist : shoppingList)
         {
            j = j + 1;
            //System.out.println(j - 1);
            tempstring += shoplist + " Price: " + PriceList.get(j - 1) + "\n";
         }
         
        
         float sum = 0;
         String sumround = "";
         for(int i=0; i < PriceList.size(); i++)
         {
            sum = sum + Float.parseFloat(PriceList.get(i));
         }
         sumround = String.format("\n$%.2f",sum); //rounds sum NECESSARY or else a bug will appear
         
         //calculate and show taxes
         String taxround = "";
         if(sum > 0)
         {
            double totalPrice = sum * 0.06 + sum;
            taxround = String.format("\n$%.2f",totalPrice);
         }
         
         //Receipt
         JOptionPane.showMessageDialog(null, tempstring + "\n" + sumround + " is your total price" + 
         "\n" + taxround + " is your total price including tax");
      
      }   
      
         
      else if (shopping.equals("no") || shopping.equals("No"))
         {
            JOptionPane.showMessageDialog(null ,"Goodbye");
         }
      
      else
      {
         JOptionPane.showMessageDialog(null ,"Please answer with a \"yes\" or \"no\".");      
      }   
      
   }



}


