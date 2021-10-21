package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[5]/input")).click();
		WebElement Confirm = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div[1]/input"));
		boolean status = Confirm.isSelected();
		System.out.println(status);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input")).click();
	}

}
