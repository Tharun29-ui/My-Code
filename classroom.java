class classroom {
    int id;
    int age;
    String name;
    static String school="SRET";
    public static void change()
    {
        school="NPC";
    }
public classroom(int id)
{
this.id=id;
}
public classroom(int id,int age)
{
    this.id=id;
    this.age=age;
}
public classroom(int id,int age,String name)
{
    this.id=id;
    this.age=age;
    this.name=name;
}
public void  display()
{
 System.out.println("age :" +id);
 System.out.println("name :"+name);
 System.out.println("student id:"+id);
 System.err.println("school:"+school);
}
}