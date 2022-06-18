import socket
s=socket.socket()
s.connect(("localhost",8080))

print("Enter a decimal number")
s.send(bytes(input(),'utf-8'))
print(s.recv(1024).decode())