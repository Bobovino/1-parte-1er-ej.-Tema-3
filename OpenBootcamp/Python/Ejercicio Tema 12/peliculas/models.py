from django.db import models
  

class Director(models.Model):
    name = models.CharField(max_length=64, help_text="Pon el nombre del autor.")
    surname = models.CharField(max_length=64, help_text="Pon los apellidos del autor.")
    oscars =models.PositiveIntegerField()
    biography = models.TextField()

    def __str__(self):
        return self.name + '' + self.surname

class Genere(models.Model):
    name=models.CharField(max_length=32, help_text="Pon el nombre del género.")

    def __str__(self):
        return self.name

class Pelicula(models.Model):
    # ForeignKey relaciona. También se puede usar on_delete CASCADE
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    title = models.CharField(max_length=64, help_text="Pon el nombre de la película.")
    genere=models.ManyToManyField(Genere)
    release_date = models.PositiveIntegerField()
    length = models.PositiveIntegerField()
    sinopsis = models.TextField()

    def __str__(self):
        return self.title