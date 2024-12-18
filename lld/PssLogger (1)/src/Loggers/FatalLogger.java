package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.Sink;

import java.util.Map;

public class FatalLogger extends Logger{
    private Sink sink;
    private Map<Level.LogLevel,Sink> config;
    public FatalLogger() {
        config =  LoggerConfig.getConfig();
        sink = config.get(LogLevel.FATAL);
    }
    public void log(String namespace, Level.LogLevel logLevel, String content, String pattern){
        sink.write(content);
    }
}
