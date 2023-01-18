import time

def main():

    t=time.localtime()
    print(t)
    hora_actual=time.strftime("%H:%M:%S", t)
    print("Son las: ", hora_actual)

    #La única condición es terminar a las siete, asumo que de la tarde.
    if hora_actual>= '19:00:00' :
        print("Son más de las siete, vete a casa.")

    else:
        print("No es hora de irse a casa aún, espera a que sean las siete.")
        print("Quedan ",18-t.tm_hour,':',59-t.tm_min,':' ,59-t.tm_sec , "para irte")


if __name__=='__main__':
    main()