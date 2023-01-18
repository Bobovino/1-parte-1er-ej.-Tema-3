class Vehiculo:
    def __init__(self,ruedas,velocidad):
        self.ruedas=ruedas
        self.velocidad=velocidad
    def getRuedas(self):
        return self.ruedas
    def getVelocidad(self):
        return self.velocidad

coche=Vehiculo(4,120)

f=open("Archivo2.txt",'r+')
f.write("Las ruedas del coche son ")
f.write(str(coche.getRuedas()))
f.write("\n")
f.write("La velocidad del coche es ")
f.write(str(coche.getVelocidad()))
f.write("\n")

for line in f:
    print(line.strip())

f.close()