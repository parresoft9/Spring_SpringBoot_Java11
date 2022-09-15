package com.curso;
/*
Ejemplos de uso: El patr?n Observer es bastante habitual en el c?digo Java, sobre todo en los componentes GUI. 
Proporciona una forma de reaccionar a los eventos que suceden en otros objetos, sin acoplarse a sus clases.

Aqu? tienes algunos ejemplos del patr?n en las principales bibliotecas Java:
java.util.Observer/java.util.Observable
Todas las implementaciones de java.util.EventListener (pr?cticamente por todos los componentes Swing)
javax.servlet.http.HttpSessionBindingListener
javax.servlet.http.HttpSessionAttributeListener
javax.faces.event.PhaseListener
Identificaci?n: El patr?n puede reconocerse por los m?todos de subscripci?n, que almacenan objetos en una lista, y por las llamadas al m?todo de actualizaci?n 
emitidas a todos los objetos de esa lista.

Suscripci?n a eventos
En este ejemplo, el patr?n Observer establece una colaboraci?n indirecta entre objetos de un editor de texto. 
Cada vez que el objeto Editor cambia, lo notifica a sus suscriptores. 
EmailNotificationListener y LogOpenListener reaccionan a esas notificaciones ejecutando sus principales comportamientos.

Las clases suscriptoras no est?n acopladas a la clase editora y pueden reutilizarse en otras aplicaciones si fuera necesario. 
La clase Editor depende ?nicamente de la interfaz suscriptora abstracta. Esto permite a?adir nuevos tipos de suscriptor sin cambiar el c?digo del editor.
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("c://file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("fer@fer.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
