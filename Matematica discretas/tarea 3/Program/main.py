import turtle as t
import numpy as np

# Metricas de la pantalla
WIDTH = 1000
HEIGHT = 300

# Dibujar el plano cartesiano
def draw_plane():
    x = t.Turtle()
    x.color('white')
    x.hideturtle()
    x.speed(0)
    x.setx(-500)
    x.setx(500)

    x = t.Turtle()
    x.color('white')
    x.hideturtle()
    x.speed(0)
    x.sety(-300)
    x.sety(300)

# crear ventana
win = t.Screen()
win.setup(1000, 600)
win.bgcolor("black")

draw_plane()

x = -500

# Agregar texto
label_1 = t.Turtle()
label_1.penup()
label_1.color("#fff")
label_1.hideturtle()
label_1.setx(-450)
label_1.sety(250)
label_1.write("[Rojo: seno, Azul: Coseno]", align="left", font=("Arial", 20, "normal"))

# configurar tortuga del seno
seno = t.Turtle()
seno.color("Red")
seno.penup()
seno.setx(-500)
seno.pendown()

coseno = t.Turtle()
coseno.color("Blue")
coseno.penup()
coseno.setx(-500)
coseno.pendown()

# graficar
while x < 500:
    # garficar seno
    y = np.sin( (x * np.pi) / 180 ) * 200
    seno.setx(x)
    seno.sety(y)

    # graficar coseno
    y = np.cos( (x * np.pi) / 180 ) * 200
    coseno.setx(x)
    coseno.sety(y)
    x += 1

win.exitonclick()