package hiof.frameworks.group15.FactoryMethods.Footer;

public class Footer {
    String email, info1, info2;

    private Footer(String email) {
        this.email = email;
    }

    private Footer(String email, String info1) {
        this.email = email;
        this.info1 = info1;
    }

    private Footer(String email, String info1, String info2) {
        this.email = email;
        this.info1 = info1;
        this.info2 = info2;
    }

    public static Footer generate(String email) {
        return new Footer(email);
    }

    public static Footer generate(String email, String info1) {
        return new Footer(email, info1);
    }

    public static Footer generate(String email, String info1, String info2) {
        return new Footer(email, info1, info2);
    }


    public String generateFooterString1(String email) {
        return "   <footer> \n" +
                "       <p> <a href = \"mailto:" + email + "\"> "
                + email + "</a></p>" + "\n  " +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n   </footer>";
    }


    public String generateFooterString2(String email, String info1) {
        return "   <footer> \n" +
                "        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + info1 + "</p>" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n " +
                "  </footer>";
    }

    public String generateFooterString3(String email, String info1, String info2) {
        return "   <footer> \n <p>" + info1 +
                "</p>\n        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + info2 + "</p>\n" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n   </footer>";
    }

    @Override
    public String toString() {
        String holder;

        if (this.info1 == null && this.info2 == null) {
            holder = generateFooterString1(email);
        } else if (this.info1 != null && this.info2 == null) {
            holder = generateFooterString2(email, info1);
        } else
            holder = generateFooterString3(email, info1, info2);

        return holder;
    }
}
