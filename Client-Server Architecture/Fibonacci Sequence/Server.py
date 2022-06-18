import socket
s=socket.socket()
print("Socket is generated")
s.bind(("localhost", 8080))
s.listen()
print("Waiting for connection...")

while True:
    conn,addr = s.accept()
    
    def fib(n):
        a=0
        b=1
        ans=[]
        while n:
            temp=a+b
            a=b
            b=temp
            ans.append(a)
            n-=1
        return ans
    
    n=int(conn.recv(1024).decode())
    conn.send(bytes(str(fib(n)),'utf-8'))  