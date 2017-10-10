import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class VerificationTitle extends FunctionalTestSetup {

    @Test
    public void VerifyTitle (){

        driver = new ChromeDriver();
        driver.get("http://google.com");

       MainPage mainPage = PageFactory.initElements(driver,MainPage.class);

       mainPage.typeSearchBox("Kraków");
       mainPage.clickSubmitButton();

       ResultPage resultPage = PageFactory.initElements(driver,ResultPage.class);
       resultPage.confirmationTitle();
    }
}
