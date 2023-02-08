package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownskill = new Select (driver.findElement(By.xpath("//select[@id='Skills']")));
		dropdownskill.selectByIndex(2);
		dropdownskill.selectByValue("Backup management");
		// TODO Auto-generated method stub

	}

}
