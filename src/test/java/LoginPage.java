import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement fieldLogin = $x("//*[@id=\"user-name\"]");
    private final SelenideElement fieldPass = $x("//*[@id=\"password\"]");
    private final SelenideElement submit = $x("//*[@id=\"login-button\"]");
    private final static SelenideElement error = $x("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    String errorMessageExpected = "Epic sadface: Username and password do not match any user in this service";
    String errorMessageActual;

    public LoginPage(String url) {
        Selenide.open(url);
    }

    public void logIn(String name, String pass) throws InterruptedException {
        Thread.sleep(1000);
        fieldLogin.sendKeys(name);
        Thread.sleep(1000);
        fieldPass.sendKeys(pass);
        Thread.sleep(1000);
        submit.click();
    }

    public void wronglogIn(String name, String pass) throws InterruptedException {
        Thread.sleep(1000);
        fieldLogin.sendKeys(name);
        Thread.sleep(1000);
        fieldPass.sendKeys(pass);
        Thread.sleep(1000);
        submit.click();
        errorMessageActual = error.getText();
    }
    public void secondTest() {
        $(error).shouldBe(Condition.visible);
        Assert.assertEquals(errorMessageActual, errorMessageExpected);
    }
}
