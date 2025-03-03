class RoyalBankVault {

    String treasureID;
    String royalHolder;
    double goldenCoins;
    String vaultType;

    public RoyalBankVault(String treasureID, String royalHolder) {
        this.treasureID = treasureID;
        this.royalHolder = royalHolder;
        this.goldenCoins = 0.0;
        this.vaultType = "Standard Treasure";
    }

    public RoyalBankVault(String treasureID, String royalHolder, double goldenCoins) {
        this.treasureID = treasureID;
        this.royalHolder = royalHolder;
        this.goldenCoins = goldenCoins;
        this.vaultType = "Standard Treasure";
    }

    public RoyalBankVault(String treasureID, String royalHolder, double goldenCoins, String vaultType) {
        this.treasureID = treasureID;
        this.royalHolder = royalHolder;
        this.goldenCoins = goldenCoins;
        this.vaultType = vaultType;
    }

    public void unveilFortune() {
        System.out.println("Treasure ID: " + treasureID);
        System.out.println("Royal Holder: " + royalHolder);
        System.out.println("Golden Coins: " + goldenCoins);
        System.out.println("Vault Type: " + vaultType);
        System.out.println("----------------------------------------");
    }
}
class 
public class KingdomBank {
    public static void main(String[] args) {
        RoyalBankVault vault1 = new RoyalBankVault("R001", "King Arthur");
        vault1.unveilFortune();

        RoyalBankVault vault2 = new RoyalBankVault("R002", "Queen Isabella", 500.0);
        vault2.unveilFortune();

        RoyalBankVault vault3 = new RoyalBankVault("R003", "Prince Henry", 1200.0, "Royal Reserve");
        vault3.unveilFortune();
    }
}