/**
*   Clase general que contiene las características principales de un cuadrilatero.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class CuadrilateroAbs extends PoligonoAbs {
    //ángulos
    //private int alfa, beta;
    //lados
    private float a, b;
    private float base, altura;

    /**
    * Constructor predeterminado, crea un cuadrilatero heredado de PolinomioAbs.java.
    */
    public CuadrilateroAbs(){}

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
    * Setter de la altura del cuadrilatero.
    * @param altura (en cm).
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    * Getter de la altura.
    * @return regresa la altura del cuadrilatero (en cm).
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
    * Sobreescritura del método para cálculo del perimetro
    * @return perimetro del cuadrilatero 
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
        return "CuadriláteroAbs{ \n\tBase: "+base+"\n\tAltura: "+altura+"\n}";
    }
}
