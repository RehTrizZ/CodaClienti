import dati.Dati;
import persona.Persona;
import sistema.SistemaCoda;

import java.util.Scanner;

public class Run {
    Scanner scanner=new Scanner(System.in);
    public void start(){
        while (true){
            System.out.println("Inserisci l'opzione desiderata:\n" +
                    "1. Inserisci persona\n" +
                    "2. Servi persona\n" +
                    "3. dati.Dati prossima persona");
            int num= scanner.nextInt();
            switch (num){
                case 1:
                    carica();
                    break;
                case 2:
                    SistemaCoda.serveCustomer();
                    break;
                case 3:
                    SistemaCoda.nextCustomer();
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
        Dati.clienti.add(new Persona(nome, cognome, numero));
    }
}
