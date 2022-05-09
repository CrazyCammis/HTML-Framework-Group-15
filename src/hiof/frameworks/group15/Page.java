package hiof.frameworks.group15;
import hiof.frameworks.group15.headerstuff.Header;
import hiof.frameworks.group15.mainTags.Footer;
import hiof.frameworks.group15.mainTags.MainTag;
public class Page{
    private static final String  htmlPart1;
    private static final String htmlPart2;
    private Header header;
    private MainTag mainTag;
    private Footer footer;

    public Page(Header header, MainTag mainTag, Footer footer) {
        this.header = header;
        this.mainTag = mainTag;
        this.footer = footer;
    }
    static {
        htmlPart1 = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n"
                +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "<title>Document</title>\n" +
                "</head>\n" +
                "<body>\n\n";

        htmlPart2 =
        "</body>\n" +
                "</html>\n";
    }

    @Override
    public String toString() {
        String holder = pageString(header, mainTag, footer);
        return holder;
    }
    private String pageString(Header header, MainTag mainTag, Footer footer) {
         String holder;
         holder = htmlPart1 +header.toString() + mainTag.toString() + footer.toString() + htmlPart2;
       return holder;
    }
}