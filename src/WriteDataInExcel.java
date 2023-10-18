import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataInExcel {

	@Test
	public static void exceltrial() throws InterruptedException {
		// TODO Auto-generated method stub
//		Random random = new Random(); 
//		int a = ThreadLocalRandom.current().nextInt(); 
//		String workbookPath="Trial_"+a;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Practice'][1]")).click();
		Thread.sleep(20000);
		
		ArrayList<String> ab= new ArrayList<>();
		ab.add("In");
		ab.add("ar");
		
		for (int i=0;i<ab.size();i++) {
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(ab.get(i));
		Thread.sleep(2000);
		List<WebElement> autoSuggestion=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for (int j=0;j<autoSuggestion.size();j++) {
			String options=autoSuggestion.get(j).getText();
			System.out.println(options);
		}
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		}
	}

}
