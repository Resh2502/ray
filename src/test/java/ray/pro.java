package ray;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pro {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options= new EdgeOptions();
		options.addArguments("disable-notification");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		//options.addArguments("--headless");
		WebDriver driver =new EdgeDriver(options);
		driver.get("https://www.abhibus.com/operator/923/TSRTC");
        //System.out.println("Reshma");
		
	}
}
	
		


