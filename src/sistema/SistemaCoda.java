package sistema;

import dati.Dati;

public final class SistemaCoda {

    public static void showCurrentlyServing(){
        System.out.println(Dati.clienti.getFirst().toString());
    }

    public static void serveCustomer(){
        System.out.println("Servito cliente: " +  Dati.clienti.getFirst().toString() + "\n------------");
    }

    public static void nextCustomer(){
        Dati.clienti.remove(Dati.clienti.size() - 1);
        System.out.println("Prossimo cliente: " + Dati.clienti.getFirst().getNome());
    }
}
