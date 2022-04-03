import logging.LoggingUtil;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StrategyMain {
    private static final Logger LOGGER = Logger.getLogger(StrategyMain.class.getName());
    public static void main(String[] args) throws IOException {
        LoggingUtil.initLogManager();
        LOGGER.log(Level.INFO, "Criando um Factory !");
    }
}
