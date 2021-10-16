/*-----------------------------------
  Abdullah Al Masrur            
  Section: F                   
  Student ID: 2012020255                           
  email: cse_2012020255@lus.ac.bd  
  Date: 16/10/21                   
 -----------------------------------*/

package Abdullah;
import java.util.Scanner;
public class Main 
{

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        AdvancedArithmetic math = new MyCalculator();

        System.out.print("Input your Number to find divisor of sum: ");
        int a = input.nextInt();
        math.divisorSum(a);

        System.out.print("Input your Number to find factorial: ");
        int b = input.nextInt();
        math.findFactorial(b);

    }
}
