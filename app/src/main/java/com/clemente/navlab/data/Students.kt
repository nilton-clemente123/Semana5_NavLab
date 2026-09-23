package com.clemente.navlab.data

/**
 * Modelo de un alumno para el directorio académico.
 */
data class Student(
    val id: String,
    val name: String,
    val career: String,
    val faculty: String,
    val email: String,
    val bio: String
)

/**
 * Lista de alumnos mostrada en el directorio.
 */
val Students = listOf(
    Student(
        id = "2024-0001",
        name = "Juan León",
        career = "Ingeniería de Sistemas",
        faculty = "Ingeniería y Tecnología",
        email = "juan.leon@example.com",
        bio = "Estudiante destacado con interés en desarrollo Android."
    ),
    Student(
        id = "2024-0002",
        name = "María García",
        career = "Arquitectura",
        faculty = "Arquitectura y Diseño",
        email = "maria.garcia@example.com",
        bio = "Apasionada por el diseño urbano y sostenible."
    ),
    Student(
        id = "2024-0003",
        name = "Carlos Pérez",
        career = "Medicina",
        faculty = "Ciencias de la Salud",
        email = "carlos.perez@example.com",
        bio = "Futuro médico con vocación de servicio."
    ),
    Student(
        id = "2024-0004",
        name = "Ana Lopez",
        career = "Derecho",
        faculty = "Ciencias Jurídicas",
        email = "ana.lopez@example.com",
        bio = "Interés en derecho corporativo."
    ),
    Student(
        id = "2024-0005",
        name = "Luis Ramirez",
        career = "Administración",
        faculty = "Ciencias Empresariales",
        email = "luis.ramirez@example.com",
        bio = "Emprendedor en formación."
    )
)
