//Read Data from Excel
package excel;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws Exception{
	String fileloction="./excel-data/login-data.xlsx";
	XSSFWorkbook wbook=new XSSFWorkbook(fileloction);
	XSSFSheet sheet= wbook.getSheetAt(0);
	 int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	 System.out.println("physicalNumberOfRows"+physicalNumberOfRows);
	int rowNum = sheet.getLastRowNum();
	System.out.println("no of rows"+rowNum);
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	System.out.println("lastcellno"+lastCellNum);
	for (int i =1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j =0; j <lastCellNum; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter df=new DataFormatter();
			 String cellvalue=df.formatCellValue(cell);
			System.out.println(cellvalue);
		} 
	}
	
          wbook.close();                                                                                                                                                                                                                                                                                  	
          
}}


