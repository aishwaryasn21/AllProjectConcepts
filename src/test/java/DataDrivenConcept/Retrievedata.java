

package DataDrivenConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Retrievedata {

	public void readalldata() throws IOException {
		System.out.println("-----------All Data---------");
		File f = new File("C:\\Users\\SAMSUNG\\eclipse-workspace\\AllconceptsProject\\DataDriven.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet st = wb.getSheetAt(0);
		
//To find no.of rows in a sheet		
		int pnr = st.getPhysicalNumberOfRows();
		System.out.println("Total no.of rows: " + pnr);

//To Retrieve the data in rows		
		for (int i = 0; i < pnr; i++) {
			Row rw = st.getRow(i);
			System.out.println();

//To find number of cells in a row
			int pnc = rw.getPhysicalNumberOfCells();

//To Retrieve the data in cells		
			for (int j = 0; j < pnc; j++) {
				Cell cl = rw.getCell(j);
				CellType clType = cl.getCellType();
				if (clType.equals(clType.STRING)) {
					String stv = cl.getStringCellValue();
					System.out.print("      " + stv);
				} else if (clType.equals(clType.NUMERIC)) {
					double num = cl.getNumericCellValue();
					System.out.println("   " + num);
					System.out.println();
				}
			}
		}
// To Retrieve data from a specified row
				System.out.println("----------Particular Row--------");
				System.out.println();
				Cell rw1 = st.getRow(2).getCell(0);
				Cell cl1 = st.getRow(2).getCell(1);
				System.out.print("2nd row: "+rw1);
				System.out.println("  "+cl1);
				System.out.println();
				
// To Retrieve data from a particular cell
				System.out.println("----------Particular Cell--------");
				System.out.println();
				Cell cl2 = st.getRow(4).getCell(0);
				System.out.println(cl2);
	}
	public static void main(String[] args) throws IOException {
		Retrievedata rt=new Retrievedata();
		rt.readalldata();

	}
}