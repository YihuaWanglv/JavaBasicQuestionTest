package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileReadLineAndWriteExcelTest {
    public static void main(String[] args) {
        String fileName = "C:/Users/Administrator/Desktop/624.log";
        File file = new File(fileName);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            List<Map<String, Object>> values = new ArrayList<Map<String, Object>>();
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                String[] array = tempStr.split(",");
                Map<String, Object> record = new HashMap<String, Object>();
                record.put("用户账号", array[0]);
                record.put("登陆时间", array[1]);
                record.put("IP", array[2]);
                record.put("是否成功", array[3]);
                values.add(record);

            }

            String filepath = "C:/Users/Administrator/Desktop/用户登陆记录624.xlsx";
            String sheetName = "用户登陆记录";
            List<String> titles = Arrays.asList("用户账号", "登陆时间","IP", "是否成功");
            ExcelUtils.writeExcel(filepath, sheetName, titles, values);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
