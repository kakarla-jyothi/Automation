package javapractice;

import java.time.Duration;

public class xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipseworkspace\\AutomationClassess\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("/html/body/div[1]/div[3[/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		Thread.sleep(3000);
		
		
		

	}

}
