'''
En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada
por parámetro con filter y realizará una suma de todos estos elementos obtenidos mediante reduce.
'''
import functools

lista=[1,2,4,5,6,7,8,9,10]

def buscaImpares(lista):
    if lista % 2 !=0:
        return True
    return False

listaImpares=list(filter(buscaImpares,lista))
print(listaImpares)

sumaImpares=functools.reduce(lambda a,b: a+b, listaImpares)
print("La suma es:",sumaImpares)



