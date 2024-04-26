package pageObjects;

import base.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderConfirm extends PageObjectBase {
    public OrderConfirm() throws IOException {
        super();
    }

    By confirmOrderLbl = By.cssSelector(".card-title.h1");

    public WebElement getConfirmOrderLabel() throws IOException {
        this.driver = getDriver();
        return driver.findElement(confirmOrderLbl);
    }
}
