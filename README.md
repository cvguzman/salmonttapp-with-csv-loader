![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Formativa Semana 6 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Cinthya Guzmán
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Sumativa de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema organizado en paquetes, aplicando principios de encapsulamiento, composición  herencia y reutilizzación de clases
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
 |         |          |     └── GestorUnidades.java
 │         │          ├── model/
 │         │          │     └── Producto.java
 |         |          |     └── CentroCultivo.java
 |         |          |     └── PlantaProceso.java
 |         |          |     └── UnidadOperativa.java
 │         │          └── ui/
 │         │                └── Main.java  
 │         │                └── Vista.java
 │         └── resources/
 |                          └── centros.txt
 ├── target/
 ├── .gitignore
 ├── pom.xml
 ├── README.md
 └── Registros.xlsx

````
El proyecto está ordenado con una estructura sencilla que separa las tareas:

# org.cvguzman.data.

Tiene clases que se ocupan de manejar y acceder a datos.

La clase GestorDatos lee y carga datos desde archivos .txt. Agrupa la lógica sobre el acceso a la información externa.

La clase RegistroExcel en hoja de cálculo facilita leer registros de un archivo .xlsx. Ofrece métodos comunes para trabajar con filas y celdas.

La clase Gestor unidades se encarga de crear y entregar objetos de las subclases, cumple el rol de proovedor de datos, 
además de implementar la interfaz mostrarResumen() a clases hijas

# org.cvguzman.model.

Incluye los clases que representan las partes de SalmonttApp.

La clase Producto: Modelo que habla de un producto del sistema con cosas como nombre, zona de hacer, tipo de planta y cuantas toneladas.


La clase CentroCultivo agrega atributos propios del cultivo en mar: capacidadTonelada.
Además de usar la interfaz mostrarResumen()

La clase PlantaProceso modela una planta de procesamiento con capacidad diaria de producción.
Además de usar la interfaz mostrarResumen()

# org.cvguzman.ui.

Tiene la clase principal del app. La clase Main que corre la aplicación.
El flujo general empieza aquí: c͏argar d͏atos ͏y mostr͏ar en cons͏ola:

- Datos en el archivo centros.txt
- Filtro de datos de archivo centros.txt
- Datos en el archivo Registros.xlsx
- Filtro de datod archivo Registros.xlsx
- Herencia de la superclase UnidadOperativa a subclases CentroCultivos y PlantaProceso.
- Muestra implementación de  usar la interfaz mostrarResumen()

Además contiene la clase Vista, del cual se ejecuta la interfaz gráfica básica de SalmonttApp 
utilizando framework Swing


# resources
Para͏ pon͏e͏r archivos ͏fuera͏ q͏ue necesita la app, como el arch͏ivo Excel Re͏g͏istros͏.xlsx d͏el usuario͏ o lugar donde es͏tá la entrada del͏ ͏programa.

# pom.xml

Define la configuración principal del proyecto Maven, definiendo su nombre, versión, dependencias y plugins.

# Registros.xslx

Contiene los datos utilizados por la aplicación para cargar y procesar información de productos. Es la fuente principal desde donde el programa obtiene los registros para mostrarlos o manipularlos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/cvguzman/salmonttapp-with-csv-loader.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** https://github.com/cvguzman/salmonttapp-with-csv-loader
**Fecha de entrega:** 15/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |  