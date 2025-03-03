interface vehicle
{
    void changeGear();
    void speedup();
    void applybrakes();
}
class car implements vehicle
{
    int speed;
    int gear;
    public car(int speed,int gear)
    {
        this.speed=speed;
        this.gear=gear;
    }
    public void changeGear()  
    {
        gear++;
    }
    public void speedup()
    {
        speed+=5;
    }
    public void applybrakes()
    {
       speed-=1;
    }
    public void printStates()
    {
        System.out.println("car-speed:"+speed+"gear:"+gear);
    }
}
class bike implements vehicle{
    int speed;
    int gear;
    public bike(int speed,int gear)
    {
        this.speed=speed;
        this.gear=gear;
    }
    public void changeGear()
    {
        gear++;
    }
    public void speedup()
    {
        speed+=2;
    }
    public void applybrakes()
    {
       speed-=1;
    }
    public void printStates()
    {
        System.out.println("car-speed:"+speed+  "gear:"+gear);
    }
}
class harish12
{
    public static void main(String[] args) {
        car Car=new car(5,1);
        Car.changeGear();
        Car.speedup();
        Car.applybrakes();
        System.out.println("CAR PRESENT STATE:");
        Car.printStates();
        bike Bike=new bike(20, 1);
        Bike.changeGear();
        Bike.speedup();
        Bike.applybrakes();
        System.out.println("BIKE PRESENT STATE:");
        Bike.printStates();
    }
}