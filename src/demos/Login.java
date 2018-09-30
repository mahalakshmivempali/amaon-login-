package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jar files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys ("mailrajeshkarnam@gmail.com") ;
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();
		
		Login login = new Login();
		login.test();
	}

	void test() {
		System.out.println("test");
	}
}
