package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class Paragraph {
    String info, paragraphID, paragraphClass;
    public String getID() {
        return paragraphID;
    }
    public String getClassName() {
        return paragraphClass;
    }

    private Paragraph(String info, String paragraphID, String paragraphClass) {
        this.info = info;
        this.paragraphID = paragraphID;
        this.paragraphClass = paragraphClass;
    }

    public static  Paragraph generate(String info, String paragraphID, String paragraphClass){
        return new Paragraph(info, paragraphID, paragraphClass);
    }

    @Override
    public String toString() {
        return "<p id=\"" + paragraphID + "\">" + info + "</p>";
    }
}
