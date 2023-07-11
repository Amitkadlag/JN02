//CPP program to demostrate the implementation of stack
#include <iostream>
#define size 10
using namespace std;
class stack
{
    int data[size];
    int top;
    public:
    stack()
    {
        top =-1;
    }
    void push(int element)
    {
        if (isFull()==1)
        cout<<"stack is full";
        
        data[++top]=element;
        
    }
    int pop()
    {
        if(isEmpty()==1)
        return -1;
        else
        return data[top--];
    }
    int isEmpty()
    {
        if(top==-1)
        return 1;
        else
        return 0;
    }
    int isFull()
    {
        if (top==size-1)
        return 1;
        else
        return 0;
    }
    int peek()
    {
         if(isEmpty()==1)
         return -1;
         else
        return data[top];
    }
};
int main()
{
  cout<<"static implementation of stack \n";
  stack st;
  st.push(10);
  st.push(20);
  cout<<"Stack is empty?\n"<<st.isEmpty();
  cout<<"\nElement is at top Position:"<<st.peek();
  cout<<"\nElement removed from stack:"<<st.pop();
  cout<<"\n Element removed from stack:"<<st.pop();
  return 0;
}

