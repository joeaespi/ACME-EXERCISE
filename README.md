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
### Modelo
Se encarga de contener la estructura de las clases empleados y días laborales lo que nos permitirá contener los datos de cada uno.
### Controlador
Trabajaremos dos: el controlador de archivos que se encargará de la lectura del archivo y llevarlos a un mapa junto al controlador de datos que toma los datos generados por el controlador anterior y en conjunto con los datos registrado nos permite calcular el pago para los empleados registrados.
### Vista
 En mi caso la vista será mi “main” el cual nos permitirá interactuar con el usuario para poder ver los resultados.

## Enfoque aplicado 
Se decidió darle un enfoque en donde el sistema sea abstracto y extensible ya que se busca que el usuario solamente vea el resultado final y no tenga interacción directa o pueda manejar los datos y también al ser extensible permitir agregas más funcionalidades que no fueron indicadas en los requerimientos como que el usuario pueda registrar más empleados y jornadas de trabajo.
Por eso también se descartó el uso de patrones creacionales ya que el sistema se centra en calcular el método de pago y no en la creación de datos.  


## Metodología 
Para llegar a la solución se decidió trabajar en 3 diferentes etapas las cuales fueron:

### Diseño: 
Etapa inicial en la que se buscó armar los diagramas de clases y de secuencia para la solución, se decidió usar el patrón fachada y una estructura MVC para esto se tomó en cuenta los requerimientos indicados.
### Codificación: 
Aquí en base a los diagramas hechos en la etapa anterior se fue armando y estructurando el código solución trabajando con github para guardar los cambios hechos.
### Pruebas y documentación: 
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
En este sistema operativo abrimos una nueva terminal y usamos el siguiente comando:
``` 
git clone  https://github.com/joeaespi/ACME-EXERCISE.git
```

Una vez clonado el repositorio tendremos un archivo .jar el cual podremos ejecutar y el código para la revisión y pruebas de este.

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

2.- Escogemos la opción File -> Open Projects from File System

![](/image/eclipse_opt.png)

3.- Escogemos “Directory” y buscamos la carpeta que contiene nuestro proyecto, se escoge la carpeta del proyecto en cuadro emergente y le damos finish.

![](/image/eclipse_emg.png)

4.- Finalmente podemos revisar a fondo el proyecto

![](/image/eclipse_view.png)


# Exercise
The company ACME offers their employees the flexibility to work the hours they want. They will pay for the hours worked based on the day of the week and time of day, according to the following table:

| Monday - Friday        | Saturday and Sunday         |
| ------------- |:-------------:|
| 00:01 - 09:00 25 USD      | 00:01 - 09:00 30 USD |
| 09:01 - 18:00 15 USD     | 09:01 - 18:00 20 USD      |
| 18:01 - 00:00 20 USD | 18:01 - 00:00 25 USD      |

## Description of solution
![](/image/SequenceDiagram.png)
Al querer determinar el salario en base a las horas de los empleados en la empresa ACME, When wanting to determine the salary in base of the employees hours in the ACME Company, It was sought to make a program in java  in which the user of the company can obtain the total to pay of the registered employees based on the days worked by reading a file which will contain the name and the days worked and based on that and making use of arrangements and maps to be able to show the amount to pay of the employees within the file. 
## Explanation of architecture
![](/image/ClassDiagram.png)
It was decided use a architecture MVC which allow us split the different package for functionality our project:
### Model
It is responsible contain the structure the employees and workday class which will allow us to contain the data of each one.
### Controller
We will work with two controllers: ControllerFile that will be in charge of the read the file and put it in a map and ControllerData that take de information obtain in the previous controller and calculate pay  for employees registered.
### View
In my case the view be my "main" which will allow us to interact with the user and see the results

## Approach applied 
It was decided apply  an approach where the system be abstract and extensible because  we search that the user  only see the final result  and don't interaction or handler the data  and also, being extensible, it allows adding more functionalities that were not indicated in the requirements, such as the user being able to register more employees and working hours. 
That is why the use of creational patterns is null because the system center in calculate pay not in create employees or workday


## Methodology 
To reach the solution it was decided work  in 3 different stages which were : 

### Design : 
Initial stage in which create Class Diagram and Sequence diagram for solución, it was decided to use Facade Design Pattern and MVC structure for this, the indicated requirements were taken into account.
### Coding: 
Using the diagrams created the previous step it was armed and structured the solution code using Github for save the changes.
### Test and documentation: 
Once finished the code we proceed to generate tests, in this case i decided use JUnit and once pass all tests i proceed  document the code and create a file for correct use.

## Instructions
First, we proceed clone the repository with  this link:
```
https://github.com/joeaespi/ACME-EXERCISE.git
```

### For windows
Using the Git Bash console we proceed clone using the next command:
```
git clone  https://github.com/joeaespi/ACME-EXERCISE.git
```
### For Linux
In this operating system open a new terminal and we used the next command:
``` 
git clone  https://github.com/joeaespi/ACME-EXERCISE.git
```

Once the repository is cloned, we will have a jar file which can be executed and the code for his review and test

### For execute the JAR
Inside of the project folder, we open a CMD console and execute the next command:
```
java -jar ACMEv1.jar 
```
At execute the command we can to interact with the system.
![](/image/cmd.png)

### For open the project
The project was developed in Eclipse and in a Java version 14, so in order to we can open it we need Eclipse IDE.

1.-Open eclipse.

2.- We choose option  File -> Open Projects from File System

![](/image/eclipse_opt.png)

3.- We choose “Directory” and search the folder that contain our project, choose the project folder and press finish.

![](/image/eclipse_emg.png)

4.- Finally, we can  check our project

![](/image/eclipse_view.png)