# Descripción
Traducción al español del juego Pathologic Classic HD

# Instrucciones
Descargar el repositorio como archivo ZIP ('Code' -> 'Download ZIP') y descomprimir.

Copiar el directorio 'Strings' dentro del directorio 'data' de la carpeta de instalación del juego.

Para encontrar el directorio de instalación del juego, ir a la biblioteca de Steam, boton derecho sobre el juego -> Propiedades -> Archivos Instalados -> Explorar.

El resultado final deberia verse así:

<img src="readme01.png" width="750">

<br>

Si lo anterior no funciona inmediatamente, verificar que el directorio 'Strings' esté en la ubicación correcta.

Si el problema persiste, dentro del directorio 'data' existe un archivo llamado 'config.ini'. Modificar la línea: 

<pre>StringsType = VFS</pre>

por:

<pre>StringsType = FS</pre>

# Enlaces y Agradecimientos
Gracias a [**somevideoguy**](https://github.com/somevideoguy/pathologic) por publicar los scripts en python que permitió esta traducción.

Esta traducción fue posible gracias a las herramientas de libre acceso:
- [Python 3.13.0](https://www.python.org/downloads/)
- [Kotlinc 2.1.0](https://kotlinlang.org/docs/command-line.html)

