## CheckSum Algorithm:
* Let r be the degree of G(x). Append 'r' to the lower end of the frame so that it contains (m+r) bits.
* Divide M(x) by G(x) using MOD-2 division
* Subtract the remainder from M(x) using MOD 2 subtraction
* The result is the check summed frame to be transmitted.
* Eg: Frame = 1101011011

<hr>

## CRC Algorithm

* **Step 1:** Store the data in an m sized integer array(a[]) where m=size of the string received by checksum() <br/>
* **Step 2:** for a parity of 1011 do the following steps for m-n times <br/>
* **Step 3:** a[i]=0 if a[i]==1 else a[i]=1 <br/>
* **Step 4:** a[i+1]=1 if a[i+1]==1 else a[i+1]=0 <br/>
* **Step 5:** a[i+2]=1 if a[i+2]==0 else a[i+2]=1 <br/>
* **Step 6:** a[i+3]=1 if a[i+3]==0 else a[i+3]=1 <br/>
* **Step 7:** Go back to Step 2 <br/>
* **Step 8:** Return last (n-1) value of the array in concatenated string form. <br/>