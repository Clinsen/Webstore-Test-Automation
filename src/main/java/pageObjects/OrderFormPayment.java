package pageObjects;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPayment extends BaseClass {
    public OrderFormPayment() throws IOException {
        super();
    }

    By payByCheck = By.xpath("//span[.='Pay by Check']");
    By payByWire = By.xpath("//span[.='Pay by bank wire']");
    By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public WebElement getPayByCheckRadioBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(payByCheck);
    }
    public WebElement getPayByWireRadioBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(payByWire);
    }
    public WebElement getTermsConditionsCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(termsAndConditions);
    }
    public WebElement getOrderBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(orderBtn);
    }
}
