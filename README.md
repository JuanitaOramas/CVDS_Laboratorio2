# CVDS_Laboratorio2


# LABORATORIO #2

## PATTERNS - FACTORY 

### La herramienta Maven


**Cuál es su mayor utilidad**

**Fases de maven**
**Maven** se utiliza en la gestión y construcción de software.  Desde la etapa en que se prueba que el codido es correcto hasta el despliegue. Posee la capacidad de realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado. Es decir, hace posible la creación de software con dependencias incluidas dentro de la estructura del JAR. Sin embargo, la característica más importante de Maven es su capacidad de trabajar en red.

**Ciclo de vida de la construcción**
-   El ciclo de vida default, que gestiona la construcción y despliegue del proyecto.
-   El ciclo de vida clean, que gestiona la limpieza del directorio del proyecto. Es decir, se encarga de eliminar todos los archivos generados en el proceso de construcción y despliegue.
-   El ciclo de vida site, que gestiona la creación de la documentación del proyecto.

**Para qué sirven los plugins**
En Maven, los plugins tienen metas. Las metas ejecutan tareas de construcción como: compilar el proyecto, empaquetarlo e implementarlo en un servidor local o remoto. Esas actividades están fuertemente relacionadas perfectamente para construir fases del ciclo de vida. Así pues cada plugin puede disponer de varias tareas a ejecutar.

**Qué es y para qué sirve el repositorio central de maven**
El repositorio central de Maven es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso. Para cualquier biblioteca involucrada en el proyecto, Maven primero busca en la carpeta .m2 del Repositorio local, y si no encuentra la biblioteca necesaria, busca en el Repositorio central y carga la biblioteca en el repositorio local.

### COMPILAR Y EJECUTAR
**Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.**

Un Paquete es un objeto PL/Sql que agrupa lógicamente otros objetos PL/Sql relacionados entre sí, encapsulándolos y convirtiéndolos en una unidad dentro de la base de datos.
Similar a compilar pero es generar un empaquetado **que se pueda “reutilizar”**
![Captura de pantalla 2022-08-29 183612](https://user-images.githubusercontent.com/77862004/187317038-718eee38-4e61-4b39-a978-d764d58de998.png)
ref: arquitecturajava.com

-   **mvn package**: Es el comando de *empaquetado* del proyecto maven. Para el proyecto java, ejecute el paquete y márquelo como un paquete jar, y para proyecto web es un paquete war.
    
-   **mvn compile**: Es el comando de *compilación* del proyecto maven, la función essrc/main/java Los archivos siguientes se compilan en archivos de clase y se envían al directorio de destino.
    
-   **mvn test**: Es el comando de *prueba* mvn test del proyecto maven, que se ejecutarásrc/test/java AbajoClase de prueba unitaria.
    
-   **mvn clean**: Es el comando de *limpieza* del proyecto maven. Ejecutar clean eliminará el directorio y el contenido de destino.
    
-   **mvn install**: Es el comando de *instalación* del proyecto maven. La ejecución de install marcará maven en un paquete jar o paquete war y lo publicará en el almacén local. 
-   **mvn deploy**: Subir al almacén remoto
-   **mvn site**: Para ejecutar el ciclo de vida de construcción del sitio

**Busque cómo ejecutar desde línea de comandos, un proyecto maven y veriﬁque la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html**
~~~
mvn exec:java -DexecmainClass="clase_principal_del_proyecto" -Dexecargs="argumentos_necesarios"
~~~
### HACER EL ESQUELETO DE LA APLICACION

### BIBLIOGRAFIA
http://panamahitek.com/que-es-maven-y-para-que-se-utiliza/
https://1984.lsi.us.es/wiki-egc/index.php/Primeros_pasos_con_Maven#:~:text=Los%20tres%20ciclos%20de%20vida,proceso%20de%20construcci%C3%B3n%20y%20despliegue.
https://geekflare.com/es/apache-maven-for-beginners/
https://www.arquitecturajava.com/que-es-un-java-maven-artifact/

