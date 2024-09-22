@ECHO OFF

call kotlinc -script kscripts/keyfinder.kts %1 Strings\main.dat.xml Strings_en\main.dat.xml

exit
