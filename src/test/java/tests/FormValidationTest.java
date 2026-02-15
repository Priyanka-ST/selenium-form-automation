package tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import java.time.Duration;

public class FormValidationTest extends BaseTest {

    @Test
    public void fillTechlisticForm() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // FIRST NAME
        WebElement firstName =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        firstName.sendKeys("Priya");

        // LAST NAME
        driver.findElement(By.name("lastname")).sendKeys("K");

        // GENDER
        driver.findElement(By.id("sex-1")).click();

        // EXPERIENCE
        driver.findElement(By.id("exp-2")).click();

        // DATE
        driver.findElement(By.id("datepicker")).sendKeys("16-02-2026");
    }
}

