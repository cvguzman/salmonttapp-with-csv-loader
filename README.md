![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Sumativa Semana 5 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Cinthya Guzmán
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Sumativa de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema organizado en paquetes, aplicando principios de encapsulamiento, composición y reutilizzación de clases
Donde se debe construir una aplicación que utilice una estructura de datos propia o una libreria diseñada por mi.
El proyecto fue desarrollado a partir de un caso contextualizado (salmontt), abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱 Estructura general del proyecto

```plaintext

SalmonttApp/
 ├── .idea/
 ├── .mvn/
 ├── src/
 │    └── main/
 │         ├── java/
 │         │    └── org.cvguzman/
 │         │          ├── data/
 │         │          │     ├── GestorDatos.java
 │         │          │     └── RegistroExcel.java
 │         │          ├── model/
 │         │          │     └── Producto.java
 │         │          └── ui/
 │         │                └── Main.java
 │         └── resources/
 ├── target/
 ├── .gitignore
 ├── pom.xml
 ├── README.md
 └── Registros.xlsx

````
El proyecto está ordenado con una estructura sencilla que separa las tareas:

# org.cvguzman.data.

Tiene clases que se ocupan de manejar y acceder a datos.
La clase GestorDatos lee y carga datos desde archivos (como Excel o TXT). Agrupa la lógica sobre el acceso a la información externa.
La clase RegistroExcel en hoja de cálculo Clase base que facilita leer registros de un archivo Excel. Ofrece métodos comunes para trabajar con filas y celdas.

# org.cvguzman.model.

Incluye los clases que representan las partes de SalmonttApp.
La clase Producto: Modelo que habla de un producto del sistema con cosas como nombre, zona de hacer, tipo de planta y cuantas toneladas.

# org.cvguzman.ui.

Tiene la pantalla/interfaz principal del app. La clase Main que corre la aplicación.
El flujo general empieza aquí: c͏argar d͏atos ͏y mostr͏ar en cons͏ola.

# resources
Para͏ pon͏e͏r archivos ͏fuera͏ q͏ue necesita la app, como el arch͏ivo Excel Re͏g͏istros͏.xlsx.z d͏el usuario͏ o lugar donde es͏tá la entrada del͏ ͏programa.

# pom.xml

Define la configuración principal del proyecto Maven, definiendo su nombre, versión, dependencias y plugins.

# Registros.xslx

Contiene los datos utilizados por la aplicación para cargar y procesar información de productos. Es la fuente principal desde donde el programa obtiene los registros para mostrarlos o manipularlos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone 
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** 
**Fecha de entrega:** 24/11/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Sumativa 