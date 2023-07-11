//CPP program to demostrate the implementation of static Queue
#include <iostream>
#define size 10
using namespace std;
class queue
{
    int data[size];
    int rear,front;
    public:
    queue()
    {
        front=rear =-1;
    }
    void insert (int element)
    {
        if (isFull()==1)
        cout<<"queue is full";
        else
        {
        data[++rear]=element;
        if(front==-1)
        front=0;
        
        }
    }
    int remove()
    {
        if(isEmpty()==1)
        return -1;
        else
        return data[front++];
    }
    int isEmpty()
    {
        if(rear==front==-1 || front>rear)
        {
            cout<<"queue is Empty";
        }
        return 1;
       
    }
    int isFull()
    {
        if (rear==size-1)
        return 1;
        else
        return 0;
    }
    int peek()
    {
         if(isEmpty()==1)
         return -1;
         else
        return data[front];
    }
};
int main()
{
  cout<<"static implementation of queue \n";
  queue q;
  q.insert(10);
   q.insert(20);
    q.insert(20);
  cout<<"Queue is empty?\n"<<q.isEmpty();
  cout<<"\nElement is at front Position:"<<q.peek();
  cout<<"\nElement removed from queue:"<<q.remove();
  cout<<"\n Element removed from queue:"<<q.remove();
  return 0;
}

