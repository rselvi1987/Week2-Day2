package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		WebElement UncheckedOption = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		WebElement CheckedOption = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean Unchecked= UncheckedOption.isSelected();
		System.out.println(Unchecked);
		boolean Checked = CheckedOption.isSelected();
		System.out.println(Checked);
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input")).click();
	}

}
