package ray;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class sele1{
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Mapila\\eclipse-workspace\\ray\\target\\driver\\msedgedriver.exe");
		
		EdgeOptions options= new EdgeOptions();
		options.addArguments("disable-notification");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		options.addArguments("--headless");
		WebDriver driver =new EdgeDriver(options);
		driver.get("https://www.abhibus.com/operator/923/TSRTC");
        System.out.println("Reshma");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*x.navigate().to("https://letcode.in/frame");

		WebDriver wd= new EdgeDriver();
		wd.get("https://www.flipkart.com/");
		WebElement a = wd.findElement(By.name("q"));
		a.sendKeys("i phone 15pro max",Keys.ENTER);
		wd.findElement(By.xpath("//div[@class='KzDlHZ'][1]")).click();
		//wd.findElement(By.xpath("//div[@class='KzDlHZ'][2]")).click();
		//wd.findElement(By.xpath("//div[@class='KzDlHZ'][3]")).click();
		//wd.findElement(By.xpath("//div[@class='KzDlHZ'][4]")).click();
		String b = wd.getWindowHandle();
		System.out.println(b);
		Set<String> c = wd.getWindowHandles();
		System.out.println(c);
		/*for(String x:c)
		{
			if(!b.contains(x))
			{
				wd.switchTo().window(x);
				
			}
		}
		*/
		/*List<String> L1=new ArrayList<>();
		L1.addAll(c);	
		wd.quit();
		
		wd.switchTo().window(L1.get(1));
		
		/*wd.switchTo().frame("firstFr");
	WebElement e=wd.findElement(By.xpath("//iframe[@src='innerFrame']"));
	wd.switchTo().frame(e);
	WebElement f=wd.findElement(By.xpath("//input[@name='email']"));*/
	
	/*	f.sendKeys("Resh");
		wd.switchTo().parentFrame();
		wd.switchTo().defaultContent();
		
		/*WebElement a = x.findElement(By.xpath("//iframe[@src='frameUI']"));
		x.switchTo().frame(a)
		WebElement b = x.findElement(By.name("fname"));
		b.sendKeys("Resh ma");
		WebElement c= x.findElement(By.name("lname"));
		c.sendKeys("Reshma");*/
		

		
		
		
		
		
		
	

		
		
		
		
	
		
		
		
		//TakesScreenshot y = (TakesScreenshot)x;
		//File src = y.getScreenshotAs(OutputType.FILE);
		//File vv= new File("C:\\Users\\Mapila\\eclipse-workspace\\ray\\target\\driver\\msedgedriver.exe");
		//FileUtils.copyFile(src, vv);
		
		
		//WebDriverManager.edgedriver().setup();
	//	WebDriver x = new EdgeDriver();
		//x.get("https://demo.guru99.com/test/drag_drop.html");
			/*x.navigate().to("https://demo.guru99.com/test/drag_drop.html");
			x.manage().window().maximize();	
			WebElement D1=x.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			WebElement D2=x.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			Actions A=new Actions(x);
			A.dragAndDrop(D1, D2).build().perform();
			WebElement D3=x.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement D4=x.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			Actions B=new Actions(x);
			B.dragAndDrop(D3, D4).build().perform();
			WebElement D5=x.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
			WebElement D6=x.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			Actions C=new Actions(x);
			C.dragAndDrop(D5, D6).build().perform();
			WebElement D7=x.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
			WebElement D8=x.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			Actions D=new Actions(x);
			D.dragAndDrop(D7, D8).build().perform();
		///*WebElement R = x.findElement(By.xpath("//a[text()='Facebook Lite']"));
		//Actions v=new Actions(x);
		//v.dragAndDrop().click().perform();
	
		TakesScreenshot y = (TakesScreenshot)x;
		File src = y.getScreenshotAs(OutputType.FILE);
		File vv= new File("C:\\Users\\Mapila\\eclipse-workspace\\ray\\target\\driver\\msedgedriver.exe");
		FileUtils.copyFile(src, vv);
		
		/*Actions v=new Actions(x);
		WebElement y = x.findElement(By.id("email"));
	    v.sendKeys(y,"resh").perfom();
	    v.doubleClick().build().perform();
	    
	    v.contextClick(y).build().perform();*/
	   /* Robot E= new Robot();
	    E.keyPress(KeyEvent.VK_DOWN);
	    E.keyRelease(KeyEvent.VK_DOWN);
	    E.keyPress(KeyEvent.VK_DOWN);
	    E.keyRelease(KeyEvent.VK_DOWN);
	    E.keyPress(KeyEvent.VK_DOWN);
	    E.keyRelease(KeyEvent.VK_DOWN);
	   //// Thread.sleep(1500);
	    E.keyPress(KeyEvent.VK_ENTER);
	    E.keyRelease(KeyEvent.VK_ENTER);
	   // Thread.sleep(1500);
	    E.keyPress(KeyEvent.VK_TAB);
	    E.keyRelease(KeyEvent.VK_TAB);
	    //Thread.sleep(1500);
	    
	    E.keyPress(KeyEvent.VK_CONTROL);
	    E.keyPress(KeyEvent.VK_V);
	    
	    E.keyRelease(KeyEvent.VK_CONTROL);
	    E.keyRelease(KeyEvent.VK_V);*/
	    
	}

}
