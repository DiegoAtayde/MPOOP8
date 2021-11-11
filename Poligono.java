/**
*   Clase general que contiene las características principales de un polígono.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/

public class Poligono {
    /**
    * Constructor predeterminado, crea un polígono.
    */
    public Poligono(){}


    /**
    * Regresa el área del polígono.
    * @return regresa un 0 de manera predeterminada.
    */
    public double area(){
        return 0;
    }

    /**
    * Regresa el perímetro del polígono.
    * @return regresa un 0 de manera predeterminada.
    */
    public double perimetro(){
        return 0;
    }
    
    /**
    * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
    */
    @Override
    public String toString(){
        return "Polígono{}";
    }
}
