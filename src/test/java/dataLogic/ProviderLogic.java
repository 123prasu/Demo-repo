package dataLogic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ProviderLogic {

	static Workbook book;
	static Sheet sheet;

	public static String test_data_sheet_path = "C:\\Users\\pdesire\\workspace\\testing123\\src\\test\\java\\dataLogic\\registration.xlsx";

	
	public String[][] getTestData(String sheetName){

		FileInputStream file = null;

		try{

			file = new FileInputStream(test_data_sheet_path);

		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e){
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for(int i =0; i<sheet.getLastRowNum(); i++){
			for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++){
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}

		}

		System.out.println(Arrays.toString(data));

		return data;


	}

}
