Conclusiones
====
Con la realización de este proyecto hemos podido poner en práctica nuestros conocimientos de Arquitectura de software adquiridos durante el semestre los cual son una excelente base para la comunicación. 

La arquitectura de software es mas bien un plan del sistema primordial para la comprensión, negociación y comunicación entre todos los interesados que nos facilita el proceso de toma de decisiones, la administración de todo tipo de cambios y el logro de un desarrollo más eficiente.

Junto a el equipo se realizó un diseño escalable del modelo de negocio que nos permite maximizar el ciclo de vida de la aplicación y minimizar los tiempos de desarrollo de nuevas funcionalidades, actualizaciones, etc.

Esta escalabilidad facilitara la integración de distintos tipos de dispositivos clientes con las mismas prestaciones que el punto anterior.

**Ventajas del Sistema**

Para el desarrollo del sistema se escogió el uso de una arquitectura RESTful en java utilizando el Framework SpringBoot  para el Backend y el Framework Angular para nuestro Frontend las principales ventajas y desventajas que esta implantación nos ofrece serian:

**Ventajas del uso de REST**

1.  **Separación entre el cliente y el servidor:** el uso de REST separa totalmente la interfaz de usuario del servidor y el almacenamiento de datos. Eso tiene algunas ventajas cuando se hacen desarrollos. Como mejorar la portabilidad de la interfaz a otro tipo de plataformas, aumenta la escalabilidad de los proyectos y permite que los distintos componentes de los desarrollos se puedan evolucionar de forma independiente.
2.  **Visibilidad, fiabilidad y escalabilidad:** La separación entre cliente y servidor tiene una ventaja evidente y es que cualquier equipo de desarrollo puede escalar el producto sin excesivos problemas. Se puede migrar a otros servidores o realizar todo tipo de cambios en la base de datos, siempre y cuando los datos de cada una de las peticiones se envíen de forma correcta. Esta separación facilita tener en servidores distintos el Frontend y el Backend y eso convierte a las aplicaciones en productos más flexibles a la hora de trabajar.
3.	**La API REST siempre es independiente del tipo de plataformas o lenguajes:** la API REST siempre se adapta al tipo de sintaxis o plataformas con las que se estén trabajando, lo que ofrece una gran libertad a la hora de cambiar o probar nuevos entornos dentro del desarrollo. Con una API REST se pueden tener servidores PHP, Java, Python o Node.js. Lo único que es indispensable es que las respuestas a las peticiones se hagan siempre en el lenguaje de intercambio de información usado, normalmente XML o JSON.

**Desventajas del uso de REST**

1.	Con el uso de REST no mantenemos estados y eso hace que se deba montar una infraestructura propia para poder conservar el conjunto de la aplicación. Generalmente el Frontend enviara un token que indicara quién es al servidor y qué es lo que ya se ha realizado en el sistema.
2.	Puede producirse en determinadas circunstancias mayor rigidez en el desarrollo, sobre todo al ser dos o más proyectos independientes, el Backend basado en REST y el o los múltiples Frontend.
3.	Pueden surgir situaciones de des-sincronización. Por ejemplo, desde el cliente (Frontend) se detectan nuevos requisitos del API (Backend) y los encargados de crearlas en la parte del server pueden estar a otro ritmo y tardar en desarrollarlas.

**Ventajas del uso de SpringBoot**

1.	Tiene un completo soporte de transacciones.
2.	Es posible utilizar anotaciones.
3.	El manejo de las conexiones a la base de datos se realiza por medio de DataSources.
4.	El cierre de las conexiones a la base de datos es transparente al usuario.
5.	Cuenta con manejo de DAOs los cuales manejan la conexión a la base de datos, que son los que obtienen y guardan los datos.
6.	Se integra fácilmente con diferentes ORM lo que permite a nuestro código ser flexible a diferentes implementaciones.

**Desventajas del uso de SpringBoot**

1.	Por cada servicio que tengamos debemos de configurarlo en un xml.
2.	No podemos saber si realizamos bien la inyección de un objeto más que en tiempo de ejecución.

**Ventajas del uso de Angular**

1.	Preparado para cualquier tipo de aplicaciones
2.	Excelente documentación técnica
3.	Un buen número de módulos creados por la comunidad
4.	Sugiere muy buenas convenciones para nombrar tus archivos, componentes, módulos y servicios
5.	Hace uso extensivo de un stack moderno que incluye: TypeScript y Webpack.
6.	Posee una Command Line Interface: Angular CLI que permite generar código boilerplate muy rápidamente
7.	Preparado para lazy loading
8.	Provee un modo producción y un modo desarrollo
9.	Listo para Ahead of Time Compilation
10.	Angular es bien apreciado en el mundo front-end empresarial

**Desventajas de uso Angular**

1.	Angular es un Framework que puede ser complejo, por lo que la curva de aprendizaje puede ser alta dependiendo de la experiencia previa de los desarrolladores.
2.	En algunas situaciones puede ser engorroso rastrear los errores generados durante el desarrollo

Con estos puntos es fácil poder apreciar que la cantidad de ventajas supera en un gran numero a las desventajas que son de menor relevancia para él sistema. 

**Inconsistencias en la Arquitectura**

Respecto a las inconsistencias de el desarrollo del sistema podemos destacar solo una, que los sensores medioambientales utilizados realizan una conexión directa a la base de datos para el almacenamiento 

**Posibles direcciones evolución**

Durante la reunión junto a los Stakeholders se trato el punto de la implementación de mapas de temperatura para fechas establecidas por los clientes, este punto será fácil de tratar una vez que se tenga una mayor cantidad de datos medioambientales de sensores en distintas ubicaciones, gracias a la separación entre el cliente y el servidor será más simple implementar cualquier nueva característica como esta.
