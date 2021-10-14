package week2.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://leafground.com/pages/Edit.html");
		driver1.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver1.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Test");
		WebElement text = driver1.findElement(By.xpath("//input[@name='username']"));
		String value = text.getAttribute("value");
		System.out.println(value);
		driver1.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean lasttext = driver1.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		System.out.println("This text is" + lasttext);
		
		}

}
