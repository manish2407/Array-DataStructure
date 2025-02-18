# 📌 Array Data Structure

Welcome to the **Array Data Structure Repository!** 🚀 This repository is dedicated to helping you understand arrays thoroughly by providing **all possible questions and approaches** to strengthen your understanding. 

---
## 📖 What is an Array?
An **array** is one of the most commonly used **data structures**, available in almost all programming languages. In Java, arrays are treated as **objects**, unlike primitive types such as `int` and `double`. Since arrays in Java are objects, you must use the `new` operator to create them.

### 📝 Key Properties of Arrays:
- Arrays store **multiple elements** of the **same data type**.
- The **size of an array is fixed** at the time of initialization.
- It provides **fast access** to elements using an index.

📌 **Example of Array Declaration in Java:**
```java
// Declaring an array
int[] numbers = new int[5];

// Initializing values
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

---
## ⚡ Basic Operations on Arrays
Arrays support various operations that allow us to manipulate data efficiently.

| Operation  | Description  |
|------------|-------------|
| 🔹 **Insertion**  | Adding an element to the array |
| 🔹 **Deletion**  | Removing an element from the array |
| 🔹 **Searching**  | Finding an element (Linear Search / Binary Search) |
| 🔹 **Traversal**  | Accessing each element one by one |
| 🔹 **Display**  | Printing the array elements |

---
## 🔍 Searching in Arrays
There are two primary ways to search for an element in an array:

### **1️⃣ Linear Search** 🔎
- Iterates through each element until a match is found.
- **Time Complexity:** `O(n)`

📌 **Example:**
```java
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) {
            return i; // Element found
        }
    }
    return -1; // Element not found
}
```

### **2️⃣ Binary Search** ⚡
- Works on **sorted arrays** by repeatedly dividing the search space.
- **Time Complexity:** `O(log n)`

📌 **Example:**
```java
public static int binarySearch(int[] arr, int key) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid; // Element found
        }
        if (arr[mid] < key) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // Element not found
}
```

---
## 🔄 Traversal and Display in Arrays
### **Traversal** 🔄
- Traversal means visiting each element in the array sequentially.
- **Time Complexity:** `O(n)`

📌 **Example:**
```java
public static void traverseArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
```

### **Display** 🖥️
- Displaying an array means printing all its elements.
- **Time Complexity:** `O(n)`

📌 **Example:**
```java
public static void displayArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
}
```

---
## 📌 Types of Arrays
### **1️⃣ Unordered Array** 📋
- Elements are stored in **any order**.
- **Insertion:** `O(1)`
- **Searching:** `O(n)`

### **2️⃣ Ordered Array** 🔢
- Elements are stored in **sorted order**.
- **Insertion:** `O(n)` (since elements need to be shifted)
- **Searching:** `O(log n)` (using Binary Search)

---
## 🕒 Time Complexity of Array Operations

| Operation | Unordered Array | Ordered Array |
|-----------|----------------|---------------|
| **Insertion** | `O(1)` | `O(n)` |
| **Deletion** | `O(n)` | `O(n)` |
| **Linear Search** | `O(n)` | `O(n)` |
| **Binary Search** | ❌ (Not possible) | `O(log n)` |

---
## 🚀 Get Started
💡 To dive deeper into array-based problems and solutions, explore the repository and try implementing different operations.

🔗 **Contribute:** Feel free to add more problems, optimized solutions, or improve existing code.

📢 **Stay Connected:** Follow us for updates and new challenges!

Happy Coding! ✨

