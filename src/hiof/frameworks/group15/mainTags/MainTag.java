package hiof.frameworks.group15.mainTags;

public class MainTag {

    private String info;

    public MainTag(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        String mainBody = " <main> \n" + info + "\n </main>";
        return  mainBody;
    }


}
