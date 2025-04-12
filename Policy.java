public class Policy
{
   private String number;
   private String providerName;
         
   //constructor
   public Policy(String num, String provider)
   {
      this.number = num;
      this.providerName = provider;
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
}