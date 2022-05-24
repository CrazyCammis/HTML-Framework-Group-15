package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class FormOption {
    private  String formOptionID, description, type, formOptionClass;

    public String getID() {
        return formOptionID;
    }

    public String getClassName() {
        return formOptionClass;
    }

    private static final String[] validTypesList = {"text", "email", "date", "image", "password",
            "number", "url", "time", "week"};

    private FormOption(String formOptionID, String description, String type, String formOptionClass) {
        this.formOptionID = formOptionID;
        this.description = description;
        this.type = type;
        this.formOptionClass = formOptionClass;
    }

    public static FormOption generate(String formOptionID, String description, String type,String formOptionClass){
        if(!typeValid(type)){
            throw new ArithmeticException("ERROR WRONG TYPE INSERTED ON FORM OPTION "+ formOptionID
                    + "\n please insert one of the following: \n " + listTypes() );

        }
        else
        return new FormOption(formOptionID, description, type, formOptionClass );
    }

    private String generateFormOptionString(String formOptionId, String description, String type) {
        return "       <label for=\"" + formOptionId + "\">" + description + ":" + "</label><br>\n" +
                "       <input type=\"" + type + "\" id=\"" + formOptionId + "\" name=\"" + formOptionId + "\"><br>\n";
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

    @Override
    public String toString() {
        return generateFormOptionString(formOptionID, description, type);
    }


}