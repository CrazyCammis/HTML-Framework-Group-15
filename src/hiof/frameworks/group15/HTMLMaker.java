package hiof.frameworks.group15;
//framework for lesing og skriving av filer


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLMaker implements  HolderInterface{
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





    @Override
    public void generateFile(String filename, String info){
        filename = filename.concat(".html");
        File page = new File(filename);
        if (!page.exists())
            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write(info);
                myWriter.close();
                System.out.println("Successfully wrote to the file: " + info);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }



    private void newPage(String pageName, String header, String main, String footer) throws IOException {
         String fullInfo;

         fullInfo = htmlPart1 +header + main + footer + htmlPart2;

        generateFile(pageName, fullInfo);

    }


    public String generateImages(String url, String caption,  String imageid, String imageClass){
        String image = "<img id=\" +" + imageid + "\" class=\"" + imageClass + "\" src= \"" + url + "\" alt= \"" + caption + "\">";

        return image;
    }

    private String genParagraph(String text, String id){
        return "<p id=\"" + id + "\">" + text + "</p>>";
    }




    public String generateFooter(String email) {
        String footerCode = "   <footer> \n" +
                "        <a href = \"mailto:"+email+"\"> "
                + email +"</a>" + "\n   </footer>";
        return footerCode;
    }

    public String generateFooter(String email, String info,String infop2) {
        String footerCode = "   <footer> \n" + info +
                "\n        <a href = \"" + email + "\"> "+ email +"</a>\n" +
                "       <p>" + infop2 + "</p>" +
                "\n   </footer>";
        return footerCode;
    }
    public String generateFooter(String email, String info) {
        String footerCode = "   <footer> \n" +
                "\n        <a href = \""+ email + "\"> "+ email +"</a>\n" +
                "       <p>" + info + "</p>" +
                "\n   </footer>";
        return footerCode;
    }

    public String groupUpTagSections(String[] listOfTags){
        String holder = "";
        for (String tags: listOfTags) {
            holder +=tags +"\n";
        }
        return holder;
    }


    public String groupUpTagSections(String tagInFront, String tagAfter){
        String holder = tagInFront + "\n" + tagAfter;

        return holder;
    }




}