package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.FormOption;

public class Form {
    private  String title, formID;
    private FormOption[] formOptions;

    private Form(String title, String formID, FormOption[] formOptions) {
        this.title = title;
        this.formID = formID;
        this.formOptions = formOptions;
    }

    public String getFormID() {
        return formID;
    }

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

    private String generateFormString(String title, String articleId, FormOption[] formOptions){
        return "<h2>" + title + "</h2> <br>\n" +
                "   <form id=\""+ articleId + "\">\n" +
                optionLoop(formOptions) + "     <br><br> <input type=\"submit\" value=\"Submit\"\n>"+
                "   </form>";
    }

    @Override
    public String toString() {
        return generateFormString(title, formID, formOptions);
    }
}
