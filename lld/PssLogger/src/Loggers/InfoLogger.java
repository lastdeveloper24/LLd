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
        config =  LoggerConfig.getInstance().getConfig();
        sink = config.get(LogLevel.INFO);
    }
    public void log( String content){
        sink.write(content);
    }



}
