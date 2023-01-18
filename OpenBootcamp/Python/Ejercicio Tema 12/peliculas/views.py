from django.shortcuts import render
from .models import Director, Genere, Pelicula

def index(request):
    num_Directors=Director.objects.all().count()
    num_Generes=Genere.objects.all().count()
    num_Peliculas=Pelicula.objects.all().count()

    return render(
        request,
        'index.html',
        context={
            'num_Directors': num_Directors,
            'num_Generes': num_Generes,
            'num_Peliculas': num_Peliculas
        }
    )

#Me da error templates does not exist, me faltaría crear los html o copiarlos de lo que pille en google
#No lo hago porque aún no sé HTML y no me fío.