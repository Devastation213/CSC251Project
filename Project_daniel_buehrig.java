import java.util.Scanner;

public class Project_daniel_buehrig
{
   public static void main(String[] args)
   {
      //create a policy object
      Policy policy = new Policy();
      //create inputs
      Scanner keyboard = new Scanner(System.in);
      String inputString;
      int inputInt;
      float inputFloat;
      //input and send policy number
      System.out.print("Please enter the Policy Number: ");
      inputInt = keyboard.nextInt();
      keyboard.nextLine(); //consume whitespace
      policy.setPolicyNumber(inputInt);
      //input and send provider name
      System.out.print("Please enter the Provider Name: ");
      inputString = keyboard.nextLine();
      policy.setProviderName(inputString);
      //input and send first name
      System.out.print("Please enter the Policyholder’s First Name: ");
      inputString = keyboard.nextLine();
      policy.setFirstName(inputString);
      //input and send last name
      System.out.print("Please enter the Policyholder’s Last Name: ");
      inputString = keyboard.nextLine();
      policy.setLastName(inputString);
      //input and send age
      System.out.print("Please enter the Policyholder’s Age: ");
      inputInt = keyboard.nextInt();
      keyboard.nextLine(); //consume whitespace
      policy.setAge(inputInt);
      //input and send smoking status
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      inputString = keyboard.nextLine();
      policy.setSmokingStatus(inputString);
      //input and send height
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      inputFloat = keyboard.nextFloat();
      keyboard.nextLine(); //consume whitespace
      policy.setHeight(inputFloat);
      //input and send weight
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      inputFloat = keyboard.nextFloat();
      keyboard.nextLine(); //consume whitespace
      policy.setWeight(inputFloat);
      //get and display information
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getFirstName());
      System.out.println("Policyholder’s Last Name: " + policy.getLastName());
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("Policyholder’s Height: %.1f inches\n", policy.getHeight());
      System.out.printf("Policyholder’s Weight: %.1f pounds\n", policy.getWeight());
      //calculate and display BMI
      System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
      //calculate and display insurance fee
      System.out.printf("Policy Price: $%.2f\n", policy.calculateInsuranceFee());
   }
}
