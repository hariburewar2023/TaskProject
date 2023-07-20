package Actions_method;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Varion_Actions_Method {

	public static void main(String[] args) {
		ChromeOptions opt =new ChromeOptions();
		List<String> list=new ArrayList();
		list.add("disable-infobars");
		list.add("--incognito");
		list.add("–disable-notifications");
		opt.addArguments(list);
		//list.add("");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		WebElement src = driver.findElement(By.xpath("//input[@id=\"src\"]"));
		src.sendKeys("p");
		Actions act = new Actions(driver);
		act.sendKeys("u").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).release().build().perform();
		act.click();
		//act.sendKeys(src, "p").moveToElement(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	}

}
