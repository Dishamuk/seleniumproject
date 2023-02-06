package Day00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class programe03 {
	public static void main(String[]args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("dfe");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

}
