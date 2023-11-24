package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {
    WebDriver driver;

    By verifyCartPage = By.xpath("//*[@id=\"continue-shopping\"]");
    By cartpageSauceLabsBackpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    By removeSauceLabsBackpack = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    public void validateOnCartPage() {
        WebElement productElement = driver.findElement(verifyCartPage);
        assertTrue(productElement.isDisplayed());
        assertEquals("Continue Shopping", productElement.getText());
    }

    public void seeSauceLabsBackPackOnCartPage() {
        WebElement productElement = driver.findElement(cartpageSauceLabsBackpack);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void removeSauceLabsBackpackButton() {

        driver.findElement(removeSauceLabsBackpack).click();
    }
}
