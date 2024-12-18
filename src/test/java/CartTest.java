import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CartTest {

    private static final String base_url = "https://plexsupply.com";
    @Test
    public void AddItemToCartTest(){
        open(base_url);
    }

}
