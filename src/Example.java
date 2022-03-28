import hiof.frameworks.group15.*;


public class Example {
    public String article1 = "";
    public String article2 = "";








    public  void example(){

//make an article
        //  public String generateArticle(String header, String paragraph, String id, String groupclass) {
        article1 = HTMLMaker.generateArticle("Breaking news!",
                "We don’t serve their kind here! What? Your droids.", "article1", "sectionArticles");
//make another article

        article2 = HTMLMaker.generateArticle("Breaking news!",
                "We don’t serve their kind here! What? Your droids.", "article1", "sectionArticles");
//
//create an array with them
        String[] holder = new String[]{article1, article2};

        //generate a section with the articles you made
        String section= HTMLMaker.generateSection(holder);
    }





}
