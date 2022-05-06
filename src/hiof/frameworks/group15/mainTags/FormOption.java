package hiof.frameworks.group15.mainTags;

public class FormOption {
    private  String formOptionID, description, type;

    public FormOption(String formOptionID, String description, String type) {
        this.formOptionID = formOptionID;
        this.description = description;
        this.type = type;
    }


    private String generateFormOption(String formOptionId, String description, String type) {
        String holder =
                "       <label for=\"" + formOptionId + "\">" + description + ":" + "/label><br>\n" +
                        "       <input type=\"" + type + "\" id=\"" + formOptionId + "\" name=\"" + formOptionId + "\"><br>\n";
        return holder;
    }

    @Override
    public String toString() {
        String holder = generateFormOption(formOptionID, description, type)
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