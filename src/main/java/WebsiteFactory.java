import java.util.logging.Logger;

public class WebsiteFactory {
    public static final Logger LOGGER = Logger.getLogger(WebsiteFactory.class.getName());

    public static Website getWebsite(WebsiteType websiteType){

        switch (websiteType){
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }
    }
}
