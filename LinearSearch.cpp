//Program to demostrate the Linear search on user inputed array
#include <iostream>
using namespace std;

int linearSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i; 
        }
    }
    return -1;
}
int main() {
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }
    int key;
    cout << "Enter the key to search: ";
    cin >> key;
    int index = linearSearch(arr, size, key);
    if (index != -1) {
        cout << "Key found at index " << index << endl;
    } else {
        cout << "Key not found" << endl;
    }
    return 0;
}
