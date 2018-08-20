Estructura 
==================================

Visión de Conjunto
------------------
.. image:: images/EstructuraOverview.jpg
    :scale: 70 %
    :align: center
El sistema se encuentra compuesto por tres componentes principales; Backend, Frontend Web, Aplicación Móvil, agregando otras dos partes adicionales; un motor de base de datos y una colección de sensores.

El **Frontend** web tiene **Componentes Visuales** que le permiten a los usuarios interactuar gráficamente con ellos, contienen vistas y controladores. Los **Ocultadores de Componentes Visuales** controlan la forma en la que ciertos componentes se despliegan al usuario.

La **Aplicación Móvil** se describe de una forma bastante similar, pero este al no tener un acceso a navegador por URL no requiere **Ocultadores de Componentes** para impedir el acceso a ciertos componentes de URL.

Los **Servicios** del **Frontend** y la **Aplicación Móvil** se comunican con el **Spring Servlet** del **Backend** utilizando el protocolo HTTP, por lo que aquí se encuentra presente un Estilo de Arquitectura Orientada a Servicios (SOA), específicamente REST. Las solicitudes pasan por varios filtros (Pipes and filters), uno de ellos es el filtro de **Autenticación** el cuál extrae credenciales a las peticiones de los usuarios.

Las peticiones que llegan al **Spring Servlet** son derivadas a los **Controladores**, los cuales conocen la intención de la solicitud y generan una respuesta dependiendo de la operación que se requiere. Para generar tal respuesta, los **Controladores** solicitan datos al componente **Repository**, el cuál contiene diversas interfaces que permiten gestionar la información de la **Base de Datos** (Estilo de Arquitectura Repository). Sin embargo, **Repository** no puede hacer esto directamente ya que no conoce exactamente cuál motor de base de datos se encuentra utilizando, por lo que deriva tal tarea al **Hibernate Entity Manager**, para generar los procedimientos de comunicación con la **Base de Datos**.

El **Sensor** es un componente técnico que puede comunicarse directamente con la **Base de Datos** para almacenar información respecto a las medidas que este obtiene.

Los **Modelos** tienen el propósito de dar a conocer la estructura de los datos que se deben almacenar en la **Base de Datos**, por lo que **Hibernate Entity Manager** los utiliza principalmente para conocer la forma de los datos.

Componentes Logicos
-------------------
En esta seccion se describe cada uno de los componentes en la arquitectura. Un component es documentado siguienfo el siguiente template.

==========================  ====================================================
 **Componente**              Identificador único
 **Responsabilidades**       describir lo que hace, y las interfaces que provee
 **Colaboradores**           otros componentes con los que interactua.
 **Notas**                   aqui no sé que va
 **Problemas**               problemas que quedan por resolver en este nivel
==========================  ====================================================

                    Tabla 1: Componente 1

Tabla 1 contiene un ejemplo de especificacion de un componente, a continuacion se discute la forma y la semantica de cada punto de la especificacion.
**Component**
Cada componente debe ser un nombre unico y posibilitar a numero de version. Esta seccion puede incluso ocntener referencias la documentacion del diseño del componente y a su implementacion. En caso de un componente complejo este debera ser descompuesto en subcomponentes, incluso agregar las referencias al capitulo o a al decomuento de arquitectura describiendo la estructura de el componente.

**Responsabilidad**
Describe el proposito or la descripcion del trabajo del componente en terminos de 1. la responsabilidad del componente y 2. las interfaces que es provista o proporcionada.

Una responsabilidad es a "pieza de funcionalidad" y especifica el proposito del componente. Esta puede ser informacion que el componente conoce, o una accion que este sabe como realizar.

Interfaces can be listed by reference to named interface specifications in section 3.3.3, or by explicitly listing and describing the use cases or operations that constitute the interface in the same way as they are described in section 3.3.3. Referencing named interfaces facilitates component “plug and play”. It can also be useful to document the rationale for the component, i.e. give the underlying reasons why the component is designed the way it is.
 
 **Collaborators**
 
Lists the other components from which the component requests services in order to achieve its purpose. Besides the collaborators it is often useful to list also the specific use cases, operations or interfaces of the collaborators that are used.

**Notes**
Documents the architectural or system-level constraints on the component that the design of the component must satisfy and contains further information needed to use and understand the component. The notes section includes issues such as: • Multiplicity: How many instances of this component exist in the architecture? Are the instances created and destroyed dynamically? If so, under what conditions and how does creation and destruction occur? • Concurrency: Is the component multi-threaded? Does it contain data that needs to be protected against simultaneous reading and writing? • Persistency:  Does the component or its data need to exist beyond the lifetime of the system? • Parameterization: Describes the variability of a component, i.e., ways in which a component can be parameterized or configured.  This is especially important when a different configuration of the component changes the depiction of the architecture.

