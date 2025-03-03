class Bank {
    double rateOfInterest() {
        return 0.0;
    }
}

class Axis extends Bank {  
    double rateOfInterest() {
        return 6.2;
    }
}

class PNB extends Bank {
    double rateOfInterest() {
        return 8.9;
    }
}

class YesBank extends Bank {   
    double rateOfInterest() {
        return 7.5;
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank axis = new Axis();
        Bank pnb = new PNB();
        Bank yesBank = new YesBank();
        
        System.out.println("Axis Bank Rate of Interest: " + axis.rateOfInterest() + "%");
        System.out.println("PNB Rate of Interest: " + pnb.rateOfInterest() + "%");
        System.out.println("Yes Bank Rate of Interest: " + yesBank.rateOfInterest() + "%");
    }
}
