import socket
s=socket.socket()
print("Socket is generated")
s.bind(('localhost', 8080))
s.listen()
print('Waiting for connection...')

conn,addr=s.accept()

while True:
    recvmsg=conn.recv(1024).decode()
    if (recvmsg=="bye"):
        print("goodbye")
        break
    
    print(recvmsg)
    msg=input("Enter message:")
    conn.send(bytes(msg,'utf-8'))