import org.junit.Test;

public class Tests extends Basis {

    private final static String BASE_URL = "https://www.saucedemo.com";
    private final static String PRODUCTS_URL = "https://www.saucedemo.com/inventory.html";
    private final static String CARTPAGE_URL = "https://www.saucedemo.com/cart.html";
    private final static String CHECKOUTPAGE_URL = "https://www.saucedemo.com/checkout-step-one.html";
    private final static String CHECKOUTOVERPAGE_URL = "https://www.saucedemo.com/checkout-step-two.html";
    private final static String CHECKOUTCOMPLETE_URL = "https://www.saucedemo.com/checkout-complete.html";

    @Test
    public void firstTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.logIn("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(PRODUCTS_URL);
        productsPage.clickOnAdd();
        YourCartPage cartPage = new YourCartPage(CARTPAGE_URL);
        cartPage.clickCheckOut();
        CheckoutPage checkoutPage = new CheckoutPage(CHECKOUTPAGE_URL);
        checkoutPage.fillFields();
        CheckoutOverPage checkoutOverPage = new CheckoutOverPage(CHECKOUTOVERPAGE_URL);
        checkoutOverPage.clickFinish();
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(CHECKOUTCOMPLETE_URL);
        checkoutCompletePage.messageCheck();
    }

    @Test
    public void secondTest() throws InterruptedException {
        LoginPage loginPage2 = new LoginPage(BASE_URL);
        loginPage2.wronglogIn("test", "test");
        loginPage2.secondTest();
    }
}
