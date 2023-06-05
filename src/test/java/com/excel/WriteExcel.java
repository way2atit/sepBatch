package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\Excel\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(f);	 // Read	
		Workbook ws = new XSSFWorkbook(fis);
		Sheet sh = ws.getSheet("Sheet3");
		
		sh.createRow(0).createCell(0).setCellValue("Pune");
		sh.getRow(0).createCell(1).setCellValue("A");
		
		sh.createRow(1).createCell(0).setCellValue("Pune");
		sh.getRow(1).createCell(1).setCellValue("A");
		
		sh.createRow(2).createCell(0).setCellValue("Mumbai");
		sh.getRow(2).createCell(1).setCellValue("B");
		
		FileOutputStream fs = new FileOutputStream(f);
		ws.write(fs);
		
		
	}

}
