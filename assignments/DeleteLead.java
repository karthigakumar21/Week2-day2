package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//	1	Launch the browser
		 ChromeDriver driver = new ChromeDriver();
			
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//	2	Enter the username
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		//	3	Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		//	4	Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		//	5	Click crm/sfa link
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		//	6	Click Leads link
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//	7	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		//	8	Click on Phone
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		 //	9	Enter phone number
		// driver.findElement(By.name("phoneCountryCode")).clear();
		// driver.findElement(By.name("phoneCountryCode")).sendKeys("9");
		// driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		//	10	Click find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//	11	Capture lead ID of First Resulting lead
		 WebElement lead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		 String firstlead = lead.getText();
		 System.out.println(firstlead);
		 //	12	Click First Resulting lead
		 
		 lead.click();
		
		 //	13	Click Delete
		 WebElement delLead = driver.findElement(By.xpath("//a[text()='Delete']"));
		 String a = delLead.getText();
		 System.out.println("the delete lead is :" +a);
		 delLead.click();
		 //	14	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		//	15	Enter captured lead ID
		 
		 driver.findElement(By.name("id")).sendKeys(firstlead);
		//	16	Click find leads button
		WebElement findLead= driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLead.click();
		String val =driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(val.contentEquals(a)) {
			System.out.println("the record is deleted successfully");
		}
		else {
//			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			System.out.println("no record to display in the lead list ");
		}
		
		//	18	Close the browser (Do not log out)
		driver.close();
	}

}
