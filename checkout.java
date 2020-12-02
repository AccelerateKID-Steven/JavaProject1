//checkout project
import java.util.Scanner;
import javax.swing.JOptionPane;
class checkout
{
   public static void main (String[] args)
   {
      //home page
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
      //input list
      
      
      
      
      
      
      //output list
      
      
   }
}
