package logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingUtil {
    public static void initLogManager() throws IOException {
        LogManager.getLogManager().readConfiguration(new FileInputStream("./src/main/resources/logging.properties"));
    }
}
