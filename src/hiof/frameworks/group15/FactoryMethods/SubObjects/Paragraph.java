package hiof.frameworks.group15.FactoryMethods.SubObjects;
/**
 * Paragraph class for HTML paragraph tag
 * @author Anders Grindal
 *
 */
public class Paragraph {
    private String info, paragraphID, paragraphClass;
    
    /**
     * Getter  for ID identifier
     * @return ID identifier
     */
    public String getID() {
        return paragraphID;
    }
    /**
     * getter for class identifier
     * @return class identifier
     */
    public String getClassName() {
        return paragraphClass;
    }

    private Paragraph(String info, String paragraphID, String paragraphClass) {
        this.info = info;
        this.paragraphID = paragraphID;
        this.paragraphClass = paragraphClass;
    }

    /**
     * Generator for new paragraph
     * @param info Paragraph text
     * @param paragraphID ID identifier
     * @param paragraphClass class identifier
     * @return Generated paragraph
     */
    public static  Paragraph generate(String info, String paragraphID, String paragraphClass){
        return new Paragraph(info, paragraphID, paragraphClass);
    }
    
    /**
     * To string method
     */

    @Override
    public String toString() {
        return "<p id=\"" + paragraphID + "\">" + info + "</p>";
    }
}
