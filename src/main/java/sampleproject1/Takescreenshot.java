package sampleproject1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     Takescreenshot tk = (Takescreenshot) driver;
 //  File srcfile = tk.getScreenshotAs(OutputType.FILE);
     
  //   Files.copy(srcfile, new File("./sampleproject/src/main/java/screenshot/loginpage.png"));
     
     
     
	}

	
	}


		
	
	





