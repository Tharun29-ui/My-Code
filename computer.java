public class computer {
    String manufacturer="ASUS";
    String processor="RTX";
    int ramsize;
    int disksize;
    public computer( int ramsize, int disksize)
    {
        this.ramsize=ramsize;
        this.disksize=disksize;
    }
    public  void ramsize()
    {
        System.out.print("ramsize is"+ramsize);
    }
    public String  disksize()
    {
        return("disksize is"+disksize);
    }
}
