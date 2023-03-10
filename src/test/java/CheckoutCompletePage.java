import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutCompletePage {
    private final SelenideElement complete = $x("//h2[@class=\"complete-header\"]");

    String actualMessage = "Thank you for your order!";
    String expectedMessage = complete.getText();

    public CheckoutCompletePage(String url) {
        Selenide.open(url);
    }
    public void messageCheck() throws NullPointerException {

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
