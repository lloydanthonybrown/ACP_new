import java.text.NumberFormat;
import java.util.HashMap;

public class MovieHandler implements ACHandler {
    public void handleIt(HashMap<String, Object> data) { // Is it important to specify the type of hashmap?

        HashMap BookData = (HashMap)data;
        int numberOfMovies = (Integer)BookData.get("amount");
        double totalAmount = numberOfMovies * (Double)BookData.get("moviePrice");

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("It will cost " + formatter.format(totalAmount) + " for those movies.");
        System.out.println("What a bargain! ");
    }
}
