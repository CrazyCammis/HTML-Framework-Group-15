package hiof.frameworks.group15;
//framework for lesing og skriving av filer


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {
    private  String holder;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }




    private String page;
    private static String htmlPart1, htmlPart2;


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


    public Page(String holder){
        this.holder = holder;
    }





    public void generateFile(String filename, String info) throws IOException {
        String html = ".html";
        //concat binder to strings sammen til en
        filename = filename.concat(html);
        File page = new File(filename);
        if (!page.exists())
            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write(info);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    }


    public void newPage(String pageName, String header, String main, String footer) throws IOException {
         String fullInfo;

         fullInfo = htmlPart1 +header + main + footer + htmlPart2;

        generateFile(pageName, fullInfo);

    }






    public static String generateArticle(String header, String paragraph, String id, String groupclass) {
        String article = "<article id=\"" + id + "\" class= \"" + groupclass + "\">\n" +
                "<header>" + header +
                "</header>" +
                " <p>" + paragraph + "</p>" +
                "</article>";

        return article;
    }


    public static String generateSection(String[] articles) {

        String holder = "";
        String section = "";
        if (articles.length >= 1) {
            for (String article : articles) {
                holder = holder.concat(article);

            }

            section = "<Section> \n  " + holder + "\n</section>";
        }
        return section;
    }

    public String generateNavList(String[] links, String[] text, String id, String groupclass) {
        int size = links.length;
        String nav = "<nav id=\"" + id + "\" class= \"" + groupclass + "\">\n  <ul> \n";
        for (int i = 0; i < size; i++) {

            nav = nav.concat("<li><a href=" + links[i] + ">" + text[i] + "</a></li>\n");
        }
        nav = nav.concat("</ul>\n   </nav>");
        return nav;
    }

    public String generateFooter(String email) {
        String footerCode = "<footer> \n" + email + "\n </footer>";

        return footerCode;
    }

    public String generateImages(String url, String id, String caption){
        String image = "<img id= " + id + " " + "src= " + url + "alt= " + caption + " >";

        return image;
    }

    public String generateForm(String titel, String id, String value){
        String form = "<h1>" + titel + "</h1><br>" +  "<form>" + "<label for=\"" + id + " >" + "titel for form" + "</labrl> <br>" + "<input type=text id=\"" + id + "value=\"" + value + "><br>" + "</form>";

        return form;
    }

    public String generateMain(String main) {
        String mainBody = "<main> \n" + main + "\n</main>";
        return  mainBody;
    }

    public String concat(String[] listOfStuff){
        String holder = "";
        for (String tags: listOfStuff) {
            holder +=tags; 
        }
        return holder;
    }


    public String concat(String part1, String part2){
        String holder = part1 + part2;

        return holder;
    }

}