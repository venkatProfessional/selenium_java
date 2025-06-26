package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class getExcelData {
    public static String[][] ReadExcel() throws IOException {
        String path = "./testdata/login.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum(); // Excludes header (0-based)
        int colCount = sheet.getRow(0).getLastCellNum(); // Number of columns from header

        String[][] data = new String[rowCount][colCount];
        DataFormatter formatter = new DataFormatter();

        for (int i = 1; i <= rowCount; i++) { // Start from 1 to skip header
            XSSFRow row = sheet.getRow(i);
            if (row == null) continue; // Skip if row is missing

            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);
//            	If the cell is null, assign an empty string "" to avoid a NullPointerException
                data[i - 1][j] = (cell == null) ? "" : formatter.formatCellValue(cell);
//                is used to convert any Excel cell value into a String, regardless of its type (e.g., number, date, formula, boolean, etc.).
            }
        }

        workbook.close();
        fis.close();
        return data;
    }
}
