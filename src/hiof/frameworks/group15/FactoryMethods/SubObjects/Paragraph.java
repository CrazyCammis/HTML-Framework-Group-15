package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class Paragraph {
    String info, paragraphID;

    private Paragraph(String info, String paragraphID) {
        this.info = info;
        this.paragraphID = paragraphID;
    }

    public static  Paragraph generate(String info, String paragraphID){
        Paragraph holder = new Paragraph(info, paragraphID);
        return  holder;
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
