#include <iostream>
using namespace std;
class Node
{
    public:
    int data;
    
    Node *next;
    Node(int no)
    {
    data= no;
    next = NULL;
    }
};
class LinkedList
{
    Node *head;
    public:
    LinkedList()
    {
        head= NULL;
    }
    void create()
    {
        int no;
        Node *newnode, *t;
        std::cout<<"enter the number upto 999";
        std::cin>>no;
        while(no != 999)
        {
         newnode = new Node(no);
         if(head == NULL)
         head = newnode;
         else
         {
             t=head;
             while(t->next != NULL)
             
                 t=t->next;
         t->next= newnode;
    
         }
         std::cin>>no;
        }
    }
    void display()
    {
        Node *C = head;
        while(C!= NULL)
        {
            std::cout<<C-> data<<"->";
            C=C->next; 
        }
    }

};
int main()
{
    std::cout<<" singly list";
    LinkedList list;
    list.create();
    std::cout<<"\n list as follow:";
    list.display();
    return 0;
}
