package autoFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MojTestStranice {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milan\\eclipse-workspace\\ZaebanProjekat\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ebay.fr/");
		
		
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		WebElement wb = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		wb.click();
		Thread.sleep(2000);
		WebElement category = driver.findElement(By.xpath("//option[contains(text(),'Art, antiquités')]"));
		category.click();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		button.click();
		Thread.sleep(2000);
		WebElement XIX = driver.findElement(By.xpath("//span[contains(text(),'Art du XIXe siècle et avant')]"));
		XIX.click();
		Thread.sleep(2000);
		WebElement peintures = driver.findElement(By.xpath("//a[contains(text(),'Peintures et émaux du XIXe siècle et avant')]"));
		peintures.click();
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.xpath("//span[@class='cbx x-refine__multi-select-cbx'][contains(text(),'Huile')]"));
		type.click();
		Thread.sleep(2000);
		WebElement theme = driver.findElement(By.xpath("//span[@class='cbx x-refine__multi-select-cbx'][contains(text(),'Paysage')]"));
		theme.click();
		Thread.sleep(2000);
		WebElement view1 = driver.findElement(By.xpath("//h3[contains(text(),'Caractéristiques')]"));
		jc.executeScript("arguments[0].scrollIntoView(true);", view1);
		Thread.sleep(2000);
		WebElement format = driver.findElement(By.xpath("//span[contains(text(),'Achat immédiat')]"));
		format.click();
		Thread.sleep(2000);
		WebElement view2 = driver.findElement(By.xpath("//h3[contains(text(),'Type')]"));
		jc.executeScript("arguments[0].scrollIntoView(true);", view2);
		Thread.sleep(2000);
		WebElement cena1 = driver.findElement(By.xpath("//input[@id='w2-w1-w0-w2-0-0[0]']"));
		cena1.click();
		cena1.sendKeys("30");
		WebElement cena2 = driver.findElement(By.xpath("//input[@id='w2-w1-w0-w2-0-1[0]']"));
		cena2.click();
		cena2.sendKeys("70");
		Thread.sleep(1000);
		WebElement point = driver.findElement(By.xpath("//div[contains(@class,'x-textrange')]//*[@class='svg-icon']"));
		point.click();
		
		
		
	}

}
