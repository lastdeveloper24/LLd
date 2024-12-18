package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.Sink;

import java.util.Map;

public class ErrorLogger extends Logger{
    private Sink sink;
    private Map<Level.LogLevel,Sink> config;
    public ErrorLogger() {
        config = LoggerConfig.getInstance().getConfig();
        sink = config.get(LogLevel.ERROR);
    }
    @Override
    public void log( String content) {
        sink.write(content);
    }
}
