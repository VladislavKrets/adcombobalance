package online.omnia.balance;


import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lollipop on 09.08.2017.
 */
public class Utils {
    private static FileWriter postbackURLWriter;

    static {
        try {
            File file = new File("error_urls.log");
            if (!file.exists()) file.createNewFile();

            postbackURLWriter = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static synchronized void write(String url){
        try {
            postbackURLWriter.write(url + "\n");
            postbackURLWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static synchronized Map<String, String> iniFileReader() {
        Map<String, String> properties = new HashMap<>();
        try (BufferedReader iniFileReader = new BufferedReader(new FileReader("sources_stat.ini"))) {
            String property;
            String[] propertyArray;
            while ((property = iniFileReader.readLine()) != null) {
                propertyArray = property.split("=");
                if (property.contains("=")) {
                    properties.put(propertyArray[0], propertyArray[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


}
