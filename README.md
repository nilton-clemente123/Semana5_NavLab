# NavLab

Portal Académico móvil desarrollado con **Kotlin** y **Jetpack Compose**, orientado a demostrar el uso de navegación (`NavController` / `NavHost`) con una identidad visual moderna basada en una paleta de morado y lavanda.

## Descripción

NavLab es una aplicación Android de tipo portal académico que permite recorrer diferentes pantallas mediante navegación entre rutas, incluyendo el paso de argumentos entre pantallas. El proyecto sirve como laboratorio de navegación y como ejemplo de interfaz académica con **Material 3**.

# Prompt utilizado para mejorar la interfaz de la aplicacion

```
Quiero mejorar el diseño visual de mi aplicación Android desarrollada con Kotlin y Jetpack Compose.

IMPORTANTE: este trabajo consiste en mejorar la PRESENTACIÓN VISUAL de la aplicación. No quiero que cambies la lógica existente ni la navegación.

La aplicación actualmente utiliza Jetpack Compose, Material 3, NavController, NavHost y diferentes pantallas. Mantén completamente funcional la navegación existente.

## REGLAS IMPORTANTES

* NO cambies la lógica de navegación.
* NO cambies las rutas existentes.
* NO cambies los argumentos de navegación.
* NO elimines funcionalidades existentes.
* NO cambies Jetpack Compose por XML.
* NO cambies innecesariamente los nombres de las funciones Composable.
* NO agregues funcionalidades que no existan.
* Conserva `NavController`, `NavHost` y las rutas actuales.
* Mantén Material 3.
* Modifica principalmente colores, tamaños, espaciado, tipografía, formas, tarjetas, botones, iconos y distribución visual.
* Antes de modificar código, revisa la estructura actual del proyecto y determina qué archivos corresponden a cada pantalla.
* Reutiliza componentes y estilos cuando sea posible para mantener consistencia.

# IDENTIDAD VISUAL GENERAL

Quiero que toda la aplicación tenga una identidad visual de aplicación académica moderna.

### Paleta

Usa como colores principales:

* Morado principal: aproximadamente `#6650A4`
* Morado oscuro: aproximadamente `#4F378B`
* Lavanda: aproximadamente `#E9DFFF`
* Lavanda muy claro: aproximadamente `#F8F3FF`
* Fondo principal: `#FAF7FF`
* Blanco para tarjetas: `#FFFFFF`
* Texto principal: `#2B2633`
* Texto secundario: `#6F6878`
* Rojo suave para acciones peligrosas como cerrar sesión.

No es necesario utilizar exactamente estos valores si el proyecto ya tiene un sistema de colores, pero la apariencia final debe mantenerse dentro de esta gama.

### Formas

Utiliza:

* Cards con esquinas redondeadas de aproximadamente 16dp.
* Botones con esquinas redondeadas de aproximadamente 10-14dp.
* Campos de texto con esquinas redondeadas.
* Avatares circulares.
* Contenedores de iconos con esquinas redondeadas.

### Sombras

Las tarjetas principales deben tener una elevación ligera. No utilizar sombras demasiado fuertes.

### Espaciado

La interfaz debe respirar.

Utiliza aproximadamente:

* 16dp de padding horizontal general.
* 20-24dp entre secciones.
* 8-12dp entre elementos relacionados.
* 16dp entre tarjetas.

Evita colocar demasiados elementos juntos.

---

# 1. HOMESCREEN / PANTALLA DE INICIO DE SESIÓN

La primera pantalla debe parecer un portal académico moderno.

## Fondo

Utiliza un fondo muy claro en tono lavanda.

No debe ser completamente blanco.

## Tarjeta principal

En el centro de la pantalla debe aparecer una tarjeta grande blanca o ligeramente lavanda.

Características:

* Bordes redondeados.
* Elevación ligera.
* Padding interno amplio.
* Ocupa aproximadamente el 75-85% del ancho disponible.
* Centrada verticalmente.

## Contenido

Dentro de la tarjeta:

Título:

"Portal Académico"

El título debe ser grande, semibold/bold y de color morado.

Debajo:

"Accede a tu cuenta"

Debe utilizar un tamaño menor y color gris/morado suave.

### Campo de correo

Campo tipo `OutlinedTextField`.

