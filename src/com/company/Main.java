package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int c = (int) Math.ceil(Math.sqrt(a.length));
        int [][] b = new int[c][c];
        int k = 0;
        for (int i = 0; i<c;i++){
            for (int j = 0; j<c;j++){
                if(k<a.length){
                    b[i][j] = a[k];
                }
                k++;
            }
        }

    }
}
