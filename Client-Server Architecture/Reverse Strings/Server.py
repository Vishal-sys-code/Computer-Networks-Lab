import socket
s=socket.socket()
print("Socket is generated")
s.bind(("localhost", 8080))
s.listen()
print("Waiting for connection...")

while True:
    conn,addr = s.accept()
    a=conn.recv(1024).decode()
    b=conn.recv(1024).decode()
    ans=b[::-1]+a[::-1]
    conn.send(bytes(ans,'utf-8'))