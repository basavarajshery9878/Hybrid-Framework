package Generic;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Data 
{
public static String get_data(String sh, int r, int c)
{
	String value= " ";
	try
	{
		FileInputStream fis = new FileInputStream("./Excel/Test_Script.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sh);
		Row row = sheet.getrow(r);
		Cell cell =  row.getCell(c);
		value = cell.toString();
	}
	catch(Exception c)
	{
		System.out.Println(e);
	}
	return value;
}
		
		
		
		
	
}
