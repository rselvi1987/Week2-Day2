package week2.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select FirstOption = new Select(Dropdown1);
		FirstOption.selectByIndex(1);
		WebElement Dropdown2 = driver.findElement(By.name("dropdown2"));
		Select SecondOption = new Select(Dropdown2);
		SecondOption.selectByVisibleText("Appium");
		WebElement Dropdown3 = driver.findElement(By.id("dropdown3"));
		Select ThirdOption = new Select(Dropdown3);
		ThirdOption.selectByValue("3");
		WebElement Dropdown4 = driver.findElement(By.className("dropdown"));
		Select Fourthoption = new Select(Dropdown4);
		List<WebElement> options = Fourthoption.getOptions();
		int value1 =options.size();
		System.out.println(value1);
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
		WebElement Lastoption = driver.findElement(By.xpath("(//div[@class='example']/select)[6]"));
		Select Lastdropdown = new Select(Lastoption);
		Lastdropdown.selectByIndex(1);
		Lastdropdown.selectByIndex(2);
		Lastdropdown.selectByIndex(3);
	}

}
