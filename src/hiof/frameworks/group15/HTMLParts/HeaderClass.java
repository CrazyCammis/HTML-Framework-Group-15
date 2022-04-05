package hiof.frameworks.group15.HTMLParts;

public class HeaderClass extends HTMLMaker{

    public HeaderClass( ) {


    }

    private  String generateHeader(String headline){
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>"+
                "</header>";

        return header;
    }

    //Can also use a nav
    private  String generateHeader(String headline, String paragrap){
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n"+
                "       <p>"+ paragrap +"<p/>\n"+
                "</header>\n";
        return header;
    }

    private  String generateHeader(String headline, String paragrap, String nav){
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n"+
                "       <p>"+ paragrap +"<p/>\n"+
                nav+
                "</header>\n";
        return header;
    }


    public String generateNavList(String[] links, String[] textForLink, String navTagId, String groupclass) {
        int size = links.length;
        String nav = "  <nav id=\"" + navTagId + "\" class= \"" + groupclass + "\">\n       <ul> \n";

        for (int i = 0; i < size; i++) {
            nav = nav.concat("      <li><a href=" + links[i] + ">" + textForLink[i] + "</a></li>\n");
        }

        nav = nav.concat("    </ul>\n   </nav>\n");
        return nav;
    }

}
