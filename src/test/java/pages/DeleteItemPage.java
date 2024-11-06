package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class DeleteItemPage extends BasePage {

    @FindBy(xpath = "//a[text()='Phones']")
    private static WebElement phoneCategory;

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    private static WebElement phoneItem;

    @FindBy(xpath = "//a[text()='Add to cart']")
    private static WebElement addToCartButton;

    @FindBy(id = "id = \"cartur\"")
    private static WebElement cartLink;

    @FindBy(xpath = "//a[text()='Delete']")
    private static WebElement deleteButton;

    @FindBy(xpath = "//tbody")
    private static WebElement cartTable;


    public static void selectPhoneCategory() {
        phoneCategory.click();
    }

    public static void addPhoneToCart() {
        phoneItem.click();
        addToCartButton.click();
    }

    public static void navigateToCart() {
        cartLink.click();
    }

    public static void deleteItemFromCart() {
        deleteButton.click();
    }

    public static boolean isCartEmpty(){
        return cartTable.getText().trim().isEmpty();
    }



}
