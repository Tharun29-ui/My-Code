class baseclass{ 
    int x; 
    int z=400; 
    public baseclass(int x){ 
        this.x=x; 
    } 
    public String display(){ 
        return (" the x value is " + x); 
    } 
} 
class derivedclass extends baseclass{ 
    int y; 
    public derivedclass(int x,int y) 
    { 
        super(x); 
        this.y=y;   
        
    } 
     void dis()
    {
        System.out.println(super.display());
    }
} 
class meow { 
    public static void main (String args[]) 
    { 
        derivedclass b = new derivedclass(5,4); 
        System.out.println(b.display()); 
        b.dis();
    } 
}