import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    WebDriver driver;

    public MainPage (WebDriver driver){
        this.driver=driver;
    }

    @FindBy (id="lst-ib")
    WebElement searchBox;
    @FindBy (how = How.NAME,using = "btnK")
    WebElement submitButton;


    public void typeSearchBox (String word){
        searchBox.sendKeys(word);
    }

    public void clickSubmitButton (){
        submitButton.click();
    }
}
