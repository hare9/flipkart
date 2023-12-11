package sampleproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	   String acttitle =driver.getTitle();
	   System.out.println(acttitle);
	   String exptitle = "Fcebook";
	   if (exptitle.equals(acttitle)) {
		  System.out.println("pass");
	   }
		  else {
			  System.out.println("fail");
		  
	   }
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
		
		

	}

}
