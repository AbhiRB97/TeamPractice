package com.teampractice.genericutilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getExcelData(String sheet, int row, int cell) throws Throwable {
		FileInputStream fis = new  FileInputStream(IConstants.excelPath1);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row ro = sh.getRow(row);
		return ro.getCell(cell).getStringCellValue();
	}

}