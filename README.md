# 🧠 Actividad Formativa 4 - Semana 6 - Desarrollo Orientado a Objetos II


👤 Autor del proyecto

Nombre completo: Daniel Francisco Caballero Salas

Sección: Programación Orientada a Objetos II

Carrera: Analista Programador Computacional

Sede: Campus Virtual


📘 Descripción general del sistema

Este proyecto implementa una interfaz gráfica en Java Swing para gestionar pedidos dentro de la aplicación SpeedFast. La interfaz permite:

- Registrar pedidos ingresando ID, dirección y tipo de pedido.

- Listar pedidos en una tabla con columnas ordenadas (ID, Dirección, Tipo).

- Refrescar la lista para visualizar los pedidos almacenados.

Consideraciones para validar entradas al registrar pedidos:

- El ID debe ser un número entero positivo.

- El ID debe ser único (no repetido en la lista).

- Todos los campos son obligatorios.

- Centrar ventanas en la pantalla al abrirse, para mejorar la experiencia de usuario.


🧱 Estructura general del proyecto

El proyecto está organizado en paquetes siguiendo la convención de dominio invertido (cl.speedfast), lo que facilita la escalabilidad y la claridad del código.

```
src/
├── 📂 data/
│   └── RegistroPedido.java       # Contenedor de pedidos, con métodos para agregar y obtener lista.
│
├── 📂 main/
│   └── Main.java                 # Punto de entrada de la aplicación. Abre la VentanaPrincipal.
│
├── 📂 model/
│   ├── Pedido.java               # Clase que representa un pedido (id, dirección, tipo).
│   └── Repartidor.java           # Clase para futuras extensiones (no usada en la GUI actual).
│
├── 📂 view/
│   ├── 📂 VentanaPrincipal/
│   │   ├── VentanaPrincipal.java   # Menú principal con botones para registrar y listar pedidos.
│   │   └── VentanaPrincipal.form   # Diseño gráfico de la ventana principal.
│   │
│   ├── 📂 VentanaRegistroPedido/
│   │   ├── VentanaRegistroPedido.java  # Formulario para ingresar un nuevo pedido con validaciones.
│   │   └── VentanaRegistroPedido.form  # Diseño gráfico del formulario de registro.
│   │
│   └── 📂 VentanaListaPedidos/
│       ├── VentanaListaPedidos.java   # Tabla que muestra los pedidos registrados con opción de refrescar.
│       └── VentanaListaPedidos.form   # Diseño gráfico de la ventana de lista.

```


⚙️ Instrucciones para clonar y ejecutar el proyecto
Clonar el repositorio desde GitHub:

Opcion 1:
 git clone https://github.com/DCaballero1164/POO2_A4_S6.git

Opcion2:
 Archivo .jar en carpeta en main de GitHub -> Ruta: out/artifacts/Semana_6_jar/Semana_6.jar

Abrir el proyecto en IntelliJ IDEA (utilizar JDK 17 o superior).

Ejecutar el archivo Main.java desde el package ui.

Visualizar los resultados en la consola.

📌 Repositorio GitHub: https://github.com/DCaballero1164/POO2_S2_S5.git 📅 Fecha de entrega: [16/02/2026]