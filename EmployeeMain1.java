class Employee {

    private String name;
    
    private static int instanceCount = 0; // Static variable to count instances
    
    public Employee(String name) {
    
    this.name = name;
    
    instanceCount++; // Increment the instance count each time an object is created
    
    }
    
    public void display() {
    
    System.out.println("Employee Name: " + name);
    
    }
    
    public int getInstanceCount() {
    
    return instanceCount;
    
    } }
    
    public class EmployeeMain1 {
    
    public static void main(String[] args) {
    
    Employee e1 = new Employee("John Doe");
    
    Employee e2 = new Employee("Jane Smith");
    
    Employee e3 = new Employee("Alice Johnson");
    
    e1.display();
    
    e2.display();
    
    e3.display();
    
    System.out.println("Total number of Employee instances: " + e1.getInstanceCount());
    
    System.out.println("Total number of Employee instances: " + e2.getInstanceCount());
    System.out.println("Total number of Employee instances: " + e3.getInstanceCount());
    
    } }