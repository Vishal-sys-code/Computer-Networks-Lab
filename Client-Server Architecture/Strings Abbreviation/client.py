import socket
from time import sleep
s=socket.socket()
s.connect(("localhost",8080))

str1,str2=input("Enter 2 strings:").split()
s.send(bytes(str1,'utf-8'))
sleep(1)
s.send(bytes(str2,'utf-8'))

print(s.recv(1024).decode())