# Ejecicio
La empresa ACME ofrece a sus empleados la flexibilidad de trabajar las horas que deseen. Pagarán las horas trabajadas con base en el día de la semana y la hora del día, según la siguiente tabla: 

|Lunes - Viernes|
|00:01 - 09:00 25 USD|
|09:01 - 18:00 15 USD|
|18:01 - 00:00 20 USD|
|Sabado y Domingos|
|00:01 - 09:00 30 USD|
|09:01 - 18:00 20 USD|
|18:01 - 00:00 25 USD|

## Descripción de Solución 
![](/image/SequenceDiagram.png)
Al necesitar saber el salario en base a las horas de los empleados en la empresa ACME, se busco realizar un programa en java en el cual el usuario de la empresa pueda escoger la opción para calcular el pago de los empleados registrados, el cual se hace por medio de un archivo el cual el sistema de encarga de leerlo internamente y devolvernos lo pagos de sus empleados acorde a sus jornadas de trabajos.

## Explicación de arquitectura 
![](/image/ClassDiagram.png)
Se decidió usar una estructura MVC la cual nos permite separar en paquetes los cuales son:
###Modelo
Que se encarga de contener la clase empleados y días laborales y poder usarlo para registrarlos.
###Controlador
Aquí encontraremos dos: controlador de archivos que se encarga de la lectura del archivo y llevarlos a un mapa y controlador de datos que toma los datos generados por el controlador anterior y en conjunto con los datos registrado nos permite calcular el pago para los empleados registrados.
###Vista
 En mi caso mi vista será mi “main” el cual nos permitirá interactuar con el usuario para poder ver resultado de los pagos.


## Enfoque aplicado 
Se decidió darle un enfoque en cual el sistema sea abstracto y extensible ya que se busca que el usuario solamente veas el resultado final y no tenga interacción directo con el manejo de los datos y también al ser extensible permitir agregas más funcionalidades que no fueron indicado en los requerimientos como que el usuario pueda registrar mas empleados y jornadas de trabajo.
Por eso también se descarto el uso de patrones creacionales ya que el sistema se centra en el calcular el método de pago y no en la creación de datos. 

## Metodología 
Se decidió darle un enfoque en cual el sistema sea abstracto y extensible ya que se busca que el usuario solamente veas el resultado final y no tenga interacción directo con el manejo de los datos y también al ser extensible permitir agregas más funcionalidades que no fueron indicado en los requerimientos como que el usuario pueda registrar mas empleados y jornadas de trabajo.
Por eso también se descarto el uso de patrones creacionales ya que el sistema se centra en el calcular el método de pago y no en la creación de datos. 

Para llegar a la solución se decidió trabajar por 3 diferentes etapas las cuales fueron:
###Diseño: 
En esta etapa inicial se busco armar los diagramas de clases y de secuencia para la solución, en el cual se decidió usar el patrón fachada y una estructura MVC para esto se tomó en cuenta los requerimientos indicados.
###Codificación: 
En esta etapa en base a los diagramas hechos en la etapa anterior se fue armando y estructurando el código solución trabajando con github para guardar los cambios hechos.
##Pruebas y documentación: 
Una vez terminado el código se procede a generar pruebas, para esto se decidió usar JUnit y una vez pasada las pruebas se procedió a documentar tanto el código como un archivo para su correcto uso.

## Instrucciones
Primero procedemos a clonar el repositorio usando el siguiente enlace:
https://github.com/joeaespi/ACME-EXERCISE.git

### Para windows
Usando la consola de Git bash procedemos hacer clone haciendo uso del siguiente comando
git clone  https://github.com/joeaespi/ACME-EXERCISE.git

### Para Linux
En este sistema operativo abrimos una nueva terminal y usamos el comando 
git clone  https://github.com/joeaespi/ACME-EXERCISE.git


Una vez clonado el repositorio podemos tendremos un archivo .jar con el cual podremos ejecutar el sistema y el código para la revisión y pruebas de este.

### Para ejecutar el JAR
Dentro de la carpeta del proyecto, abrimos una consola CMD y ejecutamos le siguiente comando
java -jar ACMEv1.jar 
Al ejecutar el comando podremos interactuar con el sistema.
![](/image/cmd.png)

### Para Abrir el proyecto
El proyecto se desarrolló en Eclipse y una versión de Java 14, así que para poder abrirlo necesitaremos IDE de Eclipse.
```
1.-Abrimos eclipse.
2.- Escogemos en File -> Open Projects from File System
![](/image/eclipse_opt.png)
3.- Escogemos “Directory” y buscamos la carpeta que contiene nuestro proyecto escoge la carpeta del proyecto en cuadro emergente y le damos finish.
![](/image/eclipse_emg.png)
4.- Finalmente podemos revisar a fondo el proyecto
![](/image/eclipse_view.png)
```