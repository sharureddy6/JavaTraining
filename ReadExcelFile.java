package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("sampleTest.xlsx")) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0); // Assuming only one sheet

            // Iterate over rows
            for (Row row : sheet) {
                // Iterate over cells
                for (Cell cell : row) {
                    // Print cell value
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); // New line for new row
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
