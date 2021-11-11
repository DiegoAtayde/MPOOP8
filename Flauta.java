/**
*   Clase general que contiene las características principales de una flauta.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Flauta extends InstrumentoViento {
    //Podemos sobreescribir algún método 
    //y agregar funcionalidades

    /**
    * Constructor predeterminado, crea una flauta.
    */
    public Flauta(){}

    /**
    * Se imprime en pantalla el mensaje correspondiente.
    */
    public void limpiar(){
        System.out.println("Limpiando la flauta");
    }

    /**
    * Sobreescritura del metodo tipoInstrumento
    * @return el mensaje respectivo
    */
    @Override
    public String tipoInstrumento() {
        return "Flauta dulce";
    }

    /**
    * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
    */
    @Override
    public String toString() {
        return "FLauta{}";
    }
}
