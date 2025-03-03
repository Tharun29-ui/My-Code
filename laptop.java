public class laptop extends computer{
    double screenSize;
    double weight;
    public laptop(double  screenSize, double weight,int ramsize,int disksize )
    {
        super(ramsize,disksize);
        this.screenSize=screenSize;
        this.weight=weight;
    }
    public void display1(){
        System.out.println("the screensize is"+screenSize);
        System.out.println("the weight is"+weight+"kg");
        System.out.println(super.ramsize);
        super.ramsize();
        super.disksize();
    }

}
