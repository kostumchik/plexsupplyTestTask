import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    public static void checkThatProductExistsInCart(String productName, String productPrice) {
        $("body").shouldHave(text(productName));
        $("body").shouldHave(text(productPrice));
        $x("//span[text()='Proceed to Checkout']").click();
    }
}
