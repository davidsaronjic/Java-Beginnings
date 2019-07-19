package paketTestMajce;

import java.awt.event.InputEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MajcaMetode {


	public static void otvoriStranu(WebDriver dr) {
		dr.get("https://shop.demoqa.com/");				
	}
	
	public static void scrollStranu(WebDriver dr) {
		JavascriptExecutor jc = (JavascriptExecutor) dr;
		WebElement view1 = dr.findElement(By.xpath("//div[@class='noo_simple_banner right']//img[@class='attachment-full size-full']"));
		jc.executeScript("arguments[0].scrollIntoView(true);", view1);
	}
	
	public static void nadjiMajcu(WebDriver dr) {
		List<WebElement> majce = dr.findElements(By.className("noo-product-item"));
		for(WebElement wb : majce) {
			try{
				wb.findElement(By.xpath("//a[contains(text(),'pink drop shoulder oversized t shirt')]"));
				wb.click();
			return;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void scrollStranu2(WebDriver dr) {
		JavascriptExecutor jct = (JavascriptExecutor) dr;
		
	    WebElement view1 = dr.findElement(By.xpath("//h1[contains(@class,'product_title entry-title')]"));
		jct.executeScript("arguments[0].scrollIntoView(true);", view1);
	}
	
	public static void bojaMajce(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath("//select[@id='pa_color']"));	//select[@id='pa_color']
		wb.click();
		WebElement wb1 = dr.findElement(By.xpath("//option[contains(text(),'Pink')]"));
		wb1.click();
	}
	
	public static void velMajce(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath("//select[@id='pa_size']"));
		wb.click();
		WebElement wb1 = dr.findElement(By.xpath("//option[contains(text(),'37')]"));
		wb1.click();
	}
	
	public static void kolMajce(WebDriver dr) {
		WebElement wb = dr.findElement(By.name("quantity"));
		wb.click();
		wb.clear();
		wb.sendKeys("3");
	}
	
	public static void dodajuKorpu(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath("//button[contains(@class,'single_add_to_cart_button button alt')]"));
		wb.click();
	}
	
	
}
