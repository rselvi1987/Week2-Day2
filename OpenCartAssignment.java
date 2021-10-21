package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("CARTASSIGNMENT");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tamilselvi");
		driver.findElement(By.name("lastname")).sendKeys("Raghupathy");
		driver.findElement(By.id("input-email")).sendKeys("abc@gmail.com");
		WebElement country = driver.findElement(By.id("input-country"));
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText("Indonesia");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.partialLinkText("data:image/jpeg;charset=utf-8;base64,/9j/4AAQSkZJRgABAQEAYABgAAD//gA7Q1JFQVRPUjogZ2QtanBlZyB2MS4wICh1c2luZyBJSkcgSlBFRyB2NjIpLCBxdWFsaXR5ID0gODAK/9sAQwAGBAUGBQQGBgUGBwcGCAoQCgoJCQoUDg8MEBcUGBgXFBYWGh0lHxobIxwWFiAsICMmJykqKRkfLTAtKDAlKCko/9sAQwEHBwcKCAoTCgoTKBoWGigoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgo/8AAEQgAIAAgAwEiAAIRAQMRAf/EAB8AAAEFAQEBAQEBAAAAAAAAAAABAgMEBQYHCAkKC//EALUQAAIBAwMCBAMFBQQEAAABfQECAwAEEQUSITFBBhNRYQcicRQygZGhCCNCscEVUtHwJDNicoIJChYXGBkaJSYnKCkqNDU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6g4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2drh4uPk5ebn6Onq8fLz9PX29/j5+v/EAB8BAAMBAQEBAQEBAQEAAAAAAAABAgMEBQYHCAkKC//EALURAAIBAgQEAwQHBQQEAAECdwABAgMRBAUhMQYSQVEHYXETIjKBCBRCkaGxwQkjM1LwFWJy0QoWJDThJfEXGBkaJicoKSo1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoKDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uLj5OXm5+jp6vLz9PX29/j5+v/aAAwDAQACEQMRAD8A+qa82+Jfxd0TwTcnT1il1TWQATZ27BRGCMjzHOduRzjBPIOMHNdx4l1MaL4d1TVGUOLK1ludpP3tiFsfjiviODz7+W91G8k8+9lLXM8jdXZmGT+bflQB6PqPx18c3pdtO0/SdPt84BMbyuufViwHb+7XRfB/4jeMNf8AiHBpniK8t3spYJD5SWyoQ6rkcjnse9cPPK+haS9zp1tbztqUUMqBny1mAmWdQG3KxZm2nsozzuBGx+zzG9x8S43ByILKWRvoSq/zYUAfSuv6bHrOhajpkzFI722kt2YdQHUqT+tfHVrZQ+FL/VY/FMW+WzY2i2UUg3TS5DZ9o9vU99wA5yR9Q+LYviBLqEkfhW58MwabIiqJr2OY3ELfxMAuUf1Gce+aq2Hwt8ODw+mn63aLq927tPc6hcDbPNM5y771IK544B6AdetAHyNe3Ed3dSXQWZZZWLuZXDkk9TkKv8q+h/2ZfDc1rpd/4hu0KG+xBbAjkxqcs"));
		
	}

}
