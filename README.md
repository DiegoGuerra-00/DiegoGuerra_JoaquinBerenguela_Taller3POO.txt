Diego Guerra   rut 21686594-4  usuario github : DiegoGuerra-00
Joaquin Benerguela rut 21708988-3 usuario github : joaquinberenguela-ux

Treyo es un sistema desarrollado en Java que permite gestionar usuarios, proyectos y tareas mediante una arquitectura basada en patrones de diseño, implementa funcionalidades de creación, manejo y procesamiento de datos utilizando un menú y la lectura de archivos
El diseño sigue uso de interfaces y patrones  de diseño (Strategy, Visitor, Factory y Singleton).
Para singleteon la clase encargada de manejar la lógica del programa (SistemaImpl) se implementa como un Singleton, esto permite manejar una sola fuente
Para el Visitor se desarollo una interfaz y sus implementaciones para recorrer sobre los objetos
Para Strategy tambien se uso una interfaz, junto con clases concretas que implementan distintas estrategias utilizadas dentro del sistema
Para el Factory se le dio un uso para la cracion de instancias, para que esto sea mas faicil la extensión del sistema
Clases principales : Usuario,Tarea,Proyecto
Se usan los patrones de diseño antes mencionado y se les implementan ciertos metodos para cada patron
La clase SistemaIMPL se usa como un centro logico para todo el progama, siendo utilizada dentro del main
Dentro del main se despliega todo el menu y se implementan metodos para acceder a los archivos con la informacion de Usuario,Tarea y Proyecto, se abren los archivos y se carga la informacion, guardandola dentro de listas en el SistemaIMPL. Tambien en el main, al desplegar el menu, se accede a todas las acciones requerridas en el taller.
