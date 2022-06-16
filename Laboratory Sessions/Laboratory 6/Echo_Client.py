import socket
c=socket.socket()
c.connect(("localhost", 8080))
ip,port='localhost',8080

print(f"Connected to {ip}:{port}")
c.send(b"Hello from client")
print('Data sent')

print(str(c.recv(1024)))