Debe contener:

* Icono de correo a la izquierda.
* Placeholder o label: "Correo Institucional".
* Bordes redondeados.
* Fondo ligeramente diferente al fondo general.

### Campo contraseña

Segundo `OutlinedTextField`.

Debe contener:

* Icono de candado.
* Texto "Contraseña".
* Icono para mostrar/ocultar contraseña a la derecha.

### Botón principal

Botón ancho:

"INICIAR SESIÓN"

Características:

* Color morado.
* Texto blanco.
* Bordes redondeados.
* Altura aproximada de 48-52dp.
* Debe destacar claramente como la acción principal.

Debajo del botón:

"¿Olvidaste tu contraseña?"

Texto pequeño y discreto.

La pantalla debe transmitir una sensación de aplicación académica moderna, sencilla y profesional.

---

# 2. HOMESCREEN / PANTALLA PRINCIPAL DESPUÉS DEL LOGIN

Después de iniciar sesión, quiero una pantalla de bienvenida.

## Fondo

Usar un fondo lavanda claro.

La parte superior puede tener una zona con un tono morado ligeramente más intenso, pero debe mantenerse limpia.

## Encabezado

Mostrar:

"Bienvenido,"

y debajo:

"Juan León"

El nombre debe destacar más.

Debajo:

"¿Qué deseas gestionar hoy?"

El encabezado debe estar centrado o ligeramente alineado hacia la izquierda, manteniendo bastante espacio alrededor.

## Opciones principales

Mostrar dos tarjetas grandes:

### Primera tarjeta

Icono de grupo/personas.

Título:

"Directorio de Alumnos"

Descripción:

"Ver y gestionar estudiantes"

### Segunda tarjeta

Icono de usuario.

Título:

"Mi Perfil Académico"

Descripción:

"Datos personales y progreso"

Cada tarjeta debe:

* Tener fondo blanco.
* Tener bordes redondeados.
* Tener una ligera elevación.
* Tener un icono dentro de un pequeño contenedor lavanda.
* Tener título en negrita.
* Tener descripción más pequeña.
* Ser fácilmente reconocible como elemento clicable.

Las tarjetas deben ocupar prácticamente todo el ancho disponible dejando márgenes laterales.

## Cerrar sesión

En la parte inferior de la pantalla colocar:

"⎋ Cerrar Sesión Segura"

Utilizar un color rojo suave.

Debe ser visualmente secundario respecto a las opciones principales.

---

# 3. LISTSCREEN / DIRECTORIO DE ALUMNOS

Esta pantalla corresponde al directorio de estudiantes.

## TopAppBar

Utilizar una barra superior sencilla.

A la izquierda:

* Flecha de regresar.

Título:

"Directorio de Alumnos"

El título debe utilizar un tono morado oscuro.

La TopAppBar debe integrarse con el fondo claro.

## Lista

Utilizar `LazyColumn`.

Cada alumno debe aparecer como una tarjeta horizontal.

Ejemplo:

[Avatar]  Juan León
Ingeniería de Sistemas                         >

Segunda:

[Avatar]  María García
Arquitectura                                   >

Tercera:

[Avatar]  Carlos Pérez
Medicina                                       >

Cuarta:

[Avatar]  Ana Lopez
Derecho                                        >

Quinta:

[Avatar]  Luis Ramirez
Administración                                 >

## Diseño de cada alumno

Cada tarjeta:

* Fondo blanco.
* Bordes redondeados.
* Altura aproximadamente 64-72dp.
* Margen vertical pequeño.
* Padding horizontal de aproximadamente 12-16dp.
* Avatar circular de aproximadamente 44-48dp.
* Nombre con mayor peso visual.
* Carrera debajo con texto más pequeño.
* Flecha `ChevronRight` a la derecha.
* Ligera elevación.

Debe parecer una lista moderna de estudiantes, no una lista de texto simple.

---

# 4. DETAILSCREEN / EXPEDIENTE ACADÉMICO

Esta pantalla muestra el detalle de un estudiante.

## TopAppBar

Mostrar:

←  Expediente Académico

La flecha debe utilizar la navegación existente.

## Encabezado visual

Crear una sección superior con fondo morado.

Esta sección debe tener aproximadamente 140-180dp de altura.

