package DataDrivenConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public void createsheet() throws IOException {
		File f = new File("C:\\Users\\SAMSUNG\\eclipse-workspace\\AllconceptsProject\\DataDriven.xlsx");
		System.out.println("----------NEWEXCEL SHEET CREATED------------");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet st = wb.createSheet("Emplydetails");
		wb.getSheet("EmplyDetails").createRow(0).createCell(0).setCellValue("S.NO");
		st.getRow(0).createCell(1).setCellValue("NAME");
		st.getRow(0).createCell(2).setCellValue("JOINING DATE");
		st.getRow(0).createCell(3).setCellValue("SALARY");

		wb.getSheet("EmplyDetails").createRow(1).createCell(0).setCellValue("1");
		wb.getSheet("EmplyDetails").getRow(1).createCell(1).setCellValue("SARA");
		wb.getSheet("EmplyDetails").getRow(1).createCell(2).setCellValue("15/05/2022");
		wb.getSheet("EmplyDetails").getRow(1).createCell(3).setCellValue("23000");

		wb.getSheet("EmplyDetails").createRow(2).createCell(0).setCellValue("2");
		wb.getSheet("EmplyDetails").getRow(2).createCell(1).setCellValue("NILA");
		wb.getSheet("EmplyDetails").getRow(2).createCell(2).setCellValue("09/10/2021");
		wb.getSheet("EmplyDetails").getRow(2).createCell(3).setCellValue("27000");

		wb.getSheet("EmplyDetails").createRow(3).createCell(0).setCellValue("3");
		wb.getSheet("EmplyDetails").getRow(3).createCell(1).setCellValue("ARUN");
		wb.getSheet("EmplyDetails").getRow(3).createCell(2).setCellValue("07/01/2022");
		wb.getSheet("EmplyDetails").getRow(3).createCell(3).setCellValue("19000");

		wb.getSheet("EmplyDetails").createRow(4).createCell(0).setCellValue("4");
		wb.getSheet("EmplyDetails").getRow(4).createCell(1).setCellValue("NITHUN");
		wb.getSheet("EmplyDetails").getRow(4).createCell(2).setCellValue("04/04/2022");
		wb.getSheet("EmplyDetails").getRow(4).createCell(3).setCellValue("24000");

		wb.getSheet("EmplyDetails").createRow(5).createCell(0).setCellValue("5");
		wb.getSheet("EmplyDetails").getRow(5).createCell(1).setCellValue("MRITHULA");
		wb.getSheet("EmplyDetails").getRow(5).createCell(2).setCellValue("21/11/2021");
		wb.getSheet("EmplyDetails").getRow(5).createCell(3).setCellValue("28000");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}
	public static void main(String[] args) throws IOException {
		Writedata w= new Writedata();
		w.createsheet();
	}

}
