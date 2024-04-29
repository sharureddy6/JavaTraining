package Utilities;

import org.apache.poi.ss.usermodel.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

    public static void main(String[] args) {

        // Blank Workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create Excel Sheet
        XSSFSheet samplesheet = workbook.createSheet("sampleSheet");

        // Creating the Data
        Map<String, Object[]> dataSet = new TreeMap<String, Object[]>();
        dataSet.put("1", new Object[]{"ID", "Name", "Company"});
        dataSet.put("2", new Object[]{"10", "Jack", "Google"});
        dataSet.put("3", new Object[]{"20", "Herlin", "Amazon"});
        dataSet.put("4", new Object[]{"30", "Reacher", "Dell"});
        dataSet.put("5", new Object[]{"40", "James", "Apple"});
        dataSet.put("6", new Object[]{"50", "Katrina", "HP"});

        // Iterate over the data
        Set<String> set = dataSet.keySet();
        int rownum = 0;
        for (String key : set) {
            Row row = samplesheet.createRow(rownum++);

            Object[] data = dataSet.get(key);
            int cellNum = 0;
            for (Object value : data) {
                Cell cell = row.createCell(cellNum++);

                if (value instanceof String)
                    cell.setCellValue((String) value);
                else if (value instanceof Integer)
                    cell.setCellValue((Integer) value);
            }
        }
        // Write Down file on hardDisk
        FileOutputStream writeFile = null;
        try {
            writeFile = new FileOutputStream("sampleTest.xlsx");
            workbook.write(writeFile);
            System.out.println("Sample excel file is created successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writeFile != null) {
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}