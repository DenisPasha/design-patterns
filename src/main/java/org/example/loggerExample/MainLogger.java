package org.example.loggerExample;

import org.apache.log4j.*;

public class MainLogger {

   private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainLogger.class);

   private static Logger log ;
    private MainLogger() {
    }

    public static Logger getLogger(){
        if (log == null){
            log = getCustomLogger();
        }
        return log;
    }
    private static Logger getCustomLogger (){
        ConsoleAppender consoleAppender = getConsoleAppender();
        FileAppender fileAppender = getFileAppender();
        addAppender(consoleAppender);
        addAppender(fileAppender);
        return logger;
    }

    private static ConsoleAppender getConsoleAppender(){
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.DEBUG);
        consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        consoleAppender.activateOptions();
        return consoleAppender;
    }
    private static FileAppender getFileAppender(){
        FileAppender fileAppender = new FileAppender();
        fileAppender.setThreshold(Level.DEBUG);
        fileAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        fileAppender.setFile("logFiles");
        fileAppender.activateOptions();
        return fileAppender;
    }
    private static void addAppender(Appender appender){
        org.apache.log4j.Logger.getRootLogger().addAppender(appender);
    }


}
