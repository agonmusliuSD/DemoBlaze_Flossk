package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class OrderPage {

    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickPurchaseButton() {
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
    }

    public void fillOrderDetails(String name, String country, String city, String creditCard, String month, String year) {
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("country")).sendKeys(country);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("card")).sendKeys(creditCard);
        driver.findElement(By.id("month")).sendKeys(month);
        driver.findElement(By.id("year")).sendKeys(year);
    }

    public void confirmOrder() {
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Purchase']")).click();
    }

    public void verifyConfirmationMessage() {
        WebElement confirmationMessage = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));

        String expectedMessage = "Thank you for your purchase!";
    }

    }