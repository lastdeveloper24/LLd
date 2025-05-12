package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.Sink;

import java.util.Map;

public class DebugLogger extends Logger{
    private Sink sink;
    private Map<Level.LogLevel,Sink> config;
    public DebugLogger(){
        config = LoggerConfig.getInstance().getConfig();
        sink = config.get(LogLevel.DEBUG);
    }
    @Override
    public void log( String content) {
        sink.write(content);
    }
}
