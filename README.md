# 🚀 Sistema de Inventario - Full Stack Application

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0%2B-6DB33F?logo=springboot&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-16%2B-DD0031?logo=angular&logoColor=white)
![Java](https://img.shields.io/badge/Java-17%2B-007396?logo=java&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-5%2B-3178C6?logo=typescript&logoColor=white)
![Bootstrap](https://img.shields.io/badge/UI-Bootstrap-7952B3?logo=bootstrap&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green)

> *"Sistema completo de gestión de inventario con arquitectura microservicios, API RESTful y dashboard interactivo"*

---

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

### 🎨 Experiencia de Usuario
- 📱 **Diseño responsive** con Bootstrap
- ⚡ **Interfaz moderna** y intuitiva
- 🔄 **Actualizaciones en tiempo real**
- 🎯 **Navegación fluida** entre módulos

---

## 🏗️ Arquitectura del Sistema

```mermaid
graph TB
    A[Angular Frontend] --> B[Spring Boot API]
    B --> C[JWT Authentication]
    B --> D[Spring Data JPA]
    D --> E[MySQL Database]
    
    F[Bootstrap UI] --> A
    G[RxJS Services] --> A
    H[REST Controllers] --> B
    I[Entity Models] --> D
    J[Spring Security] --> C
```

---

## 🛠️ Tecnologías Utilizadas

### 🔧 Backend
- **Spring Boot 3.0** - Framework de aplicaciones Java
- **Spring Security** - Autenticación y autorización
- **Spring Data JPA** - Persistencia de datos
- **JWT** - Tokens de autenticación
- **Maven** - Gestión de dependencias

### 🎨 Frontend
- **Angular 16** - Framework TypeScript
- **Bootstrap 5** - Framework CSS
- **RxJS** - Programación reactiva
- **TypeScript** - Superset de JavaScript

### 🗄️ Base de Datos
- **MySQL 8.0** - Base de datos relacional

---

## 🚀 Instalación Rápida

```bash
# Clonar repositorio
git clone https://github.com/Astharmin/Sistema_Inv.git
cd Sistema_Inv

# Backend (Spring Boot)
cd backend
mvn spring-boot:run

# Frontend (Angular)
cd ../frontend
npm install
ng serve
```

---

## 📁 Estructura del Proyecto

```
Sistema_Inv/
├── backend/                 # 🖥️ Spring Boot Application
│   ├── src/
│   │   ├── main/java/
│   │   │   ├── controller/     # 🎮 REST Controllers
│   │   │   ├── service/        # ⚙️ Business Logic
│   │   │   ├── repository/     # 🗄️ Data Access Layer
│   │   │   ├── entity/         # 📊 JPA Entities
│   │   │   └── config/         # 🔧 Security Config
│   │   └── resources/
│   └── pom.xml
├── frontend/                # 🎨 Angular Application
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/     # 🧩 UI Components
│   │   │   ├── services/       # 🔌 HTTP Services
│   │   │   ├── models/         # 📝 TypeScript Interfaces
│   │   │   └── guards/         # 🛡️ Route Guards
│   └── package.json
└── README.md
```

---

## 🔌 Endpoints Principales

### 🔐 Autenticación
```http
POST /api/auth/login     # Inicio de sesión
POST /api/auth/register  # Registro de usuario
```

### 📦 Gestión de Productos
```http
GET    /api/products     # Listar productos
POST   /api/products     # Crear producto
PUT    /api/products/{id} # Actualizar producto
DELETE /api/products/{id} # Eliminar producto
```

### 📊 Reportes
```http
GET /api/reports/stock   # Reporte de stock
GET /api/reports/sales   # Reporte de ventas
```

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

<div align="center">

### ⭐ ¿Te gustó este proyecto? ¡Déjame una estrella en GitHub!

**Desarrollado con ❤️ por [Astharmin](https://github.com/Astharmin)**
