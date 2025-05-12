package Config;

import Level.LogLevel;
import SinkStrategy.FileSink;
import SinkStrategy.ConsoleSink;
import SinkStrategy.Sink;
import java.util.Map;
import java.util.HashMap;

//implemented singletone design pattern
public class LoggerConfig {
    private static LoggerConfig instance;

    //your configuration properties
    private String sinkpath ;
    private String pattern ;
    private Map<LogLevel, Sink> customConfig = new HashMap<>();

    private LoggerConfig() {
        this.sinkpath = "/Sinks/ApplicationLog";
        this.pattern = "yyyy-MM-dd HH:mm:ss";
        customConfig.put(LogLevel.INFO, new FileSink(sinkpath));
        customConfig.put(LogLevel.WARN, new ConsoleSink());
        customConfig.put(LogLevel.DEBUG, new ConsoleSink());
        customConfig.put(LogLevel.FATAL, new ConsoleSink());
        customConfig.put(LogLevel.ERROR, new ConsoleSink());
    }

    public static synchronized  LoggerConfig getInstance() {
        if(instance == null){
            instance = new LoggerConfig();
        }
        return instance;
    }

    public String getSinkpath(){
        return sinkpath;
    }
    public void setSinkpath(String sinkpath){
        this.sinkpath = sinkpath;
    }
    public String getPattern(){
        return pattern;
    }
    public void setPattern(String pattern){
        this.pattern = pattern;
    }





    // Populate the configuration dictionary

    public void setcustomConfig(Map<LogLevel, Sink> customConfig) {
        this.customConfig = customConfig;
    }
    // Add more log levels and associated sink types as needed
    public Map<LogLevel, Sink> getConfig(){
        return customConfig;
    }
}
