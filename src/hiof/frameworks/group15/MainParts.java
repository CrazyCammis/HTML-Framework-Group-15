package hiof.frameworks.group15;

public class MainParts {

    private  String article, section, form;




    //Note need the content of the tags
    public String generateMain(String info) {
        String mainBody = "<main> \n" + info + "\n</main>";
        return  mainBody;
    }

    //TODO check if type is valid
    private String generateFormOption(String formOptionId, String description,String type){
        String holder =
                "       <label for=\"" +formOptionId + "\">"+ description + ":" +"/label><br>\n"+
                        "       <input type=\"" + type +"\" id=\"" + formOptionId + "\" name=\"" + formOptionId + "\"><br>\n";
        return holder;
    }

//CAN USE FORM AS AN OBJECT??? prevents misshandling
    private String generateForm(String titel, String articleId, String info){
        String form = "<h2>" + titel + "</h2> <br>\n" +
                "   <form id=\""+ articleId + "\">\n" +
                info +
                "   </form>\n";
        return form;
    }

        public static String generateArticle(String title, String paragraph, String id, String groupclass) {
            String article = "  <article id=\"" + id + "\" class= \"" + groupclass + "\">\n" +
                    "       <header>" + title + "</header>" +
                    " <p>" + paragraph + "</p>" +
                    "</article>";

            return article;
        }



    public  static String generateSection(String[] articles) {

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





}
