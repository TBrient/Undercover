package source.IO;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Matthewelbing on 11/3/15.
 */
public class Read {
    public static String read(String PATH){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            while (line != null){
                builder.append(line);
                builder.append(System.lineSeparator());
                line = reader.readLine();
            }
            return builder.toString();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
