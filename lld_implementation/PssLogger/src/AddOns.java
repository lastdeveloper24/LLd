import Config.LoggerConfig;
import Level.LogLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddOns {
    //get details realted to date , other common stuffs

    public String getAdditionalData(LogLevel logLevel, String comment){
        String logMessage = logLevel+" "+"["+getDate()+"]"+" "+comment;
        return logMessage;
    }

    public String getDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(LoggerConfig.getInstance().getPattern());
        String formattedDateTime = localDateTime.format(formatter);
        return formattedDateTime;
    }
}
