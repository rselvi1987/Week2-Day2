package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("UserFirstName")).sendKeys("Tamilselvi");
		driver.findElement(By.name("UserLastName")).sendKeys("Raghupathy");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@test.com");
		WebElement JobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select Title = new Select(JobTitle);
		Title.selectByValue("Customer_Service_Manager_AP");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("XYZ LTD");
		WebElement Employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select Dropdown2= new Select(Employees);
		Dropdown2.selectByIndex(4);
		driver.findElement(By.name("UserPhone")).sendKeys("898888899");
		WebElement Country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select Dropdown3 = new Select (Country);
		Dropdown3.selectByVisibleText("Canada");
		WebElement State = driver.findElement(By.xpath("//select[@name='CompanyState']"));
		Select Dropdown4= new Select(State);
		Dropdown4.selectByVisibleText("Alberta");		
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
