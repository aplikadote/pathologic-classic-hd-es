@ECHO OFF

call kotlinc -script kscripts\stringsdevcreator.kts Strings\main.dat.xml Strings_dev\main.dat.xml

exit
