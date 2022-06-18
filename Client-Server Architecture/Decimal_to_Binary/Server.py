import socket
s=socket.socket()
print("Socket is generated")
s.bind(("localhost",8080))
s.listen()
print("Waiting for connection...")

while True:
    conn,addr = s.accept()
    n=bin(int(conn.recv(1024).decode()))[2:]
    conn.send(bytes(str(n),'utf-8'))