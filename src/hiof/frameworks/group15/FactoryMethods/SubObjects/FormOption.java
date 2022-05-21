package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class FormOption {
    private  String formOptionID, description, type;
    private static final String[] validTypesList = {"text", "email", "date", "image", "password",
            "number", "url", "time", "week"};

    private FormOption(String formOptionID, String description, String type) {
        this.formOptionID = formOptionID;
        this.description = description;
        this.type = type;
    }


    public static FormOption generate(String formOptionID, String description, String type){
        if(!typeValid(type)){
            System.out.println("ERROR WRONG TYPE INSERTET ON FORM OPTION "+ formOptionID
                    + " WITH DESCRITPTION OF \n"
                    + description );
        }
        FormOption holder =   new FormOption(formOptionID, description, type);
        return holder;
    }

    private String generateFormOptionString(String formOptionId, String description, String type) {
        String holder =
                "       <label for=\"" + formOptionId + "\">" + description + ":" + "/label><br>\n" +
                        "       <input type=\"" + type + "\" id=\"" + formOptionId + "\" name=\"" + formOptionId + "\"><br>\n";
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
        String holder = generateFormOptionString(formOptionID, description, type);
        return holder;

    }

    private String getFormOptionID() {
        return formOptionID;
    }

    private void setFormOptionID(String formOptionID) {
        this.formOptionID = formOptionID;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
}