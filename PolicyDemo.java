import java.util.*;
import java.io.*;

public class PolicyDemo 
{   
   public static void main(String[] args)
   {
      /*The book uses the "throws IOException" option in the main method header. In this exercise we use a "try" and "catch" process. We "try" to open the file and process it, but if something goes wrong, 
        an IOException will be "thrown" and we can "catch" it and deal with the problem. If a problem occurs while processing the file, the IOException is immediately "thrown", the code 
        immediately jumps to the "catch" block of code. The message in the "catch" block will display. */
      try
      {
         //creating file
         File file = new File("PolicyInformation.txt");
         //creating reference scanner
         Scanner inputFile = new Scanner(file);
         
         //declare variables
         String policyNumber = "", providerName = "", firstName = "", lastName = "";
         int age = 0;
         String smokingStatus = "";
         double height = 0.00, weight = 0.00;
         int instanceCount;
         
         //make ArrayList
         ArrayList<Policy> policyList = new ArrayList<Policy>();
                  
         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
         while(inputFile.hasNext())
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();//move to next line
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            inputFile.nextLine();//move to next line
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            /*create a Policy object using the Policy class. - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            PolicyHolder customer = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName, customer);
            
            /* Add Policy objects to the ArrayList (Note: policyList is the reference variable for the ArrayList and policy is the
            reference variable for the Policy object)*/
            policyList.add(policy);
         }//close while loop
         
         inputFile.close();//close file
         //use a for loop to display information
         for(int i = 0; i < policyList.size(); i++)
         {
            //put a blank line before the output
            System.out.println();
            //display information about the Policy
            System.out.println(policyList.get(i));
            //Put a blank line before the next loop
            System.out.println();
         }//close for loop
         System.out.println(Policy.getInstanceCount());
         System.out.println(PolicyHolder.getSmokers());         
      }//close "try" block
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }//close main
}//close class