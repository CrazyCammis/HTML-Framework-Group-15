package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class Image {
    private String url, caption, imageID, imageClass;

    public String getID() {return imageID;}
    public String getClassName() {return imageClass;}

    private Image(String url, String caption, String imageID, String imageClass) {
        this.url = url;
        this.caption = caption;
        this.imageID = imageID;
        this.imageClass = imageClass;
    }

    public static Image generate(String url, String caption, String imageID, String imageClass){
        return new Image(url, caption, imageID, imageClass);
    }

    @Override
    public String toString() {
        return generateImagesString(url, caption, imageID, imageClass);
    }

    public String generateImagesString(String url, String caption, String imageID, String imageClass){
        return "<img id=\" +" + imageID + "\" class=\"" + imageClass + "\" src= \"" + url + "\" alt= \"" + caption + "\">";
    }
}
