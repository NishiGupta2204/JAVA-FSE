# Time Complexity Analysis

## Add Product

* Time Complexity: O(1)

HashMap allows constant-time insertion of products based on product ID.

## Update Product

* Time Complexity: O(1)

We first locate the product using its ID and then update its details.

## Delete Product

* Time Complexity: O(1)

HashMap provides constant-time removal of elements.

## Display Products

* Time Complexity: O(n)

Displaying products requires traversing all the elements present in the inventory.

# Optimization

We used HashMap<Integer, Product> because it provides efficient insertion, updation, deletion, and retrieval operations. Compared to ArrayList, HashMap performs better for large inventories due to its average constant-time complexity.

