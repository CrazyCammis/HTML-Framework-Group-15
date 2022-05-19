package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.FormOption;

public class Form {
    private  String title, formID;
    private FormOption[] formOptions;

    public Form(String title, String formID, FormOption[] formOptions) {
        this.title = title;
        this.formID = formID;
        this.formOptions = formOptions;
    }

    public static Form generateForm(String title, String formID, FormOption[] formOptions){
        Form holder = new Form(title, formID, formOptions);
        return holder;
    }

    private  String optionLoop(FormOption[] optionList){
        String holder = "";
        for (FormOption option: optionList) {
            holder += option.toString();
        }
        return  holder;
    }

    private String generateFormString(String titel, String articleId, FormOption[] formOptions){
        String form = "<h2>" + titel + "</h2> <br>\n" +
                "   <form id=\""+ articleId + "\">\n" +
                optionLoop(formOptions) +
                "   </form>\n";
        return form;
    }

    @Override
    public String toString() {
        String  holder = generateFormString(title, formID, formOptions);
        return holder;
    }
}
