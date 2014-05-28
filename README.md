Brave Disappointed Burst
========================

Introducción
------------
Segunda tarea correspondiente al ramo "Programación Orientada a Objetos" ELO329.
Este programa realizado en Java simula un laboratorio de física que comprende cuatro objetos: puntos fijos (FixedHook), bolas (Ball), bloques con roce cinético (Block) y resortes (Spring), y simula la interacción entre ellos.
En el archivo documentacion.pdf se puede encontrar una descripcion más detallada del trabajo realizado como también de simulaciones/pruebas realizadas durante cada etapa de esta tarea.

Compilación y Ejecución
------------
El programa posee interfaz gráfica por lo que para correrlo la primera vez hay que utilizar únicamente el comando:

	$ make && make run

Una vez compilado basta con 

	$ make run

para ejecutar la aplicación. Por otro lado para generar los documentos se debe correr el comando:

	$ make doc

el cual dejará los documentos recién generados en la carpeta *docs/* y se pueden navegar desde el archivo *index.html*.

Comentarios
------------	
- Una vez ejecutado el programa se puede apreciar un eje en donde interactúan los distintos elementos y una serie opciones en la barra superior de la ventana.
- Desde el menú "Configuration>insert" se pueden añadir los distintos elementos (bolas, puntos fijos y resortes) con sus propiedades asignadas de manera aleatoria (masa, tamaño, etc).
- También se encuentra acá la opción "My Scenario" que inserta un escenario prestablecido.
- Una vez agregados los elementos estos se pueden reposicionar seleccionandolos con un click y arrastrándolos a la posición deseada.
- En el caso que más de un elemento se encuentre en la misma posición se puede cambiar el elemento seleccionado con la tecla 'n' o 'space'.
- Desde el menú "My World" se pueden iniciar y detener las simulaciones como también modificar los parámetros del simulador.
- Es importante mencionar que durante una simulación no se puede modificar los elementos añadidos.
- Entre los parámetros que se pueden modificar del simulador esta la tasa de refresco de la pantalla como también el delta de tiempo entre cada cálculo de la simulación.

Archivos y breves descripciones
------------
- **PhysicsLab**: Acá se ejecuta el main y se crea la instancia de mundo, como tambien los listeners y la interfaz gráfica del "laboratorio".
- **LabMenuListener**: Implementación de los menus.
- **MouseListener**: Implementación del mouse.
- **MyWorld**: Contiene los elementos a simular y emula el "mundo".
- **MyWorldView**: Dibuja el "mundo".
- **PhysicsElement**: Define las clases de elementos físicos. Ball y FixedHook heredan de este.
- **Simulateable**: Interfaz para clasificar clases simulables.
- **SpringAttachable**: Interfaz para clasificar clases que se pueden conctar a un resorte.
- **Ball**: Define el objeto bola.
- **BallView**: Define el aspecto de una bola para la interfáz gráfica.
- **FixedHook**: Define el objeto punto fijo.
- **FixedHookView**: Define el aspecto de un punto fijo para la interfaz gráfica.
- **Block**: Define el objeto de bloque con roce cinético.
- **BlockView**: Define el aspecto de los bloques.
- **Spring**: Define el objeto resorte.
- **SpringView**: Define el aspecto de un resorte para la interfáz gráfica.

Etapas
------------
En la sección **Releases** del repositorio **GitHub** se pueden encontrar disponibles todas las etapas propuestas para esta tarea en formatos descargables.