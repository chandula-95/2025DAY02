package com.automation.script1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
       Thread.sleep(200);
       driver.manage().window().maximize();
        Thread.sleep(200);
        driver.get("https://www.ebay.com/");
        //driver.navigate().to("https://www.ebay.com/");
        Thread.sleep(200);
        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("I phone");
        Thread.sleep(300);
        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(300);
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Go forword");
        driver.navigate().refresh();
    }
}
