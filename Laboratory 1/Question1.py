s=input("enter The IP-Address: \n").split(".");
flag=0
for i in s:
        if(int(i)>=0 and int(i)<=255):
            flag=1
        else:
            flag=0
        if(len(s)!=4):
            flag=0
        if(flag==1):
            print("valid")
        else:
            print("invalid")
        frst=int(s[0])
        if(frst>=1 and frst<=127):
            print("class A")
        elif(frst>=128 and frst<=191):
            print("class B")
        elif(frst>=192 and frst<=223):
            print("class C")