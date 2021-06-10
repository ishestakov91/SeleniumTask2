package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePageFirstTab extends BasePage {

    @FindBy(xpath = "//h3[text()='Минимальная']")
    WebElement minimalInsurance;

    @FindBy(xpath = "//button[text()='Оформить']")
    WebElement applyEnsurance;

    public StorePageFirstTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getMinimalInsurance() {
        return minimalInsurance;
    }

    public WebElement getApplyEnsurance() {
        return applyEnsurance;
    }

    public void selectMinimalInsurance(){
        minimalInsurance.click();
    }

    public void selectApplyEnsurance(){
        applyEnsurance.click();
    }
}
