
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {


    public String readTextFromFile (String fileName){
        try {
            return new String(Files.readAllBytes(Paths.get("src/resource/" + fileName)), StandardCharsets.UTF_8) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null ;
    }


    public char[] transformTextForArr(String string){
        char[] textArr = readTextFromFile(string).toCharArray();
        return textArr ;
    }


}