**Issues**

List of issues awaiting resolution. There may also be some notes on possible implementation strategies or impact on other components. As the understanding of the system and its architecture increases this list should eventually become empty.
 
 
Lista de Componentes
--------------------

Componente Frontend
~~~~~~~~~~~~~~~~~~~

+---------------------------+-----------------------------------------------------------------------------+
| **Componente**            | Frontend                                                                    |
+---------------------------+-----------------------------------------------------------------------------+
| **Responsabilidades**     | Permite acceder, eliminar, crear y actualizar un usuario.                   |
+---------------------------+-----------------------------------------------------------------------------+
| **Colaboradores**         | - **Operación:** usuario_index()                                            |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada usuario con sus datos (nombre, correo)        |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+



Componente AppMovil
~~~~~~~~~~~~~~~~~~~

+---------------------------+-----------------------------------------------------------------------------+
| **Componente**            | AppMovil                                                                    |
+---------------------------+-----------------------------------------------------------------------------+
| **Responsabilidades**     | Permite acceder, eliminar, crear y actualizar un usuario.                   |
+---------------------------+-----------------------------------------------------------------------------+
| **Colaboradores**         | - **Operación:** usuario_index()                                            |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada usuario con sus datos (nombre, correo)        |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+



Componente SpringServel
~~~~~~~~~~~~~~~~~~~~~~~

+---------------------------+-----------------------------------------------------------------------------+
| **Componente**            | SpringServlet                                                               |
+---------------------------+-----------------------------------------------------------------------------+
| **Responsabilidades**     | Permite acceder, eliminar, crear y actualizar un usuario.                   |
+---------------------------+-----------------------------------------------------------------------------+
| **Colaboradores**         | - **Operación:** usuario_index()                                            |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada usuario con sus datos (nombre, correo)        |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+







 




Interfaces
----------

Usuario
~~~~~~~~
+---------------------------+-----------------------------------------------------------------------------+
| **Interface**             | Usuario_controller                                                          |
+---------------------------+-----------------------------------------------------------------------------+
| **Descripción**           | Permite acceder, eliminar, crear y actualizar un usuario.                   |
+---------------------------+-----------------------------------------------------------------------------+
| **Operaciones**           | - **Operación:** usuario_index()                                            |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada usuario con sus datos (nombre, correo)        |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** usuario_store( usuario_data )                              |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** POST                                                          |
|                           | - **Descripción:** Guarda todos los datos de un nuevo usuario               |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** usuario_show ( usuario id )                                |
|                           | - **Ruta:** usuario/{id}                                                    |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Muestra todos los datos del usuario especificado en el   |
|                           |   id                                                                        |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** usuario_destroy ( usuario id )                             |
|                           | - **Ruta:** usuario/{id}                                                    |
|                           | - **Metodo:** DELETE                                                        |
|                           | - **Descripción:** Elimina al usuario correspondiente al id                 |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** usuario_update ( usuario id, usuario new_data)             |
|                           | - **Ruta:** usuario                                                         |
|                           | - **Metodo:** PUT                                                           |
|                           | - **Descripción:** Actualiza los datos del usuario especificado en el id    |
+---------------------------+-----------------------------------------------------------------------------+
| **Protocolo**             | No existen restricciones en el orden de las operaciones                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+

Pregunta
~~~~~~~~
+---------------------------+-----------------------------------------------------------------------------+
| **Interface**             | Pregunta_controller                                                         |
+---------------------------+-----------------------------------------------------------------------------+
| **Descripción**           | Permite acceder, eliminar, crear, actualizar y listar por preguntas         |
|                           | aprobadas y no aprobadas.                                                   |
+---------------------------+-----------------------------------------------------------------------------+
| **Operaciones**           | - **Operación:** pregunta_index()                                           |
|                           | - **Ruta:** pregunta                                                        |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada pregunta con sus datos, ademas extrae las     |
|                           |   respuestas de cada pregunta                                               |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** pregunta_indexAprobados()                                  |
|                           | - **Ruta:** pregunta/aprobados                                              |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada pregunta *aprobada* con sus datos, además     |
|                           |   respuestas de cada pregunta                                               |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** pregunta_indexNoAprobados()                                |
|                           | - **Ruta:** pregunta/noaprobados                                            |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista cada pregunta *no aprobada* con sus datos.         |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** pregunta_store( pregunta_data )                            |
|                           | - **Ruta:** pregunta                                                        |
|                           | - **Metodo:** POST                                                          |
|                           | - **Descripción:** Guarda todos los datos de una nueva pregunta             |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** pregunta_show ( pregunta id )                              |
|                           | - **Ruta:** pregunta/{id}                                                   |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Muestra todos los datos de una pregunta especificada en  |
|                           |   el id                                                                     |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** pregunta_destroy ( pregunta id )                           |
|                           | - **Ruta:** pregunta/{id}                                                   |
|                           | - **Metodo:** DELETE                                                        |
|                           | - **Descripción:** Elimina la pregunta correspondiente al id                |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** usuario_update ( usuario id )                              |
|                           | -  **Ruta:** pregunta/aprobar/{id}                                          |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Cambia el estado de una pregunta *no aprobada* a         |
|                           |   *aprobada*.                                                               |
+---------------------------+-----------------------------------------------------------------------------+
| **Protocolo**             | No existen restricciones en el orden de las operaciones                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+


