package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class StorePageSecondTab extends BasePage {

    @FindBy(id = "surname_vzr_ins_0")
    WebElement insuredLastName;

    @FindBy(id = "name_vzr_ins_0")
    WebElement insuredFirstName;

    @FindBy(id = "birthDate_vzr_ins_0")
    WebElement insuredBirthDate;

    @FindBy(id = "person_lastName")
    WebElement insurerLastName;

    @FindBy(id = "person_firstName")
    WebElement insurerFirstName;

    @FindBy(id = "person_middleName")
    WebElement insurerMiddleName;

    @FindBy(id = "person_birthDate")
    WebElement insurerBirthDate;

    @FindBy(xpath = "//label[text()='Мужской']")
    WebElement insurerGender;

    @FindBy(id = "passportSeries")
    WebElement insurerPassportSeries;

    @FindBy(id = "passportNumber")
    WebElement insurerPassportNumber;

    @FindBy(id = "documentDate")
    WebElement insurerDocumentDate;

    @FindBy(id = "documentIssue")
    WebElement insurerDocumentIssue;

    @FindBy(xpath = "//button[contains(text(),'Продолжить')]")
    WebElement continueButton;

    @FindBy(xpath = "(//legend[text()='Контакты']/..//span[contains(@class,'form-control__message')])[1]")
    WebElement warningMessageOne;

    @FindBy(xpath = "(//legend[text()='Контакты']/..//span[contains(@class,'form-control__message')])[2]")
    WebElement warningMessageTwo;

    @FindBy(xpath = "(//legend[text()='Контакты']/..//span[contains(@class,'form-control__message')])[3]")
    WebElement warningMessageThree;

    @FindBy(xpath = "//div[contains(@class,'alert-form-error')]")
    WebElement formAlert;

    public StorePageSecondTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectInsurerGender() {
        insurerGender.click();
    }

    public void selectContinueButton() {
        continueButton.click();
    }

    public void checkFillField(String value, String elementName) {
        assertEquals(value, this.getFillField(elementName));
    }

    public void checkWarningField(String value, String elementName) {
        assertEquals(value, this.getWarningsText(elementName));
    }

    public void fillField(String fieldName, String value) throws Exception {
        switch (fieldName) {
            case "insuredLastName":
                fillField(insuredLastName, value);
                break;
            case "insuredFirstName":
                fillField(insuredFirstName, value);
                break;
            case "insuredBirthDate":
                fillField(insuredBirthDate, value);
                insurerBirthDate.sendKeys(Keys.TAB);
                break;
            case "insurerLastName":
                fillField(insurerLastName, value);
                break;
            case "insurerFirstName":
                fillField(insurerFirstName, value);
                break;
            case "insurerMiddleName":
                fillField(insurerMiddleName, value);
                break;
            case "insurerBirthDate":
                fillField(insurerBirthDate, value);
                insurerBirthDate.sendKeys(Keys.TAB);
                break;
            case "insurerGender":
                selectInsurerGender();
                break;
            case "insurerPassportSeries":
                fillField(insurerPassportSeries, value);
                break;
            case "insurerPassportNumber":
                fillField(insurerPassportNumber, value);
                break;
            case "insurerDocumentDate":
                fillField(insurerDocumentDate, value);
                insurerDocumentDate.sendKeys(Keys.TAB);
                break;
            case "insurerDocumentIssue":
                fillField(insurerDocumentIssue, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "insuredLastName":
                return insuredLastName.getAttribute("value");
            case "insuredFirstName":
                return insuredFirstName.getAttribute("value");
            case "insuredBirthDate":
                return insuredBirthDate.getAttribute("value");
            case "insurerLastName":
                return insurerLastName.getAttribute("value");
            case "insurerFirstName":
                return insurerFirstName.getAttribute("value");
            case "insurerMiddleName":
                return insurerMiddleName.getAttribute("value");
            case "insurerBirthDate":
                return insurerBirthDate.getAttribute("value");
            case "insurerPassportSeries":
                return insurerPassportSeries.getAttribute("value");
            case "insurerPassportNumber":
                return insurerPassportNumber.getAttribute("value");
            case "insurerDocumentDate":
                return insurerDocumentDate.getAttribute("value");
            case "insurerDocumentIssue":
                return insurerDocumentIssue.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public String getWarningsText(String fieldName) {
        switch (fieldName) {
            case "warningMessageOne":
                return warningMessageOne.getText();
            case "warningMessageTwo":
                return warningMessageTwo.getText();
            case "warningMessageThree":
                return warningMessageThree.getText();
            case "formAlert":
                return formAlert.getText();
        }
        throw new AssertionError("Указанного предупреждения нет на странице");
    }

}
