public class Policy
{
   private String number;
   private String providerName;
   private PolicyHolder holder;
   private double fee;
   private static int instanceCount;
         
   //constructor
   public Policy(String num, String provider, PolicyHolder owner)
   {
      this.number = num;
      this.providerName = provider;
      holder = new PolicyHolder(owner);
      fee = 600; 
      if (owner.getAge() > 50)
         fee += 75;
      if (owner.getSmokingStatus().equalsIgnoreCase("smoker"))
         fee += 100;
      if (owner.getBMI() > 35)
         fee += (BMI-35)*20;
      instanceCount++;
   }
   /*
   the getPolicyNumber method returns the policy number
   @return policy number
   */
   public String getPolicyNumber()
   {
      return number;
   }
   /*
   The getProviderName method returns the provider name
   @return provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
   /*
   The getHolder method returns a copy of the PolicyHolder class referenced by the holder object
   @return copy of object referenced by holder
   */
   public PolicyHolder getHolder()
   {
      return new PolicyHolder(holder);
   }
   /*
   the getPolicyPrice method returns the Policy Insurance Fee
   @return Insurance Fee based on Age, Smoking Status, and BMI
   */
   public double getPolicyPrice()
   {
      
      return fee;
   }
   /*
   toString method
   */
   public String toString()
   {
      String str = "Policy Number: " + number +
                   "\nProvider Name: " + providerName +
                   "\n" + holder +
                   "\nPolicy Price: $" + fee;
      return str;
   }
   /*
   the getIntsanceCount method returns the instance count
   @return policy number
   */
   public int getInstanceCount()
   {
      return instanceCount;
   }
}