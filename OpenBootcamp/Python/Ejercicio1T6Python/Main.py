class Vehiculo:
    Color="rojo"
    Ruedas=4
    Puertas=4

class Coche(Vehiculo):
    Velocidad=120
    Cilindrada=2500

print("El coche es de color", Coche.Color)
print("El coche tiene", Coche.Ruedas, "ruedas.")
print("El coche tiene", Coche.Puertas, "puertas.")
print("La velocidad actual del coche es:", Coche.Velocidad, "Km/h.")
print("La cilindrada del coche es de", Coche.Cilindrada, "cc")