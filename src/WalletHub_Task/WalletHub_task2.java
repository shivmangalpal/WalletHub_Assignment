package WalletHub_Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WalletHub_task2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://wallethub.com/profile/test_insurance_company/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='af-icon-cross']")).click();
		WebElement we0=driver.findElement(By.xpath("//span[@class='wh-rating rating_5']"));
		WebElement we5=driver.findElement(By.xpath("//div[@class='wh-rating-choices-holder']/a[1]"));
		WebElement we4=driver.findElement(By.xpath("//div[@class='wh-rating-choices-holder']/a[2]"));
		WebElement we3=driver.findElement(By.xpath("//div[@class='wh-rating-choices-holder']/a[3]"));
		WebElement we2=driver.findElement(By.xpath("//div[@class='wh-rating-choices-holder']/a[4]"));
		WebElement we1=driver.findElement(By.xpath("//div[@class='wh-rating-choices-holder']/a[5]"));
		Actions act= new Actions(driver);
		act.perform();
		Action mo_we0=act.moveToElement(we0).build();
		mo_we0.perform();
		Thread.sleep(1000);
		Action mo_we5=act.moveToElement(we5).build();
		mo_we5.perform();
		Thread.sleep(1000);
		Action mo_we4=act.moveToElement(we4).build();
		mo_we4.perform();
		Thread.sleep(1000);				
		Action mo_we3=act.moveToElement(we3).build();
		mo_we3.perform();
		Thread.sleep(1000);				
		Action mo_we2=act.moveToElement(we2).build();
		mo_we2.perform();
		Thread.sleep(2000);				
		Action mo_we1=act.moveToElement(we1).click(we1).build();
		mo_we1.perform();
		Thread.sleep(2000);						
		driver.findElement(By.xpath("//i[@class='bf-icon-down-open']")).click();
		driver.findElement(By.xpath("//a[@data-target = 'Health']")).click();	
		driver.findElement(By.xpath("//textarea[@id='review-content']")).sendKeys("Software Test Engineer having total 3 years of experience in Manual as well as Automation Testing. with a solid understanding of Test Planning, Test Design, Test Execution and Defect Reporting. Good Knowledge in Software Development Life Cycle, Software Testing Life Cycle and Bug life Cycle, Test Planning, Black Box Testing.Very Good Knowledge of Core Java and Hands on Experience in using Selenium with Java, Cross Browser Testing using Sauce Labs, creating Framework for automation and creating Test Scripts.Hands on Experience in Functional testing, Regression testing, Integration testing, Database testing, User Interface & System testing	Project Experience on TestNG Listeners, TestNG, GitHub, Page Object Model, Selenium GridGood Knowledge on testing project activities including requirements gathering, planning, designing and creating test data, reporting observations.Proficient in mapping client’s requirements into designing test scenarios and translate them to Test Cases.Proficient in developing, maintaining and executing test cases for different Black Box Testing methodologies ");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='review-content']")).sendKeys("Software Test Engineer having total 3 years of experience in Manual as well as Automation Testing. with a solid understanding of Test Planning, Test Design, Test Execution and Defect Reporting. Good Knowledge in Software Development Life Cycle, Software Testing Life Cycle and Bug life Cycle, Test Planning, Black Box Testing.Very Good Knowledge of Core Java and Hands on Experience in using Selenium with Java, Cross Browser Testing using Sauce Labs, creating Framework for automation and creating Test Scripts.Hands on Experience in Functional testing, Regression testing, Integration testing, Database testing, User Interface & System testing	Project Experience on TestNG Listeners, TestNG, GitHub, Page Object Model, Selenium GridGood Knowledge on testing project activities including requirements gathering, planning, designing and creating test data, reporting observations.Proficient in mapping client’s requirements into designing test scenarios and translate them to Test Cases.Proficient in developing, maintaining and executing test cases for different Black Box Testing methodologies ");
		WebElement wd6 = driver.findElement(By.xpath("//a[@class='bf-icon-star-empty star bstar'][5]"));
		Thread.sleep(2000);
		Action mo_wd6=act.moveToElement(wd6).click(wd6).build();
		mo_wd6.perform();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//textarea[@id='review-content']")).sendKeys("Software Test Engineer having total 3 years of experience in Manual as well as Automation Testing. with a solid understanding of Test Planning, Test Design, Test Execution and Defect Reporting. Good Knowledge in Software Development Life Cycle, Software Testing Life Cycle and Bug life Cycle, Test Planning, Black Box Testing.Very Good Knowledge of Core Java and Hands on Experience in using Selenium with Java, Cross Browser Testing using Sauce Labs, creating Framework for automation and creating Test Scripts.Hands on Experience in Functional testing, Regression testing, Integration testing, Database testing, User Interface & System testing	Project Experience on TestNG Listeners, TestNG, GitHub, Page Object Model, Selenium GridGood Knowledge on testing project activities including requirements gathering, planning, designing and creating test data, reporting observations.Proficient in mapping client’s requirements into designing test scenarios and translate them to Test Cases.Proficient in developing, maintaining and executing test cases for different Black Box Testing methodologies ");
		WebElement wd7 = driver.findElement(By.xpath("//a[@class='bf-icon-star-empty star bstar'][5]"));
		Thread.sleep(2000);
		Action mo_wd7=act.moveToElement(wd7).click(wd7).build();
		mo_wd7.perform();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
