package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage extends BasePage {

    @FindBy(xpath = "//h3[text()='Страхование для путешественников']")
    WebElement labelTravelers;

    @FindBy(xpath = "(//h3[text()='Страхование для путешественников']/../../..//a)[3]")
    WebElement buttonTravelers;

    public ProgramPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getLabelTravelers() {
        return labelTravelers;
    }

    public WebElement getButtonTravelers() {
        return buttonTravelers;
    }

    public void selectButtonTravelers(){
        buttonTravelers.click();
    }

}
