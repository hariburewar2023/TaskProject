package Actions_method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().deleteAllCookies();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("p");
	List<WebElement> lists = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]/li"));
	
	for(WebElement li:lists) {
		String actcity="Pondicherry";
		String expcity=li.getText();
		if(actcity.equals(expcity)) {
			System.out.println(expcity);
			break;
		}
		
	}
	
}
	

}
