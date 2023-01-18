f=open("Archivo.txt", 'w')
f.write('Accedemos al archivo por PRIMERA vez\n')
f.close()

f=open("Archivo.txt", 'a')
f.write("Accedemos al archivo por SEGUNDA vez\n")
f.close()
