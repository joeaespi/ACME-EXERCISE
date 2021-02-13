# Ejercicio
La empresa ACME ofrece a sus empleados la flexibilidad de trabajar las horas que deseen. Pagarán las horas trabajadas con base en el día de la semana y la hora del día, según la siguiente tabla: 

| Lunes - Viernes        | Sabado y Domingos           |
| ------------- |:-------------:|
| 00:01 - 09:00 25 USD      | 00:01 - 09:00 30 USD |
| 09:01 - 18:00 15 USD     | 09:01 - 18:00 20 USD      |
| 18:01 - 00:00 20 USD | 18:01 - 00:00 25 USD      |

## Descripción de Solución 
![](/image/SequenceDiagram.png)
Al querer determinar el salario en base a las horas de los empleados en la empresa ACME, se buscó realizar un programa en java en el cual el usuario de la empresa pueda obtener el total a pagar de los empleados registrados en base a las jornadas trabajadas mediante la lectura de un archivo el cual contendrá el nombre y las jornadas trabajadas y en base a eso y haciendo uso de arreglos y mapas poder mostrar la cantidad a pagar de los empleados dentro del archivo.
## Explicación de arquitectura 
![](/image/ClassDiagram.png)
Se decidió usar una arquitectura MVC la cual nos permite separar en diferentes paquetes la funcionalidad de nuestro proyecto:
###Modelo
Se encarga de contener la estructura de las clases empleados y días laborales lo que nos permitirá contener los datos de cada uno.
###Controlador
Trabajaremos dos: el controlador de archivos que se encargará de la lectura del archivo y llevarlos a un mapa junto al controlador de datos que toma los datos generados por el controlador anterior y en conjunto con los datos registrado nos permite calcular el pago para los empleados registrados.
###Vista
 En mi caso la vista será mi “main” el cual nos permitirá interactuar con el usuario para poder ver los resultados.

## Enfoque aplicado 
Se decidió darle un enfoque en donde el sistema sea abstracto y extensible ya que se busca que el usuario solamente vea el resultado final y no tenga interacción directa o pueda manejar los datos y también al ser extensible permitir agregas más funcionalidades que no fueron indicadas en los requerimientos como que el usuario pueda registrar más empleados y jornadas de trabajo.
Por eso también se descartó el uso de patrones creacionales ya que el sistema se centra en calcular el método de pago y no en la creación de datos.  


## Metodología 
Para llegar a la solución se decidió trabajar en 3 diferentes etapas las cuales fueron:
###Diseño: 
Etapa inicial en la que se buscó armar los diagramas de clases y de secuencia para la solución, se decidió usar el patrón fachada y una estructura MVC para esto se tomó en cuenta los requerimientos indicados.
###Codificación: 
Aquí en base a los diagramas hechos en la etapa anterior se fue armando y estructurando el código solución trabajando con github para guardar los cambios hechos.
##Pruebas y documentación: 
Una vez terminado el código se procede a generar pruebas, para esto se decidió usar JUnit y una vez pasada las pruebas se procedió a documentar tanto el código como un archivo para su correcto uso.
## Instrucciones
Primero procedemos a clonar el repositorio usando el siguiente enlace:
```
https://github.com/joeaespi/ACME-EXERCISE.git
```

### Para windows
Usando la consola de Git bash procedemos hacer clone haciendo uso del siguiente comando:
```
git clone  https://github.com/joeaespi/ACME-EXERCISE.git
```
### Para Linux
En este sistema operativo abrimos una nueva terminal y usamos el comando:
``` 
git clone  https://github.com/joeaespi/ACME-EXERCISE.git
```

Una vez clonado el repositorio podemos tendremos un archivo .jar con el cual podremos ejecutar el sistema y el código para la revisión y pruebas de este.

### Para ejecutar el JAR
Dentro de la carpeta del proyecto, abrimos una consola CMD y ejecutamos le siguiente comando:
```
java -jar ACMEv1.jar 
```
Al ejecutar el comando podremos interactuar con el sistema.
![](/image/cmd.png)

### Para Abrir el proyecto
El proyecto se desarrolló en Eclipse y una versión de Java 14, así que para poder abrirlo necesitaremos IDE de Eclipse.

1.-Abrimos eclipse.

2.- Escogemos en File -> Open Projects from File System

![](/image/eclipse_opt.png)

3.- Escogemos “Directory” y buscamos la carpeta que contiene nuestro proyecto escoge la carpeta del proyecto en cuadro emergente y le damos finish.

![](/image/eclipse_emg.png)

4.- Finalmente podemos revisar a fondo el proyecto

![](/image/eclipse_view.png)