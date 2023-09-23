#__ Librerias __#
import tkinter as tk
import tkinter.ttk as ttk
from tkinter import messagebox

import num_system_convert as nsc

import webbrowser
import pyperclip
import sys

class VisualCalculator:
    #__ Constructor
    def __init__(self):
        self.__root = tk.Tk()

        self.__seting_window() # aplicar algunos ajustes
        self.__add_widgets()   # agregar elementos visuales

        self.__root.mainloop() # ejecutar

    #__ METODOS __#
    # Configuracion de la ventana
    def __seting_window(self):
        self.__root.title("Calculadora")
        self.__root.iconbitmap("source/icon.ico")

        self.__root.minsize(300, 450)
        self.__root.resizable(0,0)

    def __add_widgets(self):
        self.__add_menu_bar()
        self.__add_body()

    # Agregar Menu superior
    def __add_menu_bar(self):
        self.menu = tk.Menu()

        self.__add_file_menu()
        self.__add_history_menu()
        self.__add_more_menu()

        self.__root.config(menu = self.menu)

    # Agregar submenus
    def __add_file_menu(self):
        self.__file_menu = tk.Menu(self.menu, tearoff=False)
        self.__file_menu.add_command(label="Salir", command=sys.exit)
        self.__file_menu.add_separator()
        self.__file_menu.add_command(label="Copiar", command=self.copy_result)
        self.__file_menu.add_command(label="Pegar", command=self.paste)

        self.menu.add_cascade(menu=self.__file_menu, label="Archivo")

    def __add_history_menu(self):
        self.__history_menu = tk.Menu(self.menu, tearoff=False)
        self.__history_menu.add_command(label="Ver historial", command=self.notify_no_complete_function)
        self.__history_menu.add_command(label="Borrar historial", command=self.notify_no_complete_function)

        self.menu.add_cascade(menu=self.__history_menu, label="Historial")

    def __add_more_menu(self):
        self.__more_menu = tk.Menu(self.menu, tearoff=False)
        self.__more_menu.add_command(label="Ayuda", command=self.open_browser)
        self.__more_menu.add_command(label="Informacion", command=self.program_info)

        self.menu.add_cascade(menu=self.__more_menu, label="Mas")

    # Agregar botones y componentes de la calculadora
    def __add_body(self):
        self.__add_inputs()
        self.__add_ope_buttons()

    # Entradas 
    def __add_inputs(self):
        self.body_title = ttk.Label(self.__root, text="CALCULADORA")
        self.input1 = ttk.Entry(self.__root)
        self.input2 = ttk.Entry(self.__root)
        self.result = ttk.Label(self.__root, text="Resultado: ")

        self.body_title.config(width=35, style="BW.TLabel", font="Helveltica 10")
        self.input1.config(width=30, font="Helveltica 12")
        self.input2.config(width=30, font="Helveltica 12")
        self.result.config(width=30, font="Helveltica 12", style="BW.TLabel")

        self.body_title.place(x=0, y=0)
        self.input1.place(x=10, y=30)
        self.input2.place(x=10, y=60)
        self.result.place(x=10, y=90)

    # Botones de opercion
    def __add_ope_buttons(self):
        self.sum_btn = ttk.Button(self.__root, text="+", width=38, command=lambda:self.operating_with_bits("+"))
        self.res_btn = ttk.Button(self.__root, text="-", width=38, command=lambda:self.operating_with_bits("-"))
        self.mul_btn = ttk.Button(self.__root, text="*", width=38, command=lambda:self.operating_with_bits("*"))
        self.divn_btn = ttk.Button(self.__root, text="/", width=38, command=lambda:self.operating_with_bits("/"))

        self.sum_btn.place(x=30, y=160)
        self.res_btn.place(x=30, y=190)
        self.mul_btn.place(x=30, y=220)
        self.divn_btn.place(x=30, y=250)

    #__ Eventos
    # realizar operaciones
    def operating_with_bits(self, sig):
        bit1 = self.input1.get()
        bit2 = self.input2.get()

        self.bin_result = 0

        if(nsc.check_if_is_bin(bit1) and nsc.check_if_is_bin(bit2)):
            n1 = nsc.bin_to_dec(bit1)
            n2 = nsc.bin_to_dec(bit2)

            self.bin_result = nsc.dec_to_bin(eval(f"{n1}{sig}{n2}"))

            self.result.config(text=f"Resultado: {self.bin_result}")

        else:
            self.result.config(text=f"Error: Solo se aceptan 0 y 1")
            messagebox.showerror("Error", "Se ingreso un caracter diferente de 0 y 1. Las operaciones en binario solo aceptan 0 y 1 como digitos validos")
        self.clear_inputs()

    # copiar y pegar el resultado al portapapeles
    def copy_result(self):
        pyperclip.copy(self.bin_result)
    def paste(self):
        self.clear_inputs()
        self.input1.insert(0, pyperclip.paste())

    # limpiar las entradas
    def clear_inputs(self):
        self.input1.delete(0, tk.END)
        self.input2.delete(0, tk.END)

    # Aviso de funcion no completada
    def notify_no_complete_function(self):
        messagebox.showwarning("Atencion", "Funcion no disponible")

    def notify_to_fake_error(self):
        messagebox.showerror("Error", "Directive_ROR_instruction.dll no se ha encontrado en los ficheros fuente. \nPara resolver este problema vaya a \"help.companytec.mx\"")
        print("Exeption: 0x0FF2AD15")

    def open_browser(self):
        webbrowser.open("www.google.com")

    def program_info(self):
        messagebox.showinfo("Informacion", 
"Version: Beta 1.2.88 \n©Sis 1C Bis, Company \n\nEste programa todavia esta en desarrollo, y algunas funcion estan incompletas o no funcionan")
