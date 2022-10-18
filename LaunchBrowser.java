package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nanda");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopal");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("rolex");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("22/09/2001");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("B.sc (cs)");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("software testing");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopalnanda983@gmail.com");	
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.id("createLeadForm_description")).clear();
	driver.findElement(By.id("id=createLeadForm_importantNote")).sendKeys("LearnTheAutomation");	
	driver.findElement(By.className("smallSubmit")).click();
	String Driver = driver.getTitle();
	System.out.println(Driver);
	}
}
    