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
         int age = 0, smoker = 0, nonsmoker = 0;
         String smokingStatus = "";
         double height = 0.00, weight = 0.00;
         
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
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            /*create a Policy object using the Policy class. - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            
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
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches\n", policyList.get(i).getHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds\n", policyList.get(i).getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policyList.get(i).getBMI());
            System.out.printf("Policy Price: $%.2f\n", policyList.get(i).getPrice());
            //Put blank lines before the next loop
            System.out.println();
            System.out.println();
         }
      }//close "try" block
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }//close main
}//close class