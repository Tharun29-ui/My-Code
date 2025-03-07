class motherboard
{
    int u1=3;
    static int u2=4;
    static class usb{
        int usb2=1;
        int usb6=2;
        int add()
        {
            motherboard m=new motherboard();
            motherboard.display(); 
            return usb2+usb6+ m.u1+u2;
        }  
    }
    public static  void display()
    {
        System.out.println("SKIBBIDI");
    }
                
}
public class nestedclass{
    public static void main(String[] args) {
        motherboard.usb tha=new motherboard.usb();
        System.out.println(+tha.add());
    }
}