import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class VSCodeTest {

    @Test
    public void vscodeTest() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Visual\\ Studio\\ Code.app/Contents/MacOS/Electron");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        ChromeDriver driver = new ChromeDriver(capabilities);
    }
}
