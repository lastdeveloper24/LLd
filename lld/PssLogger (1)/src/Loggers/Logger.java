package Loggers;

import Config.LoggerConfig;
import Level.LogLevel;

public abstract class Logger {
    LoggerConfig config = new LoggerConfig();
    public abstract void  log(String namespace, LogLevel logLevel, String content, String Pattern);


}
