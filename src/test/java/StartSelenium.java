import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
       wd = new ChromeDriver();
       wd.get("https://www.eurosport.ru/football/world-cup-qualification-uefa/2022/live_mtc1240273.shtml");
       wd.navigate().to("https://www.eurosport.ru/football/world-cup-qualification-uefa/2022/live_mtc1240273.shtml ");
    }
    @Test
    public void testName() {

    }
    @AfterMethod
    public void postCondition() {
        // wd.close();
        wd.quit();

    }
}
