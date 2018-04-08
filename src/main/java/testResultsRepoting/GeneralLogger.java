package testResultsRepoting;

import java.io.IOException;
import java.util.logging.*;

public class GeneralLogger {
    public static void createSpecificLogger(String loggerType) {
        Logger textLogger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        LogManager.getLogManager().reset();
        textLogger.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        textLogger.addHandler(consoleHandler);

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(loggerType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileHandler.setLevel(Level.ALL);
        textLogger.addHandler(fileHandler);
        textLogger.log(Level.INFO, "text log");
    }
}