
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


    public void generateArticle(String header, String paragraph, String id, String groupclass) {
        String article = "<article id=\"" + id + "\" class= \"" + groupclass + "\">\n" +
                "<header>" + header +
                "</header>" +
                " <p>" + paragraph + "</p>" +
                "</article>";
    }

    public void generateNavList(String[] links, String[] text, String id, String groupclass) {
        int size = links.length;
        String nav = "<nav id=\"" + id + "\" class= \"" + groupclass + "\">\n  <ul> \n";
        for (int i = 0; i < size; i++) {

            nav = nav.concat("<li><a href=" + links[i] + ">" + text[i] + "</a></li>\n");
        }
        nav = nav.concat("</ul>\n   </nav>");
    }
}