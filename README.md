# Gestión de Estudiantes con Ordenamiento Personalizado en Java

Este proyecto tiene como objetivo practicar el uso de colecciones, `Comparator`, y `Comparable` en Java, dentro del contexto de la Programación Orientada a Objetos (POO). En el ejercicio, se implementa una aplicación para gestionar una lista de estudiantes, permitiendo ordenarlos por diferentes criterios (nombre, edad, promedio de notas).

## Descripción del Proyecto

La aplicación permite realizar las siguientes operaciones:

- Crear y gestionar una lista de estudiantes.
- Ordenar la lista de estudiantes por distintos criterios:
- **Por nombre**: Orden alfabético ascendente.
- **Por edad**: Orden de menor a mayor edad.
- **Por promedio de notas**: Orden de mayor a menor promedio.
- Mostrar la lista de estudiantes ordenada según el criterio elegido.

El proyecto hace uso de las interfaces de Java `Comparable` y `Comparator` para implementar el ordenamiento personalizado y utiliza colecciones como `ArrayList`, `Set`, y `Map` para almacenar y organizar los datos.

## Tecnologías Utilizadas

- **Java 8+**: Lenguaje de programación utilizado.
- **Colecciones de Java**: Se utiliza `ArrayList` para almacenar los estudiantes, y se podría usar un `HashSet` o `TreeSet` si se desea evitar duplicados o implementar otro tipo de ordenamiento.
- **Interfaces `Comparable` y `Comparator`**: Para implementar el ordenamiento de estudiantes.
- **IDE recomendada**: IntelliJ IDEA, Eclipse, o cualquier editor de texto para programar en Java.

## Funcionalidades

- **Gestión de Estudiantes**:
- Los estudiantes tienen atributos como `nombre`, `edad`, y `promedioNotas`.

- **Ordenamiento**:
- **Por Nombre**: Orden alfabético ascendente usando `Comparable`.
- **Por Edad**: Orden de menor a mayor edad utilizando `Comparator`.
- **Por Promedio**: Orden de mayor a menor promedio de notas usando un `Comparator`.

## Instrucciones para Ejecutar el Proyecto

1. **Clonar el repositorio**:
  ```bash
  git clone https://github.com/tu-usuario/gestion-estudiantes-java.git
  ```

2. **Acceder al directorio del proyecto**:
  ```bash
  cd gestion-estudiantes-java
  ```

3. **Compilar y ejecutar**:
  Si estás usando Maven o Gradle, asegúrate de tenerlo instalado y ejecuta el siguiente comando para compilar:
  
  - Para Maven:
    ```bash
    mvn clean install
    mvn exec:java
    ```

  - Para Gradle:
    ```bash
    gradle build
    gradle run
    ```

4. **Ejecución en tu IDE**:
  - Si usas un IDE como IntelliJ o Eclipse, simplemente abre el proyecto, compílalo y ejecútalo como una aplicación Java.

## Estructura del Proyecto

El proyecto sigue la siguiente estructura básica:

gestion-estudiantes-java/ │ ├── src/ │ ├── Estudiante.java # Clase que representa a un estudiante. │ ├── Main.java # Clase principal para ejecutar el programa. │ ├── OrdenarPorNombre.java # Implementación de Comparator para ordenar por nombre. │ ├── OrdenarPorEdad.java # Implementación de Comparator para ordenar por edad. │ ├── OrdenarPorPromedio.java # Implementación de Comparator para ordenar por promedio. │ ├── pom.xml # Archivo de configuración para Maven (si usas Maven). └── build.gradle # Archivo de configuración para Gradle (si usas Gradle).

csharp
Copiar código

### Explicación de Clases:

- **Estudiante.java**: Representa a un estudiante con atributos como nombre, edad y promedio de notas. Implementa la interfaz `Comparable` para permitir el ordenamiento por nombre.

- **OrdenarPorNombre.java**: Implementa un `Comparator` para ordenar estudiantes por nombre.

- **OrdenarPorEdad.java**: Implementa un `Comparator` para ordenar estudiantes por edad.

- **OrdenarPorPromedio.java**: Implementa un `Comparator` para ordenar estudiantes por promedio de notas.

- **Main.java**: Clase principal que ejecuta el programa, gestiona la lista de estudiantes y permite ordenar la lista según el criterio elegido por el usuario.

## Ejemplo de Uso

Aquí tienes un ejemplo de cómo podría lucir la clase `Estudiante` y los diferentes `Comparator`:

```java
import java.util.*;

public class Estudiante implements Comparable<Estudiante> {
  private String nombre;
  private int edad;
  private double promedioNotas;

  // Constructor, getters y setters
  public Estudiante(String nombre, int edad, double promedioNotas) {
      this.nombre = nombre;
      this.edad = edad;
      this.promedioNotas = promedioNotas;
  }

  @Override
  public int compareTo(Estudiante otro) {
      return this.nombre.compareTo(otro.nombre);  // Orden por nombre alfabéticamente
  }

  @Override
  public String toString() {
      return nombre + " (" + edad + " años, Promedio: " + promedioNotas + ")";
  }

  // Getters y Setters
}

class OrdenarPorEdad implements Comparator<Estudiante> {
  @Override
  public int compare(Estudiante e1, Estudiante e2) {
      return Integer.compare(e1.getEdad(), e2.getEdad()); // Ordenar por edad (ascendente)
  }
}

class OrdenarPorPromedio implements Comparator<Estudiante> {
  @Override
  public int compare(Estudiante e1, Estudiante e2) {
      return Double.compare(e2.getPromedioNotas(), e1.getPromedioNotas()); // Ordenar por promedio (descendente)
  }
}

public class Main {
  public static void main(String[] args) {
      List<Estudiante> estudiantes = new ArrayList<>();
      estudiantes.add(new Estudiante("Juan", 20, 7.5));
      estudiantes.add(new Estudiante("Ana", 22, 8.9));
      estudiantes.add(new Estudiante("Carlos", 19, 6.5));

      // Ordenar por nombre
      Collections.sort(estudiantes);
      System.out.println("Ordenado por nombre: " + estudiantes);

      // Ordenar por edad
      Collections.sort(estudiantes, new OrdenarPorEdad());
      System.out.println("Ordenado por edad: " + estudiantes);

      // Ordenar por promedio
      Collections.sort(estudiantes, new OrdenarPorPromedio());
      System.out.println("Ordenado por promedio: " + estudiantes);
  }
}
Resultado Esperado
Si ejecutas el código de ejemplo anterior, verás que la lista de estudiantes se ordena según los criterios establecidos:

Primero por nombre alfabéticamente.
Luego por edad de menor a mayor.
Finalmente, por el promedio de notas de mayor a menor.
Contribución
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama para agregar una nueva funcionalidad o corregir un error:
bash
Copiar código
git checkout -b feature/nueva-funcionalidad
Realiza tus cambios y haz commits adecuados.
Abre un pull request describiendo los cambios realizados.
Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
