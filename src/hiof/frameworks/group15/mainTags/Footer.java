package hiof.frameworks.group15.mainTags;

public class Footer {
    String email, info1, info2;

    public Footer(String email) {
        this.email = email;
    }

    public Footer(String email, String info1) {
        this.email = email;
        this.info1 = info1;
    }

    public Footer(String email, String info1, String info2) {
        this.email = email;
        this.info1 = info1;
        this.info2 = info2;
    }

    public String generateFooterString1(String email) {
        String footerCode = "   <footer> \n" +
                "        <a href = \"mailto:"+email+"\"> "
                + email +"</a>" + "\n   </footer>";
        return footerCode;
    }


    public String generateFooterString2(String email, String info1) {
        String footerCode = "   <footer> \n" +
                "\n        <a href = \""+ email + "\"> "+ email +"</a>\n" +
                "       <p>" + info1 + "</p>" +
                "\n   </footer>";
        return footerCode;
    }

    public String generateFooterString3(String email, String info1,String infop2) {
        String footerCode = "   <footer> \n" + info1 +
                "\n        <a href = \"" + email + "\"> "+ email +"</a>\n" +
                "       <p>" + infop2 + "</p>" +
                "\n   </footer>";
        return footerCode;
    }


    @Override
    public String toString() {
        String holder;

        if(this.info1==null && this.info2 == null){
            holder =  generateFooterString1(email);
        }
        else if(this.info1 != null && this.info2 == null){
            holder = generateFooterString2(email, info1);
        }
        else
            holder= generateFooterString3(email,info1,info2);

        return  holder;
    }
}