import java.util.logging.Level;
import java.util.logging.Logger;

public class Blog extends Website{
    public static final Logger LOGGER = Logger.getLogger(Blog.class.getName());
    @Override
    public void createWebsite() {
        LOGGER.log(Level.INFO,"Criando um Blog...");
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
