import logging.LoggingUtil;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StrategyMain {
    private static final Logger LOGGER = Logger.getLogger(StrategyMain.class.getName());
    public static void main(String[] args) throws IOException {
        LoggingUtil.initLogManager();
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        LOGGER.log(Level.INFO,blog.getPages().toString());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        LOGGER.log(Level.INFO, shop.getPages().toString());
    }
}
