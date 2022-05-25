package hiof.frameworks.group15.mainTags;

import hiof.frameworks.group15.FactoryMethods.Footer.Footer;
import hiof.frameworks.group15.FactoryMethods.MainSection.Section;

public class MainTag {

    private String infoString;
    private String[] infoList;
    private Section section;
    private Footer footer;



    private MainTag(String info) {
        this.infoString = info;
    }

    private MainTag(String[] infoList) {
        this.infoList = infoList;
    }

    private MainTag(Section section) {this.section = section;}



    public static MainTag generate(String info){
        return new MainTag(info);
    }
    public static MainTag generate(String[] info){
        return new MainTag(info);
    }

    public static MainTag generate(Section section){
        return new MainTag(section);
    }

    private String generateString2(String[] infoList) {
        StringBuilder holder = new StringBuilder();
        for (String  infoStuff : infoList ) {
            holder.append(" ").append(infoStuff).append("\n");

        }
        return holder.toString();
    }

    private String generateString1(String info)
    {
        return  "<main> \n " + info + "\n</main";
    }

    private String generateString3(Section section) {
        return  "<main> \n " + section.toString() + "\n</main";
    }

    @Override
    public String toString() {
        String mainBody;
        String holder;

        if(infoString != null && infoList == null  && section == null){
             holder = generateString1(this.infoString);
        }

        else if(infoString == null && infoList != null  && section == null){
            holder = generateString2(this.infoList);
        }
        else {
            holder =  generateString3(this.section);
        }
         mainBody = " <main> \n" + holder + "\n </main>";
        return  mainBody;
    }

}



