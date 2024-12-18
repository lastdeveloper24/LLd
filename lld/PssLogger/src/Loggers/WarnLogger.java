package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.Sink;

import java.util.Map;


public class WarnLogger extends Logger {
    //driver function of  this logger which connects to DB

    //take the input
    private Sink sink;
    private Map<LogLevel,Sink> config;
    public WarnLogger() {
        config = LoggerConfig.getInstance().getConfig();
        sink = config.get(LogLevel.WARN);
    }
    @Override
    public void log(String content) {
        sink.write(content);
    }
}
