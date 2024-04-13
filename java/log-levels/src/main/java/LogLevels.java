public class LogLevels {
    
    public static String message(String logLine) {
   
String parts[] = logLine.split(": ",2);
        if(parts.length > 1){
        return parts[1].trim();}
        else{
        return "";
            }
    }

    public static String logLevel(String logLine) {
      String parts[] = logLine.split(": ",2);
        String subString = parts[0].substring(1,parts[0].length()-1);
        return subString.toLowerCase();
    }

    public static String reformat(String logLine) {

        String messages = message(logLine);
        String logLevels = logLevel(logLine);
        String result = messages+" "+"("+logLevels+")";
        return result;

        
    }
}
