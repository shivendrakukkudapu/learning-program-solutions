public class Main {
    public static void main(String[] args) {

        Logger firstLogger = Logger.getLogger();
        firstLogger.logMsg("App started.");

        Logger secondLogger = Logger.getLogger();
        secondLogger.logMsg("Loading complete.");

        if (firstLogger == secondLogger) {
            System.out.println("Logger confirmed as Singleton (same object used).");
        } else {
            System.out.println("Different logger instances (not Singleton).");
        }
    }
}
