//checkout project
import java.util.Scanner;
import javax.swing.JOptionPane;
class checkout
{
   public static void main (String[] args)
   {
<<<<<<< Updated upstream
      //home page
=======
//home page
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
      {
         JOptionPane.showMessageDialog(null ,"Goodbye");
      }
      else
      {
         JOptionPane.showMessageDialog(null ,"Please answer with yes or no");      
      }     
      //input list
=======
      {
         JOptionPane.showMessageDialog(null ,"Goodbye");
      }
      else
      {
         JOptionPane.showMessageDialog(null ,"Please answer with yes or no");      
      }   
   
         
//Ryans code very messy
//also input         
      String Systeminput;
      //input list
      JOptionPane.showMessageDialog(null ,"type done whenever your done");
      ArrayList<String> PriceList = new ArrayList<String>( );
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
            PriceList.add(Systeminput);
            System.out.println(PriceList);  
         }
         }
      
     //validaton
     }while(x < 2);
>>>>>>> Stashed changes
      
      
      
      
      
      
      //output list
      
      
   }
}
