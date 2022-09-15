package labStrings;

public class StringUtils {
    private String line;

    public StringUtils(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getSpaces(){
        int rez = 0;
        for(int i=0; i<line.length(); i++)
            if(line.charAt(i) == ' ')
                rez++;
        return rez;
    }

    public void toUpperCase(){
        String rez = "";
        char currChar;
        for(int i=0; i<line.length(); i++){
            currChar = line.charAt(i);
            if(currChar>='а' && currChar<='я')
                rez += Character.toString(currChar + 'А' - 'а');
            else if(currChar>='a' && currChar<='z')
                rez += Character.toString(currChar + 'A' - 'a');
            else rez += Character.toString(currChar);
        }
        line = rez;
    }

    public void removePunctuationMarks(){
        String punctuationMarks = ".,;:!?-\"()";
        String rez = "";
        char currChar;
        for(int i=0; i<line.length(); i++){
            currChar = line.charAt(i);
            if(punctuationMarks.indexOf(line.charAt(i)) < 0)
                rez += Character.toString(currChar);
        }
        line = rez;
    }
}
