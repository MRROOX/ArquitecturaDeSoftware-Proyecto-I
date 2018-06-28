Siguiendo la Metodología AD-HOC
=================================

.. image:: images/AD_HOC.jpg
    :scale: 30 %
    :align: center


Vision y Objetivo
------------------
La complejidad inherente de los actuales sistemas hace necesario diseñar una apropiada
arquitectura para los sistemas, de modo de enfrentar los diversos cambios requeridos, así
como satisfacer los requisitos funcionales como no funcionales.
En esta ocasión, se requiere diseñar un sistema que permita capturar parámetros
medioambientales (temperatura y humedad) y proveer una plataforma web que permita
visualizar en forma gráfica las temperaturas durante el dia. Se requiere además, que dicha
aplicación, pueda ser vista desde un equipo móvil (android), pero en este caso, se requiere
enviar preguntas específicas que deben ser almacenadas en el sitio web, para ser
respondidas y que sean visibles para todos los usuarios.

Se identifican los Stakeholders
-------------------------------
Para la realización del proyecto se ha identificado 3 tipos de usuarios.
Usuarios Web: Es aquel usuario que se conecta al sistema desde la web.
Usuario Móvil: Es aquel usuario que se conecta al sisde desde una App Móvil.
Usuario Moderador: Es aquel usuario que autoriza o niega las preguntas enviadas por un usuario.

Se definen los objetivos
-------------------------
De acuerdo a cada uno de los usuarios identificados los los objetivos que esperan cumplir cada uno de ellos.

**Usuario Web**

Objetivos:

Conocer datos de parámetros medioambientales.

Proveer de ayuda a las preguntas de usuarios móviles.

**Usuario Movil**

Objetivos:

Obtener información de temperatura de diferentes situaciones.

**Usuario Moderador**

Objetivos:

Autorización de la publicación de mensajes.



Histoias de Usuario
-------------------

Luego de realizar conversaciones con los stackeholder se definen y se eligen las historias de usuarios para ser implementadas en el sistema.

Yo como <Usuario> quiero <hacer alguna acción> que me entregue <algo>.

**Usuario Web**

Visualizar la temperatura y humedad actuales.

Visualizar un mapa de temperaturas maximas y minimas dentro de un intervalo dado.

Visualizar en gráficos los valores históricos de temperatura y humedad para poder comparar dentro de un intervalo específico de fechas.

Permitir responder a las preguntas del usuario móvil.

**Usuario Móvil**

Yo como usuario móvil quiero poder enviar preguntas acerca del clima.

Yo como usuario móvil quiero saber cuando mis preguntas sean aprobadas para ser publicadas.

Yo como usuario móvil quiero ser notificado cuando mis preguntas sean respondidas.

Yo como usuario móvil quiero visualizar las respuestas a mis preguntas.

**Moderador**

Yo como usuario moderador quiero saber cuando alguien realiza una pregunta para poder aprobar o no (recibir una notificación).

Yo como usuario moderador quiero aprobar preguntas de usuario móvil.

Yo como usuario moderador quiero saber cuando alguien responde a una de las preguntas ya aprobadas para filtrar su contenido.




Mockups
-------

A continuacion se presentan los mockups diseñados de acuerdo a una posterior discucion con el equipo de desarrollo, de esta forma.

.. image:: images/AD_HOC.jpg
    :scale: 30 %
    :align: center

