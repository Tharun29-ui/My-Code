#include <stdio.h>

#define MAX_SIZE 100

int stack[MAX_SIZE];
int top = -1;
int n;

void push(int a) {
    if (top >= n - 1) {
        printf("Stack Overflow!\n");
        return;
    }
    top++;
    stack[top] = a;
    printf("Pushed %d\n", a);
}

void pop() {
    if (top == -1) {
        printf("Stack Underflow!\n");
        return;
    }
    printf("Popped %d\n", stack[top]);
    top--;
}

void peek() {
    if (top == -1) {
        printf("Stack is empty!\n");
        return;
    }
    printf("Top element is %d\n", stack[top]);
}

void display() {
    if (top == -1) {
        printf("Stack is empty!\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int main() {
    printf("Enter the size of the stack: ");
    scanf("%d", &n);

    if (n > MAX_SIZE) {
        printf("Size exceeds maximum limit of %d\n", MAX_SIZE);
        return 1;
    }

    push(5);
    push(10);
    peek();
    display();
    pop();
    display();

    return 0;
}