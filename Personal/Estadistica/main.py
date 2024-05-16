def calcularEquilibrio(a,b,c,d):
    equilibrio = (a - c)/ (b+d)
    return equilibrio

deseo =0
#inicio del programa

print("ingrese lo que desea hacer"
          "1 - Calcular el equilibrio de ufnciones de demanda y oferta"
          "2 - calcular ")

deseo = int(next())

 while (deseo > 1 and deseo < 100):

    print("ingrese lo que desea hacer"
          "1 - Calcular el equilibrio de ufnciones de demanda y oferta"
          "2 - calcular ")

    if deseo == 1 :
        print("Ingrese en a el numero de demanda sin x")
        a = int(next())
        print("Ingrese en b el numero de demanda con x")
        b = int(next())
        print("Ingrese en c el numero de oferta sin x")
        c = int(next())
        print("Ingrese en d el numero de eferta con x")
        d = int(next())
        equilibrio = calcularEquilibrio()




