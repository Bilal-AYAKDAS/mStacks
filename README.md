# mStacks
MStacks class:
Four variables are assigned. Stacks keep how many stacks there are in the array, 
indexofTops keeps the top numbers of each stack, lenghStack keeps how many numbers
there are in each stack and stacksize keeps the size of stacks.

isFull function compares stacksize and lenghstack if it reaches 
max it returns true.

isEmpty function returns true if lenghstack is -1.

push method,
The value is which will be added and the number of stacks comes 
as the parameter. İsFull function controls the stack if it is full it 
prints the stack is overflow if it is not it adds value then it 
increases 1 lenghstack and indexofTop.

pop method,
Value is being entered and the number of stacks to take it out.
Stack is controlled by isempty function. İf it is empty it prints 
“stack is empty” then returns null. If it is not indexofTop and 
lengthStack reduces 1 and the value returns from the stack which is wanted.

Main class:
To create stacks in an array, first, we create an object and 
decide how many stacks are able to be in an array.
Then push numbers to stacks, which number should be which 
stack it is being decided here, if it is over your stack density
(according to our example 3) it will show “Stacks are overflow.” 
And it will just print the first three of them for each stack. 
So we can implement m number stacks using one array.
