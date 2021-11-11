/**
*   Clase que hereda de polígono, contiene las características de un triángulo.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/

public class Triangulo extends Poligono{
    //private int alfa, beta, gama;
    private float a, b, c;
    private float base, altura;

    /**
    * Constructor predeterminado de un triángulo.
    */
    public Triangulo(){}


    /**
    * Setter de la longitud de base del triángulo
    * @param longitud de base (en cm)
    */
    public void setBase(float base) {
        this.base = base;
    }

    /**
    * getter de la longitud de base
    * @return regresa la longitud de la base (en cm).
    */
    public float getBase() {
        return base;
    }

    /**
    * Setter de la altura del triángulo
    * @param altura (en cm)
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    * getter de la altura
    * @return regresa la altura del triángulo (en cm).
    */
    public float getAltura() {
        return altura;
    }

    /**
    * Sobreescritura del método para cálculo del área
    * @return área del triángulo 
    */
    @Override
    public double area(){
        return (base * altura) / 2; 
    }

    /**
    * Sobreescritura del método para cálculo del perímetro
    * @return perímetro del triángulo 
    */
    @Override
    public double perimetro() {
        return a + b +c;
    }

    /**
    * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
    */
    @Override
    public String toString() {
        return "Triángulo{ \n\tBase: "+base+"\n\tAltura: "+altura+"\n}";
    }

}

