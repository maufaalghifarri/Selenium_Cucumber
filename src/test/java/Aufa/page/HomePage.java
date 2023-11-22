package Aufa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    By addSauceLabsBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    By chartSymbol = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void addChartSauceLabsBackpack() {
        driver.findElement(addSauceLabsBackpack).click();
    }

    public void clickCartSymbol() {
        driver.findElement(chartSymbol).click();
    }
}