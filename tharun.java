import java.util.Scanner;
class tharun {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int length=in.nextInt();
        int breath=in.nextInt();
        Test1 bmw = new Test1(length, breath);
        bmw.length();
        bmw.breath();
        bmw.area();
        bmw.perimeter();
        bmw.recount();
    }
}
