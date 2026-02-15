"""
Algorithm  : Binary Search
Category   : Searching
Use Case   : Find the index of a key in a sorted array
Time       : O(logn)
Space      : O(1)
"""


def binary_search(arr: list[int], key: int) -> int:
    """Perform binary search on a sorted list of integers.

    Args:
        arr: Sorted list of integers to search.
        key: Integer value to find.

    Returns:
        The index of `key` in `arr` if found; otherwise -1.
    """
    lo, hi = 0, len(arr) -1
    while(lo <= hi):
        mid = (lo + hi) // 2
        if key == arr[mid]:
            # Found the element
            return mid
        if key < arr[mid]:
            # Search left space
            hi = mid -1
        else:
            # Search right space
            lo = mid + 1
    return -1

def recursive_binary_search(arr: list[int], lo: int, hi: int, key: int) -> int:
    # Base Case
    if(lo == hi) :
        return lo if  key == arr[lo] else -1
    
    mid = (lo + hi) // 2
    if(key == arr[mid]):
        return mid
    elif key < arr[mid]:
        return recursive_binary_search(arr, lo, mid - 1, key)
    else:
        return recursive_binary_search(arr, mid + 1, hi, key)


# Main method
if __name__ == "__main__":
    my_list = [3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62]
    my_key = 42
    search_idx = binary_search(my_list, my_key)
    r_search_idx = recursive_binary_search(my_list, 0, len(my_list) -1, my_key)
    print(f"Seach Index: {search_idx}, R Seach Index: {r_search_idx}")
    if search_idx == -1:
        print("Key not found")
    else:
        print(f"Key found at index: {search_idx}")

