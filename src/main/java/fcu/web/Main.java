package fcu.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://autos.yahoo.com.tw/bike-search?make_id=19");
        System.out.println(driver.getTitle());

        driver.quit();



    }
}