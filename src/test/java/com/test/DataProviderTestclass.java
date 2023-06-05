package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTestclass {

	public static WebDriver driver = null;

	@BeforeSuite
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@Test(dataProvider = "excel_Read")
	public void fillform(String fname, String lname, String address ) throws InterruptedException {

		Thread.sleep(2000);
		WebElement fname_txt = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fname_txt.clear();
		fname_txt.sendKeys(fname);

		//Thread.sleep(2000);
		WebElement lname_txt = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lname_txt.clear();
		lname_txt.sendKeys(lname);

		//Thread.sleep(2000);
		WebElement address_txt = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		address_txt.clear();
		address_txt.sendKeys(address);

		Thread.sleep(2000);
		WebElement submit_btn = driver.findElement(By.id("submitbtn"));
		// submit_btn.click();

	}

	@AfterSuite
	public void close_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	// Data Provider :
	// @DataProvider
	// Object[][]

	@DataProvider
	public Object[][] data() {

		Object[][] obj = new Object[3][3];

		obj[0][0] = "fName";
		obj[0][1] = "lname";
		obj[0][2] = "Address";

		obj[1][0] = "Admin";
		obj[1][1] = "Admin@123";
		obj[1][2] = "Pune";

		obj[2][0] = "payal";
		obj[2][1] = "Payal@123";
		obj[2][2] = "Pune";

		// 0 1 2 3 4
		// 0 fname lname address mb pincode
		// 1 10 11
		// 2
		// 3

		return obj;
	}

	@DataProvider
	public Object[][] excel_Read() throws IOException {
		File f = new File("E:\\Excel\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(f); // Read
		Workbook ws = new XSSFWorkbook(fis);
		Sheet sh = ws.getSheet("Sheet1");
		sh.getLastRowNum();

		int lastrowno = sh.getLastRowNum();
		System.out.println("lastrowno " + lastrowno); // 10 ()

		int lastcellno = sh.getRow(0).getLastCellNum();
		System.out.println(" lastcellno : " + lastcellno);  //3
		
		
		Object[][] obj = new Object[lastrowno+1][lastcellno];

		for (int i = 0; i <= lastrowno; i++) // row
		{
			for (int j = 0; j < lastcellno; j++) // cell
			{
				
				 obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();

			}
			
		}
		
		
		return obj;

	}

}
