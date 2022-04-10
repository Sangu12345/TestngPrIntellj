package testngassertpr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertpr {
    WebDriver driver;
  @BeforeClass
   void setup()
   {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\HAMJE SANGAMESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

    }
    @Test(priority=1)
    void LogoTest()
    {
   WebElement logo =driver.findElement(By.xpath("//div[@class='_8ice']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test(priority=2)
    void HomePageTitle()
    {
       String actresult= "Facebook – log in or sign up";
      String expectedresult=driver.getTitle();
    Assert.assertEquals(actresult,expectedresult);
    }
    @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
