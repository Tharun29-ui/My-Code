
class Box {
    int length, breadth, height, volume;

    
    public Box() {
        this.length = 10;
        this.breadth = 10;
        this.height = 10;
        calculateVolume();
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        calculateVolume();
    }

    
    public Box(int side) {
        this.length = this.breadth = this.height = side;
        calculateVolume();
    }

    private void calculateVolume() {
        this.volume = length * breadth * height;
    }

   
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);
    }
}


class WeightedBox extends Box {
    int weight;

    public WeightedBox(int length, int breadth, int height, int weight) {
        super(length, breadth, height); 
        this.weight = weight;
    }

   
    public WeightedBox(int side, int weight) {
        super(side); 
        this.weight = weight;
    }

    
  
    public void display1() {
        super.display();
        System.out.println("Weight: " + weight);
    }
}


public class mew {
    public static void main(String[] args) {
        System.out.println("Default Box:");
        Box defaultBox = new Box();
        defaultBox.display();

        System.out.println("\nCuboid:");
        Box cuboid = new Box(10, 15, 20);
        cuboid.display();

        System.out.println("\nCube:");
        Box cube = new Box(10);
        cube.display();

        System.out.println("\nWeighted Cuboid:");
        WeightedBox weightedCuboid = new WeightedBox(10, 15, 20, 50);
        weightedCuboid.display1();

        System.out.println("\nWeighted Cube:");
        WeightedBox weightedCube = new WeightedBox(10, 30);
        weightedCube.display1();
}
}
