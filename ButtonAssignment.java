package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		Point Position = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		int x = Position.getX();
		int y = Position.getY();
		System.out.println("Position of the button is" + x + y);
		String ButtonColor = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println("Color of the button is" + ButtonColor);
		Dimension Buttonsize = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println("Size of the button is" + Buttonsize);
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	}

}
