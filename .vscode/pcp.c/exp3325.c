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
    int choice, value;
    printf("------------------------");
    printf("\nStack Operations Menu:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("------------------------\n");
    printf("Enter the size of the stack: ");
    scanf("%d", &n);

    if (n > MAX_SIZE) {
        printf("Size exceeds maximum limit of %d\n", MAX_SIZE);
        return 1;
    }

    while (1) {
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to push: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting the program.\n");
                return 0;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}