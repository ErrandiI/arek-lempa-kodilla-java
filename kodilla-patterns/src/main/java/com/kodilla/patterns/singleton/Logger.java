package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerVoid = null;
    private String lastLog = "";
    private Logger(){
    }
    public static Logger getInstance(){
        if (loggerVoid == null) {
            synchronized (Logger.class) {
                if (loggerVoid == null) {
                    loggerVoid = new Logger();
                }
            }
        }
        return loggerVoid;
    }
    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }
    public String getLastLog() {
        return lastLog;
    }
}
