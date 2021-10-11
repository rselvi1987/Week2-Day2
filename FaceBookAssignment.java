package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver App = new ChromeDriver();
		App.get("https://en-gb.facebook.com/");
		App.manage().window().maximize();
		App.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		App.findElement(By.linkText("Create New Account")).click();
		App.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tamilselvi");
		App.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raghupathy");
		App.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9789996577");
		App.findElement(By.id("password_step_input")).sendKeys("test@2018");
		WebElement Birthday = App.findElement(By.name("birthday_day"));
		Select Day = new Select(Birthday);
		Day.selectByVisibleText("21");
		WebElement BirthMonth = App.findElement(By.name("birthday_month"));
		Select Month = new Select(BirthMonth);
		Month.selectByIndex(11);
		WebElement BirthYear = App.findElement(By.xpath("//select[@title='Year']"));
		Select Year = new Select(BirthYear);
		Year.selectByValue("1987");
		App.findElement(By.xpath("//input[@value='1']")).click();
		
	}

}
