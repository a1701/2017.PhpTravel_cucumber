package com.phpTravel.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\HOME\\Desktop\\employees.xlsx";
        // open file and convert to a stream of data
		FileInputStream inStream = new FileInputStream(filePath);
		// take the stream of data and use it as Workbook
        Workbook workbook = WorkbookFactory.create(inStream);
        // get the first worksheet from the workbook
        Sheet worksheet= workbook.getSheetAt(0);
        // go to first row
        Row row = worksheet.getRow(0);
        // go to first cell       
        Cell cell = row.getCell(0);
        
        System.out.println(cell.toString());
        
        // find out how many rows in Excell sheet
        int rowsCount = worksheet.getPhysicalNumberOfRows();
                   // =  worksheet.getLastRowNum();
        
        System.out.println("Number of rows: " + rowsCount);
        
        // print all firstNames using a loop
        for (int i = 1; i < rowsCount; i++) {
        	row  = worksheet.getRow(i);
        	cell = row.getCell(0);
        	//System.out.println(i + " - " + cell);
	   //System.out.println(i + " - " + worksheet.getRow(i).getCell(0).toString());
		}
        
        //Print the JOb id of Nancy
        row  = worksheet.getRow(5);
    	cell = row.getCell(2);
         System.out.println(cell.toString());
         
         for (int i = 0; i < worksheet.getPhysicalNumberOfRows(); i++) {
			Row myRow = worksheet.getRow(i);
			if(myRow.getCell(0).toString().equals("Nancy")) {
				System.out.println("Nancy works as " + myRow.getCell(2).toString());
				break;
			}
		}
         
        workbook.close();
        inStream.close();
	}
}
