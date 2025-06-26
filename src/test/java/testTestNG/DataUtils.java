package testTestNG;

import java.io.IOException;
import org.testng.annotations.DataProvider;

import excelData.getExcelData;


public class DataUtils {
    @DataProvider(name = "hrmLoginData",indices = {1,2})
    public String[][] loginData() throws IOException {
        return getExcelData.ReadExcel();
    }
}
