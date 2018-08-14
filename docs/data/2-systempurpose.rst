Propósito del Sistema 
=========================
problem description, system interface, non-functional requierements


Contexto
-------------


**Descripción del Problema**


La complejidad inherente de los actuales sistemas hace necesario diseñar una apropiada
arquitectura para los sistemas, de modo de enfrentar los diversos cambios requeridos, así
como satisfacer los requisitos funcionales como no funcionales.
En esta ocasión, se requiere diseñar un sistema que permita capturar parámetros
medioambientales (temperatura y humedad) y proveer una plataforma web que permita
visualizar en forma gráfica las temperaturas durante el dia. Se requiere además, que dicha
aplicación, pueda ser vista desde un equipo móvil (android), pero en este caso, se requiere
enviar preguntas específicas que deben ser almacenadas en el sitio web, para ser
respondidas y que sean visibles para todos los usuarios.


Los Servicios
-------------

**Servicios provistos por el Sistema**

Aqui el profe nos dijo que teniamos que indicar cuales eran los servicios del backend,
mostrar casos de usos de esos servicios, tambien podiamos agregar "servicios" derivados que entrega el frontend.

==========================  ===============================================================
 Interface                   Servicios
==========================  ===============================================================
 Servicio de Usuarios        Provee acceso a la persistencia de datos, permite
                             crear, buscar, actualizar y eliminar objetos de tipo Usuario.
                           
 Servicio de Medidas         Entrega medidas de temperatura, humedad respecto a diferentes
                             posibles rangos de tiempo.
 Servicio de Preguntas       Provee acceso a la persistencia de datos, permite
                             crear, listar, obtener, actualizar y eliminar preguntas.
                             Permitir registrar respuestas a preguntas.
 Servicio de Respuestas      Provee acceso a la persistencia de datos,permite
                             crear, listar, obtener, actualizar y eliminar respuestas.
==========================  ===============================================================

Requisitos no funcionales
-------------------------

Caracteristicas y restricciones
