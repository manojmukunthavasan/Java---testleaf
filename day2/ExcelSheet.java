package week5.day2;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static String[][] readExcelData(String fileName) throws IOException {
		// 1. open  the workbook using file name and path
		XSSFWorkbook file = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//2 Entry into sheet
		XSSFSheet sheetAt = file.getSheetAt(0);
		
		//3 to get number of rows
		
		int rowNum = sheetAt.getLastRowNum();
		System.out.println("Number of rows present :"+rowNum);
		
		// 4 column-cell, to get number cell
		
		int CellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("number of cell present: "+CellNum);
		//row starts with '1'
		//need to print data
		//XSSFCell cell = sheetAt.getRow(1).getCell(3);
		//print my console
		//print data inside my console
		//String stringCellValue = cell.getStringCellValue();
		//System.out.println(stringCellValue);
		
		//1,2,3
		//0,1,2,3
		
		//print all data
		String[][] data = new  String[rowNum][CellNum];
		
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			
			for (int j = 0; j <CellNum ; j++) {
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
				
				data[i-1][j] = value;
				
			}
		}
		file.close();
		return data;
		
		

	}

}
