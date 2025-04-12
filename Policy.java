public class Policy
{
   private String number;
   private String providerName;
   private PolicyHolder holder;
   private static int instanceCount;
         
   //constructor
   public Policy(String num, String provider, PolicyHolder owner)
   {
      this.number = num;
      this.providerName = provider;
      holder = new PolicyHolder(owner);
      instanceCount++;
   }
   /*
   The setPolicyNumber method stores a value in the number field
   @param num The policy number
   */
   public void setPolicyNumber(String num)
   {
      number = num;
   }
   /*
   The setProviderName method stores a value in the providerName field
   @param provider The provider name
   */
   public void setProviderName(String provider)
   {
      providerName = provider;
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
      return new PolicyHolder(holder)
   }
   /*
   the calculateInsuranceFee method calculates and returns the Policy Insurance Fee
   @return Insurance Fee based on Age, Smoking Status, and BMI
   */
   public double calculatePolicyPrice()
   {
      double fee = 600; 
      if (holder.getAge > 50)
         fee += 75;
      if (holder.getSmokingStatus.equalsIgnoreCase("smoker"))
         fee += 100;
      if (holder.getBMI > 35)
         fee += (BMI-35)*20;
      return fee;
   }
   /*
   toString method
   @return a string indicating the insurance fee
   */
   public String toString()
   {
      String str = "Policy Price: $" + fee;
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