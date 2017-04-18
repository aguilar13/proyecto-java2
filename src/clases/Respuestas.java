
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "consiste en permitir la visibilidad de atributos y/o métodos, en una clase determinada, teniendo así tres niveles ",
        " característica muy potente que permite definir una clase tomando como base a otra clase ya existente.",
        "Las clases en Java son básicamente una plantilla que sirve para crear un objeto.",
        "Los atributos son las caracterísiticas individuales que diferencian un objeto de otro y determinan su apariencia, estado u otras cualidades.",
        "referirse a la propiedad por la que es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos",
        " se llama serializar un objeto al proceso de convertirlo a bytes, para poder enviarlo por una red, y reconstruirlo luego a partir de esos bytes. ",
        "Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java.",
        " son basicamente una forma de poder ejecutar varios procesos simultáneamente en nuestros programas en Java.",
        "Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos",
        " encapsula el acceso a la base de datos. Por lo que cuando la capa de lógica de negocio necesite interactuar con la base de datos, va a hacerlo a través de la API que le ofrece DAO."
    };
    
    String[] radioR = {
               
                       // "¿Que es encapsulamiento?
               "consiste en permitir la visibilidad de atributos y/o métodos, en una clase determinada, teniendo así tres niveles,"
            + "Controlador rutina o programa que enlaza un dispositivo periférico al sistema operativo,"
            + "Base de datos no SQL,"
            + "Conjunto de elementos físicos o materiales que constituyen una computadora o un sistema informático",
                     // "¿Que es herencia en java??", 
               //característica muy potente que permite definir una clase tomando como base a otra clase ya existente
               "Es una forma de pensar y resolver problemas,"
            + "Es un paradigma de programación en el que tanto la estructura como la ejecución de los programas ,"
            +  " característica muy potente que permite definir una clase tomando como base a otra clase ya existente."
            + "Unidad dentro de un programa de computadora que consta de un estado y de un comportamiento",
                //"¿Que es una clase?",
               //"Las clases en Java son básicamente una plantilla que sirve para crear un objeto."
                " Mecanismo que consiste en organizar datos y métodos de una estructura,"
            + "Contiene caracteristicas definidas de un objeto y no contiene operaciones logicas,"
            + "Lenguaje de programacion para computadoras,"
            + "Las clases en Java son básicamente una plantilla que sirve para crear un objeto.",
                     //"¿Que es un atributo en java?", 
                     //"Los atributos son las caracterísiticas individuales que diferencian un objeto de otro y determinan su apariencia, estado u otras cualidades."
                "Son declaraciones de objetos"
            + ",Todo objeto puede tener cierto numero de propiedades,"
            + "Los atributos son las caracterísiticas individuales que diferencian un objeto de otro y determinan su apariencia, estado u otras cualidades."
            + "Se encarga de mantener ocultos los procesos internos que necesita para hacer lo que sea",
                  //"¿Que es el polimorfismo?"
                //"referirse a la propiedad por la que es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos",
               "Indica la posibilidad de definir varias operaciones con el mismo nombre,"
            + "referirse a la propiedad por la que es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos"
            + "Cada vez que creamos una nueva instancia,"
            + "Nos permite crear estructuras jerarquicas de clases",
                 //"¿Que es serializacion?",
                 // " se llama serializar un objeto al proceso de convertirlo a bytes, para poder enviarlo por una red, y reconstruirlo luego a partir de esos bytes. "
              " se llama serializar un objeto al proceso de convertirlo a bytes, para poder enviarlo por una red, y reconstruirlo luego a partir de esos bytes. "            + ",Se encarga  de mantener ocultos  los procesos internos"
            + ",Se encarga de mantener ocultos los procesos internos"
            + ",Unidad dentro de un programa de computadora que consta de un estado y de un comportamiento",
                    //"¿Define JDK?",
                    //"Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java.",

               "Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java."
            + ",Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java,"
            + "Propagacion de los atributos y las operaciones a traves de distintas sub-clases definidas apartir de una clase en comun,"
            + "Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java.",

               
               //"Que es un Thread",
               //
               "Es una tarea que se ejecuta paralelamente con todos los sistemas ,"
            + " son basicamente una forma de poder ejecutar varios procesos simultáneamente en nuestros programas en Java."
            + "Incompatibilidad de tipos de datos ,"
            + "Se tiene referencia a una instancia de un objeto",
               
               
               //  "Que significa DAO en JAVA
               //"Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos"
             
               "Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos,"
            + "Evalua una condicion,"
            + "Es un atributo  de una parte de los datos  que indica al ordenador algo sobre la clase de datos sobre los que se va a procesar ,"
            + "Es una tarea que se ejecuta paralelamente con todos los sistemas",
               
               //Que es un DAO
               // " encapsula el acceso a la base de datos. Por lo que cuando la capa de lógica de negocio necesite interactuar con la base de datos, va a hacerlo a través de la API que le ofrece DAO."
               "Construye una lista vacia con una capacidad inicial de diez,"
            + "Conjunto de procesos de concurrentemente trabajan,"
            +  " encapsula el acceso a la base de datos. Por lo que cuando la capa de lógica de negocio necesite interactuar con la base de datos, va a hacerlo a través de la API que le ofrece DAO."
            + "Es una tarea que se ejecuta paralelamente con todos los sistemas"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
