import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CashoutPage {
    public static void checkThatCheckoutIsOpenAndContainsProduct(String productName, String productPrice){
        $("body").shouldHave(text(productName));
        $("body").shouldHave(text(productPrice));
    }
}
