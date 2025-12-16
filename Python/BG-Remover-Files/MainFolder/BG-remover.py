import os
import tkinter as tk
from tkinter import filedialog, messagebox

from rembg import remove
from PIL import Image

def file_window():
    root = tk.Tk()
    root.withdraw()

    file_path = filedialog.askopenfilename(
        title = "Select a file",
        filetypes = (
            ("Image Files", "*.jpg *.jpeg *.png"),
            ("All Files", "*")
        ),
        initialdir = os.getcwd()
    )
    root.destroy()

    if file_path:
        return file_path
    else:
        return None

selected_file = file_window()

def removes_bg(path_input):
    file_name = os.path.splitext(os.path.basename(path_input))[0]
    path_output = os.path.join("C:/Users/MSI/Desktop/Gil-VsCode/Gil-Files-main/Python/BG-Remover-Files/Image-Output/", f"{file_name}.png")

    input_open = Image.open(path_input)
    output_image = remove(input_open)

    output_image.save(path_output)
    Image.open(path_output)
    os.startfile(path_output)

    return path_output

    
if selected_file:
    try:
        removes_bg(selected_file)
    except Exception as e:
        messagebox.showerror("Error", e)