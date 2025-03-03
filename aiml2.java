public class aiml2 {
    public static void main(String[] args) {
        aiml1 pizza1 = new aiml1();
        pizza1.displayOrder();
        aiml1 pizza2 = new aiml1(true, true);
        pizza2.displayOrder();       
       aiml1 pizza3 = new aiml1(true, true, true);
        pizza3.displayOrder();
    }
}
