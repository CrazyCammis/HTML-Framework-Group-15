package hiof.frameworks.group15.mainTags;

import java.util.Arrays;

public class Form {
    private  String title, formID;
    private FormOption[] formOptions;

    public Form(String title, String formID, FormOption[] formOptions) {
        this.title = title;
        this.formID = formID;
        this.formOptions = formOptions;
    }



    private  String optionLoop(FormOption[] optionList){
        String holder = "";
        for (FormOption option: optionList) {
            holder += option.toString();
        }
        return  holder;
    }

    private String generateForm(String titel, String articleId, FormOption[] formOptions){
        String form = "<h2>" + titel + "</h2> <br>\n" +
                "   <form id=\""+ articleId + "\">\n" +
                optionLoop(formOptions) +
                "   </form>\n";
        return form;
    }

    @Override
    public String toString() {
        String  holder = generateForm(title, formID, formOptions);
        return holder;
    }
}
