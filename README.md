<p align="left">
  <img src="https://img.shields.io/badge/Java-FF6F00?style=for-the-badge&logo=openjdk&logoColor=white"/>

  <img src="https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/dcanosu/Pokemon/main/.github/badges/java.json&style=for-the-badge"/>

  <img src="https://img.shields.io/github/last-commit/dcanosu/Pokemon?style=for-the-badge"/>

  <img src="https://img-shields.io/badge/Proyecto-Final-4c1?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Completado-green?style=for-the-badge"/> 
  </p>

# 🏆 Proyecto Final: Liga Pokémon con Arreglos y Algoritmos Básicos

**Curso:** Lógica de Programación y Laboratorio
**Departamento:** Sistemas de Información

Este proyecto simula un sistema de gestión para la Liga Pokémon, utilizando arreglos estáticos de objetos para almacenar datos y aplicando algoritmos clásicos de búsqueda y ordenamiento implementados manualmente.

## 🔑 Tecnología Principal

| Tecnología | Versión | 
 | ----- | ----- | 
| Java  | 8+ | 

## 🎯 Objetivo de Aprendizaje

El estudiante implementa un sistema básico, utilizando arreglos estáticos de objetos y algoritmos clásicos de búsqueda y ordenamiento, aplicando estructuras de control iterativas y condicionales para resolver problemas computacionales de forma correcta, eficiente y documentada.

## 📝 Requerimientos del Sistema

### I. Gestión de Pokémon

* **Estructura de Datos:** Los datos se almacenan en un arreglo estático con un máximo de **40 Pokémon**.

* **Atributos:** Cada Pokémon debe tener `id`, `nombre`, `tipo` (Agua, Fuego, Planta, Eléctrico), `ataque`, `defensa`, y `entrenador`.

* **Generación de Stats:** Los valores de `ataque` y `defensa` (rango $1–100$) se asignan de forma **aleatoria** en el momento de la creación del Pokémon.

### II. Algoritmos de Búsqueda y Ordenamiento

**Restricción Crucial:** Todos los algoritmos deben implementarse manualmente, **sin usar librerías de Java**, y deben ser **iterativos** (no se permite recursión).

#### Búsqueda

* **Búsqueda Lineal:** Implementada para buscar Pokémon por **nombre**.

* **Búsqueda Binaria:** Implementada para buscar Pokémon por **ID** (requiere que el arreglo esté previamente ordenado por ID).

#### Ordenamiento

* **Ordenamiento por Selección (Selection Sort):** Utilizado para ordenar el arreglo de Pokémon por **ataque**.

* **Ordenamiento por Inserción (Insertion Sort):** Utilizado para ordenar por **defensa** o **ID**. (Actualmente, el ID usa Bubble Sort, pero se recomienda cambiar a Inserción para cumplir este punto).

### III. Simulación de Batallas Pokémon

* **Formato:** Batallas 1 contra 1.

* **HP Inicial:** Cada Pokémon inicia con **100 HP** por batalla.

* **Mecánica:** El turno es alternado hasta que el HP de uno de los Pokémon llegue a 0 o menos.

* **Fórmula de Daño (mínimo de 1 punto):** $$
    \text{daño} = \lfloor 50 \times \frac{\text{ataque}}{\text{defensa}} \times \text{efectividad} \rceil
    $$
    *(Donde* $\lfloor \dots \rceil$ *significa redondear al entero más cercano)*

* **Efectividades:**

    * Agua > Fuergo ($\times 2$); Agua < Planta ($\times 0.5$).

    * Fuego > Planta ($\times 2$); Fuego < Agua ($\times 0.5$).

    * Planta > Agua ($\times 2$); Planta < Fuego ($\times 0.5$).

    * Eléctrico > Agua ($\times 2$); neutral contra los demás.

### IV. Campeonato Simple (Round Robin)

* **Participantes:** Simulación de un torneo "todos contra todos" entre 3 o 4 entrenadores.

* **Equipos:** Cada entrenador tiene un equipo de hasta **6 Pokémon**.

* **Registro de Resultados:** Se deben registrar y presentar: Partidas Jugadas (PJ), Partidas Ganadas (PG), Partidas Perdidas (PP), y el porcentaje de victorias.

* **Salida:** Al finalizar, se presenta una **tabla de posiciones** completa.

## ⚙️ Estructura de Entradas y Salidas

| Categoría | Entradas (Input) | Salidas (Output) | 
 | ----- | ----- | ----- | 
| **Configuración** | Número de Pokémon a registrar (máx. 40). | Listado de Pokémon (antes y después de ordenar). | 
| **Registro** | ID, nombre, tipo, entrenador, etc., para cada Pokémon. | Resultados de búsqueda (posición o "no encontrado"). | 
| **Búsqueda** | Nombre del Pokémon o ID a buscar. | Registro de batallas (turno, atacante, daño, HP restante). | 
| **Campeonato** | Número de entrenadores (máx. 4), equipos (lista de IDs, máx. 10 por entrenador). | **Tabla de campeonato** (PJ, PG, PP, %Victorias). | 

## 📅 Fechas Importantes

| Actividad | Fecha Límite | 
 | ----- | ----- | 
| **Entrega de Código Fuente** | 23 de noviembre | 
| **Sustentación** | Coordinar horario entre el 24 y el 30 de noviembre | 

> **NOTA IMPORTANTE:** Su proyecto solo es calificable en el momento de la sustentación; bajo ninguna circunstancia se evalúa el código no sustentado.
