paises=[]
palabraClave='Salir'
palabra=''

print("Escribe paises hasta que te canses. Al terminar, escribe fuera y saldrán ordenados alfabéticamente.")

while palabra!=palabraClave:
    palabra=str(input(("Por favor, introduce un pais: ")))
    if palabra!=palabraClave:
        paises.append(palabra)
    else:
        paises.sort()
        paisesOrdenados=set(paises)
        print(paisesOrdenados)







