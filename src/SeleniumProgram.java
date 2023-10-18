import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\software testing course\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Select checkbox for option 3 from the checkbox list
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		String chekboxOption=driver.findElement(By.xpath("//input[@id='checkBoxOption3']/..")).getText();
		//Select the same option in dropdown
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(dropDown);
		s.selectByVisibleText(chekboxOption);
		//enter the same option text in alert text box
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(chekboxOption);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		//grab text from alert and verify the option text is present or not
		Alert alertText=driver.switchTo().alert();
		if(alertText.getText().contains(chekboxOption)) {
			System.out.println("option text is present :"+chekboxOption);
		}
//		String alertText=driver.switchTo().alert().getText();
//		String [] words=alertText.split(",")[0].split(" ");
//		List<String> textFromAlert=Arrays.asList(words);
//		if(textFromAlert.contains(chekboxOption)) {
//			System.out.println("option text is present :"+chekboxOption);
//		}
		driver.quit();
	}

}
