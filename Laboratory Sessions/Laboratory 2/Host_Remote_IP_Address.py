# Write a program to find the hostname and the ip-address of the remote machine

import socket as sc

hostname = "www.google.com"
ip = sc.gethostbyname(hostname)
print("Remote IP Address: " , ip)

# Output:
# Remote IP Address:  142.251.2.104