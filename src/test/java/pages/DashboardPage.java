package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage() {
        this.driver = driver;

    }
    public void selectCategory(String category) {
        driver.findElement(By.xpath("//a[@id='itemc' and text()='" + category + "']")).click();
    }

    public void addPhoneToCart(String itemName) {
        driver.findElement(By.xpath("//a[@class='hrefch' and text()='" + itemName + "']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']")).click();
        driver.switchTo().alert().accept();
    }

    public void goToHomePage() {
        driver.findElement(By.xpath("//a[@class='nav-link' and @href='index.html']")).click();
    }

    public void addLaptopToCart(String itemName) {
        driver.findElement(By.xpath("//a[@class='hrefch' and text()='" + itemName + "']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']")).click();
        driver.switchTo().alert().accept();
    }

    public void goToCart() {
        driver.findElement(By.id("cartur")).click();
    }

    @FindBy(xpath = "//h3[@class='price-container']")
    private WebElement dashboardPrice;

    public String getProductPrice() {
        return dashboardPrice.getText();
    }
}

