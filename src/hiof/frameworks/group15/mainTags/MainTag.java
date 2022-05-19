package hiof.frameworks.group15.mainTags;

import hiof.frameworks.group15.FactoryMethods.MainSection.Footer;

public class MainTag {

    private String info;
    private String[] infoList;
    private Section section;
    private Footer footer;


    public MainTag(String info) {
        this.info = info;
    }

    public MainTag(String[] infoList) {
        this.infoList = infoList;
    }

    public MainTag(Section section) {this.section = section;}

    public MainTag(Section section, Footer footer) {
        this.section = section;
        this.footer = footer;
    }
    private String generateString1(String info)
    {
        return  "<main> \n " + info + "\n</main";
    }

    public static MainTag generateMainTag(String info){
        MainTag holder = new MainTag(info);
        return  holder;
    }
    public static MainTag generateMainTag(String[] info){
        MainTag holder = new MainTag(info);
        return  holder;
    }



    public static MainTag generateMainTag(Section section){
        MainTag holder = new MainTag(section);
        return  holder;
    }







    private String generateString2(String[] infoList)
    {
        String holder = "";
        for (String  infoStuff : infoList ) {
            holder += " " + infoStuff + "\n";

        }
        return  holder;
    }
    private String generateString3(Section section)
    {
        return  "<main> \n " + section.toString() + "\n</main";
    }

    private String generateString4(Section section, Footer footer)
    {
        return  "<main> \n " + section.toString()  + "\n" + footer.toString()+ "\n</main";
    }

    @Override
    public String toString() {
        String mainBody = "";
        String holder = "";

        if(this.info != null){
             holder = generateString1(this.info);
        }

        else if(this.infoList != null){
            holder = generateString2(this.infoList);
        }
        else if(this.section != null){
            generateString3(this.section);
        }
        else {
            System.out.println("ERROR IN MAIN, INVALID CONTENT");
        }
         mainBody = " <main> \n" + holder + "\n </main>";
        return  mainBody;
    }

}



