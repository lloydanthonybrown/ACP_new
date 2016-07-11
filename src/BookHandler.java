import java.text.NumberFormat;
import java.util.HashMap;

public class BookHandler implements ACHandler{
    public void handleIt(HashMap<String, Object> data) { // Is it important to specify the type of hashmap?

        HashMap BookData = (HashMap)data;
        int numberOfBooks = (Integer)BookData.get("amount");
        double totalAmount = numberOfBooks * (Double)BookData.get("bookPrice");

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("It will cost " + formatter.format(totalAmount) + " for those books.");
        System.out.println("What a bargain! ");
    }
}
