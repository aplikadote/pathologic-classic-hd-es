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

# Guía de compilación manual
1. Instalar [python](https://www.python.org/downloads/) (la última versión disponible, 3.13.0 a la fecha nov-2024)
2. Obtener la ultima versión del proyecto **pathologic-classic-hd-es** (descargar como zip)
4. Ir al directorio _REPO_ y abrir un Terminal de windows (Boton derecho en un lugar sin iconos de directorio y seleccionar 'Abrir en Terminal')
5. Ejecutar <pre>> .\compile.bat </pre>

El script actualizará el fichero 'Strings/main.dat'.

El directorio 'Strings' ahora estará listo para ser copiado al directorio '_GAME_/data'

# Enlaces y Agradecimientos
Gracias a **somevideoguy** por publicar los scripts en python que permitió esta traducción.

Repositorio: https://github.com/somevideoguy/pathologic
