package hiof.frameworks.group15.mainTags;

public class MainTag {

    private String info;
    private String[] infoList;

    public MainTag(String info) {
        this.info = info;
    }

    public MainTag(String[] infoList) {
        this.infoList = infoList;
    }

    @Override
    public String toString() {
        String mainBody = "";
        String holder = "";
        if(info != null & infoList == null)

                mainBody= "<main> \n" + info + "\n </main>";
        else

            for (String  infoStuff : infoList ) {
                holder += " " + infoStuff + "\n";

            }
         mainBody = " <main> \n" + holder + "\n </main>";
        return  mainBody;
    }

}



