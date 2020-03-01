package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File src = new File("D:\\Excel.xlsx");
FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);


int count = sheet1.getLastRowNum();
for(int i=0;i<=count;i++) {
	String shdata = sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println(shdata);
}

	}

}
