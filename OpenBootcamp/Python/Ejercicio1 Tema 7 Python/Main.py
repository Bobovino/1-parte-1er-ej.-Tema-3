import Operaciones as op

def main():

    a=float(input("Introduce un número: "))
    b=float(input("Introduce otro número: "))

    print("Su suma es: ",op.suma(a,b))
    print("Su resta es: ", op.resta(a,b))
    print("Su multiplicación es: ", op.multiplicacion(a,b))
    print("Su división es: ", op.division(a,b))


if __name__=='__main__':
    main()