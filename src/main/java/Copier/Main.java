package Copier;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class Main {

    private static String content = null;
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement googleSearch= driver.findElement(By.name("q"));
        googleSearch.click();


       CopyStringToClipBoard.basic("input.txt");

        googleSearch.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(5000);
        googleSearch.submit();
        driver.quit();



    }


}
