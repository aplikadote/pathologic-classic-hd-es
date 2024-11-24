# Descripción
Traducción al español del juego Pathologic Classic HD

# Instrucciones
- Descargar repositorio como archivo ZIP (*) y descomprimir. Llamaremos a este directorio _REPO_
- Ubicar el directorio de instalacion del juego (**). Llamaremos a este directorio _GAME_ 
- Copiar directorio '_REPO_/Strings' dentro del directorio '_GAME_/data'

<sub>(*) Click sobre el boton 'Code', luego click en 'Download ZIP'</sub>

<sub>(**) En steam, ir a Biblioteca, boton derecho sobre el juego -> Propiedades -> Archivos Instalados -> Explorar</sub>

## Si lo anterior no funciona inmediatamente
Dentro del archivo '$GAMEDIR\data\config.ini', modificar la línea 

<pre>StringsType = VFS</pre>

por

<pre>StringsType = FS</pre>

# Guía de compilación
1. Instalar [python](https://www.python.org/downloads/) (la última versión disponible, 3.13.0 a la fecha nov-2024)
2. **Recordar o copiar directorio de instalacion**. Usualmente se instalará en: <pre>C:\Users\\_USER_\AppData\Local\Programs\Python\Python313 (_USER_ es el usuario windows)</pre>
3. Agregar el directorio de instalación de python a la variable PATH de windows (*)
4. Dirigirse al directorio _REPO_ y abrir un Terminal de windows (Boton derecho y seleccionar 'Abrir en Terminal')
5. Ejecutar <pre>> .\compile.bat </pre>

## (*) Actualizar PATH de windows 
1. En explorador de directorios de windows, Boton Derecho sobre 'Este Equipo' -> 'Propiedades' -> 'Configuracion avanzada del sistema' -> 'Variables de entorno'
2. Se abrirá un dialogo llamado 'Variables de entorno'
3. Click sobre 'Path' de la seccion **'Variables de sistema'**. Luego click en botón 'Editar'
4. Aparecerá un dialog llamado 'Editar variable de entorno' con una lista de rutas de directorios
5. Click en botón 'Nuevo' y en el Textbox que aparecerá disponible para editar pegar la ruta de instalación de python.

# Enlaces y Agradecimientos
Gracias a **somevideoguy** por publicar los scripts en python que permitió esta traducción.

Repositorio: https://github.com/somevideoguy/pathologic
