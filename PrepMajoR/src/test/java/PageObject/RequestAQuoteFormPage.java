package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestAQuoteFormPage {
    public RequestAQuoteFormPage(WebDriver driver)

    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li[id='menu-item-587'] a")
    private WebElement Pricing;
    public void ClickPricing()
    {
        Pricing.click();
    }


}