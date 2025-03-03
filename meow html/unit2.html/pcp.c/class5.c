#include <stdio.h>
int main(){
    int num,sub;
    scanf("%d %d",&num,&sub);
    int marks[num][sub];
   for(int i=0;i<num;i++){
   for(int j=0;j<sub;j++)
   {
    start:
    printf("enter the marks of student %d subject %d :",i+1,j+1);
    scanf("%d",&marks[i][j]);
    if(marks[i][j]<0 ||marks[i][j]>100)
    {
        printf("wrong marks.enter in range(0 and 100)");
        goto start;
    }
   }
}
int thershold;
int count =0;
meow:
printf("enter the thershold value");
scanf("%d",&thershold);
if(thershold>100 ||thershold <0){printf("not possible eneter in range(0 &100)");goto meow;}
for(int i=0;i<num;i++){
    for(int j=0;j<sub;j++)
    {
     if(marks[i][j]>thershold)
     {
        count++;
     }
    }
}
int target;
printf("enter the value you want to search");
scanf("%d",&target);
for(int i=0;i<num;i++){
    for(int j=0;j<sub;j++)
    {
     printf("the marks of student %d in subject %d is : %d\n",i+1,j+1,marks[i][j]);
    }
}
printf("how many marks greater than thershold :%d\n",count);
for(int i=0;i<num;i++){
    for(int j=0;j<sub;j++)
    {
     if(target==marks[i][j])
     {
        printf("the value is found in database\n");
        break;
      }
      else{
        printf("not found in database");
        break;
      }
    }
}
return 0;
}
