import java.util.Scanner;

public class MainClass {
    public static final String NAME_FOR_FILE = "encrypted text.txt";


    public static void main(String[] args) {
        int step ;
        FileHandler fileHandler = new FileHandler();
        TranscriptText transcriptText = new TranscriptText();
        OutputConsole outputConsole = new OutputConsole();
        Scanner scanner = new Scanner(System.in) ;
        transcriptText.keyGeneration();
        while (true){
            char[] unreadableText = fileHandler.transformTextForArr(NAME_FOR_FILE) ;
            outputConsole.startMessage();
            step = scanner.nextInt();
            if(step != 0){
                transcriptText.coding(unreadableText,step);
                outputConsole.transcript(step,transcriptText.getFinishText());
            }else {
                break;
            }
        }
        scanner.close();
    }
}
