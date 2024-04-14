import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {


        char ch [] = dnaStrand.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : ch){
            if(c == 'A'){
                sb.append('U');
            }
            else if(c == 'T') sb.append('A');
            else if(c == 'G') sb.append('C');
            else if(c == 'C') sb.append('G');
        }

        return sb.toString();
    }

}
