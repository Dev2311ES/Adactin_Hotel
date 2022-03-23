package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Excel {
	// 1.Particular Cell Data Driven
	public static void particluar_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\TestCases\\DataReadWritePractice.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(4);
		Cell c = r.getCell(2);

		CellType cellType = c.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int Numericvalue = (int) numericCellValue;
			System.out.println(Numericvalue);
		}
		wb.close();
	}

	// All Data Driven
	public static void all_Data_Retrieve() throws IOException {
		File f = new File("C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\TestCases\\DataReadWritePractice.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) 
		{
			Row r = s.getRow(i);
			
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) 
			{
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				if (type.equals(CellType.STRING)) 
				{

					String cellValue = c.getStringCellValue();
					System.out.println(cellValue);

				}
				else if (type.equals(CellType.NUMERIC)) 
				{
					double numericCellValue = c.getNumericCellValue();
					int v = (int) numericCellValue;
					String st = Integer.toString(v);
					System.out.println(st);
					
				}

			}
		}
		wb.close();
	}
	//3.Particular Row Data Retrieve
		public static void particular_Row_Data() throws IOException {
			File f = new File("C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\TestCases\\DataReadWritePractice.xlsx");
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis); 
			Sheet s = wb.getSheetAt(0);
			Row r = s.getRow(3);
			for(int i = 0; i<r.getPhysicalNumberOfCells(); i++) {
									
					Cell c = r.getCell(i);
					CellType type = c.getCellType();
					
					if (type.equals(CellType.STRING)) 
					{

						String cellValue = c.getStringCellValue();
						System.out.println(cellValue);

					}
					else if (type.equals(CellType.NUMERIC)) 
					{
						double numericCellValue = c.getNumericCellValue();
						int v = (int) numericCellValue;
						String st = Integer.toString(v);
						System.out.println(st);
						
					}

				}
			wb.close();
			}
	
	
	//4.Particular Column Data Retrieve
	public static void particular_Column_Data() throws IOException {
		File f = new File("C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\TestCases\\DataReadWritePractice.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis); 
		Sheet s = wb.getSheetAt(0);
		
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) 
		{
			
			Row r = s.getRow(i);
				Cell c = r.getCell(2);
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) 
				{

					String cellValue = c.getStringCellValue();
					System.out.println(cellValue);

				}
				else if (type.equals(CellType.NUMERIC)) 
				{
					double numericCellValue = c.getNumericCellValue();
					int v = (int) numericCellValue;
					String st = Integer.toString(v);
					System.out.println(st);
					
				}

			}
		wb.close();
		}

	public static void main(String[] args) throws IOException {
		System.out.println("Particluar Data Retrieve Form The Cell:");
		particluar_Cell_Data();
		System.out.println("-----------------------------");
		System.out.println("All Data Retrieve :");
		all_Data_Retrieve();
		System.out.println("-----------------------------");
		System.out.println("Particular Row Datas Retrieve :");
		particular_Row_Data();
		System.out.println("-----------------------------");
		System.out.println("Particular Column Datas Retrieve :");
		particular_Column_Data();
	}

}
