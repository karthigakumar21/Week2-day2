package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.name("firstName")).sendKeys("karthiga");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement firstleadval = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		firstleadval.click();
		String title = driver.getTitle();
		System.out.println("title is :" +title);
		
		String viewcompanyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(viewcompanyname);
		
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement companyname = driver.findElement(By.id("updateLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("cts");
		
		
		driver.findElement(By.name("submitButton")).click();
		String updatedcmpyname =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("the update company name:" +updatedcmpyname);
		
		if(viewcompanyname.equals(updatedcmpyname))
		{
			System.out.println("both are equal");
		}
		else {
			System.out.println("newly updated");
		}
		driver.close();
		}
	}


