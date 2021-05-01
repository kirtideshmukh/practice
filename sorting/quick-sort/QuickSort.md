##Quick Sort
* Type: Divide and conquer algorithm
###Complexity
* Best    : O(nlog(n)) time | O(log(n)) space [when pivot divides array in exactly half: only log(n) quick sort calls]
* Average : O(nlog(n)) time | O(log(n)) space
* Worst   : O(n^2) time | O(log(n)) space [when pivot divides array such that n-1 and 0]

###Space complexity
If the quick sort logic is applied for the smaller array then it will take only O(log(n)) space  [as at most log(n) calls]
else in worst case  O(n) calls on the call stack  before then finally calling Quick Sort on a list of length one 
which was of the small sub array between the two.