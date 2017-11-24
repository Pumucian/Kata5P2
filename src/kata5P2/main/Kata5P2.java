package kata5P2.main;

import kata5P2.view.MailListReader;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.model.Mail;
import kata5P2.model.Histogram;
import java.io.IOException;
import java.util.List;

public class Kata5P2 {
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    
    public static void main(String[] args) throws IOException {
        Kata5P2 a = new Kata5P2();
        a.execute();
    }

    private void execute() throws IOException{
        input();
        process();
        output();
    }
            
    private void input() throws IOException{
        String filename = "C:\\Users\\fali0\\Documents\\NetBeansProjects\\Kata4\\emailsfile.txt";
        mailList = MailListReader.read(filename);        
    }
            
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    } 
            
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();        
    }
            
    
    
}
