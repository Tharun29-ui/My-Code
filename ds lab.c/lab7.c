#include <stdio.h> 
#define SIZE 5 

int queueArray[SIZE], frontIndex = -1, rearIndex = -1; 

void insertToQueue(int value) { 
    if (rearIndex == SIZE - 1) { 
        printf("Queue Overflow! Cannot insert %d\n", value); 
        return; 
    } 
    if (frontIndex == -1) frontIndex = 0; 
    queueArray[++rearIndex] = value; 
    printf("%d inserted into queue\n", value); 
} 

void deleteFromQueue() { 
    if (frontIndex == -1 || frontIndex > rearIndex) { 
        printf("Queue Underflow! Cannot remove element.\n"); 
        return; 
    } 
    printf("%d removed from queue\n", queueArray[frontIndex++]); 


    if (frontIndex > rearIndex) {
        frontIndex = rearIndex = -1;
    }
} 


void printQueue() { 
    if (frontIndex == -1) { 
        printf("Queue is empty.\n");
        return; 
    } 
    printf("Current queue: "); 
    for (int i = frontIndex; i <= rearIndex; i++) 
        printf("%d ", queueArray[i]); 
    printf("\n"); 
} 


int main() { 
    insertToQueue(66); 
    insertToQueue(77); 
    insertToQueue(55); 
    insertToQueue(23); 
    printQueue(); 

    deleteFromQueue(); 
    printQueue(); 

    insertToQueue(56);
    insertToQueue(67);  
    printQueue(); 

    return 0; 
}
