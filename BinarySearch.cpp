//Program to demostrate the binar search
#include <iostream>
#include <algorithm>
using namespace std;
int binarySearch(int arr[], int left, int right, int key) {
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1;
}
int main() {
    int size;
    cout << "Enter The Number of element in Array ";
    cin >> size;
    int arr[size];
    cout << "Enter the elements of the array in sorted order: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + size); 
    int key;
    cout << "Enter the number to search: ";
    cin >> key;
    int index = binarySearch(arr, 0, size - 1, key);
    if (index != -1)
        cout << " found at index " << index << endl;
    else
        cout << " not found" << endl;
    return 0;
}
