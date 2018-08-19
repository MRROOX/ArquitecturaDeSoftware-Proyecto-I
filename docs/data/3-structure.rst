Estructura 
==================================

Visión de Conjunto
------------------
.. image:: images/EstructuraOverview.jpg
    :scale: 70 %
    :align: center
El sistema se encuentra compuesto por tres componentes principales; Backend, Frontend Web, Aplicación Móvil, agregando otras dos partes adicionales; un motor de base de datos y una colección de sensores.

El **Frontend** web tiene **Componentes Visuales** que le permiten a los usuarios interactuar gráficamente con ellos, contienen vistas y controladores. Los **Ocultadores de Componentes Visuales** controlan la forma en la que ciertos componentes se despliegan al usuario. Y los **Servicios** proveen interfaces entre el **Backend** y **Frontend** utilizando a HTTP como protocolo de comunicación.

La **Aplicación Móvil** se describe de una forma bastante similar, pero este al no tener un acceso a navegador por URL no requiere **Ocultadores de Componentes** para impedir el acceso a ciertos componentes de URL.

Los **Servicios** del **Frontend** y la **Aplicación Móvil** se comunican con el **Spring Servlet** del **Backend** utilizando el protocolo HTTP, por lo que aquí se encuentra presente un Estilo de Arquitectura Orientada a Servicios (SOA), específicamente REST. Las solicitudes pasan por varios filtros (Pipes and filters), uno de ellos es el filtro de **Autenticación** el cuál extrae credenciales a las peticiones de los usuarios.

Componentes Logicos
-------------------

==========================  ====================================================
 **Componente**              Identificador único
 **Responsabilidades**       describir lo que hace, y las interfaces que provee
 **Colaboradores**           otros componentes con los que interactua.
 **Notas**                   aqui no sé que va
 **Problemas**               problemas que quedan por resolver en este nivel
==========================  ====================================================

Interfaces
----------
