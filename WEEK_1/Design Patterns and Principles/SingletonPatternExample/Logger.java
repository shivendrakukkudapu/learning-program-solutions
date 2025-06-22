public class Logger {

    private static Logger loggerObj;

    private Logger() {
        System.out.println("Logger started...");
    }

    public static Logger getLogger() {
        if (loggerObj == null) {
            loggerObj = new Logger();
        }
        return loggerObj;
    }

    public void logMsg(String msg) {
        System.out.println("Log >> " + msg);
    }
}
