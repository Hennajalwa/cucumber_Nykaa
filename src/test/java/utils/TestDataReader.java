package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class TestDataReader {
    private static HashMap<String, HashMap<String, String>> data;
    private static XSSFWorkbook workbook = null;
    public static void main(String[] args) {
        init();
    }
    private static void init() {
        if (workbook == null) {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream("src/test/resources/Nykaa.xlsx");
            } catch (FileNotFoundException e)
            {
                throw new RuntimeException(e);
            }
            try {
                workbook = new XSSFWorkbook(fileInputStream);
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            data = new HashMap<>();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

             Row row = sheet.getRow(i);
             if(row != null && row.getCell(0 )!= null) {
             System.out.println(i);
             String key = row.getCell(0).getStringCellValue();
             HashMap<String, String> rowData = new HashMap();
             for (int j = 1; j < row.getLastCellNum(); j++)
             {
                 //itterative through all column
             String columnName = sheet.getRow(0).getCell(j).getStringCellValue();
             if(row.getCell(j)!=null)
             rowData.put(columnName, row.getCell(j).getStringCellValue());
             }
             data.put(key, rowData);                }            }

             }
    }
    public static HashMap<String, String> getData (String key){
             init();
             return data.get(key);
             }
}

