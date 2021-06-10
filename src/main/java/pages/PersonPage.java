package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Страхование']")
    WebElement menuInsurance;

    @FindBy(xpath = "//a[text()='Все страховые программы']")
    WebElement allPrograms;

    public PersonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMenuInsurance(){
        menuInsurance.click();
    }

    public void selectAllPrograms(){
        allPrograms.click();
    }
}
