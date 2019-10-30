package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReader {
    
    public static List<Mail> read (String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            /*while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }*/
            
            IteratorReader iteratorReader = new IteratorReader(reader);
            for(String line : iteratorReader) {
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }
        }
        catch(FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File Not Fount)" + exception.getMessage());
        }
        catch(IOException exception) {
            System.out.println("ERROR MailListReader::read (IO)" + exception.getMessage());
        }
        return list;
    }
    
}
