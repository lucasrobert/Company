# MyHotel / Company

Esta es una aplicación que proporciona una REST API para obtener información sobre los empleados y la compañia.

##Estructura del proyecto:
```
src
├───main
│   ├───java
│   │   └───com
│   │       └───myhotel
│   │           └───rentacar
│   │               ├───domain
│   │               │   ├───model
│   │               │   ├───repository
│   │               │   └───usecase
│   │               │       ├───dto
│   │               │       ├───enums
│   │               │       ├───impl
│   │               │       └───mapper
│   │               └───infraestructure
│   │                   ├───handler
│   │                   └───rest
│   └───resources
│       ├───static
│       └───templates
└───test
    └───java
        └───com
            └───myhotel
                └───rentacar
                    ├───controller
                    └───service
```
## Stack Tecnológico

* Java 11 JDK.
* [Apache Maven](https://maven.apache.org/) 3.8.x en adelante.
* [Spring boot](https://spring.io/projects/spring-boot) - Framework de java
* [Hibernate](https://hibernate.org/) - ORM. Mapear tablas a clases de Java
* [Junit](https://junit.org/junit5/docs/current/user-guide/) - Tests y Test de integración.
* [Lombok](https://projectlombok.org/) - Anotaciones para reducir codigo (setters, getters,etc)
* [MapStruc](https://mapstruct.org/) - Mapeo entre DTOs y Entities
* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) - Utilides auxiliares
* [MySQL](https://www.mysql.com/) - Base de datos


## Prerequisitos

###MySQL Server 8.x
Download: https://dev.mysql.com/downloads/mysql/

####Dump: 
**https://drive.google.com/file/d/1-aE6SGlFGnrHw_RfdFAkh19DOWPBywTf/view**

###Java 11 JDK
Oracle jdk: https://www.oracle.com/ar/java/technologies/javase/jdk11-archive-downloads.html

Verificar instalación:

      $ java -version
      java version "11.0.12" 2021-07-20 LTS
      Java(TM) SE Runtime Environment 18.9 (build 11.0.12+8-LTS-237)
      Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.12+8-LTS-237, mixed mode)

      $ javac -version
      javac 11.0.12


### Apache Maven
Maven 3.8.4+
Download: https://archive.apache.org/dist/maven/maven-3/3.8.4/binaries/

Instalación: https://www.baeldung.com/install-maven-on-windows-linux-mac

Verificar instalación:

      $ mvn -v
      Maven home: C:\apache-maven-3.8.4
      Java version: 11.0.12, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.12
      Default locale: es_AR, platform encoding: Cp1252
      OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"



### Postman
Download: https://www.postman.com/downloads/

Instalación: https://learning.postman.com/docs/getting-started/installation-and-updates/

## Install
Clonar el repositorio: https://github.com/lucasrobert/Company.git

## Build
Mediante linea de comando hacemos un build del proyecto maven.
 
    $ mvn clean install -DskipTests

Si no tenemos maven instalado podemos utilizar maven "incorporado" en el proyecto.

    $ ./mvnw clean install -DskipTests

## Run the app

Ir a la clase com.myhotel.company.RentacarApplication, hacer click con el botón derecho y seleccionar "Run RentacarApplication.main().."

## Run the tests

**_SOLO SE CREARON ALGUNOS TEST A MODO DE EJEMPLO_**

Mediante linea de comando hacemos un build del proyecto maven.

    $ mvn clean install

O se pueden ejecutar directamente ejecutando

Mediante linea de comando hacemos un build del proyecto maven.

    $ mvn test

# Endpoints

## 1. EMPLOYEE

### “GET /v1/employees/a”
Obtenger cantidad de empleados pertenecientes al segmento A (salario menor a USD 3.500)

- **URL**: http://localhost:8080/v1/employees/a

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                                                                      |
|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados. |

### Ejemplos
- **200 OK**
```
{
    "_data": 37,
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/employees/b”
Obtenger cantidad de empleados pertenecientes al segmento B (salario mayor o igual a USD 3.500 y menor que USD 8000)

- **URL**: http://localhost:8080/v1/employees/b

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                                                                      |
|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados. |

### Ejemplos
- **200 OK**
```
{
    "_data": 37,
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/employees/c”
Obtenger cantidad de empleados pertenecientes al segmento C (salario mayor o igual a USD 8000)

- **URL**: http://localhost:8080/v1/employees/c

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                                                                      |
|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados. |

### Ejemplos
- **200 OK**
```
{
    "_data": 35,
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/employees/max-salary-department”
Obtenger empleados con mayor sueldo de cada departamento.

- **URL**: http://localhost:8080/v1/employees/max-salary-department

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                  |
|-----------------|------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con un listado de empleados. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "employeeId": 100.0,
            "firstName": "Steven",
            "lastName": "King",
            "email": "SKING",
            "phoneNumber": "515.123.4567",
            "hireDate": "1987-06-17T03:00:00.000+00:00",
            "job": {
                "jobId": "AD_PRES",
                "jobTitle": "President",
                "minSalary": 20000.0,
                "maxSalary": 40000.0
            },
            "salary": 24000.0,
            "commissionPct": 0.0,
            "managerId": 0.0,
            "department": {
                "departmentId": 90.0,
                "departmentName": "Executive",
                "managerId": 100.0,
                "location": 1700.0
            }
        },
        {
            "employeeId": 103.0,
            "firstName": "Alexander",
            "lastName": "Hunold",
            "email": "AHUNOLD",
            "phoneNumber": "590.423.4567",
            "hireDate": "1987-06-20T03:00:00.000+00:00",
            "job": {
                "jobId": "IT_PROG",
                "jobTitle": "Programmer",
                "minSalary": 4000.0,
                "maxSalary": 10000.0
            },
            "salary": 9000.0,
            "commissionPct": 0.0,
            "managerId": 102.0,
            "department": {
                "departmentId": 60.0,
                "departmentName": "IT",
                "managerId": 103.0,
                "location": 1400.0
            }
        }
    ]
}
```

### “GET /v1/employees/manager-fifteen-servicet”
Obtenger gerentes que hayan sido contratados hace más de 15 años.

- **URL**: http://localhost:8080/v1/employees/manager-fifteen-service

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con un listado de gerentes. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "employeeId": 200.0,
            "firstName": "Jennifer",
            "lastName": "Whalen",
            "email": "JWHALEN",
            "phoneNumber": "515.123.4444",
            "hireDate": "1987-09-25T03:00:00.000+00:00",
            "job": {
                "jobId": "AD_ASST",
                "jobTitle": "Administration Assistant",
                "minSalary": 3000.0,
                "maxSalary": 6000.0
            },
            "salary": 4400.0,
            "commissionPct": 0.0,
            "managerId": 101.0,
            "department": {
                "departmentId": 10.0,
                "departmentName": "Administration",
                "managerId": 200.0,
                "location": 1700.0
            }
        },
        {
            "employeeId": 201.0,
            "firstName": "Michael",
            "lastName": "Hartstein",
            "email": "MHARTSTE",
            "phoneNumber": "515.123.5555",
            "hireDate": "1987-09-26T03:00:00.000+00:00",
            "job": {
                "jobId": "MK_MAN",
                "jobTitle": "Marketing Manager",
                "minSalary": 9000.0,
                "maxSalary": 15000.0
            },
            "salary": 13000.0,
            "commissionPct": 0.0,
            "managerId": 100.0,
            "department": {
                "departmentId": 20.0,
                "departmentName": "Marketing",
                "managerId": 201.0,
                "location": 1800.0
            }
        }
    ]
}
```

## 2. DEPARTMENT

### “GET /v1/departments/a”
Obtenger cantidad de empleados por departamento pertenecientes al segmento A (salario menor a USD 3.500)

- **URL**: http://localhost:8080/v1/employees/a

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                    |
|-----------------|------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados por departamento. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "count": 5,
            "departmentName": "Purchasing"
        },
        {
            "count": 32,
            "departmentName": "Shipping"
        }
    ],
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/departments/b”
Obtenger cantidad de empleados por departamento pertenecientes al segmento B (salario mayor o igual a USD 3.500 y menor que USD 8000)

- **URL**: http://localhost:8080/v1/departments/b

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                    |
|-----------------|------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados por departamento. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "count": 4,
            "departmentName": "IT"
        },
        {
            "count": 3,
            "departmentName": "Finance"
        },
        {
            "count": 12,
            "departmentName": "Shipping"
        },
        {
            "count": 14,
            "departmentName": "Sales"
        },
        {
            "count": 1,
            "departmentName": "Administration"
        },
        {
            "count": 1,
            "departmentName": "Marketing"
        },
        {
            "count": 1,
            "departmentName": "Human Resources"
        }
    ],
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/departments/c”
Obtenger cantidad de empleados por departamento pertenecientes al segmento C (salario mayor o igual a USD 8000)

- **URL**: http://localhost:8080/v1/departments/c

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                                    |
|-----------------|------------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con la cantidad de empleados por departamente. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "count": 3,
            "departmentName": "Executive"
        },
        {
            "count": 1,
            "departmentName": "IT"
        },
        {
            "count": 3,
            "departmentName": "Finance"
        },
        {
            "count": 1,
            "departmentName": "Purchasing"
        },
        {
            "count": 2,
            "departmentName": "Shipping"
        },
        {
            "count": 22,
            "departmentName": "Sales"
        },
        {
            "count": 1,
            "departmentName": "Marketing"
        },
        {
            "count": 1,
            "departmentName": "Public Relations"
        },
        {
            "count": 2,
            "departmentName": "Accounting"
        }
    ],
    "_errors": [],
    "_status": "OK"
}
```

### “GET /v1/departments/avg-salary”
Obtenger Salario promedio de todos los departamentos que tengan más de 10 empleados

- **URL**: http://localhost:8080/v1/departments/avg-salary

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                                               |
|-----------------|-------------------------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con el salario promedio por departamente. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "departmentName": "Shipping",
            "salaryAvg": 3475.56
        },
        {
            "departmentName": "Sales",
            "salaryAvg": 8955.88
        }
    ],
    "_errors": [],
    "_status": "OK"
}
```
## 3. Country

### “GET /v1/countries/summary”
Obtenger un resumen agrupado por pais (Salario mas alto, Salario mas bajo, etc)

- **URL**: http://localhost:8080/v1/countries/summary

- **PARAMS**
```
N/A
```
- **BODY**
```
N/A
```

- **Descripción campos y formatos**:
```
N/A
```

- **Códigos de respuesta esperados**:

| Código          | Descripción                                                              |
|-----------------|--------------------------------------------------------------------------|
| 200 Ok          | La solicitud ha tenido éxito y devuelve un json con un resumen por pais. |

### Ejemplos
- **200 OK**
```
{
    "_data": [
        {
            "count": 68,
            "countryName": "United States of America",
            "salaryMax": 24000.0,
            "salaryAvg": 5064.71,
            "salaryMin": 2100.0,
            "avgYear": 35.0
        },
        {
            "count": 35,
            "countryName": "United Kingdom",
            "salaryMax": 14000.0,
            "salaryAvg": 8885.71,
            "salaryMin": 6100.0,
            "avgYear": 35.0
        },
        {
            "count": 2,
            "countryName": "Canada",
            "salaryMax": 13000.0,
            "salaryAvg": 9500.0,
            "salaryMin": 6000.0,
            "avgYear": 35.0
        },
        {
            "count": 1,
            "countryName": "Germany",
            "salaryMax": 10000.0,
            "salaryAvg": 10000.0,
            "salaryMin": 10000.0,
            "avgYear": 35.0
        }
    ],
    "_errors": [],
    "_status": "OK"
}
```

# Postman con ejemplos
https://www.getpostman.com/collections/7ac8d0cfd9b92c5327f8

## Autor

* **Lucas Robert** - https://github.com/lucasrobert