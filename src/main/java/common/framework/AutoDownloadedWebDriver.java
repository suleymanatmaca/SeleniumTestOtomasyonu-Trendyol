package common.framework;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoDownloadedWebDriver implements DriverSource {
    public enum WebBrowsers {
        CHROME,
        FIREFOX,
        IE
    }

    private BaseConfiguration baseConfiguration = new BaseConfiguration();

    @Override
    public WebDriver newDriver() {
        WebBrowsers browserType = WebBrowsers.valueOf(baseConfiguration.getProperty("browser"));
        String workingDir = System.getProperty("user.dir");

        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", workingDir + "\\Drivers\\chromedriver.exe");
                ChromeDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", workingDir + "\\Drivers\\geckodriver.exe");
                FirefoxOptions options = new FirefoxOptions()
                        .setProfile(new FirefoxProfile());
                WebDriver ffdriver = new FirefoxDriver(options);
                return ffdriver;
            case IE:
                System.setProperty("webdriver.ie.driver", workingDir + "\\Drivers\\MicrosoftWebDriver.exe");
                WebDriver iedriver = new InternetExplorerDriver();
                return iedriver;
            default:
                return null;
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
