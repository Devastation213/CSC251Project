public class Policy
{
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private float height;
   private float weight;
   private double BMI;
      
   //no-arg constructor
   public Policy()
   {
      this.number = 0;
      this.providerName = "Unknown";
      this.firstName = "Unknown";
      this.lastName = "Unknown";
      this.age = 0;
      this.smokeStatus = "Unknown";
      this.height = 0;
      this.weight = 0;
      this.BMI = 0;
   }
   /*
   The setPolicyNumber method stores a value in the number field
   @param num The policy number
   */
   public void setPolicyNumber(int num)
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
   The setFirstName method stores a value in the firstName field
   @param first The customer's first name
   */
   public void setFirstName(String first)
   {
      firstName = first;
   }
   /*
   The setLastName method stores a value in the lastName field
   @param last The customer's last name
   */
   public void setLastName(String last)
   {
      lastName = last;
   }
   /*
   The setAge method stores a value in the age field
   @param a The customers age
   */
   public void setAge(int a)
   {
      age = a;
   }
   /*
   The setSmokingStatus method stores a value in the smokeStatus field
   @param smoke The customer's smoking status
   */
   public void setSmokingStatus(String smoke)
   {
      smokeStatus = smoke;
   }
   /*
   The setHeight method stores a value in the height field
   @param h The customer's height
   */
   public void setHeight(float h)
   {
      height = h;
   }
   /*
   The setWeight method stores a value in the weight field
   @param w The customer's weight
   */
   public void setWeight(float w)
   {
      weight = w;
   }
   /*
   the getPolicyNumber method returns the policy number
   @return policy number
   */
   public int getPolicyNumber()
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
   The getFirstName method returns the policyholder's first name
   @return customer first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   /*
   The getLastName method returns the policyholder's last name
   @return customer last name
   */
   public String getLastName()
   {
      return lastName;
   }
   /*
   the getAge method returns the policyholder's age
   @return customer age
   */
   public int getAge()
   {
      return age;
   }
   /*
   the getSmokingStatus method returns the policyholder's smoking status
   @return customer smoking status
   */
   public String getSmokingStatus()
   {
      return smokeStatus;
   }
   /*
   the getHeight method returns the policyholder's height
   @return customer height
   */
   public float getHeight()
   {
      return height;
   }
   /*
   the getWeight method returns the policyholder's weight
   @return customer weight
   */
   public float getWeight()
   {
      return weight;
   }
   /*
   the calculateBMI method calculates and returns the policyholder's BMI
   @return Body Mass Index based on Weight and Height
   */
   public double calculateBMI()
   {
      BMI = (weight * 703) / (Math.pow(height, 2.0));
      return BMI;
   }
   /*
   the calculateInsuranceFee method calculates and returns the Policy Insurance Fee
   @return Insurance Fee based on Age, Smoking Status, and BMI set before
   */
   public double calculateInsuranceFee()
   {
      double fee = 600;
      if (age > 50)
         fee += 75;
      if (smokeStatus.equalsIgnoreCase("smoker"))
         fee += 100;
      if (BMI > 35)
         fee += (BMI-35)*20;
      return fee;
   }

}