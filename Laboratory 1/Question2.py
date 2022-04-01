class IpChecker:
    def __init__(self, ip, s):
        self.s = s
        self.ip = ip

    def check(self):
        for i in self.ip:
            if i > 255:
                print("Invalid IP")
                return
        print("Valid IP")
        self.subnet()

    def subnet(self):
        ans = ''
        for i in range(self.s):
            ans += '1'
        for i in range(self.s, 32):
            ans += '0'

    ls = []

    ls.append(ans[0:8])
    ls.append(ans[8:16])
    ls.append(ans[16:24])

    ls.append(ans[24:32])

    ls_new = [int(i, 2) for i in ls]
    op1 = ''
    for i in ls_new:
        op1 += str(i)
        op1 += '.'
    print("Subnet Mask : ", op1[:-1])
    out_put = []
    for i, j in zip(self.ip, ls_new):
        out_put.append(i & j)

    op2 = ''
    for i in out_put:
        op2 += str(i)
        op2 += '.'
    print("Net Id : ", op2[:-1])

    ip = input()
    print("Given Ip : ", ip)
    ip = list(ip.split('/'))
    submask = int(ip[1])
    ip = list(map(int, ip[0].split('.')))

    check = IpChecker(ip, submask)