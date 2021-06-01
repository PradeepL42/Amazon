package externalfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdataexcel
        {

    public void Testdata(String username, String password) throws IOException {
        File src = new File("/Users/pradeep/Documents/Testdataamazon.xlsx");

        // load file
        FileInputStream fis = new FileInputStream(src);

        // Load workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // Load sheet- Here we are loading first sheetonly
        XSSFSheet sheet = wb.getSheet("homescreen");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //int i= sheet.getLastRowNum();
// Import data for Email.
             username = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
            password = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
        }
    }
}
