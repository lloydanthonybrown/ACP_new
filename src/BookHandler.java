import java.text.NumberFormat;
import java.util.HashMap;

public class BookHandler implements ACHandler{
    public void handleIt(HashMap<String, Object> data) {

        HashMap BookData = (HashMap)data;
        int numberOfBooks = (Integer)BookData.get("amount");
        // Something is breaking here. I can't cast an Integer to a Double. How do I fix that?
        double totalAmount = numberOfBooks * (Double)BookData.get("bookPrice");

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        // Will this actually print to the console, because the method itself doesn't return anything?
        System.out.println("It will cost " + formatter.format(totalAmount) + " for those books.");
        System.out.println("What a bargain! ");
    }
}
