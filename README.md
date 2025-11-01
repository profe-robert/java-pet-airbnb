# java-pet-airbnb
Proyecto basico java con poo simulando el compartamiento de un hotel de mascotas.

🐾 Sistema de Registro de Mascotas — AirbnbPet

PGY2121 — Programación Orientada a Objetos (Java)
Experiencia de Aprendizaje 2: Herencia, Polimorfismo y Colecciones

Este proyecto implementa un sistema simple para registrar mascotas que se alojan en la veterinaria AirbnbPet, utilizando conceptos fundamentales de POO en Java, exclusivamente con contenido de la Experiencia 2 (sin interfaz gráfica ni base de datos).

🎯 Objetivo del ejercicio

Aplicar los conceptos principales de POO vistos en clases:

Concepto	        Aplicación en el proyecto
- Clase abstracta	Mascota define comportamiento base
- Herencia	        Perro, Gato y Conejo extienden Mascota
- Polimorfismo	    Método sobrescrito mostrarDatos()
- Sobrescritura	    Cada tipo de mascota imprime sus datos de forma diferente
- Constructores	    Todas las clases tienen constructor vacío y completo
- Colecciones	    Se utiliza ArrayList<Mascota> para almacenar los registros
- Validación	    No se permiten códigos duplicados al registrar mascotas

🧠 Contexto del problema

La veterinaria AirbnbPet requiere un sistema para administrar mascotas alojadas.

Cada mascota tiene:
- Código único
- Nombre
- Peso
- Edad
- Días de alojamiento
- Requiere o no supervisión nocturna

Dependiendo del tipo, además incluye:

Tipo	Atributo único
🐶 Perro	Realiza ejercicio durante el día
🐱 Gato	Pedigrí
🐰 Conejo	Tipo de dieta

📂 Estructura del proyecto
bash```
src/
└── cl.airbnbpet
    ├── modelo/
    │   ├── Mascota.java        (clase abstracta)
    │   ├── Perro.java
    │   ├── Gato.java
    │   └── Conejo.java
    │
    ├── repositorio/
    │   └── RegistroMascotas.java  (manejo de ArrayList)
    │
    └── app/
        └── Main.java             (punto de ejecución)
```

🧬 Explicación de cada componente
Mascota (superclase abstracta)
- Define atributos comunes
- Incluye constructor vacío y completo
- Contiene el método abstracto mostrarDatos()
- Forza a las clases hijas a implementar su propia versión

Perro, Gato, Conejo
- Extienden Mascota
- Cada una agrega un atributo especial
- Sobrescriben mostrarDatos() para mostrar su información

RegistroMascotas
- Utiliza un ArrayList<Mascota>
- Métodos clave:
    - agregar(Mascota m) → valida código único
    - listarTodas() → retorna lista
    - cantidad() → total de mascotas registradas

Main (Clase principal)
- Crea la colección
- Agrega 3 perros, 2 gatos y 2 conejos
- Lista todas las mascotas
- Muestra el total


🚀 Cómo ejecutar

Requisitos
- JDK 8+ (recomendado JDK 17 o JDK 24)
- NetBeans, IntelliJ o VSCode con extensión Java

Ejecución
1. Importa el proyecto o copia el código en tu IDE
2. Ejecuta la clase Main
3. Visualiza la salida en consola

bash```
📌 Salida esperada (ejemplo)
AirbnbPet - Registro de Mascotas (EA2)

Listado de mascotas alojadas:
Perro {codigo='P-001', nombre='Rocky', ...}
Perro {codigo='P-002', nombre='Luna', ...}
Perro {codigo='P-003', nombre='Milo', ...}
Gato {codigo='G-001', nombre='Misha', ...}
Gato {codigo='G-002', nombre='Nina', ...}
Conejo {codigo='C-001', nombre='Snow', ...}
Conejo {codigo='C-002', nombre='Bunny', ...}

Total de mascotas: 7
```