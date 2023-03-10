import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class YourCartPage {
    private final SelenideElement checkOutButton = $x("//button[@class=\"btn btn_action btn_medium checkout_button\"]");

    public YourCartPage(String url) {
        Selenide.open(url);
    }

    public void clickCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        checkOutButton.click();
    }
}
