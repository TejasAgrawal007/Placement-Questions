#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void kLargestElement(int arr[], int size, int k){

    // Sort The element
    sort(arr, arr + size, greater<int>());

    for (int i = 0; i < k; i++)
        cout<<arr[i]<<" ";
    
}

int main(){
    int arr[] = { 1, 23, 12, 9, 30, 2, 50 };
    int size = sizeof(arr) / sizeof(arr[0]);
    int k = 3;
    kLargestElement(arr, size, k);

    return 0;
}