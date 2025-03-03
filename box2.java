class Box {
    double length, breadth, height;
    
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    
    Box() {
        this(0, 0, 0);
    }
    
    double volume() {
        return length * breadth * height;
    }
}

class BoxWeight extends Box {
    double mass;
    
    BoxWeight(double l, double b, double h, double m) {
        super(l, b, h);
        mass = m;
    }
    
    BoxWeight() {
        this(0, 0, 0, 0);
    }
}

class Shipment extends BoxWeight {
    double shippingCost;
    
    Shipment(double l, double b, double h, double m, double cost) {
        super(l, b, h, m);
        shippingCost = cost;
    }
    
    Shipment() {
        this(0, 0, 0, 0, 0);
    }
    
    Shipment(double side, double m, double cost) {
        this(side, side, side, m, cost);
    }
}

public class box2 {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(10, 20, 30, 15, 50);
        Shipment s2 = new Shipment(5, 10, 8, 8, 25);
        Shipment s3 = new Shipment(6, 12, 10, 9, 30);
        Shipment cube = new Shipment(5, 12, 40);
        
        System.out.println("Shipment 1 - Volume: " + s1.volume() + ", Weight: " + s1.mass + ", Cost: " + s1.shippingCost);
        System.out.println("Shipment 2 - Volume: " + s2.volume() + ", Weight: " + s2.mass + ", Cost: " + s2.shippingCost);
        System.out.println("Shipment 3 - Volume: " + s3.volume() + ", Weight: " + s3.mass + ", Cost: " + s3.shippingCost);
        System.out.println("Cube Shipment - Volume: " + cube.volume() + ", Weight: " + cube.mass + ", Cost: " + cube.shippingCost);
    }
}
