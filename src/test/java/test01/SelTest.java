package test01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SelTest {
	
	@Test
	public void f()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.edubridgeindia.com/");
			
			String actual_tiitle=driver.getTitle();
			String expected_title="Job-Oriented Online Courses in India. Learn Anywhere, Anytime & at Anyplace";
			
			Assert.assertEquals(actual_tiitle, expected_title);
			
			driver.close();
	}

}
