import java.util.Scanner;

public class Run {
    Scanner scanner=new Scanner(System.in);
    public void start(){
        while (true){
            System.out.println("Inserisci l'opzione desiderata:\n" +
                    "1. Inserisci persona\n" +
                    "2. Servi persona\n" +
                    "3. Dati prossima persona");
            int num= scanner.nextInt();
            switch (num){
                case 1:
                    //passa la persona
                    break;
                case 2:
                    //servi persona
                    break;
                case 3:
                    //prossima persona
                    break;
                default:
                    System.out.println("Opzione non valida");
            }
        }
    }
    public void carica(){
        System.out.println("Inserisci i dati:");

        System.out.println("Inserisci il nome:");
        String nome=scanner.next();
        System.out.println("Inserisci il cognome:");
        String cognome=scanner.next();
        int numero=scanner.nextInt();
        //implementa il passaggio dei dati alla lista
    };
}
