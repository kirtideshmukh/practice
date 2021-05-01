##Merge Sort
* Type: Divide and conquer algorithm
###Complexity
* Best    : O(nlog(n)) time | O(nlog(n)) space 
* Average : O(nlog(n)) time | O(nlog(n)) space
* Worst   : O(nlog(n)) time | O(nlog(n)) space

###Space complexity
* With bruteforce logic it takes (nlog(n)) in all the cases

* With in-place sorting , the space complexity can be reduced to O(n). For that use the auxiliary array.
We need one array the sort of initial values, and we need one array to store new sorted values.
And the way it works is you have to kind of continuously swap them.