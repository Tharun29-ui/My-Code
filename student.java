public class student extends person1  {
    String colname;
    int id;
    public student(String Name, int mobile, int age, String colname, int id) {
        super(Name, mobile, age); 
        this.colname = colname;
        this.id = id;
    }
   
    public void display1() {
        super.display(); 
        System.out.println("The college name is: " + colname + ", student ID: " + id);
    }
}

