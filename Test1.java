class Test1 {
    int length;
    int breath;
    int area;
    int perimeter;
    int count=0;
    public Test1(int length, int breath)
    {
    this.length= length;
    this.breath=breath;
    count++;
    }
void length() {
    System.out.println(length + " is the given length.");
}

void breath() {
    System.out.println(breath + " is the given breath.");
}

void area() {
    area=length*breath;
    System.out.println(area + " is the area.");
}
void perimeter() {
    perimeter=2*(length+breath);
    System.out.println(perimeter + " is the perimeter.");
}
public void display()
{
    System.out.println(" length: " +length);
    System.out.println(":breath "+ breath);
    System.out.println("area : " +area);
    System.out.println("perimeter : " +perimeter);
}
public int recount()
{
return count ;
}
}
