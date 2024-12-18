import com.codeborne.selenide.Condition;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public static Map<String, String> addProductToCart() {
        $x("(//span[text()='Best Selling Products']/parent::h2/parent::div/parent::div//h3[@class='product-item-name'])[1]").scrollIntoView(false); //find first product in Best Selling section
        if ($("#notice-cookie-block").isDisplayed()) {
            $("#btn-cookie-allow").click();
        }
        String productName = $x("(//span[text()='Best Selling Products']/parent::h2/parent::div/parent::div//h3[@class='product-item-name'])[1]/a").getText(); //save product name
        String productPrice = $x("(//span[text()='Best Selling Products']/parent::h2/parent::div/parent::div//div[@class='price-wrap'])[1]//span[@class='price']").getText(); //save product price
        Map<String, String> productDetails = new HashMap<>();
        productDetails.put("productName", productName);
        productDetails.put("productPrice", productPrice);
        sleep(2000);
        $x("(//span[text()='Best Selling Products']/parent::h2/parent::div/parent::div//div[@class='product-btn'])[1]").hover();
        $x("(//span[text()='Best Selling Products']/parent::h2/parent::div/parent::div//div[@class='product-btn'])[1]//i[@class='mbi mbi-bag2']").click(); //click Add to Cart icon
        $x("//span[text()='Checkout']").shouldBe(visible, Duration.ofSeconds(10));
        $x("//a[text()='shopping cart']").click();
        return productDetails;
    }
}
