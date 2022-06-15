s = input("Enter the string: ")
mat = []
for i in s:
    x = list(format(ord(i), '08b'))
    mat.append(x)
for i in mat:
    i.append('1') if (i.count('1') & 1) else i.append('0')

aa = []
for i in range(len(mat[0])):
    k = []
    for j in range(len(mat)):
        k.append(mat[j][i])
    aa.append('1') if (k.count('1') & 1) else aa.append('0')
mat.append(aa)

for i in mat:
    print(*i)