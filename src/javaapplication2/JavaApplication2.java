package javaapplication2;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int uitkomst = faculteitsFunctie(5);
        String begeleidendeTekst;
        begeleidendeTekst = "de uitkomst van 5!= ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        
        
    }
    
    
    public static int faculteitsFunctie(int getal1){
        int optelling = getal1;
        
        return optelling;
    }
    
    
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }}
    
