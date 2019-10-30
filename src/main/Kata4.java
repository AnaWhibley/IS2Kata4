package main;

import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
