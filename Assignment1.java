package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement submitbtn=driver.findElement(By.className("btn-primary"));
		username.sendKeys("kumar.testleaf@gmail.com");
		password.sendKeys("leaf@12");
		submitbtn.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title of the Page : "+ title);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
