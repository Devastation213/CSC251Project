public class PolicyHolder
{
   private String firstName, lastName;
   private int age;
   private String smokeStatus;
   private double height, weight, BMI;
   
   //constructor
   public PolicyHolder(String first, String last, int a, String smoke, double h, double w)
   {
      this.firstName = first;
      this.lastName = last;
      this.age = a;
      this.smokeStatus = smoke;
      this.height = h;
      this.weight = w;
      this.BMI = (weight * 703) / (Math.pow(height, 2.0));
   }
   //copy constructor
   copy constructor(PolicyHolder object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      age = object2.age;
      smokeStatus = object2.smokeStatus;
      height = object2.height;
      weight = object2.weight;
      BMI = object2.BMI;
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
   public double getHeight()
   {
      return height;
   }
   /*
   the getWeight method returns the policyholder's weight
   @return customer weight
   */
   public double getWeight()
   {
      return weight;
   }
   /*
   the getBMI method returns the policyholder's BMI
   @return Body Mass Index based on Weight and Height
   */
   public double getBMI()
   {
      return BMI;
   }
   /*
   toString method
   @return a string indicating the policyholder's full name, age, smoking status, height, weight, and BMI
   */
   public String toString()
   {
      String str = "Policyholder's First Name: " + FirstName + 
                   "\nPolicyholder's Last Name: " + LastName +
                   "\nPolicyholder's Age: " + age +
                   "\nPolicyholder's Smoking Status: " + smokeStatus +
                   "\nPolicyholder's Height: " + height + 
                   " inches\nPolicyholder's Weight: " + weight +
                   " pounds\nPolicyholder's BMI: " + BMI;
      return str;
   }
}