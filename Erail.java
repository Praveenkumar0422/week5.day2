package oops;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		WebElement select = driver.findElement(By.id("chkSelectDateOnly"));
		if (select.isSelected()) {
			select.click();
		}
		WebElement source = driver.findElement(By.id("txtStationFrom"));
		source.clear();
		source.sendKeys("Mgr Chennai Ctr",Keys.TAB);
		WebElement desti = driver.findElement(By.id("txtStationTo"));
		desti.clear();
		desti.sendKeys("Coimbatore Jn" ,Keys.TAB);
		driver.findElement(By.id("buttonFromTo")).click();
		List<String>lst=new ArrayList<String>();
		List<WebElement> colum = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
		for (WebElement col : colum) {
			String text = col.getText();
			System.out.println(text);
			lst.add(text);
		}
		Collections.sort(lst);
		System.out.println(lst);
	
	}

}
