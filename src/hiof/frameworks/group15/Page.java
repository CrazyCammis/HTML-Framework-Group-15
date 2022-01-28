package hiof.frameworks.group15;
//framework for lesing og skriving av filer


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {

    public void generateFile(String filename) throws IOException {
        String html = ".html";
        //concat binder to strings sammen til en
        filename = filename.concat(html);
        File page = new File(filename);
        if (!page.exists())
            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
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

    public void generateNavList(String[] links, String[] text, String id, String groupclass) {
        int size = links.length;
        String nav = "<nav id=\"" + id + "\" class= \"" + groupclass + "\">\n  <ul> \n";
        for (int i = 0; i < size; i++) {

            nav = nav.concat("<li><a href=" + links[i] + ">" + text[i] + "</a></li>\n");
        }
        nav = nav.concat("</ul>\n   </nav>");
    }

    public void generateFooter(String email) {
        String footerCode = "<footer> \n" + email + "\n </footer>";

    }

    public String generateImages(String url, String id, String caption){
        String image = "<img id= " + id + " " + "src= " + url + "alt= " + caption + " >";

        return image;
    }

    public String generateForm(String titel, String id, String value){
        String form = "<h1>" + titel + "</h1><br>" +  "<form>" + "<label for=\"" + id + " >" + "titel for form" + "</labrl> <br>" + "<input type=text id=\"" + id + "value=\"" + value + "><br>" + "</form>";

        return form;
    }

    public void generateMain(String main) {
        String mainHtmlCode = "<main> \n" + main + "\n</main>";
    }


}