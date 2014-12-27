Do bottom up approach and construct the tree from the leaves rather than doing top down approach and constructing tree from root to get o(n) time complexity.

STEP 1: Take left n/2 nodes and recursively construct the left sub tree.

STEP 2: After left sub tree is constructed, we allocate memory for root and link the left sub tree with root.

STEP 3: Finally, we recursively construct the right sub tree and link it with root.