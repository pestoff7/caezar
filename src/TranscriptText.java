public class TranscriptText {
    public String finishText ;
    public char[] upperCase ;
    public char[] lowerCase ;


    public void keyGeneration(){
        String upperCaseAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String lowerCaseAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        this.upperCase = upperCaseAlphabet.toCharArray() ;
        this.lowerCase = lowerCaseAlphabet.toCharArray() ;
    }


    public void coding(char[] letters, int step){
        for (int i = 0; i<letters.length; i++) {
            for (int j = 0; j<upperCase.length; j++) {
                if (letters[i] == upperCase[j]){
                    if(j + step < upperCase.length){
                       letters[i] = upperCase[j + step] ;
                    }else {
                        letters[i] = upperCase[j + step - 33];
                    }
                    break;
                }
            }
            for(int k = 0; k<lowerCase.length; k++){
                if (letters[i] == lowerCase[k]){
                    if(k + step < lowerCase.length){
                        letters[i] = lowerCase[k + step] ;
                    }else {
                        letters[i] = lowerCase[k + step - 33];
                    }
                    break;
                }
            }
        }
        String lettersString = new String(letters) ;
        this.finishText = lettersString;
    }

    public String getFinishText(){
        return finishText;
    }

}
