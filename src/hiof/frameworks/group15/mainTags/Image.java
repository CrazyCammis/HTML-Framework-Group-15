package hiof.frameworks.group15.mainTags;

public class Image {
    private String url, caption, imageID, imageClass;


    public Image(String url, String caption, String imageID, String imageClass) {
        this.url = url;
        this.caption = caption;
        this.imageID = imageID;
        this.imageClass = imageClass;
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
