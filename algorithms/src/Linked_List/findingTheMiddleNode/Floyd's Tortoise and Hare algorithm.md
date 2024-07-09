###Floyd's Tortoise and Hare algorithm

In this problem, you should use the slow and fast pointer technique (also known as Floyd's Tortoise 
and Hare algorithm)to find the middle element of the linked list efficiently.

The key idea is to have two pointers, one that moves twice as fast as the other. By the time the fast
pointer reaches the end of the linked list, the slow pointer will be at the middle.

1. Initialize two pointers: slow and fast, both pointing to the head of the list.

2. While fast is not null and the next node of fast is not null:

3. Move slow one step ahead (i.e., slow = slow.next).

4. Move fast two steps ahead (i.e., fast = fast.next.next).

5. When the while loop ends, slow will point to the middle node of the list. Return slow.