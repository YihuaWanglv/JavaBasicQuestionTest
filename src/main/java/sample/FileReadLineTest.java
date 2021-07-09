package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadLineTest {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.0");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.1");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.2");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.3");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.4");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.5");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.6");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.7");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.8");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.9");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.10");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.11");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.12");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.13");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-24.14");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/app.log.2021-06-25.0");

        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.0");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.1");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.2");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.3");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.4");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.5");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.6");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.7");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.8");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.9");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.10");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.11");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.12");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.13");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-24.14");
        list.add("C:/Users/Administrator/Documents/ves/ves-gateway/logs/210624/lb/app.log.2021-06-25.0");

        for (String fileName : list) {
            File file = new File(fileName);
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String tempStr;
                while ((tempStr = reader.readLine()) != null) {
                    if (tempStr.contains("请求内容:{\"username\":\"") || tempStr.contains("请求路径:/auth/login,远程IP地址") || tempStr.contains("请求内容:{\"clientName\":\"h5\",\"username\":")) {
                        System.out.println(tempStr);
                    }
                }
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
}
