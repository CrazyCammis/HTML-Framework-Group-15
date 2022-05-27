package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.FormOption;
/**
 * Form class for HTML form tag
 * @author Anders Grindal
 *
 */
public class Form {
    private final String title;
    private final String formID;
    private final FormOption[] formOptions;

    private Form(String title, String formID, FormOption[] formOptions) {
        this.title = title;
        this.formID = formID;
        this.formOptions = formOptions;
    }

    /**
     * getter for ID 
     * @return ID identifier 
     */
    public String getID() {return formID;}

    /**
     * Generates a form with title, formID and an array of formOptions
     * @param title Title
     * @param formID ID identifeir
     * @param formOptions Array of formOptions
     * @return Generated Form 
     */
    public static Form generate(String title, String formID, FormOption[] formOptions){
        return new Form(title, formID, formOptions);
    }

    private  String optionLoop(FormOption[] optionList){
        StringBuilder holder = new StringBuilder();
        for (FormOption option: optionList) {
            holder.append(option.toString());
        }
        return holder.toString();
    }

    private String generateFormString(){
        return "<h2>" + title + "</h2> <br>\n" +
                "   <form id=\""+ formID + "\">\n" +
                optionLoop(formOptions) + "     <br> <input type=\"submit\" value=\"Submit\"\n>"+
                "   </form>";
    }

    /**
     * To string method
     */
    @Override
    public String toString() {
        return generateFormString();
    }
}
