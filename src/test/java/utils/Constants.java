package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Constants {
    public static final String CONFIG_FILE_PATH= System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    public  static final int EXPLICIT_WAIT=20;
    public static final int IMPLICIT_WAIT=10;
    public static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"/src/test/resources\\features\\testdata\\batch18excel.xlsx";
    //\src\test\resources\features\testdata\batch18excel.xlsx
}