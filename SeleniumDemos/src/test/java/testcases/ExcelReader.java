package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String[][] testdata() throws IOException{
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
		
		String[][] data=new String[rowcount][colcount];
		DataFormatter df=new DataFormatter();
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return data;
	}
	
//	public static void main(String[] args) {
//		//print test data in matrix format
//		try {
//			String[][] data=testdata();
//			for (int i = 0; i < data.length; i++) {
//				for (int j = 0; j < data[i].length; j++) {
//					System.out.print(data[i][j]+" ");
//				}
//				System.out.println();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
