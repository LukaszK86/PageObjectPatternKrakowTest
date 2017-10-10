import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage {

    @FindBy(how = How.ID,using = "rhs_title" )
    WebElement titleKrakow;

    public String confirmationTitle (){
        return titleKrakow.getText();
    }

}
