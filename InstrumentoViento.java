/**
*   Clase general que contiene los metodos principales de un instrumento de viento.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class InstrumentoViento extends Object implements InstrumentoMusical {

  /**
  * Constructor predeterminado, crea un instrumento de viento.
  */
  public InstrumentoViento(){}
    
  //Por defecto todos lod métodos de la interfaz son públicos, 
  //por lo tanto así deben ser imprelementados

  /**
  * Sobreescritura del metodo tocar
  */
  @Override
  public void tocar() {
    System.out.println("Tocando con viento");
  }

  /**
  * Sobreescritura del metodo afinar
  */
  @Override
  public void afinar() {
    System.out.println("Afinando con viento");
  }

  /**
  * Sobreescritura del metodo tipoInstrumento
  * @return el mensaje respectivo
  */
  @Override
  public String tipoInstrumento() {
    return "Instrumento de viento";
  }

  /**
  * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
  */
  @Override
  public String toString() {
    return "InstrumentoViento{}";
  }
}
