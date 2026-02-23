# Data Structures and Algorithms

A revision-first DSA repository organized for efficient learning and practice.

## Directory Structure

```
data-structures-algorithms/
├── README.md                    # This file
├── ROADMAP.md                   # Learning roadmap
├── NOTES.md                     # General notes
│
├── index/                       # Topic-wise problem indexing
│   ├── array.md
│   ├── string.md
│   ├── linked-list.md
│   └── ...
│
├── data_structures/             # DS concepts and implementations
│   ├── arrays/
│   ├── linked_list/
│   └── ...
│
├── algorithms/                  # Algorithm concepts and implementations
│   ├── searching/
│   ├── sorting/
│   └── ...
│
├── problems/                    # Problem solutions (organized by source)
│   ├── leetcode/
│   │   ├── easy/
│   │   ├── medium/
│   │   └── hard/
│   ├── codeforces/
│   └── misc/
│
├── templates/                   # Code templates
│   ├── problem.py
│   ├── ds_template.py
│   └── algo_template.py
│
├── utils/                       # Helper functions
│   └── helpers.py
│
├── tests/                       # Test files
└── requirements.txt
```

## Index System

Each topic has an index file in `index/{topic}.md` that lists all problems related to that topic, regardless of where they are stored in the repository.

**Example:** `index/array.md` might contain:
```
- [0001] Two Sum → problems/leetcode/easy/0001-two-sum.py
- [0056] Merge Intervals → problems/leetcode/medium/0056-merge-intervals.py
```

This allows topic-based navigation without duplicating problem files.

## Problem Organization

- All problems go under `problems/` directory
- Organized by source (leetcode, codeforces, misc) and difficulty
- Problems are NOT segregated by topic
- Every problem must be indexed in relevant topic files under `index/`

## Templates

### Problem Template

```python
"""
Problem ID   : LC-XXXX
Title        : Problem Title
Link         : https://leetcode.com/problems/xxxx/
Difficulty   : Easy | Medium | Hard

Topics       : Array, Binary Search
Pattern      : Sliding Window / Two Pointers

Time         : O()
Space        : O()

Notes:
- Key insight
- Edge cases
"""

from typing import List


class Solution:
    def solve(self, nums: List[int]) -> int:
        pass


if __name__ == "__main__":
    sol = Solution()
    # print(sol.solve([...]))
```

### Data Structure Template

```python
"""
Data Structure : Name
Use Cases      :
Operations     :
Time Complexity:
Space          :
"""


class DataStructure:
    def __init__(self):
        pass

    def insert(self, value):
        pass

    def delete(self, value):
        pass

    def search(self, value):
        pass
```

### Algorithm Template

```python
"""
Algorithm  : Name
Category   : Searching / Sorting / DP / Greedy
Use Case   :
Time       :
Space      :
"""


def algorithm(input_data):
    pass
```

## Naming Conventions

### Problem Files
- Format: `{id}-{problem-name}.py`
- Examples:
  - `0001-two-sum.py`
  - `0056-merge-intervals.py`
  - `1234-longest-common-subsequence.py`

### Index Entries
- Format: `[{id}] Problem Title → path/to/file.py`
- Example: `[0056] Merge Intervals → problems/leetcode/medium/0056-merge-intervals.py`

### Folders
- Use `snake_case` only
- No spaces
- No abbreviations unless standard (e.g., `dp` is acceptable for dynamic_programming in some contexts, but use full names in main structure)

## Mandatory Rules

1. **Problems only under `/problems`** - Never place problem solutions in data_structures/ or algorithms/
2. **No topic folders inside problems** - Problems are organized by source and difficulty, not by topic
3. **Every problem must be indexed** - Add entries to all relevant `index/*.md` files
4. **Concepts go to data_structures/ or algorithms/** - Implementations of data structures and algorithms as learning material belong in their respective folders
5. **Use templates** - Always start new files from the appropriate template
6. **Follow naming conventions** - Consistent naming enables better navigation and tooling

## Usage

1. **Adding a new problem:**
   - Create file in appropriate `problems/{source}/{difficulty}/` directory
   - Use problem template
   - Add entry to all relevant topic index files

2. **Adding a concept:**
   - Place in `data_structures/` or `algorithms/`
   - Use appropriate template
   - Document complexity and use cases

3. **Reviewing a topic:**
   - Open `index/{topic}.md`
   - Follow links to problems
   - Review concept files in `data_structures/` or `algorithms/`