Respuesta
~~~~~~~~~
+---------------------------+-----------------------------------------------------------------------------+
| **Interface**             | Respuesta_controller                                                        |
+---------------------------+-----------------------------------------------------------------------------+
| **Descripción**           | Permite acceder, aprobar, eliminar, ademas de listar por respuestas no      |
|                           | aprobadas.                                                                  |
+---------------------------+-----------------------------------------------------------------------------+
| **Operaciones**           | - **Operación:** respuesta_indexNoAprobado()                                |
|                           | - **Ruta:** respuesta/noaprobados                                           |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista las respuestas no aprobadas con sus datos.         |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** respuesta_store( respuesta_data )                          |
|                           | - **Ruta:** respuesta                                                       |
|                           | - **Metodo:** POST                                                          |
|                           | - **Descripción:** Guarda todos los datos de una nueva respuesta            |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** respuesta_aprobar ( respuesta id )                         |
|                           | - **Ruta:** respuesta/aprobar/{id}                                          |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Permita aprobar una respuesta con la id especificada     |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** respuesta_destroy ( respuesta id )                         |
|                           | - **Ruta:** respuesta/{id}                                                  |
|                           | - **Metodo:** DELETE                                                        |
|                           | - **Descripción:** Elimina la respuesta correspondiente al id               |
+---------------------------+-----------------------------------------------------------------------------+
| **Protocolo**             | No existen restricciones en el orden de las operaciones                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+

Medida
~~~~~~
+---------------------------+-----------------------------------------------------------------------------+
| **Interface**             | Medida_controller                                                           |
+---------------------------+-----------------------------------------------------------------------------+
| **Descripción**           | Permite acceder, guardar, listar y encontrar medidas entre un rango de      |
|                           | fechas.                                                                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Operaciones**           | - **Operación:** medida_index()                                             |
|                           | - **Ruta:** medida                                                          |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** Lista todas las mediciones registradas.                  |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** medida_indexOf( Rango rango_fecha )                        |
|                           | - **Ruta:** medida/range                                                    |
|                           | - **Metodo:** POST                                                          |
|                           | - **Descripción:** Lista todas las medidas encontradas en el rango de       |
|                           |   fechas establecido.                                                       |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** medida_store( medida_data )                                |
|                           | - **Ruta:** medida                                                          |
|                           | - **Metodo:** POST                                                          |
|                           | - **Descripción:** Guarda todos los datos de una nueva medida               |
+                           +-----------------------------------------------------------------------------+
|                           | - **Operación:** medida_show ( medida id )                                  |
|                           | - **Ruta:** medida/{id}                                                     |
|                           | - **Metodo:** GET                                                           |
|                           | - **Descripción:** permite obtener la medida correspondiente al id          |
+---------------------------+-----------------------------------------------------------------------------+
| **Protocolo**             | No existen restricciones en el orden de las operaciones                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 | Esta interface es provista en el componente servicios del frontend y el     |
|                           | componente servicios de la aplicación movil                                 |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+


Grafico
~~~~~~~
+---------------------------+-----------------------------------------------------------------------------+
| **Interface**             | Grafico_medidas                                                             |
+---------------------------+-----------------------------------------------------------------------------+
| **Descripción**           | Permite graficar las medidas registradas, cambiar el rango de fechas a      |
|                           | a partir de una lista de medidas                                            |
+---------------------------+-----------------------------------------------------------------------------+
| **Operaciones**           | - **Operación:** grafico_setMedidas()                                       |
|                           | - **Descripción:** Permite modificar las medidas que se mostrarán en el     |
|                           |   gráfico.                                                                  |
+---------------------------+-----------------------------------------------------------------------------+
| **Protocolo**             | No existen restricciones en el orden de las operaciones                     |
+---------------------------+-----------------------------------------------------------------------------+
| **Notas**                 |                                                                             |
|                           |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+
| **Problemas**             |                                                                             |
+---------------------------+-----------------------------------------------------------------------------+
