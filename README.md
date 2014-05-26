Brave Disappointed Burst
========================

Introducci�n
------------
Segunda tarea correspondiente al ramo "Programaci�n Orientada a Objetos" ELO329.
Este programa realizado en Java simula un laboratorio de f�sica que comprende tres objetos: puntos fijos (FixedHook), bolas (Ball) y resortes (Spring), y simula la interacci�n entre ellos.
En el archivo documentacion.pdf se puede encontrar una descripcion m�s detallada del trabajo realizado como tambi�n de simulaciones/pruebas realizadas durante cada etapa de esta tarea.

Compilaci�n y Ejecuci�n
------------
El programa posee interfaz gr�fica por lo que para correrlo la primera vez hay que utilizar �nicamente el comando:

	$ make && make run

Una vez compilado basta con 

	$ make run

para ejecutar la aplicaci�n. Por otro lado para generar los documentos se debe correr el comando:

	$ make doc

el cual dejar� los documentos reci�n generados en la carpeta *docs/* y se pueden navegar desde el archivo *index.html*.

Comentarios
------------	
- Una vez ejecutado el programa se puede apreciar un eje en donde interact�an los distintos elementos y una serie opciones en la barra superior de la ventana.
- Desde el men� "Configuration>insert" se pueden a�adir los distintos elementos (bolas, puntos fijos y resortes) con sus propiedades asignadas de manera aleatoria (masa, tama�o, etc).
- Tambi�n se encuentra ac� la opci�n "My Scenario" que inserta un escenario prestablecido.
- Una vez agregados los elementos estos se pueden reposicionar seleccionandolos con un click y arrastr�ndolos a la posici�n deseada.
- En el caso que m�s de un elemento se encuentre en la misma posici�n se puede cambiar el elemento seleccionado con la tecla 'n' o 'space'.
- Desde el men� "My World" se pueden iniciar y detener las simulaciones como tambi�n modificar los par�metros del simulador.
- Es importante mencionar que durante una simulaci�n no se puede modificar los elementos a�adidos.
- Entre los par�metros que se pueden modificar del simulador esta la tasa de refresco de la pantalla como tambi�n el delta de tiempo entre cada c�lculo de la simulaci�n.

Archivos y breves descripciones
------------
- **PhysicsLab**: Ac� se ejecuta el main y se crea la instancia de mundo, como tambien los listeners y la interfaz gr�fica del "laboratorio".
- **LabMenuListener**: Implementaci�n de los menus.
- **MouseListener**: Implementaci�n del mouse.
- **MyWorld**: Contiene los elementos a simular y emula el "mundo".
- **MyWorldView**: Dibuja el "mundo".
- **PhysicsElement**: Define las clases de elementos f�sicos. Ball y FixedHook heredan de este.
- **Simulateable**: Interfaz para clasificar clases simulables.
- **SpringAttachable**: Interfaz para clasificar clases que se pueden conctar a un resorte.
- **Ball**: Define el objeto bola.
- **BallView**: Define el aspecto de una bola para la interf�z gr�fica.
- **FixedHook**: Define el objeto punto fijo.
- **FixedHookView**: Define el aspecto de un punto fijo para la interfaz gr�fica.
- **Spring**: Define el objeto resorte.
- **SpringView**: Define el aspecto de un resorte para la interf�z gr�fica.

Etapas
------------
En la secci�n **Releases** del repositorio **GitHub** se pueden encontrar disponibles todas las etapas propuestas para esta tarea en formatos descargables.
