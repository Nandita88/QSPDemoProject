package qspAppsPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownVerificationTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dropdown3 = driver.findElement(By.id("select3"));
		Select select3 = new Select(dropdown3);
		boolean isIndiaPresent=false;
		List<WebElement> countries = select3.getOptions();
		for (WebElement country : countries) {
			if(country.getText().equals("India")) {
				isIndiaPresent=true;
				break;
			}
		}
		if(isIndiaPresent) {
			System.out.println("India is present");
		}
		else {
			System.out.println("India is not present");
		}
		
		
		
		
		

	}

}
