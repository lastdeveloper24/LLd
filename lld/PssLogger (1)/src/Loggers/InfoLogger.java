package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.Sink;

import java.util.Map;


public class InfoLogger extends Logger {
    private Sink sink;
    private Map<LogLevel, Sink> config;
    //driver function of  this logger which connects to DB
    public InfoLogger(){
        config =  LoggerConfig.getConfig();
        sink = config.get(LogLevel.INFO);
    }
    public void log(String namespace, LogLevel logLevel, String content, String pattern){
        String additionalDate = LoggerConfig.getAdditionalDate(pattern);
        String comment = LogLevel.INFO+" "+"["+additionalDate+"]"+" "+content;
        sink.write(comment);

    }



}
