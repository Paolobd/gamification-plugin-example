package com.github.paolo.gamificationexample;

import com.github.paolobd.gamegui.GameGui;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

/**
 * This class is used to conduct a gamification experiment on the 'amazon.com' webpage using the Game GUI plugin
 * and Game GUI library.<br>
 * After finishing the tasks, complete this <a href="https://forms.gle/dQgiN6DzLCbdQbxD7">survey</a>
 */
public class AmazonTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        //The following line allows the driver to communicate with the gamification plugin
        //DO NOT DELETE!
        driver = GameGui.gamifyWebDriver(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    /**
     * Task 1:<br>
     * - On amazon.com search for 'Galactic Purple DualSense'<br>
     * - Click on the first result<br>
     * - Check that the product price is lower than $ 50
     */
    @Test
    public void task1() {

    }

    /**
     * Task 2:<br>
     * - On the 'Galactic Purple DualSense' page click on 'See more reviews'<br>
     * - Check the title and author of top positive review<br>
     * - Check the title and author of top critical review
     */
    @Test
    public void task2() {

    }

    /**
     * Task 3:<br>
     * - On the 'Galactic Purple DualSense' page click on 'Add to Cart'<br>
     * - On the new page click 'Go to Cart'<br>
     * - Check the name of the item in the cart, the quantity, the price, and the subtotal<br>
     * - Click 'Proceed to checkout'<br>
     * - Check the button is 'Create your Amazon account' is present
     */
    @Test
    public void task3() {

    }
}
