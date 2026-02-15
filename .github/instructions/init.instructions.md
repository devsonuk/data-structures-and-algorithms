---
description: Repository creation instructions
# applyTo: 'Describe when these instructions should be loaded' # when provided, instructions will automatically be added to the request context when the pattern matches an attached file
---
We're are setting up a Python-based DSA repository.

STRICTLY follow the structure, templates, and conventions below.
Do NOT add extra files, folders, or explanations.
Do NOT improvise.

=====================
GOAL
=====================
Create a clean, revision-first DSA repository with:
- Concepts separated from problems
- Problems not segregated by topic
- Topic-wise indexing via markdown files
- Standard Python templates

=====================
DIRECTORY STRUCTURE
=====================

data-structures-and-algorithms/
├── README.md
├── ROADMAP.md
├── NOTES.md
│
├── index/
│   ├── array.md
│   ├── string.md
│   ├── linked-list.md
│   ├── stack.md
│   ├── queue.md
│   ├── hash-table.md
│   ├── heap.md
│   ├── tree.md
│   ├── graph.md
│   ├── binary-search.md
│   ├── sorting.md
│   ├── recursion.md
│   ├── backtracking.md
│   ├── greedy.md
│   ├── dynamic-programming.md
│   ├── sliding-window.md
│   ├── two-pointers.md
│   ├── interval.md
│   └── math.md
│
├── data_structures/
│   ├── arrays/
│   ├── linked_list/
│   ├── stack/
│   ├── queue/
│   ├── tree/
│   └── graph/
│
├── algorithms/
│   ├── searching/
│   ├── sorting/
│   ├── recursion/
│   ├── backtracking/
│   ├── greedy/
│   └── dynamic_programming/
│
├── problems/
│   ├── leetcode/
│   │   ├── easy/
│   │   ├── medium/
│   │   └── hard/
│   ├── codeforces/
│   └── misc/
│
├── templates/
│   ├── problem.py
│   ├── ds_template.py
│   └── algo_template.py
│
├── utils/
│   └── helpers.py
│
├── tests/
└── requirements.txt

=====================
INDEX FILE CONVENTION
=====================

Each index/{topic}.md file must follow this format:

# <Topic Name>

## Easy
- [0001] Two Sum  
  → problems/leetcode/easy/0001-two-sum.py

## Medium
- [0056] Merge Intervals  
  → problems/leetcode/medium/0056-merge-intervals.py

## Hard
- [0076] Minimum Window Substring  
  → problems/leetcode/hard/0076-minimum-window-substring.py

Rules:
- Every entry MUST include a relative file path
- A problem may appear in multiple topic index files
- Do NOT duplicate code files

=====================
README.md (GLOBAL)
=====================

README.md must document:
- Repository purpose (revision-first DSA)
- Directory structure explanation
- Index system using index/{topic}.md
- Index entry format WITH file links
- Problem organization rules
- Templates usage
- Naming conventions
- Mandatory rules

Tone:
- Professional
- Concise
- Technical
- No marketing language

=====================
PYTHON TEMPLATES
=====================

templates/problem.py
--------------------
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


templates/ds_template.py
------------------------
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


templates/algo_template.py
--------------------------
"""
Algorithm  : Name
Category   : Searching / Sorting / DP / Greedy
Use Case   :
Time       :
Space      :
"""


def algorithm(input_data):
    pass

=====================
NAMING CONVENTIONS
=====================

Problem files:
- 0001-two-sum.py
- 0056-merge-intervals.py

Index entries:
- [0056] Merge Intervals  
  → problems/leetcode/medium/0056-merge-intervals.py

Folders:
- snake_case only
- no spaces
- no abbreviations unless standard

=====================
IMPORTANT
=====================
Generate the repository exactly as specified.
Do not add explanations, comments, or files beyond this scope.
