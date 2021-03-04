package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculator {

    @Test
    public void calculateKgCmNormal() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Open site https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 2. Enter 80 in Weight field
        driver.findElement(By.name("wg")).sendKeys("80");
        // 3. Enter 180 in Height field
        driver.findElement(By.name("ht")).sendKeys("180");
        // 4. Click Calculate button
        driver.findElement(By.name("cc")).click();
        String actualCategoryText = driver.findElement(By.name("desc")).getAttribute("value");
        String expectedCategoryText = "Your category is Normal";
        // 5. Check text "Your category is Normal" is displayed
        Assert.assertEquals(actualCategoryText,expectedCategoryText, "Your category is Normal");

        driver.close();
    }
    @Test
    public void calculateKgCmObese() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Open site https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 2. Enter 140 in Weight field
        driver.findElement(By.name("wg")).sendKeys("140");
        // 3. Enter 180 in Height field
        driver.findElement(By.name("ht")).sendKeys("180");
        // 4. Click Calculate button
        driver.findElement(By.name("cc")).click();
        String actualCategoryText = driver.findElement(By.name("desc")).getAttribute("value");
        String expectedCategoryText = "Your category is Obese";
        // 5. Check text "Your category is Normal" is displayed
        Assert.assertEquals(actualCategoryText,expectedCategoryText, "Incorrect" + actualCategoryText);

        driver.close();
    }

    @Test
    public void calculate() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Open site https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        // 2. Enter 140 in Weight field
        driver.findElement(By.name("wg")).sendKeys("140");
        // 3. Enter 180 in Height field
        driver.findElement(By.name("ht")).sendKeys("180");
        // 4. Click Calculate button
        driver.findElement(By.name("cc")).click();
        String actualCategoryText = driver.findElement(By.name("desc")).getAttribute("value");
        String expectedCategoryText = "Your category is Obese";
        // 5. Check text "Your category is Normal" is displayed
        Assert.assertEquals(actualCategoryText,expectedCategoryText, "Incorrect" + actualCategoryText);

        driver.close();
    }

}
