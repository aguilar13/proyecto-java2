
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Que es encapsulamiento?",
        "¿Que es herencia en java?", 
        "¿Que es una clase?",
        "¿Que es un atributo en java?", 
        "¿Que es  polimorfismo?",
        "¿Que es serializacion?",
        "¿Define JDK?",
        "¿Que es un Thread?",
        "¿Que significa DAO en JAVA?",
        "¿Que es un DAO?",
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
