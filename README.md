# Lenguajes de Programación

Este repositorio se relaciona con la evolución de los lenguajes de programación, las diferencias entre ellos, los estilos de programación más importantes y cómo Java se posiciona dentro de este ecosistema global. Explora desde lenguajes populares tradicionales como C y C++, hasta lenguajes interpretados como Python y Matlab, y estilos como la programación orientada a objetos y la programación funcional.

Este repositorio busca ofrecer una visión amplia y contextualizada sobre cómo se programan los sistemas modernos y por qué los lenguajes existen en plural, tomando como base el ejemplo conceptual de la Torre de Babel.


## Contenido del repositorio
 
Lenguajes Populares

Incluye:

Diferencias entre:

Compilación vs interpretación

Manejo de memoria manual (C/C++) vs recolección de basura (Java)

Tipado estático vs dinámico

Uso de bibliotecas y estructuras de datos

Ventajas y desventajas de cada lenguaje según su propósito.

Java en Contexto

Amplia disponibilidad y madurez del lenguaje.

Ecosistema robusto: millones de desarrolladores y miles de millones de dispositivos.

Abstracciones modernas y bibliotecas extensas.

Comparación de Java frente a C, C++, Python y Matlab en parámetros como:

Bibliotecas modernas

Comprobación de tipos

Facilidad de uso

Propósito y orientación del lenguaje

Además, explica por qué incluso con Java como base, conviene aprender nuevos lenguajes a lo largo de la carrera profesional.

Programación Orientada a Objetos

El software como simulación del mundo real.

Objetos con propiedades y comportamiento.

Encapsulación y ocultamiento de información.

Reutilización mediante bibliotecas.

Especificación estricta del comportamiento y verificación automática.

Historia de la OOP desde Simula, Smalltalk y CLU.

Comprobación de Tipos

Conceptos clave sobre el tipado estático (Java, C, C++) y tipado dinámico (Python, Matlab):

¿Cuándo se detectan los errores de tipo?

Programación Funcional

Funciones como ciudadanos de primera clase.

Ausencia de efectos secundarios.

Modelo de ejecución perezosa o bajo demanda.

Uso de map, reduce y composición funcional.

Concurrencia facilitada por la naturaleza funcional.

Ejemplos en Python y conexiones teóricas con lenguajes como Scheme y Lisp.

## Objetivo del repositorio

Comprender las diferencias entre lenguajes compilados e interpretados.

Identificar cuándo conviene usar C, C++, Java, Python o Matlab.

Estilos de programación:

Procedimental

Orientado a objetos

Funcional

## Ejecucion 

Necesitas tener instalado Java JDK 8 o superior.

Puedes comprobarlo con:
java -version
javac -version

Ubícate en la carpeta src/

Ejemplo:
cd src

Compila los programas

Los dos archivos dependen entre sí. Compílalos juntos:
javac Bar.java BarChartRacer.java

Esto generará archivos .class en la misma carpeta.

Ejecuta el programa principal

El programa principal es:

BarChartRacer.java

Para ejecutarlo:
java BarChartRacer

¿Requiere argumentos?

La mayoría de implementaciones de BarChartRacer utilizan un archivo de datos .txt donde vienen las barras para cada cuadro de la animación.

Ejemplo típico:
java BarChartRacer data.txt

Si tu archivo BarChartRacer.java requiere argumentos, verás algo así dentro de su código:

public static void main(String[] args) {
    String filename = args[0];
}


# Autor

Jonnathan Rosero Segura
