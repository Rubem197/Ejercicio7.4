package principal;

public class Texto {
    private final static String VOCALES= "aeiouáéíóú" ;
    private final int TAMANO;
    private String cadena;
    private char caracter;

    public Texto(int TAMANO)
    {
        this.TAMANO=TAMANO;
        cadena="";
    }
    public void cadenaPrincipio(String cadena){
       if (cadena.length()+this.cadena.length()<=TAMANO){
           this.cadena=cadena+this.cadena;
       }
    }
    public void cadenaFinal(String cadena){
        if (cadena.length()+this.cadena.length()<=TAMANO){
            this.cadena=this.cadena+cadena;
        }
    }
    public void caracterFinal(char caracter){
        if (this.cadena.length()+1<=TAMANO){
            this.cadena=this.cadena+caracter;
        }
    }
    public void caracterPrincipio(char caracter){
        if (this.cadena.length()+1<=TAMANO){
            this.cadena=caracter+this.cadena;
        }
    }
    public boolean comprobarVocales(char caracter){
        boolean vocal= false;
        caracter=Character.toLowerCase(caracter);
        if (VOCALES.indexOf(caracter)!= -1){
            vocal=true;
        }
        return vocal;
    }
    public int contarVocales(){
        int contador=0;
        for (int i=0; i<cadena.length();i++){
        if (comprobarVocales(cadena.charAt(i))){
                contador++;
            }
        }
        return contador;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}

