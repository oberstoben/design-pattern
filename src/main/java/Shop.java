import java.util.logging.Level;
import java.util.logging.Logger;

public class Shop extends Website {
    public static final Logger LOGGER = Logger.getLogger(Shop.class.getName());
    @Override
    public void createWebsite() {
        LOGGER.log(Level.INFO, "Criando um Shop...");
        pages.add(new CartPage());
        pages.add((new ItemPage()));
        pages.add(new SearchPage());
    }
}
