# 🚀 Sistema de Inventario - Full Stack Application

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0%2B-6DB33F?logo=springboot&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-16%2B-DD0031?logo=angular&logoColor=white)
![Java](https://img.shields.io/badge/Java-17%2B-007396?logo=java&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-5%2B-3178C6?logo=typescript&logoColor=white)
![Bootstrap](https://img.shields.io/badge/UI-Bootstrap-7952B3?logo=bootstrap&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green)

> *"Sistema completo de gestión de inventario con arquitectura microservicios, API RESTful y dashboard interactivo"*

## 🌟 Características Principales

### 📦 Gestión de Inventario
- ✅ **CRUD completo** de productos y categorías
- 📊 **Dashboard analytics** con métricas en tiempo real
- 🔍 **Búsqueda avanzada** y filtros dinámicos
- 📈 **Reportes automáticos** de stock y rotación
- 🏷️ **Gestión de categorías** y subcategorías

### 🔐 Sistema de Seguridad
- 👤 **Autenticación JWT** con roles de usuario
- 🛡️ **Autorización por endpoints** 
- 🔒 **Password encryption** con BCrypt
- 📧 **Sistema de recuperación** de contraseñas

## 🏗️ Arquitectura del Sistema

```mermaid
graph TB
    A[Angular Frontend] --> B[Spring Boot API]
    B --> C[JWT Authentication]
    B --> D[Spring Data JPA]
    D --> E[MySQL Database]
    
    G[RxJS Services] --> A
    H[REST Controllers] --> B
    I[Entity Models] --> D
```
