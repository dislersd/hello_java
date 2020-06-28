package employeeApp;

public class Main {
  private static void workWithData() {
    System.out.println("Hello Java!!");
    HealthPlan h1 = new HealthPlan("My Health 1");
    HealthPlan h2 = new HealthPlan("My Health 2");
    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 100);
    Employee emp1 = new Employee("Steve", "Smith", 45000, true, c1.id, h1.getId());
    Employee emp2 = new Employee("Lisa", "Thompson", 60000, true, c1.id, h2.getId());
    Employee emp3 = new Employee("Mike", "Johnson", 50000, false, c2.id, h1.getId());
    Employee emp4 = new Employee("Allison", "O'Donnel", 80000, true, c2.id, h2.getId());

    System.out.println("*** Query Data");
    System.out.println(c1);
    System.out.println();
    System.out.println("Original: " + c1.debt);
    c1.debt = -c1.debt;
    c1.debt = -c1.debt;
  }

  public static void main(String[] args) {
    workWithData();
  }
}
