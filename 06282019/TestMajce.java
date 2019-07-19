package paketTestMajce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMajce {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milan\\eclipse-workspace\\ZaebanProjekat\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		
		try {
			
			MajcaMetode.otvoriStranu(driver);

			MajcaMetode.scrollStranu(driver);

			MajcaMetode.nadjiMajcu(driver);

			MajcaMetode.scrollStranu2(driver);
			Thread.sleep(3000);
			MajcaMetode.bojaMajce(driver);

			MajcaMetode.velMajce(driver);

			MajcaMetode.kolMajce(driver);
		
			MajcaMetode.dodajuKorpu(driver);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
