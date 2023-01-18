from tkinter import *

def selecc():
    screen.config(text ='Has seleccionado: ' +format(option.get()))

def reset():
    option.set(None)
    screen.config(text='')

root = Tk()
root.config(bd=100)

option =StringVar()
option.set(None)

Radiobutton(root, text="Manzanas", variable=option,value="Manzanas", command=selecc).pack()
Radiobutton(root, text="Peras", variable=option,value="Peras", command=selecc).pack()
Radiobutton(root, text="Naranjas", variable=option,value="Naranjas", command=selecc).pack()

screen =Label(root)
screen.pack()

Button(root, text="Resetear", command=reset).pack()

root.mainloop()