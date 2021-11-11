public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------- Clases Concretas ----------------");

        Poligono pol =  new Poligono();
        Triangulo tri = new Triangulo();
        Cuadrilatero cua = new Cuadrilatero();

        System.out.println(pol);
        System.out.println(tri);
        System.out.println(cua);

        System.out.println(pol.area());
        System.out.println(tri.area());
        System.out.println(cua.area());
        
        
        System.out.println("---------------- Clases Abstractas ----------------");
        TrianguloAbs triabs = new TrianguloAbs();
        CuadrilateroAbs cuabs = new CuadrilateroAbs();

        System.out.println(triabs);
        System.out.println(cuabs);
        System.out.println(triabs.perimetro());
        System.out.println(cuabs.perimetro());


        System.out.println("---------------- Interfaces ----------------");
        InstrumentoViento iv = new InstrumentoViento();
        Flauta flute = new Flauta();

        System.out.println(iv);
        System.out.println(flute);


        System.out.println("---------------- Atributos en Interfaces ----------------");
        System.out.println("El mes "+Meses.NUEVE+" corresponde a: "+Meses.NOMBRES_MESES[9]);
        System.out.println("El valor de PI es:"+Math.PI);
        System.out.println("El valor de PI es:"+(float)Math.PI);
        System.out.println("El valor de PI es:"+(int)Math.PI);
    }
}
