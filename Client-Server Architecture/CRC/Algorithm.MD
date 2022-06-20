## CheckSum Algorithm:
* Let r be the degree of G(x). Append 'r' to the lower end of the frame so that it contains (m+r) bits.
* Divide M(x) by G(x) using MOD-2 division
* Subtract the remainder from M(x) using MOD 2 subtraction
* The result is the check summed frame to be transmitted.
* Eg: Frame = 1101011011