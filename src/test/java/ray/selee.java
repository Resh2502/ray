package ray;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selee {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Mapila\\eclipse-workspace\\ray\\target\\driver\\msedgedriver.exe");
		WebDriver x = new EdgeDriver();
		/*x.navigate().to("https://www.flipkart.com/");
		x.manage().window().minimize();
		//x.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//x.findElement(By.id("mail")).sendKeys("resh");
		 WebDriverWait Wait= new WebDriverWait(x,Duration.ofSeconds(25));
		 WebElement until =Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mail")));
		 until.sendKeys("resh");*/
		 
		 
		 x.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		 WebElement table =x.findElement(By.xpath("//table[@class=\"dataTable\"]"));
				 List<WebElement> tr = table.findElements(By.tagName("tr"));
				 for(int i=0; i<tr.size(); i++) {
				 WebElement row = tr.get(i);
				 List<WebElement> td = row.findElements(By.tagName("td"));
				 for(int j=0; j<td.size(); j++)
				 {
				 WebElement d = td.get(j);
				 String tt = d.getText();
				 String t = "IDFC Bank";
				 if(tt.equals(t)) {
				 System.out.println(tr.get(i).getText());
				 }
				 }
				 }
			}
	
		
	

}

		
































		/*Thread.sleep(2000);
		List<String> l1 = new LinkedList<>();
		List<String> l2 = new LinkedList<>();
		
	
	
x.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi mobiles",Keys.ENTER);
List<WebElement> r =x.findElements(By.xpath("//div[@class='KzDlHZ']"));
//String text = x.getText();
//System.out.println(text);
	


	for(int i=1; i<r.size(); i++) {
	WebElement t = r.get(i);
	String text = t.getText();
	l1.add(text);
	}
	System.out.println(l1);
	Thread.sleep(2000);
	

List<WebElement> rr = x.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
   for(int j=1; j<rr.size(); j++) {
	   WebElement v = rr.get(j);
	   String textt = v.getText();
	   l2.add(textt);
   }
   System.out.println(l2);
   Map<String, String> map = new LinkedHashMap<>();
   for(int i=0; i<l1.size() && i<l2.size() ;i++) {
	   map.put(l1.get(i), l2.get(i));
	   }
   System.out.println(map);
	}
	
}

		
		/*List<String> l1 = new LinkedList<>();
		List<String> l2 = new LinkedList<>();
		
		x.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi mobiles",Keys.ENTER);
       List<WebElement> e1 = x.findElements(By.xpath("//div[@class='KzDlHZ']"));
	for(int i=1; i<e1.size(); i++) {
	WebElement b = e1.get(i);
	String text1 = b.getText();
	System.out.println(text1);
	l1.add(text1);
	}
     List<WebElement> e2 = x.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
   for(int j=1; j<e2.size(); j++) {
	   WebElement f = e2.get(j);
	   String text2 = f.getText();
	   System.out.println(text2);
	   Thread.sleep(2000);
	   l2.add(text2);
   }
  	
   File a = new File("C:\\Users\\Mapila\\Desktop\\book.xlsx");
	XSSFWorkbook w = new XSSFWorkbook();
	XSSFSheet s = w.createSheet("Sheet1");
	 for (int i = 0; i < l1.size(); i++) {
            Row row = s.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            Row row = s.getRow(i);
            if (row == null) {
                row = s.createRow(i);
            }
            Cell cell = row.createCell(1);
            cell.setCellValue(l2.get(i));
        }

        FileOutputStream f1 = new FileOutputStream(a);
		w.write(f1);
		f1.close();
	}
}
		//WebDriver wd= new EdgeDriver();
		//File a = new File("C:\\Users\\Mapila\\Desktop\\book.xlsx");	
		/*FileInputStream b = new FileInputStream(a);
		XSSFWorkbook xs = new XSSFWorkbook(b);
		XSSFSheet s = xs.getSheet("Sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row r = s.getRow(i);
			int cellsize = r.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = r.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					if(value.equals("Resh")) {
						cell.setCellValue("overwrite");
					}
				
				}
			}
			FileOutputStream f2 = new FileOutputStream(a);
			xs.write(f2);
			b.close();
		}
		}
	}*/

		/*XSSFWorkbook xs = new XSSFWorkbook();
		XSSFSheet s = xs.createSheet("Sheet1");
		Row r = s.createRow(0);
		for(int i=0; i<10; i++) {
			Cell c = r.createCell(i);
			c.setCellValue("Resh");
		}
		FileOutputStream b = new FileOutputStream(a);
		xs.write(b);
		b.close();
	}
}*/

		
		/*File a = new File("C:\\Users\\Mapila\\Desktop\\book.xlsx");
		FileInputStream f1 = new FileInputStream(a);
		XSSFWorkbook w = new XSSFWorkbook(f1);
		XSSFSheet s = w.getSheet("Sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = s.getRow(i);
			int cellSize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellSize; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat ss = new SimpleDateFormat("MM/dd/yyyy");
						String value = ss.format(d);
						System.out.println(value);
					}
					else {
						double d = cell.getNumericCellValue();
						long l1 = (long)d;
						String value = String.valueOf(l1);
						System.out.println(value);
					}
				}
			}
		}*/
		
		
		
		/*File a = new File("This PC\\Desktop\\book.xlsx");
		FileInputStream b = new FileInputStream(a);
		XSSFWorkbook c = new XSSFWorkbook(b);
		XSSFSheet d = c.getSheet("Sheet1");
		int rowsize = d.getPhysicalNumberOfRows();
		for(int i=0; i<rowsize;i++) {
			Row row = d.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for(int j=0; i<cellsize ;j++) {
				Cell cell =row.getCell(j);
				int celltype= cell.getCellType();
				if(celltype==1) {
					String v = celltype.g();
					System.out.println(v);
					
				}
				
			}
			
		}*/
		
		
		
		
		
		
		
		
		//String s1 = "https://www.facebook.com/login.php/";
		/*x.get("https://www.facebook.com/login.php/");
		WebElement R = x.findElement(By.xpath("//a[text()='Facebook Lite']"));
		Actions v=new Actions(x);
		v.moveToElement(R).click().perform();*/
		
		//x.get("https://www.facebook.com/login.php/");
		//x.manage().window().maximize();
		//Thread.sleep(2000);
		/*x.manage().window().minimize();
		Thread.sleep(2000);
		x.close();*/
		//x.navigate().to("https://www.facebook.com/login.php/");
		/*x.navigate().back();
		Thread.sleep(2000);
		x.navigate().forward();
		Thread.sleep(2000);
		x.navigate().refresh();*/
		/*Actions v=new Actions(x);
		WebElement y = x.findElement(By.id("email"));
	    v.sendKeys(y,"resh").perform();
	    v.doubleClick().build().perform();
	    v.contextClick(y).build().perform();
	    Robot E= new Robot();
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
	    E.keyRelease(KeyEvent.VK_V);
	    E.keyPress(KeyEvent.VK_CONTROL);
	    E.keyRelease(KeyEvent.VK_V);
	    
		/*y.sendKeys("ert@gmail.com");
		WebElement y2 = x.findElement(By.id("pass"));
		y2.sendKeys("ert@gmail.com");
		WebElement y3 = x.findElement(By.linkText("login"));
		y3.click();
		x.findElement(By.xpath("//input [contains(@placeholder,'Password')]")).click();
		
		//WebElement y3 = x.findElement(By.name("login"));
		//y3.click();
		//System.out.println(y);
		//x.getCurrentUrl();
	String S1 = x.getTitle();
	String S2 = x.getCurrentUrl();
	
	
	System.out.println(S1);
	System.out.println(S2);
	String S3 = ("https://www.facebook.com/login.php/");
	if(S2.equals(S3)) {
		System.out.println("match");
	}
	else {
		
	
		System.out.println("not match");
	}*/
	
