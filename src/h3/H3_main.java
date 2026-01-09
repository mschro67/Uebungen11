//by mschro67

package h3;

import java.util.Arrays;

public class H3_main{
    public static void main(String[] args){
        int[] x = {1,4,3,2};
        int[] y = {8,5,7,6};

        System.out.println(Arrays.toString(mergeSort(x,y)));
    }

    public static int[] mergeSort(int[] x,int[] y){
        int[] merged=new int[x.length+y.length];
        for (int a=0;a<x.length;a++){
            merged[a]=x[a];
        }
        for (int b=0;b<y.length;b++){
            merged[x.length+b]=y[b];
        }
        int[] sorted = new int[merged.length];
        for (int c=0;c<sorted.length;c++){

        }
        return merged;
    }
}