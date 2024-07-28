public class mergesort {
    mergeSort(int[] a, int l, int r){
        if(l<r) {
            int mid=(l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }

    public static void main(String[] args) {

    }

}
