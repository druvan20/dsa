    #include<iostream>
    #include<string>
    using namespace std;
    
        int  main() {
        string a;
        getline(cin, a);  
        int left = 0;
        int right = a.length() - 1;
        int flag = 0;  
        while (left < right) {
        if (a[left] != a[right]) {
            flag = 1;break;    
        }left++; 
        right--; 
    }if (flag != 1) {
        cout << "PALINDROME" ;
    }else{
        cout << "NOT PALINDROME" ;
    }
    return 0;
}



