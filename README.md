- 👋 Hi, I’m @MarianFajardo
- 👀 I’m interested in systems and programming, I like to aquarella painting and I try to be better, Un ingniero es de ingenio y recursivo
- 🌱 I’m currently learning to paint in aquarella
- 📫 How to reach me marian.fajardo@gmail.com

<!---
MarianFajardo/MarianFajardo is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
Este repositorio fue creado para las pruebas de ingreso a ML
El codigo entregado esta por niveles

**DESAFIOS**

Nivel 1
Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por Magneto.

Para este nivel tenemos el código creado para Java 1.8, es una sencilla aplicación (Java Project) que tiene la lógica para recibir un String como una sola línea y lo transforma en una matriz para luego analizarlos por las diferentes posiciones y encontrar si tiene secuencias hasta cuatro veces repetidas y determinar si es o no un mutante.

Este proyecto tiene una clase llamada ComparaADN con la logica descrita y adicionalmente con un método main para ser ejecutada

MarianFajardo/Mutantes/

**Clases **

•	Mutantes

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

A continuación se puede revisar como se accede al servicio de manera exitosa y no exitosa (mutante o no mutante )

Humano
 
![Screen Shot 2021-08-09 at 23 19 43](https://user-images.githubusercontent.com/88635536/128808150-8bb610d7-1a50-4dfa-b6e4-d2b61efb1b10.png)

Mutante 
![Screen Shot 2021-08-09 at 23 14 07](https://user-images.githubusercontent.com/88635536/128808198-1613abf5-14f3-485e-adba-f35e91278114.png)




