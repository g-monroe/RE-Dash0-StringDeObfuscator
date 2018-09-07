# RE-Dash0-StringDeObfuscator
Educational purposes only! A reverse engineering program that tries to overall de-obfuscate Strings from dash0 obfuscator

# Intro:
I wanted to see if I could crack dash0 for educational purposes. This is what I came up with since there are a very complex sequence of steps to crack a program like this. This is the first step to make sense of the DashOPro.jar using the ant-dasho.jar as a forground approach to see how the program works. After I decompiled the jar and used programs to view the code, I saw a big majority of the code to be in byte code. This ment that I had to find a byte viewer for java.

This is how java works with the compiler:
<img src="https://mk0resourcesinfm536w.kinstacdn.com/wp-content/uploads/012914_1551_JavaBytecod1.png"/>

With this concept in mind, I will need to work backwards. Overall though, its better to work with what I have which is code that isn't byte code and actually java code. I noticed that they use a custom encoder for there strings where I found there compiled code for how they decode it in the ant-dasho.jar. With that in mind I refacted the compiled code and got it working with simple classes and strings. After some time passed working on it I finally totally decompiled the encoder functions and got it working decoding all the strings from multiple files that I gathered that were encoded using this obfuscator. 


# Issues
With that in mind if you just used the b and a classes that are in this project, you can easily make a manual more accurate decoder since some strings are actually 25% to 50% unicoded which means my approach when parsing the files causes the decoder to fail, but not crash.

With that in mind my parser could be changed to fix this issue but right now my time is very limited. So pelase keep that in mind. If there isn't any raw unicode in the strings itself the program shouldn't have any problem decoding the strings at all.

# How to Use/Test:
Overall the program works as it needs to, I built it using the IDE Intellij, you can easily rebuild my project and use my test samples by importingthe project using the IDE's wizard.

After building the jar go to the folder with cmd and run the command: java -jar C:\DIRECTORY\FILENAME.jar INPUTFILE.txt
-FILENAME.jar is the file you just built using the project
-C:\DIRECTORY\ is where the file is located on the system
-INPUTFILE.txt is the config file.

If everything is correct, along with .java files are obfuscated with dash0 it should attempt to deob the strings in the file, with no errors.

# How to configure the INPUTFILE:
The first line of the .txt config file is the directory of where you want to results saved from each file. The delimiter is a new-line so each file you enter you should just be able to press enter to add another file in the txt. The files have to be .java for the program to attempt the deob. You can see the sampleTests/input.txt for an example.
