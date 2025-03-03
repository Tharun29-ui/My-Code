#include <stdio.h>
#include <stdlib.h>
struct harish
{
    int data;
    struct harish *next;
};
struct harish*head=NULL;
void insertend(int value)
{
    struct harish* newnode=(struct harish*)malloc(sizeof(struct harish));
    newnode->data=value;
    newnode->next=NULL;
    if(head==NULL)
    {
        printf("set is empty so newnode become head");
        head=newnode;
    }
    else
    {
     struct harish *temp=head;
     while(temp->next!=NULL)
     {
        temp=temp->next;
     }
     temp->next=head;
    }
}
void insertbeg(int value)
{
struct harish* newnode=(struct harish*)malloc(sizeof(struct harish));
newnode->data=value;
newnode->next=head;
head=newnode;
}
void insertpostion(int value,int position)
{
    struct harish *newnode=(struct harish*)malloc(sizeof(struct harish));
    if(pos==1)
    {
        newnode->next=head;
        head=newnode;
    }
    else
    {
       struct harish * temp=head;
        for( int i=1;temp->next!=NULL && i<pos-1;i++)
        {
              temp=temp->next;
        }
       if(temp==NULL)
       {
          printf("Invalid");
       }
       newnode->next=temp->next;
       temp->next=newnode;
    }
}
void deleteatatallpos(int value,int position)
{
    if(position==1)
    {
       head=head->next;
       free(head);
    }
struct harish * temp=head;
    for(int i=1;temp->next!=NULL &&i<position-1;i++)
    {
        temp=temp->next;
        struct harish*bhuvi=temp->next;
        temp->next=temp->next->next;
        free(bhuvi);
    }
}
void display()
{
    struct harish*temp=head;
   printf("linked list");
   while(temp!=NULL)
   {
    printf("%d->",temp->data);
    temp=temp->next;
   }
   printf("null\n");
}
int main()
{
    int choice, value, position;
while (1) {
printf("\nMENU:\n");
printf("1.insert beginning");
printf("2.insert end\n");
printf("3.insert at position\n");
printf("5.delete at any position\n");
printf("4.display\n");
printf("5.exit\n");
printf("enter your choice");
scanf("%d",&choice);
switch(1)
{
    case 1:
    printf("enter the value");
    scanf("%d",&value);
    insertbeg(value);
    break;
     case 2:
    printf("enter the value");
    scanf("%d",&value);
    insertend(value);
    break;
     case 3:
     printf("enter the position");
     scanf("%d",&position);
     printf("enter the value");
     scanf("%d",&value);
    insertposition(value,position);
    break;
    case 4:
     printf("enter the position");
     scanf("%d",&position);
     printf("enter the value");
     scanf("%d",&value);
     deleteatatallpos(value,position);
     case 5:
     display();
     break;
     case 6:
    printf("exiting\n");
    return 0;
    break;
    default:
    printf("invalid choice please try again");
   break;
}
}
}