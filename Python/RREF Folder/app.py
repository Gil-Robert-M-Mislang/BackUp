import sys
from PyQt6.QtWidgets import (QApplication, QWidget, QLabel, QLineEdit, QPushButton, QFrame, QHBoxLayout, QVBoxLayout, QGridLayout)
from PyQt6.QtCore import Qt, pyqtSignal
from PyQt6.QtGui import QIcon

class Label(QLabel):
    def __init__(self, text):
        super().__init__()
        self.setStyleSheet("font-size: 14px; color: 868b92;")
        self.setText(text)

class H2(QLabel):
    def __init__(self, text):
        super().__init__()
        self.setStyleSheet("font-size: 20px; color: 2f333a; font-weight: bold;")
        self.setText(text)

class Application(QWidget):
    def __init__(self, parent = None):
        super().__init__()
        self.parent = parent
        self.layout = {}
        self.layout['main'] = QVBoxLayout()
        self.setLayout(self.layout['main'])

        self.labels = {}
        self.combobox = {}
        self.line_edits = {}

        self.init_ui()

    def init_ui(self):
        self.labels['form_title'] = QLabel('Reduced Row Echelon Form Calculator')
        self.labels['form_title'].setStyleSheet('font-size: 25px; color: #000000; font-weight: bold;')
        self.layout['main'].addWidget(self.labels['form_title'])
        
        line_divider = QFrame(self)
        line_divider.setFrameShape(QFrame.Shape.HLine)
        line_divider.setFrameShadow(QFrame.Shadow.Sunken)
        line_divider.setFixedHeight(20)
        line_divider.setFixedWidth(550)
        
        self.layout['main'].addWidget(line_divider, alignment = Qt.AlignmentFlag.AlignHCenter)

        self.layout['calculator'] = QGridLayout()
        self.layout['main'].addLayout(self.layout['calculator'])

        #Table Size Section
        self.layout['calculator'].addWidget(QLabel(), 0, 0, 1, 1)
        self.layout['calculator'].addWidget(H2('Table Size'), 0, 0, 2, 1)

        #Table Size info
        self.line_edits['row'] = QLineEdit()
        self.line_edits['column'] = QLineEdit()
        self.line_edits['row'].setFixedWidth(40)
        self.line_edits['column'].setFixedWidth(40)
        self.layout['calculator'].addWidget(self.line_edits['row'], 1, 1, 1, 3)
        self.layout['calculator'].addWidget(self.line_edits['column'], 1, 3, 1, 3)
        self.layout['calculator'].addWidget(Label('Row'), 1, 0, 1, 3, alignment = Qt.AlignmentFlag.AlignLeft)
        self.layout['calculator'].addWidget(Label('Column'), 1, 2, 1, 3, alignment = Qt.AlignmentFlag.AlignLeft)

        self.submit_button = QPushButton('&Enter', clicked = self.done_size)
        self.clear_button = QPushButton('&Clear', clicked = self.reset)
        self.layout['calculator'].addWidget(self.submit_button, 1, 3, 1, 3, alignment = Qt.AlignmentFlag.AlignHCenter)
        self.layout['calculator'].addWidget(self.clear_button, 1, 4, 1, 3, alignment = Qt.AlignmentFlag.AlignHCenter)
    
    def reset(self):
        for widget in self.children():
            if isinstance(widget, QLineEdit):
                widget.clear()

    def done_size(self):
        line_divider = QFrame(self)
        line_divider.setFrameShape(QFrame.Shape.HLine)
        line_divider.setFrameShadow(QFrame.Shadow.Sunken)
        line_divider.setFixedHeight(20)
        line_divider.setFixedWidth(550)
        self.layout['main'].addWidget(line_divider, alignment = Qt.AlignmentFlag.AlignHCenter)

        self.layout['input'] = QGridLayout()
        self.layout['main'].addLayout(self.layout['input'])
        row_input = int(self.line_edits['row'].text())
        column_input = int(self.line_edits['column'].text())
        #Cell width error (Hindi sya maganda and consistent)
        width = int(600/column_input)
        print(width)

        for i in range(row_input):
            for j in range(column_input):
                self.line_edits['cells'] = QLineEdit()
                self.line_edits['cells'].setFixedWidth(width)
                self.line_edits['cells'].setStyleSheet('border: 1px solid black;')
                self.layout['input'].addWidget(self.line_edits['cells'], i+2, j, 1, 3)


        


class AppWindow(QWidget):
    def __init__(self):
        super().__init__()
        self.setFixedHeight(700) #--> Height of the window
        self.setFixedWidth(600) #-->Width of the window
        self.setWindowTitle('RREF Calculator') #--> Title of the Window
        self.setWindowIcon(QIcon('main_Icon.png')) #--> Icon of the window
        self.setStyleSheet(''' 
            QWidget {
                font-size: 18px   
            }
        ''') #--> automatically set the font to 18 pixels

        #Organize the widgets
        self.layout = {}
        self.layout['main'] = QVBoxLayout() #--> organize the widgets for coding
        self.setLayout(self.layout['main']) #--> application of layout settings

        self.init_ui()

    def init_ui(self):
        self.main_ui = Application()
        self.layout['main'].addWidget(self.main_ui, alignment = Qt.AlignmentFlag.AlignHCenter)
        
            


#Launch the App
if __name__ == "__main__": 
    app = QApplication(sys.argv)
    window = AppWindow()
    window.show()
    sys.exit(app.exec()) 