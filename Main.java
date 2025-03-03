class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}

class Student extends Person {
    int id;
    int[] marks;

    public Student(String name, int age, String sex, int id, int[] marks) {
        super(name, age, sex);
        this.id = id;
        this.marks = marks;
    }

    public double calculateAverageMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + id);
        System.out.println("Average Marks: " + calculateAverageMarks());
    }
}

class Employee extends Person {
    int empId;
    int[] attendance;

    public Employee(String name, int age, String sex, int empId, int[] attendance) {
        super(name, age, sex);
        this.empId = empId;
        this.attendance = attendance;
    }

    public double calculateAttendancePercentage() {
        int presentDays = 0;
        for (int day : attendance) {
            if (day == 1) {
                presentDays++;
            }
        }
        return (double) presentDays / attendance.length * 100;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.println("Attendance Percentage: " + calculateAttendancePercentage() + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 88,99};
        Student student = new Student("John", 20, "Male", 101, studentMarks);

        int[] employeeAttendance = {1, 1, 1, 0, 1, 1, 0, 1};
        Employee employee = new Employee("Alice", 30, "Female", 201, employeeAttendance);

        System.out.println("Student Details:");
        student.displayStudentDetails();
        System.out.println();

        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
    }
}
