import Level.LogLevel;
import Loggers.*;

public class LoggerFactory {
    Logger getLogger(LogLevel logLevel){
        switch (logLevel) {
            case INFO:
                return new InfoLogger();
            case WARN:
                return new WarnLogger();
            case FATAL:
                return new FatalLogger();
            case ERROR:
                return new ErrorLogger();
            case DEBUG:
                return new DebugLogger();
            default:
                return null;
        }
    }
}
