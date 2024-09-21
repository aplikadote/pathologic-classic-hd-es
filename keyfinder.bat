@ECHO OFF

call kotlinc -script kscripts/keyfinder.kts %1 Strings\main.dat.xml Strings_dev\main.dat.xml

exit
