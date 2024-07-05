package fcu.web;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://autos.yahoo.com.tw/new-bikes/make/honda");
        System.out.println(driver.getTitle());
        try{
            List<WebElement> elements = driver.findElements(By.cssSelector(".year-single  "));
            for(WebElement element : elements)
            {
                WebElement nameElement =element.findElement(By.cssSelector("span.title"));
                WebElement priceElement=element.findElement(By.cssSelector("span.price"));

                System.out.print(nameElement.getText()+"\t");
                System.out.print(priceElement.getText()+"\t 萬 \n");




            }

        }
        catch(NoSuchElementException nee)
        {
                nee.printStackTrace();
        }
        finally
        {
            driver.quit();
        }



    }
}