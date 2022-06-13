# Write a program to find the hostname and the ip-address of the local machine

import socket as sc

hostname = sc.gethostname()
ip = sc.gethostbyname(hostname)
print("HostName: ",hostname)
print("IP Address: ",ip)


# Output: 
# HostName:  1defacb52e61
# IP Address:  172.28.0.2
