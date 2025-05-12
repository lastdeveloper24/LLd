package Config;

import Level.LogLevel;
import SinkStrategy.FileSink;
import SinkStrategy.ConsoleSink;
import SinkStrategy.Sink;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.HashMap;

public class LoggerConfig {
    static String SinkPath= "ApplicationLog";
    public static Map<LogLevel, Sink> logConfig = new HashMap<>();

    static {
        // Populate the configuration dictionary
        logConfig.put(LogLevel.INFO, new FileSink(SinkPath));
        logConfig.put(LogLevel.WARN, new ConsoleSink());
        logConfig.put(LogLevel.DEBUG, new ConsoleSink());
        logConfig.put(LogLevel.ERROR, new ConsoleSink());
        logConfig.put(LogLevel.FATAL, new ConsoleSink());
        // Add more log levels and associated sink types as needed
    }

    public static String getAdditionalDate(String pattern){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = localDateTime.format(formatter);

        //add other relevant namespaces if needed

        return formattedDateTime;
    }
    public static Map<LogLevel, Sink> getConfig(){
        return logConfig;
    }
}
