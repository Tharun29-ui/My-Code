#include <stdio.h>
#define MAX 100

int q[MAX];
int front = -1, rear = -1;
int enq(int val) {
    if (rear == MAX - 1) {
        printf("Queue is full. Cannot enqueue %d\n", val);
        return -1; 
    }
    if (front == -1) {
        front = 0; 
    }
    rear++;
    q[rear] = val;
    printf("The %d is enqueued\n", val);
    return 0; 
}

int deq() {
    if (front == -1 || front > rear) {
        printf("Queue is empty. Cannot dequeue\n");
        return -1; 
    }
    int val = q[front];
    front++;
    if (front > rear) {
        front = rear = -1;
    }
    printf("The %d is dequeued\n", val);
    return val; 
}
int main() {
    enq(10);
    enq(20);
    enq(30);
    deq();
    deq();
    deq();
    deq();
    return 0;
}