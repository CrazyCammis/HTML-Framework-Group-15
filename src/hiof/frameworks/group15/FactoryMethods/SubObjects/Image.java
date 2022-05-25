package hiof.frameworks.group15.FactoryMethods.SubObjects;
/**
 * Image class for HTML image tag
 * @author Anders Grindal
 *
 */
public class Image{
    private String  url, caption, imageID, imageClass;
    
    /**
     * getter for ID 
     * @return ID identifier 
     */
    public String getID() {return imageID;}
    
    /**
     * getter for ID 
     * @return ID identifier 
     */
    public String getClassName() {return imageClass;}

    private Image(String url, String caption, String imageID, String imageClass) {
        this.url = url;
        this.caption = caption;
        this.imageID = imageID;
        this.imageClass = imageClass;
    }

    /**
     * Generate new image tag
     * @param url Source from the Internet
     * @param caption Descriptive text in case image doesn't load
     * @param imageID Id identifier 
     * @param imageClass class identifier 
     * @return Generated image
     */
    public static Image generate(String url, String caption, String imageID, String imageClass){
        return new Image(url, caption, imageID, imageClass);
    }

    /**
     * To string method
     */
    @Override
    public String toString() {
        return generateImagesString(url, caption, imageID, imageClass);
    }

    private String generateImagesString(String url, String caption, String imageID, String imageClass){
        return "<img id=\" +" + imageID + "\" class=\"" + imageClass + "\" src= \"" + url + "\" alt= \"" + caption + "\">";
    }
}
