from tkinter import ttk
from tkinter import *
import tkinter as tk

root=tk.Tk()
root.config(width=200,height=200)
root.title("Lista de dulces manchegos")

listaD=ttk.Combobox(
    state="readonly",
    values=["Pezuña","Riñón","Cono de nata", "Tartaleta de fresa"]
)
listaD.place(x=100, y=100)

etiqueta = Label(text="Esto es una lista de desplegables")
etiqueta.pack()

root.mainloop()

#No entendía bien que pedía el enunciado, así que ejecuté la solución de GitHub para ver que buscábais
# y luego hice el ejercicio
# con otro recurso de tkinter.

""" 
from tkinter import *
master = Tk()
elemento = StringVar()

listbox = Listbox(master)
for item in ["Pepe", "María", "Ernesto", "Ruben", "Carlos", "Laura", "Ana", "Lorena"]:
    listbox.insert(END, item)
listbox.pack()

label = Label(text="Lista de nombres de personas")
label.pack()

master.mainloop()
"""