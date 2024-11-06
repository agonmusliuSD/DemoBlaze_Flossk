package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategoriesPage {

private WebDriver driver;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isCategoryPresent(String categoryName) {
        List<WebElement> categoryItems = driver.findElements(By.xpath("//*[@id=\"cat\"]"));
        for (WebElement category : categoryItems) {
            if (category.getText().equalsIgnoreCase(categoryName)) {
                return true;
            }
        }
        return false;
    }
}