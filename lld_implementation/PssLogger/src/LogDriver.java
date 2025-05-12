import Config.LoggerConfig;
import Level.LogLevel;
import Loggers.Logger;



public class LogDriver {
    private AddOns addOns ;
    LoggerFactory loggerFactory ;

    public LogDriver(){
        this.addOns = new AddOns();
        this.loggerFactory = new LoggerFactory();

    }

    // instead of formatting the comment in th code , pass the comment to a method of addOns object which is going to do that .
    void Info(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.INFO);
        String logMessage  = addOns.getAdditionalData(LogLevel.INFO, comment);
        logger.log(logMessage);
    }

    void Error(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.ERROR);
        String logMessage  = addOns.getAdditionalData(LogLevel.ERROR, comment);
        logger.log(logMessage);
    }

    void Fatal(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.FATAL);
        String logMessage  = addOns.getAdditionalData(LogLevel.FATAL, comment);
        logger.log( logMessage);
    }

    void Warn(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.WARN);
        String logMessage  = addOns.getAdditionalData(LogLevel.WARN, comment);
        logger.log( logMessage);
    }

    void Debug(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.DEBUG);
        String logMessage  = addOns.getAdditionalData(LogLevel.DEBUG, comment);
        logger.log( logMessage);
    }
}



