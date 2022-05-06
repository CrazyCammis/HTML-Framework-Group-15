package hiof.frameworks.group15;

public class MainParts {

    private  String article, section, form;



    //GENERATE MAIN WILL CONSIST OF STRING AS THERE ARE TOO MANY STUFF TO DO A PROPER TO STRING CHECK
    public String generateMain(String info) {
        String mainBody = "<main> \n" + info + "\n</main>";
        return  mainBody;
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
