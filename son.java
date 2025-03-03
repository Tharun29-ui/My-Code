public class son extends dad {  
    int y; 

    public son(int x, int y) {
        super(x);
        this.y = y;
    }

    public void display1() {
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println(super.display() + ": The value of y is " + y);
        System.out.println("The value of m is: " + super.m);
    }
}
