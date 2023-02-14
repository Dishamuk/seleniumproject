package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select dropdownall=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		dropdownall.selectByIndex(10);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("java books");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		// TODO Auto-generated method stub

	}

}
