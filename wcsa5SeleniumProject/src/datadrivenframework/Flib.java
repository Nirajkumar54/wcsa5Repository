package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
			//to generic reusable methods
			//all methods are non static
public String readExcelData(String excelpath,String sheetname, int rowcount,int cellcount) throws EncryptedDocumentException, IOException
{
	FileInputStream  fis = new java.io.FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowcount);
	Cell cell= row.getCell(cellcount);
	String data = cell.getStringCellValue();
	return data;
	
	
}
}
