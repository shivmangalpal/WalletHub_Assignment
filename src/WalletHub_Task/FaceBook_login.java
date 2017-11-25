package WalletHub_Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FaceBook_login 
{
	public static void main(String[] args)throws Exception
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shivmangalpal007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("shiv@1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//a[@id = 'u_0_d']")).click();
		driver.findElement(By.xpath("//div[@class='_nh6 _3qd3']")).click();
		Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='_1p1v']")));
        actions.click();
        actions.sendKeys(" i love my India ");
        actions.build().perform();
      	driver.findElement(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).click();
	}	
}
