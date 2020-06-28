# hello java
Working with Java basics. 
- Creating variables with their correct types:
```java
  private int id; // 3
  private String fname; // "David"
  private String lname; // "Johnson"
  private double salary; // 20000
  private boolean has401k; // true
  private int companyId; // 322350
  private int healthPlanId; // 22017
```

- Creating factory classes that generate objects:
 ```java
 public class Employee {

    private static int maxId = 0; // static is shared across objects - single memory location across all objects

    // fields
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlanId;

    // methods
    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId) {

      maxId++;
      id = maxId;
      this.fname = fname;
      this.lname = lname;
      this.salary = salary;
      this.has401k = has401k;
      this.companyId = companyId;
      this.healthPlanId = healthPlanId;
    }

    // Getter Methods
    public int getId() {
      return id;
    }

    public String getFname() {
      return fname;
    }

    public String getLname() {
      return lname;
    }

    public double getSalary() {
      return salary;
    }

    public boolean getHas401k() {
      return has401k;
    }

    public int getCompanyId() {
      return companyId;
    }

    public int getHealthPlanId() {
      return healthPlanId;
    }

    // Setter Methods
    public void setFname(String fname) {
      this.fname = fname;
    }

    public void setLname(String lname) {
      this.lname = lname;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }

    public void setHas401k(boolean has401k) {
      this.has401k = has401k;
    }

    public void setCompanyId(int companyId) {
      this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId) {
      this.healthPlanId = healthPlanId;
    }

    // Other Methods
    public String getName() {
      return fname + " " + lname;
    }
}
 ```
