# Requisitos especificos de sofware
## For Rush Table POS

Tabla de Contenidos
=================
* [Historial de Revisiones](#historial-de-revisiones)
* 1 [Introducción](#1-introducción)
  * 1.1 [Propósito del Documento](#11-propósito-del-documento)
  * 1.2 [Alcance del Producto](#12-alcance-del-producto)
  * 1.3 [Definiciones, Acrónimos y Abreviaturas](#13-definiciones-acrónimos-y-abreviaturas)
  * 1.4 [Referencias](#14-referencias)
  * 1.5 [Resumen del Documento](#15-resumen-del-documento)
* 2 [Visión General del Producto](#2-visión-general-del-producto)
  * 2.1 [Perspectiva del Producto](#21-perspectiva-del-producto)
  * 2.2 [Funciones del Producto](#22-funciones-del-producto)
  * 2.3 [Restricciones del Producto](#23-restricciones-del-producto)
  * 2.4 [Características del Usuario](#24-características-del-usuario)
  * 2.5 [Suposiciones y Dependencias](#25-suposiciones-y-dependencias)
  * 2.6 [Asignación de Requisitos](#26-asignación-de-requisitos)
* 3 [Requisitos](#3-requisitos)
  * 3.1 [Interfaces Externas](#31-interfaces-externas)
    * 3.1.1 [Interfaces de Usuario](#311-interfaces-de-usuario)
    * 3.1.2 [Interfaces de Hardware](#312-interfaces-de-hardware)
    * 3.1.3 [Interfaces de Software](#313-interfaces-de-software)
  * 3.2 [Funcionales](#32-funcionales)
  * 3.3 [Calidad del Servicio](#33-calidad-del-servicio)
    * 3.3.1 [Rendimiento](#331-rendimiento)
    * 3.3.2 [Seguridad](#332-seguridad)
    * 3.3.3 [Fiabilidad](#333-fiabilidad)
    * 3.3.4 [Disponibilidad](#334-disponibilidad)
  * 3.4 [Cumplimiento](#34-cumplimiento)
  * 3.5 [Diseño e Implementación](#35-diseño-e-implementación)
    * 3.5.1 [Instalación](#351-instalación)
    * 3.5.2 [Distribución](#352-distribución)
    * 3.5.3 [Mantenibilidad](#353-mantenibilidad)
    * 3.5.4 [Reutilización](#354-reutilización)
    * 3.5.5 [Portabilidad](#355-portabilidad)
    * 3.5.6 [Costo](#356-costo)
    * 3.5.7 [Fecha Límite](#357-fecha-límite)
    * 3.5.8 [Prueba de Concepto](#358-prueba-de-concepto)
* 4 [Verificación](#4-verificación)
* 5 [Apéndices](#5-apéndices)

## Historial de Revisiones
| Nombre | Fecha   | Razón de los Cambios  | Versión   |
| ---- | ------- | ------------------- | --------- |
|      |         |                     |           |
|      |         |                     |           |
|      |         |                     |           |

## 1. Introducción
> (Esta sección debería proporcionar una descripción general de todo el documento).
Este documento proporciona una descripción completa del proyecto, detallando información relevante para cada área involucrada, incluyendo programadores, equipo de testeo, diseñador de interfaz de usuario (UI), equipo de marketing, entre otros. Un sistema de punto de venta eficiente es esencial para cualquier negocio, ya que optimiza las operaciones diarias, desde el registro de ventas hasta la gestión del inventario y la generación de informes financieros. Por lo tanto, es crucial definir claramente los requisitos y objetivos del software de punto de venta para garantizar su desarrollo y funcionamiento exitosos. Este documento servirá como guía integral para comprender y ejecutar el proyecto de manera eficiente y efectiva.
### 1.1 Propósito del Documento
Describir el propósito del SRS y su audiencia prevista.

El propósito principal de este documento es proporcionar una descripción detallada y completa del proyecto, abordando aspectos relevantes para cada área involucrada en su desarrollo y ejecución, desde los programadores hasta el equipo de marketing. Se busca crear una guía integral que cubra todos los aspectos esenciales del proyecto, estableciendo claramente los requisitos y objetivos que se persiguen. La intención es brindar una referencia detallada que permita comprender y ejecutar eficientemente todas las etapas del proyecto, promoviendo así la coherencia y la efectividad en su implementación. Este documento servirá como un recurso fundamental para alinear las expectativas, facilitar la comunicación entre los diferentes equipos y garantizar el éxito general del proyecto.

### 1.2 Alcance del Producto
Identificar el producto cuyos requisitos de software se especifican en este documento, incluido el número de revisión o versión. Explicar lo que hará el producto cubierto por este SRS, especialmente si este SRS describe solo parte del sistema o un subsistema único. Proporcionar una breve descripción del software que se está especificando y su propósito, incluidos los beneficios relevantes, objetivos y metas. Relacionar el software con los objetivos corporativos o estrategias comerciales. Si hay disponible un documento de visión y alcance separado, haga referencia a él en lugar de duplicar su contenido aquí.

El producto abordado por este documento es el Sistema de Punto de Venta (POS) diseñado específicamente para un restaurante. Este POS proporcionará una amplia gama de características y herramientas amigables para el usuario, destinadas a facilitar una gestión empresarial eficiente. Se centrará en agilizar las operaciones diarias del restaurante, organizar los datos y simplificar las tareas cotidianas, al tiempo que potencia el potencial de la organización.

El propósito principal del software es mejorar la eficiencia operativa del restaurante al reducir la necesidad de recuentos de inventario manuales y procesos largos mediante herramientas de automatización inteligentes e integradas. Además, el POS permitirá registrar transacciones, generar informes regulares sobre las métricas comerciales, ajustar precios, controlar aspectos financieros y completar otras tareas esenciales con precisión tecnológica.

El sistema también simplificará las operaciones al proporcionar capacidades de control de stock eficientes, reduciendo la necesidad de mano de obra manual y manteniendo actualizados los requisitos de stock. Además, ofrecerá la capacidad de crear grupos y enviar facturas a clientes, con recordatorios automáticos, informes digitales, gestión de nóminas y más.

En términos de rendimiento, el POS reducirá el riesgo de errores humanos y ahorrará tiempo mediante características como quioscos de autoservicio, recuentos de inventario automatizados y programación de empleados, permitiendo a los empleados centrarse en el servicio al cliente.

Además, proporcionará información valiosa sobre el comportamiento del cliente y ayudará a identificar ventajas y desventajas de la empresa para desarrollar estrategias comerciales sólidas. Las integraciones de terceros mejorarán aún más el rendimiento de las herramientas existentes.

En cuanto a la seguridad, el POS realizará copias de seguridad de datos regularmente, ofrecerá pagos compatibles con PCI, puntos de venta seguros y encriptación de datos, garantizando la seguridad contra hackeos maliciosos y otras amenazas.

### 1.3 Definiciones, Acrónimos y Abreviaturas

### 1.4 Referencias
Enumerar cualquier otro documento o direcciones web a los que se refiera este SRS. Estos pueden incluir guías de estilo de interfaz de usuario, contratos, estándares, especificaciones de requisitos del sistema, documentos de casos de uso o un documento de visión y alcance. Proporcionar suficiente información para que el lector pueda acceder a una copia de cada referencia, incluido el título, autor, número de versión, fecha y origen o ubicación.

### 1.5 Resumen del Documento
Describir lo que contiene el resto del documento y cómo está organizado.

## 2. Visión General del Producto
> Esta sección debería describir los factores generales que afectan al producto y sus requisitos. Esta sección no establece requisitos específicos. En su lugar, proporciona un contexto para esos requisitos, que se definen en detalle en la Sección 3, y los hace más fáciles de entender.

### 2.1 Perspectiva del Producto
Describir el contexto y el origen del producto que se especifica en este SRS. Por ejemplo, indique si este producto es un miembro de seguimiento de una familia de productos, un reemplazo para ciertos sistemas existentes o un producto nuevo y autocontenido. Si el SRS define un componente de un sistema más grande, relacione los requisitos del sistema más grande con la funcionalidad de este software e identifique las interfaces entre los dos. Un diagrama simple que muestre los componentes principales del sistema general, las interconexiones de los subsistemas y las interfaces externas puede ser útil.

En el ámbito de la industria gastronómica, un sistema de punto de venta (POS) para restaurantes se erige como una herramienta esencial para optimizar la eficiencia y la productividad del negocio. Al fusionar interfaces amigables con funciones avanzadas de gestión, estos sistemas agilizan la toma de pedidos, el marketing, la gestión de inventarios y el análisis empresarial. 

### 2.2 Funciones del Producto
Resumir las principales funciones que el producto debe realizar o permitir al usuario realizar. Los detalles se proporcionarán en la Sección 3, por lo que aquí solo se necesita un resumen de alto nivel (como una lista con viñetas). Organice las funciones para que sean comprensibles para cualquier lector del SRS. Una imagen de los principales grupos de requisitos relacionados y cómo se relacionan, como un diagrama de flujo de datos de nivel superior o un diagrama de clase de objetos, a menudo es efectiva.

Los sistemas POS modernos están diseñados con la premisa de ofrecer una experiencia de usuario fluida y eficaz. Facilitan a los empleados del restaurante la ejecución rápida y precisa de pedidos, al tiempo que permiten la recopilación de información relevante de los clientes para estrategias de marketing dirigidas. Destaca también la gestión de inventario automatizada, que actualiza los recuentos de existencias con cada venta, optimizando así el control de inventarios y reduciendo el tiempo dedicado a tareas administrativas.

Interfaz fácil de usar:

La usabilidad es fundamental para un sistema POS exitoso. Debe contar con una interfaz intuitiva y fácil de navegar para que el personal pueda realizar transacciones sin esfuerzo y con mínimos errores. Funciones como compatibilidad con pantalla táctil y diseños personalizables son aspectos a tener en cuenta.
Gestión de inventario:

Una gestión eficiente del inventario es esencial para mantener un equilibrio óptimo de existencias y evitar problemas como la falta o el exceso de productos. El POS debe permitirle realizar un seguimiento en tiempo real del inventario, configurar reordenamientos automáticos y gestionar proveedores de manera efectiva.
Informes y análisis de ventas:

La capacidad de generar informes detallados y analizar las ventas es crucial para comprender el rendimiento del negocio. El sistema POS debe ofrecer insights sobre tendencias de ventas, productos más populares y comportamiento del cliente, lo que le permite tomar decisiones informadas para mejorar la rentabilidad.
Capacidades de integración:

Es fundamental que el sistema POS se integre sin problemas con otros software utilizados en el negocio, como herramientas de contabilidad, gestión de relaciones con el cliente (CRM) y plataformas de comercio electrónico. La integración facilita el intercambio de datos entre sistemas y mejora la eficiencia operativa.
Procesamiento de pagos:

La capacidad de procesar pagos de manera eficiente es esencial para la satisfacción del cliente. El sistema POS debe admitir una variedad de métodos de pago y garantizar transacciones rápidas y seguras para reducir los tiempos de espera y proteger la información del cliente.
Seguridad y cumplimiento:

La seguridad de los datos es una prioridad. El sistema POS debe cumplir con estándares y regulaciones de la industria para proteger la información sensible del cliente. Funciones como encriptación de extremo a extremo y controles de acceso garantizan la seguridad de los datos.
Escalabilidad:

Al elegir un sistema POS, es importante considerar la capacidad de escalabilidad para adaptarse al crecimiento del negocio. La solución debe ser flexible y permitir la expansión sin dificultades técnicas significativas.
### 2.3 Restricciones del Producto
Esta subsección debería proporcionar una descripción general de cualquier otro elemento que limite las opciones del desarrollador. Estos pueden incluir:
* Interfaces a usuarios, otras aplicaciones o hardware.
* Restricciones de calidad de servicio.
* Cumplimiento de estándares.
* Restricciones en torno al diseño o implementación.

El sistema de punto de venta (POS) para restaurantes se enfrenta a varias restricciones que limitan las opciones de desarrollo y funcionamiento. Estas restricciones son fundamentales para garantizar un funcionamiento óptimo y seguro del sistema en el entorno restaurantero. A continuación, se detallan algunas de las restricciones más relevantes:

* **Nivel de Conocimiento de los Usuarios**: Una restricción importante es que no todos los usuarios del sistema, especialmente los meseros, tienen un gran conocimiento técnico. Por lo tanto, el sistema debe ser intuitivo y fácil de usar, con una interfaz de usuario clara y sencilla que requiera un mínimo de capacitación para su operación.

* **Autoridad de los Meseros**: Los meseros no deben tener total autoridad sobre el sistema, ya que podrían realizar acciones indebidas o acceder a funciones sensibles. Se requiere un control de acceso adecuado para garantizar que cada usuario tenga los permisos adecuados según su rol en el restaurante.

* **Necesidad de Supervisión Gerencial**: Debido a la naturaleza crítica de las operaciones del restaurante, es fundamental que el sistema cuente con la supervisión adecuada de los gerentes. Los gerentes deben tener acceso a funciones avanzadas de gestión y reportes para monitorear el desempeño del restaurante y tomar decisiones informadas.

* **Velocidad de Operación**: En el ámbito restaurantero, la velocidad es esencial para brindar un servicio de calidad. El sistema POS debe ser rápido y ágil, capaz de procesar pedidos y transacciones de manera eficiente para evitar retrasos y garantizar la satisfacción del cliente.

* **Cumplimiento con los Estándares de la Industria**: El sistema debe cumplir con los estándares de la industria restaurantera, incluido el manejo de comandas, la terminología específica del sector y los procedimientos operativos comunes en los restaurantes. Esto garantiza una integración suave con las prácticas establecidas y facilita la adopción del sistema por parte del personal.

Al considerar estas restricciones, el diseño y la implementación del sistema POS deben priorizar la facilidad de uso, la seguridad, la eficiencia operativa y el cumplimiento con los estándares de la industria gastronómica. Estas consideraciones son fundamentales para garantizar el éxito y la aceptación del sistema en el entorno restaurantero.




### 2.4 Características del Usuario
Identificar las diversas clases de usuarios que se anticipa que utilizarán este producto. Las clases de usuarios pueden diferenciarse según la frecuencia de uso, el subconjunto de funciones del producto utilizadas, la experiencia técnica, los niveles de seguridad o privilegio, el nivel educativo o la experiencia. Describir las características pertinentes de cada clase de usuario. Es posible que ciertos requisitos se refieran solo a ciertas clases de usuarios. Distinguir las clases de usuarios más importantes para este producto de las menos importantes para satisfacer.

Los principales usuarios de los sistemas POS son los propietarios, administradores y personal de servicio del restaurante. Estos se benefician de las funciones intuitivas y las herramientas de análisis empresarial para la toma de decisiones informadas que ofrecen estos sistemas.
El sistema de punto de venta (POS) para restaurantes está diseñado para atender a diversas clases de usuarios que desempeñan roles específicos dentro del establecimiento gastronómico. A continuación, se describen las características y funciones principales de cada clase de usuario:

#### 1. Mesero:
- **Descripción**: Los meseros son usuarios clave en el sistema POS, responsables de tomar pedidos, registrar pagos, administrar mesas y garantizar la satisfacción del cliente.
- **Funciones Principales**:
  - Registrar pagos de cuentas.
  - Ingresar pedidos de los clientes.
  - Imprimir cuentas para los clientes.
  - Administrar sus mesas y cuentas asociadas.
  - Verificar la disponibilidad de productos en el inventario.
  - Consultar horarios y registrar entradas y salidas.
- **Nivel Educativo y Técnico**: Los meseros no requieren un nivel educativo avanzado ni conocimientos técnicos especializados. Se espera que puedan operar el sistema con un mínimo de capacitación.

#### 2. Supervisor de Piso:
- **Descripción**: Los supervisores de piso tienen un rol de supervisión y control sobre las operaciones del restaurante. Actúan como intermediarios entre los meseros y la gerencia.
- **Funciones Principales**:
  - Acceder a las mesas y cuentas de todos los meseros.
  - Visualizar todas las cuentas abiertas en el momento.
  - Acceder a cuentas cerradas (pagos registrados) durante el día.
  - Modificar y borrar elementos de las cuentas según sea necesario.
  - Imprimir cuentas y gestionar alimentos especiales, como cortesías.
  - Realizar descuentos en las cuentas de los clientes.
- **Nivel Educativo y Técnico**: Se espera que los supervisores de piso tengan un nivel educativo intermedio y conocimientos técnicos básicos para operar el sistema y realizar tareas de supervisión.

#### 3. Gerente:
- **Descripción**: Los gerentes tienen un rol de liderazgo y toma de decisiones en el restaurante. Son responsables de la gestión global del establecimiento y la optimización de su rendimiento.
- **Funciones Principales**:
  - Acceder a informes de ventas y análisis de desempeño de los meseros.
  - Consultar información detallada sobre la venta, incluidos todos los pagos realizados en el día.
  - Modificar el menú, agregar o eliminar elementos según sea necesario.
  - Gestionar el inventario y realizar ajustes según las necesidades del negocio.
  - Elaborar horarios de trabajo para el personal.
- **Nivel Educativo y Técnico**: Se espera que los gerentes tengan un nivel educativo avanzado y sólidos conocimientos técnicos para utilizar el sistema de manera efectiva y tomar decisiones estratégicas para el restaurante.

#### 4. Áreas de Producción (Bartenders y Cocineros):
- **Descripción**: Las áreas de producción, que incluyen a los bartenders y cocineros, utilizan el sistema POS principalmente para gestionar y coordinar los pedidos entrantes y salientes, así como para obtener información relevante sobre la preparación de los alimentos y bebidas.
- **Funciones Principales**:
  - Ver los pedidos asignados a su área de trabajo.
  - Organizar el orden de preparación de los pedidos.
  - Marcar los pedidos como completados una vez finalizados.
  - Consultar indicaciones especiales sobre la preparación de platos.
  - Revisar pedidos anteriores realizados durante su turno de trabajo.
- **Nivel Educativo y Técnico**: Aunque se espera que tengan un conocimiento práctico de las operaciones del restaurante, los bartenders y cocineros no necesitan un nivel educativo específico ni habilidades técnicas avanzadas para utilizar el sistema POS en su área de producción.
### 2.5 Suposiciones y Dependencias
Enumerar los factores asumidos (en lugar de hechos conocidos) que podrían afectar a los requisitos establecidos en el SRS. Estos podrían incluir componentes de terceros o comerciales que planea utilizar, problemas relacionados con el entorno de desarrollo o operación, o restricciones. El proyecto podría verse afectado si estas suposiciones son incorrectas, no se comparten o cambian. También identificar cualquier dependencia que el proyecto tenga con factores externos, como componentes de software que pretende reutilizar de otro proyecto, a menos que ya estén documentados en otro lugar (por ejemplo, en el documento de visión y alcance o el plan del proyecto).

Se asume que los restaurantes que implementan un sistema POS buscan mejorar la eficiencia operativa, aumentar la satisfacción del cliente y optimizar los procesos de negocio mediante el uso de tecnología avanzada y herramientas de gestión modernas.

### 2.6 Asignación de Requisitos
Asignar los requisitos de software a elementos de software. Para los requisitos que requerirán implementación en múltiples elementos de software, o cuando la asignación a un elemento de software esté inicialmente indefinida, esto debe indicarse así. Se debe utilizar una tabla de referencia cruzada por función y elemento de software para resumir la asignación.

Identificar los requisitos que pueden posponerse hasta versiones futuras del sistema (por ejemplo, bloques y/o incrementos).


## 3. Requisitos
> Esta sección especifica los requisitos del producto de software. Especificar todos los requisitos de software a un nivel de detalle suficiente para permitir que los diseñadores diseñen un sistema de software que satisfaga esos requisitos, y para permitir que los probadores prueben que el sistema de software cumple con esos requisitos.

> Los requisitos específicos deben:
* Ser identificables de manera única.
* Indicar el sujeto del requisito (por ejemplo, sistema, software, etc.) y qué se debe hacer.
* Opcionalmente, indicar las condiciones y restricciones, si las hay.
* Describir cada entrada (estímulo) en el sistema de software, cada salida (respuesta) del sistema de software y todas las funciones realizadas por el sistema de software en respuesta a una entrada o en apoyo de una salida.
* Ser verificables (por ejemplo, la realización del requisito se puede demostrar a satisfacción del cliente)
* Conformarse a una sintaxis acordada, palabras clave y términos.

### 3.1 Interfaces Externas
> Esta subsección define todos los requisitos de entradas y salidas del sistema de software. Cada interfaz definida puede incluir el siguiente contenido:
* Nombre del elemento
* Origen de la entrada o destino de la salida
* Rango válido, precisión y/o tolerancia
* Unidades de medida
* Sincronización
* Relaciones con otras entradas/salidas
* Formatos/organización de pantalla
* Formatos/organización de ventana
* Formatos de datos
* Formatos de comandos
* Mensajes finales

#### 3.1.1 Interfaces de Usuario
Definir los componentes de software para los que se necesita una interfaz de usuario. Describir las características lógicas de cada interfaz entre el producto de software y los usuarios. Esto puede incluir imágenes de pantalla de muestra, cualquier estándar de GUI o guías de estilo de la familia de productos que se deben seguir, restricciones de diseño de pantalla, botones estándar y funciones (por ejemplo, ayuda) que aparecerán en cada pantalla, atajos de teclado, estándares de visualización de mensajes de error, etc. Los detalles del diseño de la interfaz de usuario deben documentarse en una especificación de interfaz de usuario separada.

Podría dividirse además en requisitos de Usabilidad y Conveniencia.

#### 3.1.2 Interfaces de Hardware
Describir las características lógicas y físicas de cada interfaz entre el producto de software y los componentes de hardware del sistema. Esto puede incluir los tipos de dispositivos admitidos, la naturaleza de las interacciones de datos y control entre el software y el hardware, y los protocolos de comunicación que se utilizarán.

#### 3.1.3 Interfaces de Software
Describir las conexiones entre este producto y otros componentes de software específicos (nombre y versión), incluidas bases de datos, sistemas operativos, herramientas, bibliotecas y componentes comerciales integrados. Identificar los elementos de datos o mensajes que entran y salen del sistema y describir el propósito de cada uno. Describir los servicios necesarios y la naturaleza de las comunicaciones. Hacer referencia a documentos que describan protocolos de interfaz de programación de aplicaciones detallados. Identificar datos que se compartirán entre componentes de software. Si el mecanismo de intercambio de datos debe implementarse de una manera específica (por ejemplo, uso de un área de datos global en un sistema operativo multitarea), especifíquelo como una restricción de implementación.

### 3.2 Funcionales
> Esta sección especifica los requisitos de los efectos funcionales que el software a ser desarrollado debe tener en su entorno.

### 3.3 Calidad del Servicio
> Esta sección establece propiedades adicionales relacionadas con la calidad que los efectos funcionales del software deberían presentar.

#### 3.3.1 Rendimiento
Si hay requisitos de rendimiento para el producto en diversas circunstancias, indíquelos aquí y explique su justificación, para ayudar a los desarrolladores a comprender la intención y tomar decisiones de diseño adecuadas. Especifique las relaciones de tiempo para sistemas en tiempo real. Haga que dichos requisitos sean lo más específicos posible. Es posible que necesite establecer requisitos de rendimiento para requisitos o características funcionales individuales.

#### 3.3.2 Seguridad
Especificar cualquier requisito relacionado con la seguridad o problemas de privacidad relacionados con el uso del producto o la protección de los datos utilizados o creados por el producto. Definir cualquier requisito de autenticación de identidad de usuario. Hacer referencia a políticas externas o regulaciones que contengan problemas de seguridad que afecten al producto. Definir cualquier certificación de seguridad o privacidad que deba cumplirse.

#### 3.3.3 Fiabilidad
Especificar los factores necesarios para establecer la fiabilidad requerida del sistema de software en el momento de la entrega.

#### 3.3.4 Disponibilidad
Especificar los factores necesarios para garantizar un nivel de disponibilidad definido para todo el sistema, como punto de control, recuperación y reinicio.

### 3.4 Cumplimiento
Especificar los requisitos derivados de estándares o regulaciones existentes, incluidos:
* Formato de informe
* Nomenclatura de datos
* Procedimientos contables
* Trazabilidad de auditoría

Por ejemplo, esto podría especificar el requisito de que el software rastree la actividad de procesamiento. Tales trazas son necesarias para algunas aplicaciones para cumplir con los estándares mínimos regulatorios o financieros. Un requisito de trazabilidad de auditoría puede, por ejemplo, indicar que todos los cambios en una base de datos de nómina deben registrarse en un archivo de trazabilidad con valores antes y después.

### 3.5 Diseño e Implementación

#### 3.5.1 Instalación
Restricciones para garantizar que el software a desarrollar se ejecute sin problemas en la plataforma de implementación objetivo.

#### 3.5.2 Distribución
Restricciones en los componentes de software para adaptarse a la estructura geográficamente distribuida de la organización anfitriona, la distribución de datos a procesar o la distribución de dispositivos a controlar.

#### 3.5.3 Mantenibilidad
Especificar atributos del software que se relacionen con la facilidad de mantenimiento del propio software. Estos pueden incluir requisitos para cierta modularidad, interfaces o limitación de complejidad. No se deben colocar requisitos aquí solo porque se considere que son buenas prácticas de diseño.

#### 3.5.4 Reutilización
<!-- TODO: come up with a description -->

#### 3.5.5 Portabilidad
Especificar atributos del software que se relacionen con la facilidad de trasladar el software a otras máquinas anfitrionas y/o sistemas operativos.

#### 3.5.6 Costo
Especificar el costo monetario del producto de software.

#### 3.5.7 Fecha Límite
Especificar el cronograma para la entrega del producto de software.

#### 3.5.8 Prueba de Concepto
<!-- TODO: come up with a description -->

## 4. Verificación
> Esta sección proporciona los enfoques y métodos de verificación planificados para calificar el software. Se recomienda que los elementos de información para la verificación se den de manera paralela con los elementos de requisitos en la Sección 3. El propósito del proceso de verificación es proporcionar evidencia objetiva de que un sistema o elemento del sistema cumple con sus requisitos y características especificados.

<!-- TODO: dar más orientación, similar a la sección 3 -->
<!-- ieee 15288:2015 -->

## 5. Apéndices