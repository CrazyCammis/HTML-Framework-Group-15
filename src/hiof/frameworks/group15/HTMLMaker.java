package hiof.frameworks.group15;
//framework for lesing og skriving av filer


import java.io.IOException;

public class HTMLMaker extends  Parent{
    private  String holder;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }




    private String page;
    private static String htmlPart1, htmlPart2;
    public HTMLMaker(){

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






    public void newHTMLFile(String fileName, String info) throws IOException {
        generateFile(fileName, info, "html");
    }


    private void newPage(String pageName, String header, String main, String footer) throws IOException {
         String fullInfo;

         fullInfo = htmlPart1 +header + main + footer + htmlPart2;

        generateFile(pageName, fullInfo, "html");

    }
/*
    private String genParagraph(String text, String id){
        return "<p id=\"" + id + "\">" + text + "</p>>";
    }
*/



    //Note need the content of the tags
    public String generateMain(String main) {
        String mainBody = "<main> \n" + main + "\n</main>";
        return  mainBody;
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



    public static String generateArticle(String header, String paragraph, String id, String groupclass) {
        String article = "  <article id=\"" + id + "\" class= \"" + groupclass + "\">\n" +
                "       <header>" + header + "</header>" +
                " <p>" + paragraph + "</p>" +
                "</article>";

        return article;
    }

    public String generateImages(String url, String id, String caption){
        String image = "<img id= " + id + " " + "src= " + url + "alt= " + caption + " >";

        return image;
    }


    private String generateFormOption(String id, String description,String type){
        String holder =
            "       <label for=\"" +id + "\">"+ description + ":" +"/label><br>\n"+
            "       <input type=\"" + type +"\" id=\"" + id + "\" name=\"" + id + "\"><br>\n";
        return holder;
    }




    public String generateForm(String titel, String id, String info){
        String form = "<h2>" + titel + "</h2> <br>\n" +
                "   <form id=\""+ id + "\">\n" +
                info +
                "   </form>\n";
        return form;
    }






    public String generateFooter(String email) {
        String footerCode = "   <footer> \n" +
                "        <a href = \"mailto: abc@example.com\"> "
                + email +"</a>" + "\n   </footer>";
        return footerCode;
    }

    public String generateFooter(String email, String info,String infop2) {
        String footerCode = "   <footer> \n" + info +
                "\n        <a href = \"mailto: abc@example.com\"> "+ email +"</a>\n" +
                "       <p>" + infop2 + "</p>" +
                "\n   </footer>";
        return footerCode;
    }

    public String concatTags(String[] listOfTags){
        String holder = "";
        for (String tags: listOfTags) {
            holder +=tags;
        }
        return holder;
    }


    public String concatTags(String part1, String part2){
        String holder = part1 + part2;

        return holder;
    }


}