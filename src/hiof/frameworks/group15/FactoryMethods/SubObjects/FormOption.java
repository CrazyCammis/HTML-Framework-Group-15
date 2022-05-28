package hiof.frameworks.group15.FactoryMethods.SubObjects;
/**
 * FormOption class for HTML form subsection, aka the form parts
 * @author Anders Grindal
 *
 */
public class FormOption {
    private  String formOptionID, description, type, formOptionClass;

    /**
     * Getter for the ID identifier
     * @return ID identifier
     */
    public String getID() {
        return formOptionID;
    }

    /***
     * Getter for class identifier
     * @return class identifier
     */
    public String getClassName() {
        return formOptionClass;
    }

    private static final String[] validTypesList = {"text", "email", "date", "image", "password",
            "number", "url", "time", "week"};

    private FormOption(String description, String type, String formOptionID,  String formOptionClass) {
        this.description = description;
        this.type = type;
        this.formOptionClass = formOptionClass;
        this.formOptionID = formOptionID;
    }

    /**
     * Generate a form option part
     * @param description description of what you have to fill out
     * @param type what kind of answer are accepted
     * @param formOptionID form option ID
     * @param formOptionClass Class identifier
     * @return Generated question box
     */


    public static FormOption generate( String description, String type, String formOptionID, String formOptionClass){
        if(!typeValid(type)){
            throw new ArithmeticException("ERROR WRONG TYPE INSERTED ON FORM OPTION "+ formOptionID
                    + "\n please insert one of the following: \n " + listTypes() );
        }
        else
        return new FormOption(description, type, formOptionID, formOptionClass );
    }

    private String generateFormOptionString() {
        return "       <label for=\"" + formOptionID + "\">" + description + ":" + "</label><br>\n" +
                "       <input type=\"" + type + "\" id=\"" + formOptionID + "\" name=\"" + formOptionID + "\"><br>\n";
    }

    private static String listTypes(){
        String holder ="";
        for (String type :  validTypesList){
            holder += type+ ", ";
        }
        return holder;
    }

    private static boolean typeValid(String check){
        for(String types : validTypesList){
            if(check.equals(types)){
                return true;
            }
        }
        return false;
    }
    /**
     * To string method
     */

    @Override
    public String toString() {
        return generateFormOptionString();
    }


}