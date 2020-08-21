package com.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.testbase.TestBase;

public class TestUtil extends TestBase {
	public static ArrayList<Map<String,String>> getDataFromExcel(String sheetName){
		ArrayList<Map<String,String>> lstData = new ArrayList<Map<String,String>>();
		XLSWorkbookReader xlsReader=null;
		try {
			xlsReader = new XLSWorkbookReader(relativePath+"/src/main/java/com/testdata/RegistrationTestData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		int rowCount = xlsReader.getRowCount(sheetName);
		Object[][] objs;
		for(int iRow = 2;iRow<=rowCount;iRow++) {
			Map<String ,String> map = new HashMap<String ,String>();
			for(int iCell=0;iCell<xlsReader.getColumnCount(sheetName);iCell++) {
				String colName = xlsReader.getCellData(sheetName, iCell, 1);
				String cellValue = xlsReader.getCellData(sheetName, iCell, iRow);
//				objs[][]=
			}
			lstData.add(map);
		}
		
		return lstData;
		
	}
}
