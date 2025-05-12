import Config.LoggerConfig;
import Level.LogLevel;
import SinkStrategy.ConsoleSink;
import SinkStrategy.Sink;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<LogLevel, Sink> customConfig = new HashMap<>();
        customConfig.put(LogLevel.INFO, new ConsoleSink());
        customConfig.put(LogLevel.WARN, new ConsoleSink());
        customConfig.put(LogLevel.DEBUG, new ConsoleSink());
        customConfig.put(LogLevel.FATAL, new ConsoleSink());
        customConfig.put(LogLevel.ERROR, new ConsoleSink());

        LogDriver logDriver = new LogDriver();

        //inplemented the logger config using singleton design pattern
        LoggerConfig loggerConfig = LoggerConfig.getInstance();
//        loggerConfig.setcustomConfig(customConfig);

        logDriver.Info("This application is working");

        logDriver.Info("This application process is complete ");
        logDriver.Info("This application is working");

        logDriver.Info("This application process is complete ");

        logDriver.Error("File Type not mathcing ");
    }
}