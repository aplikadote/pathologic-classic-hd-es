@ECHO off

rem Creando 'String_dev/main.dat.xml'
call kotlinc -script kscripts\stringsdevcreator.kts Strings\main.dat.xml Strings_dev\main.dat.xml

rem Codificando 'Strings_dev\main.dat'
call python .\pyscripts\encode_keys.py -i Strings_dev/main.dat.xml -o Strings_dev/main.dat

rem Instalando directorio 'Strings'
call robocopy .\Strings_dev "%PathologicGameDir%\data\Strings"

exit