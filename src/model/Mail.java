package model;

public class Mail {
    
    String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return "";
    }
    
    public static boolean isMail (String lineFile) {
        return true;
    }
}
