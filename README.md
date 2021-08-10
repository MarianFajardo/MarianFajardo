- 👋 Hi, I’m @MarianFajardo
- 👀 I’m interested in systems and programming, I like to paint in aquarella and I try to be better every day, Un ingniero es de ingenio y recursivo
- 🌱 I’m currently learning to paint in aquarella
- 📫 How to reach me marian.fajardo@gmail.com

<!---
MarianFajardo/MarianFajardo is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
Este repositorio fue creado para las pruebas de ingreso a ML
El codigo entregado esta por niveles

**Software usado:**
•	Java 1.8
•	Spring Boot
•	SpringToolSuite 4
•	Postman
•	AWS Elastic Beanstalk (versión libre)


**DESAFIOS**

Nivel 1

Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por Magneto.

Para este nivel tenemos el código creado para Java 1.8, es una sencilla aplicación (Java Project) que tiene la lógica para recibir un String como una sola línea y lo transforma en una matriz para luego analizarlos por las diferentes posiciones y encontrar si tiene secuencias hasta cuatro veces repetidas y determinar si es o no un mutante.

Este proyecto tiene una clase llamada ComparaADN con la logica descrita y adicionalmente con un método main para ser ejecutada

**Clases **

•	Mutantes

Esto se encuentra en el paquete de Mutantes y adicionlamente se incluye un jar para que pueda ser ejecutado con la instrucción desde la consola de comandos o haciendo doble clic desde un PC con Windows y JRE instaladas 

#java -jar mutantes.jar

Nivel 2

Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
Amazon AWS, etc), crear el servicio “/mutant/” en donde se pueda detectar si un humano es
mutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el
siguiente formato:
POST → /mutant/
{
“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un
403-Forbidden

Para este nivel cree una aplicación web en Spring Boot de manera que recibe una cadena de caracteres a nivel del Body para la petición en POST y devuelve la respuesta HTTP según corresponda.

Se tomo como ejemplo la aplicación de servicios REST de ejemplo de Spring, se reutilizo el código del nivel anterior sin embargo se creo una clase java que implementa una interfaz para hacer mas fácil y organizado el paso de información manteniendo los principios de la programación orientada a objetos

La aplicación esta alojada en AWS en un servicio llamado AWS Elastic Beanstalk el cual proporciona facilidad para cargar aplicaciones web con solo desplegarlas, de manera que AWS realiza el monitoreo y demás temas de aprovisionamiento como adminsitrar de manera automática la implementación, desde el aprovisionamiento de la capacidad, el equilibrio de carga y el escalado automático hasta la monitorización del estado de la aplicación.

Para efectos de la prueba es una manera sencilla de acceder al host de la aplicación y publicación del servicio, por medio de la siguiente URL
 http://imutant-env.eba-pksfigp4.us-east-2.elasticbeanstalk.com/mutant
 
He implementado el método GET (para veriricacion de la funcionalidad facilmente y no tener lios al desplegar en el AWS) y el método POST (como especifica el ejercicio)![image](https://user-images.githubusercontent.com/88635536/128810374-da40c612-fba6-42c0-b9e0-609ab378f3d6.png)

Esta aplicación se encuentra en el paquete ml-mutant-service

A continuación se puede revisar como se accede al servicio de manera exitosa y no exitosa (mutante o no mutante )

Humano
 
![Screen Shot 2021-08-09 at 23 19 43](https://user-images.githubusercontent.com/88635536/128808150-8bb610d7-1a50-4dfa-b6e4-d2b61efb1b10.png)

Mutante 
![Screen Shot 2021-08-09 at 23 14 07](https://user-images.githubusercontent.com/88635536/128808198-1613abf5-14f3-485e-adba-f35e91278114.png)



**Nivel 3**

Anexar una base de datos, la cual guarde los ADN’s verificados con la API.
Solo 1 registro por ADN. Exponer un servicio extra “/stats” que devuelva un Json con las estadísticas de las verificaciones de ADN: {“count_mutant_dna”:40, “count_human_dna”:100: “ratio”:0.4} 
Tener en cuenta que la API puede recibir fluctuaciones agresivas de tráfico (Entre 100 y 1 millón de peticiones por segundo).

Test-Automáticos, Code coverage > 80%.


Este nivel no ha sido completado sin embargo es posible diseñar este desafío de una manera que la aplicación web se conecte a la BD por medio del servidor de aplicaciones en donde este tenga creado un pool de conexiones a esta para que de esta forma se administre de manera eficiente las conexiones a la BD, es importante tener en cuenta que adicionar el método de conteo de accesos no es complicado a nivel de código pero que es necesario tener una infraestructura robusta para el tema de las fluctuaciones tan grandes pues un millones de peticiones en un segundo es considerado un ataque de denegación de servicios, es decir que las balanceadores que estén de frente deben tener la posibilidad de bloquear la IP de la que se generan este tipo de peticiones, un millón de peticiones en un segundo es posible simularlo con una herramienta como jmeter de manera sencilla para el método GET sin embargo es posible que la plataforma bloquee este tipo de peticiones y se debe tener presente que la arquitectura debe proveer la capacidad (almacenamiento, disco, procesador y memoria) para responder a esta fluctuación tan alta en tan poco tiempo. 

La aplicación a nivel de código no requiere paralelismo pues siendo una aplicación REST en donde es de modo síncrono es innecesario sin embargo es importante tener en cuenta que depende del requerimiento funcional de la aplicación la definición de la arquitectura lógica y física, pues estas deben soportar el trafico requerido y tener un rendimiento optimo para el usuario final así como también debe ser escalable en el tiempo y por lo menos al salir a producción tenga una capacidad de crecimiento a 5 años con lo diseñado. 

Para finalizar es un gusto estar con ustedes cumpliendo estos desafios y sientanse en libertad de progeuntar cualquier detalle de las aplicaciones, su diseño, implementación y la parte de infraestructura.


![image](https://user-images.githubusercontent.com/88635536/128810407-47f8076c-96c8-4cda-b2b5-7a05bb0ca9d8.png)


