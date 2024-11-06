package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class ProductPricePage extends BasePage {

    @FindBy(xpath = "//h5[text()='$320']")
    public WebElement productPrice;

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void selectProduct(String productName){
        WebElement productLink = driver.findElement(By.xpath("//a[contains(text(), 'Sony xperia')]"));
        productLink.click();
    }
}
