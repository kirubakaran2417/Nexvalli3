package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("D:\\Workspaces\\Nexvali3\\SeleniumDemos\\testdata\\testdata.xlsx"));
		//For handling excel Files we have to use XSSF workbook 
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String sh=sheet.getSheetName();
		System.out.println(sh);
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows: "+rowcount);
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no of columns: "+colcount);
		//DIRECT WAY
		for (int i = 0; i < rowcount; i++) {
			XSSFCell cell=sheet.getRow(i).getCell(0);
		switch(cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			
		}
		}
		
		//using data formatter
		DataFormatter df=new DataFormatter();
		for (int i = 0; i < rowcount; i++) {
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(0)));
		}
	}
}
