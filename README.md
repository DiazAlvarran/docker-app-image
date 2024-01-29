# Calculadora Web

Este proyecto es una web que realiza operaciones básicas de aritmética con dos números

- Sumar: /sumar/12/4
- Restar: /restar/12/4
- Multiplicar: /multiplicar/12/4
- Dividir: /dividir/12/4

## Pre-Requisitos
1. Java 8
2. Maven

## Ejecutar servicio API RESTful de manera local

 1. Clonar el repositorio de manera local.

 2. Ubicarse en la carpeta raíz del proyecto clonado y ejecutar un `clean` e `install` con maven, ya sea por comandos o desde un IDE.

 Por comandos sería:

```
mvn clean install
```

 3. Inicializar el servicio, esto varía según el IDE a utilizar. Por comandos de maven sería:
 
```
mvn spring-boot:run
```

**Nota: El servicio iniciará en el puerto 8080.**

**Nota: También se puede obtener una imagen desde Docker Hub con el comando `docker pull jorgevda/java-calculadora:1.0`**

## Ejecución de Pruebas

Pegar en el navegador las siguientes URLs para ver los resultados:

- `localhost:8080/sumar/12/4`
- `localhost:8080/restar/12/4`
- `localhost:8080/multiplicar/12/4`
- `localhost:8080/dividir/12/4`

