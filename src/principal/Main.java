package principal;

public class Main {

    public static void main(String[] args) {
        Texto t1= new Texto(30);
        t1.caracterFinal('e');
        System.out.println(t1.getCadena());
        t1.cadenaFinal("tu abuela hace abichuelas");
        System.out.println(t1.getCadena());
        System.out.println(t1.contarVocales());

    }
}
