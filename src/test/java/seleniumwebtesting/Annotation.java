package seleniumwebtesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void launchbrowser() {
		System.out.println("launch browser");
	}
	@BeforeTest
	public void passurl() {
		System.out.println("pass url");
		
	}
	@BeforeClass
	public void dbconnection() {
		System.out.println("dbconnection");
	}
	@BeforeMethod	
	public void getusernameandpassword() {
		System.out.println("username and password");
	}
	   @Test
		public void dologin() {
			
		}
		
		
		
		
		

	

}
