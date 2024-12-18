import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class CartTest {

    private static final String base_url = "https://plexsupply.com";
    @Test
    public void AddItemToCartTest(){
        Map<String, String> productDetails;
        open(base_url);
        productDetails = HomePage.addProductToCart();
        CartPage.checkThatProductExistsInCart(productDetails.get("productName"), productDetails.get("productPrice"));
    }

}
