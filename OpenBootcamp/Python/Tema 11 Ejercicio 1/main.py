import sqlite3

conn=sqlite3.connect('Alumnos.db')
cursor=conn.cursor()

cursor.execute('DROP TABLE IF EXISTS Alumnos')
cursor.execute('CREATE TABLE  Alumnos(ID INT PRIMARY KEY , NAME TEXT NOT NULL, SURNAME TEXT NOT NULL)')


cursor.execute("INSERT INTO Alumnos VALUES(1,'Pepe', 'Gomez')")
cursor.execute("INSERT INTO Alumnos VALUES(2,'Hermenegilda', 'Pantene')")
cursor.execute("INSERT INTO Alumnos VALUES(3,'Pew', 'Diepie')")
cursor.execute("INSERT INTO Alumnos VALUES(4,'Pablo', 'Neruda')")
cursor.execute("INSERT INTO Alumnos VALUES(5,'Yokse', 'Porcierto')")
cursor.execute("INSERT INTO Alumnos VALUES(6,'Amaia', 'Montera')")
cursor.execute("INSERT INTO Alumnos VALUES(7,'Piscolabis', 'Amiumiu')")
cursor.execute("INSERT INTO Alumnos VALUES(8,'Ar', 'Mario')")

conn.commit()

rows = cursor.execute("SELECT * FROM Alumnos WHERE NAME='Pew'")
for row in rows:
    print(row)
#También se puede hacer con fetchall

cursor.close()
conn.close()

