package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class fileOperations {
    public static String read(String filename) throws Exception {
        FileReader file = new FileReader(filename);
        int c;
        String result = "";
        while((c=file.read())!=-1){
            result = result+(char)c;
        }
        return result;
    }
}
