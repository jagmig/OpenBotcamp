package sesion7.Singleton;

/* Patrones de Diseño mas conocidos y sus características principales:

Patrones Creacionales
Sirven como ayuda a la hora de construir objetos o instancias.

Patrón Singleton: Tiene como principio que solo puede haber una instancia por clase. El objetivo de este patrón
es el de garantizar que una clase solo tenga una instancia (o ejemplar) y proporcionar un punto de acceso
 global a ella.
 Este patrón por ejemplo, suele ser utilizado para las conexiones a bases de datos, conexiones a un mismo fichero.


 PATRÓN FACTORY: Sirve para crear una jerarquía de clase y utiliza una u otra de forma transparente.
 En general las Factory class pueden ser más complejas  encargándose de crear las instancias bajo
 condiciones de negocio o diversos inputs que hacen que su uso sea conveniente.

 PATRÓN BUILDER: Nos pernmite construir objetos complejos paso a paso en lugar de tener un "mega constructor"
 y con muchas llamadas a los metodos. Ejemplo de uso: Sus ventajas son que solucionan el problema de los
 constructores telescópicos y combinación de argumentos es usar el patrón de diseño Builder,
 además permite crear objetos complejos de forma flexible en varios pasos con propiedades opcionales.

 PATRÓN PROTOTYPE: Tiene como objetivo que una clase se clone a si misma y que ese clon herede todos los metodos
 y las propiedades del original.

 PATRONES ESTRUCTURALES
 Solucionan el diseño de composición de agregación de clases a objetos. Acopla varias clases en una.

 PATRÓN DECORATOR: Añade funcionalidad a una clase ya existente sin modificar esa clase. No hay que tocar el código de
 la clase para añadrile funcionalidad. En otras palabras, mejora la clase sin tocar la clase original. Se aplica
 creando un método constructor que implementa o recibe como parámetro la interfaz original y el al llamarlo debes
 de implementar sus metodos. Un método llama a otro método que está dentro de otro, que asu vez esta dentro de otro.

 PATRÓN ADAPTER: Crea una clase que permite que clases con la misma implementación y clases con distinta implementación
 funcionen coherentemente. Es una clase intermedia que hace que múltiples clases, que no tengan por que estar con la
 misma implementación y con los mismos métodos puedan trabajar coherentemente. Se utiliza mucho en código legacy o
 código antiguo y le queremos meter código nuevo.

 PATRÓN FACADE: Es un "envoltorio" que simplifica algo que hay complejo por detrás. Oculta la lógica complicada,
 poniendo por delante algo sencillo. Se utilizaz creando una clase tipo facade y escondemos toda la complejidad del
 código ahí, y solo en el main instanceamos esa clase facade y listo.


 PATRONES DE COMPORTAMIENTO:
 Ofrececn soliciones entre la iteración entre clases y objetos Observer, se basan en emisor y receptor y el
 comportamiento que toman cuando pasa algo.


 */
public class Ejercicio_Singleton {

    public static void main(String[] args) {

        Ejercicio_Singleton Jorge = Ejercicio_Singleton.getSingletonInstance("Jorge Gomez");

        Ejercicio_Singleton Ramon = Ejercicio_Singleton.getSingletonInstance("Ramon Ricardez");

        System.out.println(Jorge.getNombre());

        System.out.println(Ramon.getNombre());

    }

    private static Ejercicio_Singleton Ejercicio_Singleton;

    private String nombre;


    private Ejercicio_Singleton(String nombre) {

        this.nombre = nombre;
        System.out.println("El nombre: " + this.nombre);

    }

    public static Ejercicio_Singleton getSingletonInstance(String nombre) {

        if (Ejercicio_Singleton == null){

            Ejercicio_Singleton = new Ejercicio_Singleton(nombre);
        }else{

            System.out.println("No se puede crear el objeto " + nombre + " por que ya existe uno de la clase Ejercicio_Singleton");
        }

        return Ejercicio_Singleton;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
