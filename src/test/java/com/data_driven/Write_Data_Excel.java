package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_Excel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sugadev\\Desktop\\Project\\DataDriven\\DataReadWritePractice.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		/*Sheet createSheet = wb.createSheet("NewSheet");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("data");*/
		
		wb.createSheet("Write").createRow(0).createCell(0).setCellValue("india");
		wb.getSheet("Write").getRow(0).createCell(1).setCellValue("delhi");
		wb.getSheet("Write").createRow(1).createCell(0).setCellValue("TamilNadu");
		wb.getSheet("Write").getRow(1).createCell(1).setCellValue("Chennai");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		wb.close();
		System.out.println("Successfully");
		
	}

}
