@ECHO OFF

rem Codificando 'Strings\main.dat'
call py .\pyscripts\encode_keys.py -i Strings/main.dat.xml -o Strings/main.dat

rem Instalando directorio 'Strings'
call robocopy .\Strings "%PathologicGameDir%\data\Strings"

exit