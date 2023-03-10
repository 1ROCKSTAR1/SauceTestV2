import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private final SelenideElement addToCart = $x("//button[@name=\"add-to-cart-sauce-labs-backpack\"]");
    private final SelenideElement cart = $x("//a[@class=\"shopping_cart_link\"]");

    public ProductsPage(String url){
        Selenide.open(url);
    }

    public void clickOnAdd() throws InterruptedException {
        Thread.sleep(2000);
        addToCart.click();
        Thread.sleep(2000);
        cart.click();
    }
}
