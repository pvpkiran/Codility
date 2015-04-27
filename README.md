This is one of the Coding Challenges I came across recently.

Given a number N, this program prints the Length of the array with array contains representing the numbers leading to N. 
The condition being, 
1. First number is always 1. A[0] = 1
2. Every subsequent number is either twice the previous number or one more than the previous number.
   For every number i, the subsequent number can be represented as,
   A[i+1] = A[i]*2 
       or
   A[i+1] = A[i]+1 

Example 1: Given N = 17, Ouput will be Length = 6 with
A[0]=1, A[1]=2, A[2]=4, A[3]=8, A[4]=16, A[5]=17

Example 2: Given N = 29 Length = 8 with
A[0]=1, A[1]=2, A[2]=3, A[3]=6, A[4]=7, A[5]=14, A[6]=28, A[7]=29

