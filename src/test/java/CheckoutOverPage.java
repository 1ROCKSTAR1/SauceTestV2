import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutOverPage {
    private final SelenideElement finish = $x("//button[@class=\"btn btn_action btn_medium cart_button\"]");

    public CheckoutOverPage(String url) {
        Selenide.open(url);
    }
    public void clickFinish() throws InterruptedException {
        Thread.sleep(1000);
        finish.click();
    }
}