El avatar del estudiante debe aparecer superpuesto sobre el límite entre el fondo morado y el fondo claro.

El avatar debe ser:

* Circular.
* Grande.
* Aproximadamente 90-110dp.
* Con un borde blanco.
* Con ligera sombra.

## Información del estudiante

Debajo del avatar:

"Juan León"

En texto grande y semibold.

Debajo:

"Ingeniería de Sistemas"

En texto más pequeño y color morado/gris.

## Tarjeta de información

Crear una Card blanca con esquinas redondeadas.

Dentro mostrar:

🎓 ID Estudiante
2024-0001

✉ Correo
[juan.leon@example.com](mailto:juan.leon@example.com)

💼 Facultad
Ingeniería y Tecnología

Separar visualmente cada dato.

## Biografía

Debajo colocar una sección:

"Biografía"

Y una tarjeta o contenedor suave:

"Estudiante destacado con interés en desarrollo Android."

El resultado debe parecer un perfil académico profesional.

---

# 5. PROFILESCREEN / CONFIGURACIÓN DE PERFIL

Esta pantalla debe representar la configuración/perfil académico del usuario.

## TopAppBar

Título:

"Configuración de Perfil"

A la izquierda:

Flecha de regresar.

## Encabezado

Crear una sección superior con fondo morado.

Puede utilizar un degradado sutil entre morado y un tono ligeramente más cálido, siempre manteniendo una apariencia profesional.

En el centro:

Avatar circular.

Debajo:

"Juan León Suyon"

El nombre debe utilizar texto blanco.

## Sección Información Personal

Título de sección:

"INFORMACIÓN PERSONAL"

Utilizar texto pequeño, semibold y morado.

Debajo crear filas:

### Nombre Completo

Icono de usuario.

"Juan León Suyon"

### Correo

Icono de correo.

"[juan.leon@tecsup.edu.pe](mailto:juan.leon@tecsup.edu.pe)"

### Teléfono

Icono de teléfono.

"+51 987 654 321"

Cada fila debe tener:

* Icono dentro de un pequeño contenedor lavanda.
* Etiqueta pequeña.
* Valor debajo o al lado.
* Separación vertical clara.

## Sección Académica

Título:

"ACADÉMICO"

Mostrar:

### Carrera

Icono relacionado con estudios.

"Ingeniería de Software"

### Ciclo

Icono relacionado con calendario/estudios.

"VI Ciclo"

## Botón cerrar sesión

En la parte inferior:

"Cerrar Sesión"

Características:

* Ancho casi completo.
* Fondo rojo muy claro.
* Texto rojo.
* Icono de logout.
* Bordes redondeados.
* Debe verse como una acción secundaria/peligrosa.

---

# COMPONENTES Y ESTILOS REUTILIZABLES

Si varias pantallas necesitan los mismos estilos, crea componentes reutilizables.

Por ejemplo:

* AppColors
* AppDimensions
* AppTypography
* StudentCard
* ProfileInfoRow
* SectionTitle
* PrimaryButton

No dupliques innecesariamente código de estilos.

Si ya existe un archivo de Theme, adapta el Theme existente en lugar de crear un sistema completamente separado.

---

# RESULTADO ESPERADO

La aplicación final debe tener una apariencia similar a un moderno portal académico móvil:

* Lavanda y morado como identidad visual.
* Fondos claros.
* Tarjetas blancas redondeadas.
* Sombras ligeras.
* Avatares circulares.
* Iconos Material 3.
* Botones morados.
* Mucho espacio visual.
* Tipografía jerarquizada.
* Información organizada en tarjetas y secciones.
* Diseño consistente entre todas las pantallas.

La prioridad es que todas las pantallas parezcan pertenecer a la MISMA aplicación.

Antes de terminar:

1. Revisa todas las pantallas modificadas.
2. Comprueba que la navegación siga funcionando.
3. Comprueba que no hayas eliminado ninguna funcionalidad existente.
4. Comprueba que no existan errores de compilación.
5. Si modificaste Theme.kt o archivos de colores, asegúrate de que todas las pantallas continúen compilando.
6. Resume al final qué archivos modificaste y qué cambios visuales realizaste.

No implementes funcionalidades nuevas. El objetivo de esta tarea es exclusivamente mejorar la presentación visual de la aplicación existente.

```