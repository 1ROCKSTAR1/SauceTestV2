import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    private final SelenideElement firstName = $x("//input[@data-test=\"firstName\"]");
    private final SelenideElement lastName = $x("//input[@data-test=\"lastName\"]");
    private final SelenideElement code = $x("//input[@data-test=\"postalCode\"]");
    private final SelenideElement continueButton = $x("//input[@type=\"submit\"]");

    public CheckoutPage(String url) {
        Selenide.open(url);
    }

    public void fillFields() throws InterruptedException {
        Thread.sleep(2000);
        firstName.sendKeys("test");
        Thread.sleep(1000);
        lastName.sendKeys("test");
        Thread.sleep(1000);
        code.sendKeys("test");
        Thread.sleep(1000);
        continueButton.click();
    }
}
