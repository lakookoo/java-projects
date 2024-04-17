import accounts.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Main {
    public static void main(String[] args) {
        Account silver = new SilverCheckingAccount(5000, 0.025, 1000);
        CheckingAccount gold = new GoldCheckingAccount(5000, 0.025, 1000);
        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);

        //System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        //silver.purchase(3500);
        gold.purchase(3500);
        diamond.purchase(3500);

        //System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());


    }
}