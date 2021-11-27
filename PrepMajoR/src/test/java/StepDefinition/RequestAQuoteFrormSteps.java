package StepDefinition;

import PageObject.RequestAQuoteFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestAQuoteFrormSteps {
    public RequestAQuoteFormPage requestAQuoteFormPage;//declaring LinkedIn Page object
    public static WebDriver driver;// declaring driver
    public RequestAQuoteFormPage linked = new RequestAQuoteFormPage(driver);

    public RequestAQuoteFrormSteps()

    {
        WebDriverManager.chromedriver().setup(); //Setting up chrome web driver manager
        driver = new ChromeDriver(); // Initializing chrome driver new means initializing
        requestAQuoteFormPage = new RequestAQuoteFormPage(driver); //Instantiating linkedin page object driver


    }


    @Given("a user navigate to prepmajor")
    public void aUserNavigateToPrepmajor() {
        driver.get("https://develop0.prepmajor.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    @When("a user clicks on pricing on the header")
    public void aUserClicksOnPricingOnTheHeader() {
        requestAQuoteFormPage.clickPricing();
    }

    @And("a user clicks on request a quote at the customize plan card")
    public void aUserClicksOnRequestAQuoteAtTheCustomizePlanCard() {
    }

    @And("a user enter in the name box")
    public void aUserEnterInTheNameBox() {
    }

    @And("a user enter in the email box")
    public void aUserEnterInTheEmailBox() {
    }

    @And("a user enter in the company name box")
    public void aUserEnterInTheCompanyNameBox() {
    }

    @And("a user enter in phone number")
    public void aUserEnterInPhoneNumber() {
    }

    @And("a user enter in the country box")
    public void aUserEnterInTheCountryBox() {
    }

    @And("a user click yes to book a free demo")
    public void aUserClickYesToBookAFreeDemo() {
    }

    @And("a user click No doesn't want to book a free demo")
    public void aUserClickNoDoesnTWantToBookAFreeDemo() {
    }

    @And("a user select Yes-Book a meeting from the dropdown menu")
    public void aUserSelectYesBookAMeetingFromTheDropdownMenu() {
    }

    @And("a user select No-someone will contact you at a later date to arrange a meeting")
    public void aUserSelectNoSomeoneWillContactYouAtALaterDateToArrangeAMeeting() {
    }

    @And("a user enter message in the message box")
    public void aUserEnterMessageInTheMessageBox() {
    }

    @And("a user click on the submit button")
    public void aUserClickOnTheSubmitButton() {
    }

    @Then("Thank you for your message. It has been sent is displayed successfully")
    public void thankYouForYourMessageItHasBeenSentIsDisplayedSuccessfully() {
    }


}
