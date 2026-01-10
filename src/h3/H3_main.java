//by mschro67

package h3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class H3_main{
    public static void main(String[] args){
        int[] x = {1,5,5,2};
        int[] y = {4,6,3,7};

        System.out.println("x:\t\t\t\t"+Arrays.toString(x)+"\ny:\t\t\t\t"+Arrays.toString(y)+"\nmergeSort(x,y): "+Arrays.toString(mergeSort(x,y)));
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
        for (int c=0;c<merged.length;c++){
            sorted[c]=Integer.valueOf(merged[c]);
        }
        Arrays.sort(sorted);

        int[] finished=new int[sorted.length];
        int minus=0;
        for (int d=0;d<finished.length;d++){
            finished[d]=Integer.MIN_VALUE;
        }
        for (int e=0;e<finished.length;e++){
            if (e==0){
                minus+=0;
            }else if (sorted[e-1] == sorted[e]){
                minus++;
            }
            finished[e-minus]=Integer.valueOf(sorted[e]);
        }
        int minValues=0;
        for (int f=0;f<finished.length;f++){
            if (finished[f]==Integer.MIN_VALUE){
                minValues++;
            }
        }

        int[] shorten=new int[finished.length-minValues];
        for (int g=0;g<shorten.length;g++){
            shorten[g]=finished[g];
        }
        return shorten;
    }
}