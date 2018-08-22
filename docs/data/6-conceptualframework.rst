Marco Conceptual
=====

Dominio Léxico
--------------

- **Sensor**: Es un aparato electrónico que registra medidas medioambientales del sector en el que se encuentra.
- **Medida**: Consiste en un registro que graba información de temperatura y humedad en un momento específico de tiempo.
- **Gráfico**: Es un gráfico de interpolación que muestra variaciones de medidas entre un rango de tiempo.
- **Pregunta**: Es una pregunta sobre el clima, que puede ser creada por cualquier tipo de usuario.
- **Respuesta**: Es un registro que puede ser creado por cualquier tipo de usuario, para poder responder una pregunta.
- **Moderador**: Un tipo de usuario que puede gestionar las cuentas de usuario del sistema, y moderar/sancionar preguntas y respuestas indebidas.
- **Usuario**: Cualquier tipo de persona que utiliza el sistema y registra una cuenta de usuario en el, puede ser un visitante web, visistante móvil o moderador.


Diagrama Léxico
---------------
.. image:: images/DiagramaLexico.png
    :scale: 70 %
    :align: center

Restricciones
~~~~~~~~~~~~~
- Una **Pregunta** o **Respuesta** no puede ser visualizada si el **Moderador** no la aprueba.
- En caso de que no existan **Medidas**, el gráfico puede mostrarse vacío.
- Para que exista una **Pregunta** o una **Respuesta**, debe haber un **Usuario** que la haya creado.
