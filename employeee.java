public class employeee extends person1{
    public static employeee akshay;
    String organisation;
    int empid;
    public employeee(String organisation,int empid)
    {
        this.organisation=organisation;
        this.empid=empid;
    }
    public employeee()
{
      this.empid=34;
      this.organisation="allen";
}
    public void display2()
    {
        super.display();
        System.err.println("organisation name:"+organisation+"employee id:"+empid);
    }
}
