# Guía de Configuración de Base de Datos con JDBC en NetBeans

Esta guía contiene los pasos detallados para configurar una conexión a una base de datos utilizando el driver JDBC dentro del IDE Apache NetBeans.

## Paso 1: Descargar el Driver JDBC

Antes de comenzar, debes tener descargado el driver JDBC correspondiente a tu sistema gestor de bases de datos (SGBD).
- Para **MySQL**: Descarga el archivo `.jar` de *MySQL Connector/J*.
- Para **PostgreSQL**: Descarga el archivo `.jar` de *PostgreSQL JDBC Driver*.
- Para **SQL Server**: Descarga el archivo `.jar` de *Microsoft JDBC Driver for SQL Server*.

*(Ilustración 1: Mostrar una captura de pantalla de la página web oficial descargando el driver correspondiente)*

## Paso 2: Registrar el Driver en NetBeans (Pestaña Services)

1. Abre Apache NetBeans y dirígete a la pestaña **Services** (Servicios), que normalmente se encuentra en la parte superior izquierda, junto a *Projects* y *Files*.
2. Despliega el nodo **Databases**.
3. Haz clic derecho sobre la carpeta **Drivers** y selecciona **New Driver...** (Nuevo Controlador...).

*(Ilustración 2: Captura de pantalla mostrando el menú contextual sobre la carpeta 'Drivers' con la opción 'New Driver' resaltada)*

## Paso 3: Añadir el archivo JAR del Driver

1. En la ventana "New JDBC Driver", haz clic en el botón **Add...** (Añadir...).
2. Navega por el explorador de archivos hasta la ubicación donde guardaste el archivo `.jar` del driver JDBC descargado en el Paso 1.
3. Selecciónalo y haz clic en **Open** (Abrir).
4. El nombre de la clase del driver (Driver Class) debería detectarse automáticamente (por ejemplo, `com.mysql.cj.jdbc.Driver` para MySQL).
5. Haz clic en **OK**.

*(Ilustración 3: Ventana de diálogo 'New JDBC Driver' con el botón Add resaltado y el archivo .jar ya listado)*

## Paso 4: Crear la Conexión a la Base de Datos

1. Una vez que el driver está registrado, verás el nuevo driver bajo la carpeta **Drivers** en la pestaña **Services**.
2. Haz clic derecho sobre tu nuevo driver (ej. *MySQL (Connector/J driver)*) y selecciona **Connect Using...** (Conectar usando...).

*(Ilustración 4: Captura del menú contextual sobre el driver recién creado mostrando la opción 'Connect Using...')*

## Paso 5: Configurar los Parámetros de la Conexión

Se abrirá el asistente "New Connection Wizard". Aquí debes introducir los detalles de tu servidor de base de datos:

- **Host**: `localhost` (si está en tu propia máquina) o la IP del servidor.
- **Port**: El puerto por defecto (ej. `3306` para MySQL, `5432` para PostgreSQL).
- **Database**: El nombre de tu base de datos (debes haberla creado previamente en tu SGBD).
- **User Name**: Tu usuario (ej. `root`).
- **Password**: La contraseña de tu usuario.

1. Haz clic en el botón **Test Connection** (Probar Conexión). Si los datos son correctos, verás un mensaje indicando *Connection Succeeded* (Conexión exitosa).
2. Haz clic en **Next**, luego **Next** nuevamente, y finalmente en **Finish** (Terminar).

*(Ilustración 5: Formulario de la conexión con todos los datos rellenos y el mensaje de 'Connection Succeeded' visible)*

## Paso 6: Agregar el Driver al Proyecto de Java (Opcional pero necesario para código)

Para que tu código Java (como en el proyecto de Herencia) pueda utilizar la base de datos, debes agregar el `.jar` al *Classpath* o dependencias de tu proyecto:

**Si usas Ant (Proyecto Normal):**
1. En la pestaña **Projects**, busca tu proyecto.
2. Haz clic derecho en la carpeta **Libraries** y selecciona **Add JAR/Folder...**.
3. Selecciona el archivo `.jar` del driver y acepta.

**Si usas Maven:**
1. Expande tu proyecto, haz clic derecho en **Dependencies** y selecciona **Add Dependency...**.
2. Busca el driver en el repositorio (ej. `mysql-connector-java`) o edita directamente el archivo `pom.xml` agregando la dependencia.

*(Ilustración 6: Carpeta Libraries en el panel de proyectos con el archivo JAR del driver agregado)*

---

### Nota sobre las ilustraciones:
*Al momento de pasar esto a tu documento de Word definitivo, por favor reemplaza los textos en cursiva "*(Ilustración...)*" por capturas de pantalla reales de tu propio IDE realizando cada paso, tal como lo requiere la rúbrica de la actividad.*
