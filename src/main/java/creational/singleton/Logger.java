package creational.singleton;

public class Logger {

    private Logger() {
    }

    private static class LazyHolder {
        static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LazyHolder.INSTANCE;
    }
}
