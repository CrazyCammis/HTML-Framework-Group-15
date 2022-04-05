package hiof.frameworks.group15;

public class MainParts {

    private  String article, section, form;




    //Note need the content of the tags
    public String generateMain(String main) {
        String mainBody = "<main> \n" + main + "\n</main>";
        return  mainBody;
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



    private String generateFormOption(String id, String description,String type){
        String holder =
                "       <label for=\"" +id + "\">"+ description + ":" +"/label><br>\n"+
                        "       <input type=\"" + type +"\" id=\"" + id + "\" name=\"" + id + "\"><br>\n";
        return holder;
    }


    private String generateForm(String titel, String id, String info){
        String form = "<h2>" + titel + "</h2> <br>\n" +
                "   <form id=\""+ id + "\">\n" +
                info +
                "   </form>\n";
        return form;
    }

        public static String generateArticle(String header, String paragraph, String id, String groupclass) {
            String article = "  <article id=\"" + id + "\" class= \"" + groupclass + "\">\n" +
                    "       <header>" + header + "</header>" +
                    " <p>" + paragraph + "</p>" +
                    "</article>";

            return article;
        }






}
