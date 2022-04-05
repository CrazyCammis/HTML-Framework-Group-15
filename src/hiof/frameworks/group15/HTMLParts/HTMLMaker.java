package hiof.frameworks.group15.HTMLParts;
//framework for lesing og skriving av filer


import java.io.IOException;

public class HTMLMaker extends Parent {
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


    private void newPage(String pageName, String header, MainParts main, String footer) throws IOException {
         String fullInfo;

         fullInfo = htmlPart1 +header + main + footer + htmlPart2;

        generateFile(pageName, fullInfo, "html");

    }


    public String generateImages(String url, String id, String caption){
        String image = "<img id= " + id + " " + "src= " + url + "alt= " + caption + " >";

        return image;
    }
/*
    private String genParagraph(String text, String id){
        return "<p id=\"" + id + "\">" + text + "</p>>";
    }
*/








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

    public String groupUpTagSections(String[] listOfTags){
        String holder = "";
        for (String tags: listOfTags) {
            holder +=tags;
        }
        return holder;
    }


    public String groupUpTagSections(String part1, String part2){
        String holder = part1 + part2;

        return holder;
    }


}