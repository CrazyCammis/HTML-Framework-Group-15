package hiof.frameworks.group15.mainTags;

public class Paragraph {
    String info, paragraphID;

    public Paragraph(String info, String paragraphID) {
        this.info = info;
        this.paragraphID = paragraphID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        String holder = "<p id=\"" + paragraphID + "\">" + info + "</p>";
        return holder;
    }
}
