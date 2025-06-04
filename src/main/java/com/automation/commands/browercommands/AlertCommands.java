package com.automation.commands.browercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertCommands {

    public static void main(String[] args) throws InterruptedException {
        alertwithok();
    }

    public static void alertwithok() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class='btn btn-danger']")).click(); // Fixed here
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
        Thread.sleep(3000);

    }
}


//public class AlertCommands {
//    public static void main(String[] args) throws InterruptedException {
//        alertWithOK();
//    }
//
//    public static void alertWithOK() throws InterruptedException {
//        WebDriver driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Alerts.html");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
//
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
//        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        Thread.sleep(3000);
//    }
//}