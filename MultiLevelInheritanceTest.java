class Person {
   String name;
   int age;
   String mobileNo;

   public void getPersonDetails(String name, int age, String mobileNo) {
       this.name = name;
       this.age = age;
       this.mobileNo = mobileNo;
   }

   public void displayPerson() {
       System.out.println(name);
       System.out.println(age);
       System.out.println(mobileNo);
   }
}

class Student extends Person {
   int rollNo;
   double[] marks;
   String institution;

   public void getStudentDetails(int rollNo, double[] marks, String institution) {
       this.rollNo = rollNo;
       this.marks = marks;
       this.institution = institution;
   }

   public double getAverageMarks() {
       double sum = 0;
       for (int i = 0; i < marks.length; i++) {
           sum += marks[i];
       }
       return sum / marks.length;
   }

   public void displayStudent() {
       displayPerson();
       System.out.println(rollNo);
       for (int i = 0; i < marks.length; i++) {
           System.out.print(marks[i] + " ");
       }
       System.out.println();
       System.out.println(getAverageMarks());
       System.out.println(institution);
   }
}

class Employee extends Student {
   double salary;
   double[] salaryHistory;
   String organizationName;

   public void getEmployeeDetails(double salary, double[] salaryHistory, String organizationName) {
       this.salary = salary;
       this.salaryHistory = salaryHistory;
       this.organizationName = organizationName;
   }

   public void displayEmployee() {
       displayStudent();
       System.out.println(salary);
       for (int i = 0; i < salaryHistory.length; i++) {
           System.out.print(salaryHistory[i] + " ");
       }
       System.out.println();
       System.out.println(organizationName);
   }
}

public class MultiLevelInheritanceTest {
   public static void main(String[] args) {
       Employee emp = new Employee();

       double[] marks = {88.5, 76.0, 91.2, 85.0};
       double[] salaryHistory = {50000, 60000, 75000, 90000};

       emp.getPersonDetails("Alice Johnson", 30, "9876543210");
       emp.getStudentDetails(1023, marks, "Harvard University");
       emp.getEmployeeDetails(95000.0, salaryHistory, "Google Inc.");

       emp.displayEmployee();
   }
}
