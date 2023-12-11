package sampleproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
		List<WebElement>selectoption=select.getOptions();
	//	System.out.println(selectoption.size());
		
		for(WebElement e : selectoption ) {
			System.out.println(e.getText());
			if (e.getText().equals("APIs")) {
				e.click();
			}
		}
		
		
        select.selectByValue("APIs");
        Thread.sleep(2000);
       
        select.selectByVisibleText("C");
        Thread.sleep(2000);
        
        select.selectByIndex(5);
        
	}

}
