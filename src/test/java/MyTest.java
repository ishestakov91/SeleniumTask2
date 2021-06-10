import org.junit.Test;
import pages.PersonPage;
import pages.ProgramPage;
import pages.StorePageFirstTab;
import pages.StorePageSecondTab;

public class MyTest extends BaseTest {

    @Test
    public void testInsurance() throws Exception {

        driver.get(baseUrl + "/");

        PersonPage personPage = new PersonPage(driver);
        personPage.selectMenuInsurance();
        personPage.wait(1000);
        personPage.selectAllPrograms();

        ProgramPage programPage = new ProgramPage(driver);
        programPage.isElementDisplayed(programPage.getLabelTravelers());
        programPage.pageScroll(programPage.getButtonTravelers());
        programPage.selectButtonTravelers();

        StorePageFirstTab storePageFirstTab = new StorePageFirstTab(driver);
        storePageFirstTab.pageScroll(storePageFirstTab.getMinimalInsurance());
        storePageFirstTab.selectMinimalInsurance();
        storePageFirstTab.wait(2000);
        storePageFirstTab.pageScroll(storePageFirstTab.getApplyEnsurance());
        storePageFirstTab.selectApplyEnsurance();
        storePageFirstTab.wait(1000);

        StorePageSecondTab storePageSecondTab = new StorePageSecondTab(driver);
        storePageSecondTab.fillField("insuredLastName", "Иванов");
        storePageSecondTab.fillField("insuredFirstName", "Иван");
        storePageSecondTab.fillField("insuredBirthDate", "02061971");
        storePageSecondTab.fillField("insurerLastName", "Иванов");
        storePageSecondTab.fillField("insurerFirstName", "Иван");
        storePageSecondTab.fillField("insurerMiddleName", "Иванович");
        storePageSecondTab.fillField("insurerBirthDate", "02061971");
        storePageSecondTab.fillField("insurerGender", "Мужской");
        storePageSecondTab.fillField("insurerPassportSeries", "0316");
        storePageSecondTab.fillField("insurerPassportNumber", "770378");
        storePageSecondTab.fillField("insurerDocumentDate", "15062016");
        storePageSecondTab.fillField("insurerDocumentIssue", "ОВД г. Москва");

        storePageSecondTab.checkFillField("Иванов", "insuredLastName");
        storePageSecondTab.checkFillField("Иван", "insuredFirstName");
        storePageSecondTab.checkFillField("02.06.1971", "insuredBirthDate");
        storePageSecondTab.checkFillField("Иванов", "insurerLastName");
        storePageSecondTab.checkFillField("Иван", "insurerFirstName");
        storePageSecondTab.checkFillField("Иванович", "insurerMiddleName");
        storePageSecondTab.checkFillField("02.06.1971", "insurerBirthDate");
        storePageSecondTab.checkFillField("0316", "insurerPassportSeries");
        storePageSecondTab.checkFillField("770378", "insurerPassportNumber");
        storePageSecondTab.checkFillField("15.06.2016", "insurerDocumentDate");
        storePageSecondTab.checkFillField("ОВД г. Москва", "insurerDocumentIssue");

        storePageSecondTab.wait(1000);

        storePageSecondTab.selectContinueButton();

        storePageSecondTab.checkWarningField("Поле не заполнено.", "warningMessageOne");
        storePageSecondTab.checkWarningField("Поле не заполнено.", "warningMessageTwo");
        storePageSecondTab.checkWarningField("Поле не заполнено.", "warningMessageThree");
        storePageSecondTab.checkWarningField("При заполнении данных произошла ошибка", "formAlert");

    }


}



