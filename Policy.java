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
   */
   public void setPolicyNumber(int num)
   {
      number = num;
   }
   /*
<<<<<<< Updated upstream
   The setPolicyProviderName method stores a value in the providerName field
=======
   The setProviderName method stores a value in the providerName field
>>>>>>> Stashed changes
   */
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   /*
   The setFirstName method stores a value in the firstName field
   */
   public void setFirstName(String first)
   {
      firstName = first;
   }
   /*
   The setLastName method stores a value in the lastName field
   */
   public void setLastName(String last)
   {
      lastName = last;
   }
   /*
   The setAge method stores a value in the age field
   */
   public void setAge(int a)
   {
      age = a;
   }
   /*
   The setSmokingStatus method stores a value in the smokeStatus field
   */
<<<<<<< Updated upstream
   public void setmokingStatus(String smoke)
=======
   public void setSmokingStatus(String smoke)
>>>>>>> Stashed changes
   {
      smokeStatus = smoke;
   }
   /*
   The setHeight method stores a value in the height field
   */
   public void setHeight(float h)
   {
      height = h;
   }
   /*
   The setWeight method stores a value in the weight field
   */
   public void setWeight(float w)
   {
      weight = w;
   }
   /*
   the getPolicyNumber method returns the policy number
   */
   public int getPolicyNumber()
   {
      return number;
   }
   /*
   The getProviderName method returns the provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
   /*
   The getFirstName method returns the policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   /*
   The getLastName method returns the policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
  /*
   the getAge method returns the policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   /*
   the getSmokingStatus method returns the policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokeStatus;
   }
   /*
   the getHeight method returns the policyholder's height
   */
   public float getHeight()
   {
      return height;
   }
   /*
   the getWeight method returns the policyholder's weight
   */
   public float getWeight()
   {
      return weight;
   }
<<<<<<< Updated upstream
   
=======
   /*
   the calculateBMI method calculates and returns the policyholder's BMI
   */
>>>>>>> Stashed changes
   public double calculateBMI()
   {
      BMI = (weight * 703) / (Math.pow(height, 2.0));
      return BMI;
   }
<<<<<<< Updated upstream
=======
   /*
   the calculateInsuranceFee method calculates and returns the Policy Insurance Fee
   */
>>>>>>> Stashed changes
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