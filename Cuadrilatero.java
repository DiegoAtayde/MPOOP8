/**
*   Clase general que contiene las características principales de un cuadrilatero.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Cuadrilatero extends Poligono {
    //ángulos
    //private int alfa, beta;
    //lados
    private float a, b;
    private float base, altura;
    
    /**
    * Constructor predeterminado, crea un cuadrilatero.
    */
    public Cuadrilatero(){}

    /**
    * Setter de la base del cuadrilatero.
    * @param base (en cm).
    */
    public void setBase(float base) {
        this.base = base;
    }

    /**
    * Getter de la base.
    * @return regresa la base del cuadrilatero (en cm).
    */
    public float getBase() {
        return base;
    }

    /**
    * Setter de la altura
    * @param altura del cuadrilatero (en cm).
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    * Getter de la altura
    * @return regresa la altura del triángulo (en cm).
    */
    public float getAltura() {
        return altura;
    }

    /**
    * Sobreescritura del método para cálculo del área
    * @return área del cuadrilatero 
    */
    @Override
    public double area() {
        return base * altura;
    }
    
    /**
    * Sobreescritura del método para cálculo del perímetro
    * @return perímetro del cuadrilatero 
    */
    @Override
    public double perimetro() {
        return 2 * (a+b);
    }

    /**
    * Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
    */
    @Override
    public String toString() {
        return "Cuadrilátero{ \n\tBase: "+base+"\n\tAltura: "+altura+"\n}";
    }
}
