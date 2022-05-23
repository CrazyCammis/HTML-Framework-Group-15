package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class Paragraph {
    String info, paragraphID, paragraphClass;

    private Paragraph(String info, String paragraphID, String paragraphClass) {
        this.info = info;
        this.paragraphID = paragraphID;
        this.paragraphClass = paragraphClass;
    }

    public static  Paragraph generate(String info, String paragraphID, String paragraphClass){
        Paragraph holder = new Paragraph(info, paragraphID, paragraphClass);
        return  holder;
    }


    @Override
    public String toString() {
        String holder = "<p id=\"" + paragraphID + "\">" + info + "</p>";
        return holder;
    }



}
