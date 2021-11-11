/**
*   Clase abstracta que contiene las características principales de un polígono.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/

public abstract class PoligonoAbs {
    
    //métodos abstractos 
    /**
    * Método abstracto que regresa el área del polígono.
    * @return área del polígono.
    */
    public abstract double area();
    /**
    * Método abstracto que regresa el perímetro del polígono.
    * @return perímetro del polígono.
    */
    public abstract double perimetro();


    //métodos concretos
    /**
    * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
    */
    @Override
    public String toString() {
        return "PolígonoAbs{}";
    }
}
