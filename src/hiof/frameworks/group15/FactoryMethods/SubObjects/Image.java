package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class Image {
    private String url, caption, imageID, imageClass;


    public String getImageID() {
        return imageID;
    }

    public String getImageClass() {
        return imageClass;
    }

    private Image(String url, String caption, String imageID, String imageClass) {
        this.url = url;
        this.caption = caption;
        this.imageID = imageID;
        this.imageClass = imageClass;
    }

    public static Image generate(String url, String caption, String imageID, String imageClass){
        Image holder = new Image(url, caption, imageID, imageClass);
        return  holder;
    }

    @Override
    public String toString() {
        String holder = generateImagesString(url, caption, imageID, imageClass);
        return holder;
    }

    public String generateImagesString(String url, String caption, String imageID, String imageClass){
        String image = "<img id=\" +" + imageID + "\" class=\"" + imageClass + "\" src= \"" + url + "\" alt= \"" + caption + "\">";

        return image;
    }
}
