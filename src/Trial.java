import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		boolean abc=driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).isDisplayed();
		System.out.println(abc);

	}

}
