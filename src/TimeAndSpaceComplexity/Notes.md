## Time Complexity

### For iterative solution
* Just analyze the solution steps

### For recursive solution
* Find the recurrence relation.
* Solve the relation to get the ans.
* Examples:
  * For factorial
    * Recurrence relation will be t(n) = t(n-1) + k
    * Solve it recursively as: </br>
      t(n) = t(n-1) + k </br>
      t(n-1) = t(n-2) + k </br>
      t(n-2) = t(n-3) + k </br>
      ................... </br>
      t(1) = k            </br>
      ___________________ </br>
      t(n) = (n+1)*k      </br>
      t(n) = nk + k
    * Finally, will get O(n).
  * For Binary Search
    * Recurrence relation will be t(n) = t(n/2) + k
    * Solve it recursively as: </br>
      t(n) = t(n/2) + k </br>
      t(n/2) = t(n/4) + k </br>
      t(n/4) = t(n/8) + k </br>
      ................... </br>
      t(1) = k            </br>
      ___________________ </br>
      t(n) = (log n)*k      </br> 
      t(n) = log n
    * Finally, will get O(log n).
    
## Space Complexity
* Only auxiliary space should be considered.
* All time complexity rules will apply here.
* At any point of time maximum amount of memory need should be only considered.
* Examples:
  * For Bubble Sort: O(1)
  * For Merge Sort: O(n)