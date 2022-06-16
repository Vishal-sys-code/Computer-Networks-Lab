import socket
s=socket.socket()
ip,port='localhost',8080
print("Socket is generated")
s.bind(("localhost",8080))
s.listen()
print("Waiting for connection...")

while True:
    conn,addr = s.accept() 
    data=conn.recv(1024);
    if data:
        print(f"Server received {data.decode('utf-8')}")
        conn.send(bytes(str(data)+"(returned from server)",'utf-8'))
    else:
        conn.send(b'No data received')