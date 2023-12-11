package sampleproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Actionclass {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		   
		WebElement	dragelement = driver.findElement(By.id("draggable"));
		WebElement dropelement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(dragelement, dropelement).build().perform();
		
//action.click(dragelement).moveToElement(dropelement).release(dragelement).build().perform();
		

	}

}
