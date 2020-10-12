**CPEN 221 / Fall 2020 / Exercise 6**

---

This exercise consists of two tasks.

---

## 1. Sequences

> The code for this task should be in the package `sequences`.

Let us define a sequence **S** as follows:

* S(0) = 1
* For every value v in S:
   * x = 2 * v + 1 is in S
   * y = 6 * v is in S
   * z = v * v + 1 is also in S

There are no other values in S other than values that satisfy the relationships defined above.

Given an index `n`, `0 <= n`, you should implement a method that returns `S(n)`.

The sequence is, naturally, in ascending order and contains no duplicates. The first few elements (starting with the 0-th element) are:

> 1, 2, 3, 5, 6, 7, 10, 11, 12, 13, 15, 18, 21, 23, 25, 26.



## 2. Target `Or` Sum

> The code for this task should be in the package `orsum`.

Given a **non-negative** `int` `target` and an array of **non-negative** `int`s, `intArray`, is it possible to obtain `target` by selecting some `int`s from `intArray` and performing only bitwise `OR` operations on the selected numbers? The method should return `true` or `false`. (If the input array is empty then the default OR sum of elements in the array is 0.)

What is the bitwise `OR` operation? Consider the `int` 18, which is `10010` in binary and the `int` 3, which is `11` in binary, `18 OR 3` would give us `10011` in binary or the `int` 19 in decimal:

```
10010
   11
-----
10011
```

The bitwise OR operation performs a bit-by-bit OR and produces a new value.

If `a` and `b` are two bits, then the bit-OR operation has the following truth table:

| `a`  | `b`  | `a` OR `b` |
| ---- | ---- | ---------- |
| 0    | 0    | 0          |
| 0    | 1    | 1          |
| 1    | 0    | 1          |
| 1    | 1    | 1          |

In Java, given two `int`s, `m` and `n`, the bitwise OR operator is `|` and we can write `int x = m | n;`.

For the given problem, here are two examples:

1. `intArray = {1, 2, 4, 8}` and `target = 7` is possible because ` 7 = (1 | 2 | 4)`.
2. `intArray = {1, 4, 8}` and `target = 7` is not possible.

**Hint**: It is possible to solve this problem without examining every subset of `intArray`. You are not required to solve the problem in any particular fashion but this hint may guide some of you.

## Submitting Your Work

You will submit your work by making changes, committing your work and pushing to GitHub. You must get comfortable with the basic workflow using Git and GitHub. Not being able to push your work to GitHub is not a reasonable excuse for late submissions.

## JUnit Testing

It may be useful to note the following about the JUnit tests:

- the use of parametrization to avoid repeated code segments;
- the use of per-test timeouts.