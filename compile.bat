@ECHO OFF

call python .\pyscripts\encode_keys.py -i Strings/main.dat.xml -o Strings/main.dat
call python .\pyscripts\encode_keys.py -i Strings_dev/main.dat.xml -o Strings_dev/main.dat

exit
