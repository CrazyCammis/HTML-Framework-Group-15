package hiof.frameworks.group15.FactoryMethods.MainSection;

/**
 * Main class for HTML main tag
 * @author Anders Grindal
 *
 */
public class MainTag {

    private String infoString;
    private String[] infoList;
    private Section section;




    private MainTag(String info) {
        this.infoString = info;
    }

    private MainTag(String[] infoList) {
        this.infoList = infoList;
    }

    private MainTag(Section section) {this.section = section;}

    /**
     * Generates a mainTag with body that gets in information from a direct string
     * @param info info to fill the body
     * @return generated Main 
     */
    public static MainTag generate(String info){
        return new MainTag(info);
    }
    /**
     * Generates maintag from an array of Strings
     * @param info array of info strings
     * @return Generated mainTag
     */
    public static MainTag generate(String[] info){
        return new MainTag(info);
    }
    
    /**
     * Generates maintag with just a section
     * @param section section
     * @return Generated main tag
     */

    public static MainTag generate(Section section){
        return new MainTag(section);
    }


    private String generateString1()
    {
        return  "<main> \n " + infoString + "\n</main";
    }

    private String generateString2() {
        StringBuilder holder = new StringBuilder();
        for (String  infoStuff : infoList ) {
            holder.append(" ").append(infoStuff).append("\n");

        }
        return holder.toString();
    }

    private String generateString3() {
        return  "<main> \n " + section.toString() + "\n</main";
    }

    /**
     * To string method
     */
    @Override
    public String toString() {
        String mainBody;
        String holder;

        if(infoString != null && infoList == null  && section == null){
             holder = generateString1();
        }

        else if(infoString == null && infoList != null  && section == null){
            holder = generateString2();
        }
        else {
            holder =  generateString3();
        }
         mainBody = " <main> \n" + holder + "\n </main>";
        return  mainBody;
    }
}



