package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BasePage;

import java.util.List;

public class CalculationPage extends BasePage {

    public void addProductToCart(String productName) {
        WebElement productLink = driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']"));
        productLink.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCartButton.click();

        driver.switchTo().alert().accept();

        driver.navigate().back();
    }

    public void cartLink() {
        WebElement cartLink = driver.findElement(By.xpath("//a[text()='Cart']"));
        cartLink.click();
    }

    public int calculateExpectedTotal() {
        List<WebElement> productPrices = driver.findElements(By.xpath("//tbody/tr/td[3]"));
        int total = 0;
        for (WebElement priceElement : productPrices) {
            int price = Integer.parseInt(priceElement.getText());
            total += price;
        }
        return total;
    }

    public int getDisplayedCartTotal() {
        WebElement cartTotal = driver.findElement(By.xpath("//h3[@id='totalp']"));
        return Integer.parseInt(cartTotal.getText());

    }

    public void validateCartTotal() {
        int expectedTotal = calculateExpectedTotal();
        int actualTotal = getDisplayedCartTotal();
        System.out.println("Expected total: " + expectedTotal + ", Actual total: " + actualTotal);  // Debugging line
        Assert.assertEquals(String.valueOf(actualTotal), expectedTotal, "Cart total does not match expected total");
    }


}