package com.testmadness.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil 
{	
	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFCell cell;
	private static XSSFRow row;

	/*
	 * This method is to set the File path and to open the Excel file. Pass
	 * Excel Path and Sheet name as Arguments to this method
	 */

	public static void setExcelFile(String Path, String SheetName) throws Exception 
	{
		try 
		{
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the Excel workbook
			excelWBook = new XSSFWorkbook(ExcelFile);
		     // Access the Excel Sheet
			excelWSheet = excelWBook.getSheet(SheetName);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method is to read the test data from the Excel cell. We are passing
	 * parameters as Row number and Column number
	 */

	public static String getCellData(int RowNum, int ColNum) throws Exception 
	{
		try 
		{
              // Access a particular cell in a sheet
			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = cell.getStringCellValue();
			return CellData;
		} catch (Exception e) 
		{
			return null;
		}
	}

	/*
	 * This method is to write in the Excel cell. Passing Row number and Column
	 * number are the parameters
	 */

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception 
	{
		try 
		{
			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			if (cell == null) 
			{
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			} else 
			{
				cell.setCellValue(Result);
			}

			// Update the Test Results folder with 'PASS/FAIL results'

			FileOutputStream fileOut = new FileOutputStream(Constants.PATH_RESULTS + Constants.FILE_NAME);
			excelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}