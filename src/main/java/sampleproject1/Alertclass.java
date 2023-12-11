package sampleproject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement signin = driver.findElement(By.name("proceed"));
         signin.click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		String alertText = alert.getText();
		if( alertText.equals("Please enter a valid user name")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		//alert.dismiss();

	}

}
