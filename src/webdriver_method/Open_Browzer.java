package webdriver_method;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Browzer {

	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		List<String> list=new ArrayList<>();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement eleCalender= driver.findElement(By.id("datepicker"));
		eleCalender.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"ui-datepicker-title\"]")));
		String getTitle1 = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
		System.out.println(getTitle1);
		//String r;
		String[] yearMont=getTitle1.split(" ");
		System.out.println(yearMont);
		
		
		//While(!())
		
	}

}
