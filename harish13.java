interface addition{
    int add();
}
interface subraction{
    int sub();
}
class cal implements addition,subraction{
    int a,b;
    public cal(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
    public int square()
    {
        return (a+b)*(a+b);
    }
}
class harish13{
    public static void main(String[] args) {
        cal x=new cal(6,5);
        System.out.println("addition:"+x.add());
        System.out.println("subraction:"+x.sub());
        System.out.println("square:"+x.square());
    }
}