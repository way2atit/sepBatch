package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\Excel\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(f);	 // Read	
		Workbook ws = new XSSFWorkbook(fis);		
		Sheet sh =   ws.getSheet("Sheet1");
		sh.getLastRowNum();
		
		
		int lastrowno = sh.getLastRowNum();
		System.out.println("lastrowno " +lastrowno); // 10  ()
		
		
		int lastcellno = sh.getRow(0).getLastCellNum();
		System.out.println(" lastcellno : "+lastcellno);
		
		
		
		
		
		
		for(int i = 0 ; i <= lastrowno ; i++) // row 
		{
			for(int j =0 ; j < lastcellno ;j++) // cell
			{
				String v =sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print("  "+v);
				
				
			}
			System.out.println();
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		//---------------------- Single data
		/*Row r =sh.getRow(4);		
		Cell cell =r.getCell(0);
		
		String value = cell.getStringCellValue();
		System.out.println("value : "+value);*/
		
		
		
	}

}
