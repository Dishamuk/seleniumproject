package Day00;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class program02 {
	public static void main(String[]args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://online.inlinguabangalore.com/web/login");
		System.out.println(driver.getTitle());
		
	}
	

}
