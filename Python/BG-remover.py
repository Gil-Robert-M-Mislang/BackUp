from rembg import remove
from PIL import Image

path_input = 'test.jpg'
path_output = 'test.png'

input_open = Image.open(path_input)
output_image = remove(input_open)

output_image.save(path_output)
Image.open("test.png")