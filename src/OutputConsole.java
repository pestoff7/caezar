public class OutputConsole {


    public void startMessage(){
        System.out.print("Введитете шаг сдвига или '0' если текст устраивает");
    }

    public void transcript(int step, String textTranscript){
        System.out.println("Шаг сдвига " + step);
        System.out.println("Получившийся текст :");
        System.out.println(textTranscript);
    }


}
