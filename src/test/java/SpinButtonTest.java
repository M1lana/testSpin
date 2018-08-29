import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SpinButtonTest extends BaseTest {

    @Test
    public void spinButtonIsActivatedAgainAfterSpin() {
        // waiting the spin button to be displayed
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("spinButton")))).click();

        // waiting for the end of the round
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.id("spinButton"), "class", "disabled")));
    }
}