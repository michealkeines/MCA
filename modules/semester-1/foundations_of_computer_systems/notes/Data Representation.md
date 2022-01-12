Data is a collection of unorganized facts consiste of numbers text, symbols or just description of things

Processed data is called Information

Types of data

numeric

charcter string (text or ascii representation)

audio

images

videos

# Data representation

Data is stored, processed and transmitted as sequence of bits i.e 0's and 1's

even though humans inrerpret text and pictures, computers interpret them as bit patters

![[Pasted image 20220112033531.png]]

the task of data representation is converting data into corresponding binary format

# Numeric data:

the numbers are encoded to their binary equivalant through number conversion methods

separate conversion methods for representing 
- Integers
- Fractions numbers

defines how a number cna be represented using distint symbols or digits

Base in a numver system is the total number of distinct digits in the system.

the maxium value of a single digit in a number system is one less than its base.

![[Pasted image 20220112042526.png]]

types:
	unsigned
	signed
	
## unsigned  

Any number can be represented to tis binary equivalent by the binary conversion technique

decimal to binary
octal to binary
hexadecimal to binary

![[Pasted image 20220112042737.png]]
![[Pasted image 20220112042840.png]]
![[Pasted image 20220112043256.png]]

## signed
Can represent zero, postive, negative integers
Contain sign flag

in binary number system signed numbers are used to encode negative numbers

there are three methods to acheive these

signed magnitude method
1's complement method
2's complement method

Signed magnitude method

one of the simplest representation

MOST SIGNIFICANT BIT (MSB) represent the sign

![[Pasted image 20220112043859.png]]

drawback

![[Pasted image 20220112044122.png]]

1's complement 

the negative number are represneted using the 1's complement fo its positive compont, that is flipping the bits

![[Pasted image 20220112044247.png]]

![[Pasted image 20220112044419.png]]

drawback

![[Pasted image 20220112044613.png]]

2's complement

the negative number are represneted using the 2's complement fo its positive compont, that is flipping the bits + adding 1

![[Pasted image 20220112044745.png]]

![[Pasted image 20220112044717.png]]

![[Pasted image 20220112044932.png]]


# Text data

text data, 
alpha numeric data
special characters


represented by means of a code
- ASCII
- Unicode

Each of the different symbols in the text is assigned a unique bit pattern

The text is then represented as a long string of bits

ASCII

![[Pasted image 20220112045226.png]]

![[Pasted image 20220112045253.png]]

![[Pasted image 20220112045339.png]]

![[Pasted image 20220112045413.png]]

![[Pasted image 20220112045447.png]]

Unicode

because ascii is limited to 128 character, the rest of world wants the same encoding for their characters too

thus unicode standard was created

it unify all the differnt encoding schemes

unicode and UTF

![[Pasted image 20220112045723.png]]

![[Pasted image 20220112045810.png]]


# Audio

the amplitude of the sound wave is recorded at regular intervals thorugh sampling

the sampled data is then encoded to binary sequence

![[Pasted image 20220112034053.png]]

![[Pasted image 20220112050145.png]]

![[Pasted image 20220112051009.png]]

![[Pasted image 20220112051151.png]]

quantization: the amplitude of analog audio data, which has a continous range of values, is first quantized to a set of discrete value.

sampling: the samples whose amplitude has to be recorded is then obtained

the amplitude of the samples are then converted to its corresponding binary values.

# image & video

images are interpreted as a collection of dots, each of which is called a pixel 
pixel - picture element

each pixed is then encoded and the entire images is represented as collection of these encoded pixels

resolution of the image: the number of pixels used to represent an image

each pixel has its own intensity value or brightness

Image type varies according to the type of intensity used for each pixel

depending upon the type of intensity images are classified into

Binary Image

Grayscale Image

Colour Image

Binary images:

it contains only two colors - black and white

black is represented as 0 and while as 1

each pixel can be stored using a single bit

Gray scale images

a range shades from the black to white colour

uses 8-bit format that accommodates 256 different shades

range varies from 0-255

0 for black
255 for white

Color images:

each pixel is composed of 3 channels
- Red, Green and Blue Colours

each of these channels need 8 bits for storage and hence a totla of 24 bits is required to represent a single pixel

The shade of each pixel will vary depending on the intensity of R, G, B

![[Pasted image 20220112052356.png]]


a videos can be considered as a collection of images and can be encoded almost similar to image encoding

a series of digital images displayed in rapid succession

 in the context of video these iamges are called frames
 
 the rate at which frames are displayed is known as the frame rate and is measured in frames per second FPS
 
 representing a video is nothing but representing these frames in a efficient manner.
 
 


