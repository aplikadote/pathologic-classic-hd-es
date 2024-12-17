# Descripción
Traducción al español del juego Pathologic Classic HD

# Instrucciones
Directorios:
-  _**REPO**_ : directorio descomprimido del repositorio **pathologic-classic-hd-es**
-  _**GAME**_ : directorio de instalación del juego (*)

Pasos:
- Descargar repositorio como archivo ZIP (*) y descomprimir.
- El directorio anterior es el denominado _**REPO**_.
- Dentro del directorio _**REPO**_ existe el directorio 'Strings'
- Copiar directorio '_**REPO**_/Strings' dentro del directorio '_**GAME**_/data'

<sub>(*) En steam, ir a Biblioteca, boton derecho sobre el juego -> Propiedades -> Archivos Instalados -> Explorar</sub>

<sub>(**) Click sobre el boton 'Code', luego click en 'Download ZIP'</sub>

<br>

Si lo anterior no funciona inmediatamente
Dentro del archivo '_**GAME**_\data\config.ini', modificar la línea 

<pre>StringsType = VFS</pre>

por

<pre>StringsType = FS</pre>

# Guía de compilación manual
1. Instalar [python](https://www.python.org/downloads/) (la última versión disponible, 3.13.0 a la fecha nov-2024)
2. Obtener la ultima versión del proyecto **pathologic-classic-hd-es** (descargar como zip)
4. Ir al directorio _**REPO**_ y abrir un Terminal de windows (***)
5. Ejecutar <pre>> .\compile.bat </pre>

<sub>(***) Boton derecho en un lugar sin iconos de directorio o archivos y seleccionar 'Abrir en Terminal'</sub>

El script actualizará el fichero 'Strings/main.dat'.

El directorio 'Strings' ahora estará listo para ser copiado al directorio '_**GAME**_/data'

# Enlaces y Agradecimientos
Gracias a [**somevideoguy**](https://github.com/somevideoguy/pathologic) por publicar los scripts en python que permitió esta traducción.

Esta traducción fue posible gracias a las herramientas de libre acceso:
- [Python 3.13.0](https://www.python.org/downloads/)
- [Kotlinc 2.1.0](https://kotlinlang.org/docs/command-line.html)

