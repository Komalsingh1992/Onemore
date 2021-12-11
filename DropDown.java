package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		Select sc=new Select(driver.findElement(By.id("day")));
		sc.selectByVisibleText("1");
		System.out.println(sc.isMultiple());
		boolean status = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		
		if(status){
			System.out.println("Checkbox is checked");
		} else {
			System.out.println("Checkbox is unchecked");
		}
		
	}

}
