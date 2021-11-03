package org.AlgoDaily.practise;

public class BinarySearch {
    public int binary(int[] a, int start, int end, int element){
        if(a.length == 0 )
            return -1;
        if(start>end||end<start)
            return -1;
        if(a.length==1)
            if(a[0]==element)
                return 0;
            else return -1;
        int mid=(start+end)/2;
        if(element==a[mid])
            return mid;
        else if(a[mid]>element)
            return binary(a,start,mid-1,element);
        else
            return binary(a,mid+1,end,element);
    }
}
