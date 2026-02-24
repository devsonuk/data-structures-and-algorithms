"""
Heap Data Structure
"""
from typing import List


class Heap:
    def __init__(self, is_max_heap = True):
        self.heap = []
        self.is_max_heap = is_max_heap

    def create(self, data_list:List):
        """Builds a heap from an existing list of integers."""
        self.heap = data_list[:] # Copy the list
        n = len(self.heap)

        # Sart from the last non-leaf node and move up to the root
        for i in range((n-2)//2, -1, -1):
            self._bubble_down(i)

    def add(self, value):
        """Inserts a new value into the heap."""
        # Add to the end
        self.heap.append(value)

        # Restore the heap property
        self._bubble_up(len(self.heap)-1)

    def delete(self):
        """Removes and returns the root element (min/max).
            1. In a Heap, the "delete" operation specifically refers to removing the root. Since we can't just leave a hole at the top, we use a clever trick:
            2. Swap the root with the last element in the list.
            3. Pop the last element (which is now our old root) to return it.
            4. Bubble Down (or Sift Down): The new root is likely very small, so we push it down the tree until it's larger than both its children.
        """
        if(len(self.heap) == 0):
            return None
        if(len(self.heap) == 1):
            return self.heap.pop()
        
        # Save the root value to return
        root_value = self.heap[0]

        # Move the last element to the root
        self.heap[0] = self.heap.pop()

        # Fix the heap property by pushing the new root down
        self._bubble_down(0)

        return root_value

    def peek(self):
        """Peak the top element"""
        return self.heap[0] if self.heap else None

    def print_heap(self):
        """Displays the current state of the heap array."""
        print("Heap Array:", self.heap)

    # Private methods
    def _compare(self, val1, val2):
        """Returns True if val1 should be above val2 in the heap."""
        if self.is_max_heap:
            return val1 > val2
        else:
            # For Min-Heap, the smaller value should be above
            return val1 < val2

    def _bubble_up(self, index):
        # We need to compare self.heap[index] with its parent
        parent_index = (index-1) // 2

        # We stop if we hit the root (index 0) or we satisfy the heap property
        if index > 0 and self._compare(self.heap[index], self.heap[parent_index]):
            # Swap them!
            self.heap[index] , self.heap[parent_index] = self.heap[parent_index], self.heap[index]

            # Recursive call to keep bubbling up
            self._bubble_up(parent_index)

    def _bubble_down(self, index):
        largest = index
        left = 2 * index + 1
        right = 2 * index + 2
        n = len(self.heap)

        # Check if left child exists and is greater than current largest
        if left < n and self._compare(self.heap[left], self.heap[largest]):
            largest = left
        
        # Check if right child exists and is greater than the current largest
        if right < n and self._compare(self.heap[right], self.heap[largest]):
            largest = right

        # If the largest is not the parent, we need to swap and continue
        if largest != index:
            # Swap the root and largest value child
            self.heap[index], self.heap[largest] = self.heap[largest], self.heap[index]
            self._bubble_down(largest)

    # Iterative version
    def _bubble_up_itr(self, index):
        """Iterative bubble up"""

        # Calculate parent for the first time
        parent_index = (index-1) // 2

        # Loop while we aren't at the root and the heap property is violated
        while(index > 0 and self._compare(self.heap[index], self.heap[parent_index])):
            # 1. Swap the elements
            self.heap[index], self.heap[parent_index] = self.heap[parent_index], self.heap[index]

            # 2. Update index to move 'up' the tree
            index = parent_index

            # 3. Recalculate the NEW parent index for the next loop iteration
            parent_index = (index - 1) // 2

    def _bubble_down_itr(self, index):
        """Iterative bubble down solution"""
        n = len(self.heap)

        while True:
            left = 2 * index + 1
            right = 2 * index + 2
            largest = index
            

            if left < n and self._compare(self.heap[left], self.heap[largest]):
                largest = left

            if right < n and self._compare(self.heap[right], self.heap[largest]):
                largest = right
            
            if largest != index:
                # 1. Swap the elements
                self.heap[index], self.heap[largest] = self.heap[largest], self.heap[index]

                # Update index to largest node
                index = largest 
            else:
                # Reached at correct position
                break
    
   


if __name__ == "__main__":
    # Initialize the class
    max_heap = Heap()

    # The initial unsorted list
    scores = [10, 20, 15, 12, 40, 25, 18]

    # Call the create
    max_heap.create(scores)

    # Display the result
    max_heap.print_heap()

    # Delete
    max_heap.delete()

    # Display the result
    max_heap.print_heap()

    # Add
    max_heap.add(37)

     # Display the result
    max_heap.print_heap()


