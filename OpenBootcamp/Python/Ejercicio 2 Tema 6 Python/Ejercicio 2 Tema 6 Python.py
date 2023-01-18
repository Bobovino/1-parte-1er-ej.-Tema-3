class Alumno:
    nombre=''
    nota=''

    def cambiarNombre(self):
        self.nombre=input("Intoduzca el nombre del alumno: ")
    def cambiarNota(self):
        self.nota=int(input("Intoduzca la nota del alumno: "))

Alumno1=Alumno()
Alumno1.cambiarNombre()
Alumno1.cambiarNota()

print("El Alumno se llama:",Alumno1.nombre)
print("Su nota es:",Alumno1.nota)

if Alumno1.nota >= 5:
    print(Alumno1.nombre,"está aprobadísimo.")
else:
    print(Alumno1.nombre,"está suspenso.")





