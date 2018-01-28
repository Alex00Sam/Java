package com.company;



public class Sort {
    public static void main(String[] args) {
        int b;
        int a[] ={7,2,6,2,9,4,1,46754,223,56345,57464,785,12,122};
        for (int i =1 ; i<a.length;i++){
            if (a[i-1]>a[i]) {
              b=a[i];
              a[i]=a[i-1];
              a[i-1] = b;
              i =0;
            }
        }
        for (int j = 0 ; j<a.length;j++) {
            System.out.print(a[j]+" ");
        }


    }
}
