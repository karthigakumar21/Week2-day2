package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("karthika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kamal");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthigakumar21@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("karthiga123");
		WebElement dayval = driver.findElement(By.id("day"));
		Select day = new Select(dayval);
		List<WebElement> options = day.getOptions();
		for (int i = 0; i < options.size(); i++) {
			options.get(1).click();
		}	
		   WebElement findElementmonth = driver.findElement(By.id("month"));
		   Select month = new Select(findElementmonth);
		   month.selectByIndex(0);
		   
		   WebElement findElementyear = driver.findElement(By.xpath("//*[@id='year']"));
		   Select year = new Select(findElementyear);
		   year.selectByVisibleText("1991");
		   
		   driver.findElement(By.xpath("//label[text()='Female']")).click();
		   driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		   
		}

}
