package org.ddemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Simple {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\vigne\\eclipse-workspace\\Letcode\\src\\test\\resources\\Testdata\\Untitled spreadsheet.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sh=wb.createSheet("Mydetailssssssssssssssssss");
		Object data[][]= {{"Name","Password","Mobile No"},{"Vigesh","vicky@1",1234567890l},{"karthi","Karthi@12",5431276887l},{"Dinesh","Din@123",56789012345l},{"Vijay","Vij@12",1234543215l},{"John","john@1",876554325l},{"Peter","pete@123",8907654320l},{"Krishna","krish@132",5432167892l}};
		
		for(int i=0;i<data.length;i++) {
			Row row=sh.createRow(i);
			for (int j = 0; j < data[i].length; j++) {
				Cell cell=row.createCell(j);
				Object value= data[i][j];
				if (value instanceof String) {
					cell.setCellValue((String) value);
				} else if(value instanceof Long) {
                    cell.setCellValue((Long) value);
				}
				
			}
		}
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
	
		Sheet sh1=wb.getSheet("Mydetailsssssssssssssssss");
		int rowsize=sh1.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row=sh1.getRow(i);
			int cellsize=row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell=row.getCell(j);
				CellType celltype=cell.getCellType();
				switch (celltype) {
				case STRING:
					String scv=cell.getStringCellValue();
					System.out.print(scv + " ");
					break;
				case NUMERIC:
					double d=cell.getNumericCellValue();
					long l=(long)d;
					System.out.print(l + " ");
				    break;
				}
				
			}
			 System.out.println();	
		}
		System.out.println("Finish");
}
	}
