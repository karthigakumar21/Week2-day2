package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// * 2. Enter UserName and Password Using Id Locator
		 
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		// * 3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // 4. Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 // 5. Click on contacts Button
		  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 // 6. Click on Create Contact
		  driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		 // 7. Enter FirstName Field Using id Locator
		  driver.findElement(By.id("firstNameField")).sendKeys("karthika");
		 // 8. Enter LastName Field Using id Locator
		  driver.findElement(By.id("lastNameField")).sendKeys("kamal");
		 // 9. Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("karthiga");
		 // 10. Enter LastName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("kamal");
		 // 11. Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.name("departmentName")).sendKeys("IT Dept");
		 // 12. Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.name("description")).sendKeys("Automation testing");
		 // 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("karthigakamal21@gmail.com");
		 // 14. Select State/Province as NewYork Using Visible Text
		  WebElement stateval = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		  Select state = new Select(stateval);
		  state.selectByVisibleText("Indiana");
		 
		  
		 // 15. Click on Create Contact
		  driver.findElement(By.name("submitButton")).click();
		 // 16. Click on edit button 
		  driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 // 17. Clear the Description Field using .clear
		  driver.findElement(By.name("description")).clear();
		 // 18. Fill ImportantNote Field with Any text
		  driver.findElement(By.name("importantNote")).sendKeys("AUTOMATION TESTING");
		 // 19. Click on update button using Xpath locator
		  driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		 // 20. Get the Title of Resulting Page.
		  String title = driver.getTitle();
		  System.out.println("the title is :" +title);
		  
		  driver.close();
		  
	}

}
