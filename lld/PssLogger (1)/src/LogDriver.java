import Config.LoggerConfig;
import Level.LogLevel;
import Loggers.Logger;



public class LogDriver {
    LoggerFactory loggerFactory = new LoggerFactory();
    String Infopattern = "yyyy-MM-dd HH:mm:ss";
    String ErrorPattern = "yyyy-MM-dd";


    void Info(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.INFO);
//        String additionalDate = LoggerConfig.getAdditionalDate(Infopattern);

        logger.log("namespace1", LogLevel.INFO, comment, Infopattern);
    }

    void Error(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.ERROR);
        String additionalDate = LoggerConfig.getAdditionalDate(ErrorPattern);
        comment = LogLevel.ERROR+" "+"["+additionalDate+"]"+" "+comment;
        logger.log("namespace1", LogLevel.ERROR, comment, ErrorPattern);
    }

    void Fatal(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.FATAL);

        logger.log("namespace1",LogLevel.FATAL, comment, Infopattern);
    }

    void Warn(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.WARN);

        logger.log("namespace1", LogLevel.WARN, comment, Infopattern);
    }

    void Debug(String comment){
        Logger logger = loggerFactory.getLogger(LogLevel.DEBUG);

        logger.log("namespace1", LogLevel.DEBUG, comment, ErrorPattern);
    }
}


