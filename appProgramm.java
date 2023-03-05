import java.util.ArrayList;
import java.util.List;

/**
 * appClasses
 */
public class appProgramm {

    public static void main(String[] args) {
        List<productBase> prodList = new ArrayList<>();

        productBase baykal = new prodLimonad("Baykal", (float) 10.20, 100, "ps", (float) 1.0);
        productBase stolovoe = new prodEgg("Stolovoe", 5, 100, "ps", 20, 30);
        productBase Nareznoy = new prodBread("Nareznoy", 1, 100, "ps", 10, "wht");
        productBase mask = new prodMask("Mask_med", 1, 100, "ps", 50);
        productBase milky = new prodMilk("Prostoye", 3, 100, "ps", 90, (float) 3.2);
        productBase pumpers = new prodNappy("Pumpers", 12, 100, "ps", 20, 3, (float) 0.1, (float) 0.4, "ress");
        productBase soska = new prodPacifier("Soska", (float) 0.2, 500, "ps", 0, 3);
        productBase tp = new prodToiletPaper("Myagkaya", 3, 100, "ps", 6, 3);


        prodList.add(0, baykal);
        prodList.add(1, stolovoe);
        prodList.add(2, Nareznoy);
        prodList.add(3, mask);
        prodList.add(4, milky);
        prodList.add(5, pumpers);
        prodList.add(6, soska);
        prodList.add(7, tp);

        QuickViewAllProducts(prodList);
    }

    public static void QuickViewAllProducts(List<productBase> prodList) {
        System.out.println("===========================");
        for (productBase product : prodList) {
            System.out.println(product.toString());
        }
    }
}