import tkinter as tk
from tkinter import filedialog
import os

def open_file_dialog():
    # Create a hidden root window (avoids showing a blank main window)
    root = tk.Tk()
    root.withdraw() 
    
    # Open the file dialog
    file_path = filedialog.askopenfilename(
        title="Select a File",
        filetypes=(
            ("Text files", "*.txt"),
            ("All files", "*.*")
        ),
        initialdir=os.getcwd() # Start in the current working directory
    )
    
    # Destroy the hidden root window after selection
    root.destroy()
    
    if file_path:
        print(f"Selected file: {file_path}")
        return file_path
    else:
        print("No file selected.")
        return None

# --- How to use it ---
selected_file = open_file_dialog()

if selected_file:
    # You can now use the file path string to open and process the file
    try:
        with open(selected_file, 'r') as f:
            content = f.read()
            # print(content[:200]) # Print the first 200 characters
    except Exception as e:
        print(f"Error reading file: {e}")