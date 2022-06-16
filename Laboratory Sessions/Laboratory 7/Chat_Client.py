import socket
s=socket.socket()
s.connect(('localhost', 8080))


while True:
    msg=input("Enter a message:")
    s.send(bytes(msg,'utf-8'))
    recvmsg=(s.recv(1024).decode())
    
    if (recvmsg=="bye"):
        print("goodbye")
        s.send(bytes("bye","utf-8"))
        break
    
    print(recvmsg)