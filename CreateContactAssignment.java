package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tamilselvi");
		driver.findElement(By.id("lastNameField")).sendKeys("Raghupathy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Selvi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Raghu");
		driver.findElement(By.name("departmentName")).sendKeys("ABCD");
		driver.findElement(By.id("createContactForm_description")).sendKeys("TESTTTTT");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@test.com");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select StateDropdown = new Select(State);
		StateDropdown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Not Applicable at this time");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String Title = driver.getTitle();
		System.out.println("Title of this page is" + Title);
	}

}
