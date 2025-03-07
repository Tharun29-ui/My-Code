#include <stdio.h>
#include <string.h>
#define MAX 100
char stack[MAX][100];
int top = -1;
void push_song(char song[]) {
    if (top == MAX - 1) {
        printf("Playlist is full!\n");} else {
        top++;
        strcpy(stack[top], song);
        printf("Added: %s\n", song);}}
void pop_to_next() {
    if (top == -1) {
        printf("No more songs to skip.\n");
    } else {
        printf("Skipping: %s\n", stack[top]);
        top--;
        if (top >= 0)
            printf("Now playing: %s\n", stack[top]);
        else
            printf("No more songs in the playlist.\n");}}
void peek_next() {
    if (top == -1) {
        printf("No songs in the playlist.\n");
    } else {
        printf("Now playing: %s\n", stack[top]);}}
int main() {
    int choice;
    char song[100];
    while (1) {
        printf("\nMusic Playlist\n");
        printf("1. Add song\n");
        printf("2. Play next\n");
        printf("3. Skip to next\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();
        switch (choice) {
            case 1:
                printf("Enter song name: ");
                fgets(song, sizeof(song), stdin);
                song[strcspn(song, "\n")] = '\0';
                push_song(song);
                break;
            case 2:
                peek_next();
                break;
            case 3:
                pop_to_next();
                break;
            case 4:
                printf("Exiting the App!\n");
                return 0;
            default:
                printf("Invalid choice, please try again\n");
        }
    }
}
