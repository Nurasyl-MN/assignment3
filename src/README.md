# Assignment 3 – HashTable and BST

## Student
Your Name: [Write your name here]

## Description
This project contains the implementation of two data structures:

1. **MyHashTable<K, V>**
2. **BST<K extends Comparable<K>, V>**

The assignment was completed **without using recursion**, as required.

---

## Part 1 – MyHashTable

### Implemented features
- Custom generic hash table: `MyHashTable<K, V>`
- Separate chaining with linked nodes
- Methods:
    - `put(K key, V value)`
    - `get(K key)`
    - `remove(K key)`
    - `contains(V value)`
    - `getKey(V value)`
    - `size()`
    - `printBucketSizes()`

### Testing
- Created additional key class: `MyTestingClass`
- Implemented custom `hashCode()` manually
- Added 10000 random elements into the hash table
- Printed the number of elements in each bucket
- Tuned `hashCode()` to improve uniform distribution

---

## Part 2 – BST

### Implemented features
- Generic Binary Search Tree: `BST<K extends Comparable<K>, V>`
- Methods:
    - `put(K key, V value)`
    - `get(K key)`
    - `delete(K key)`
    - `size()`
    - `iterator()`

### Important note
- **Recursion was not used**
- In-order traversal for iterator was implemented **iteratively**
- During iteration both **key** and **value** are accessible

Example:
```java
for (var elem : tree) {
    System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
}