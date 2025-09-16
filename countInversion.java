package dailyquestions;

public class countInversion {
    static int count = 0;
    public static void merge(int arr[], int si,int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<= mid && j <=ei){
            if(arr[i] <= arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
                count += mid - i + 1;
            } k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
       
        
    }
    public static void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1, r);
        
        merge(arr, l, mid, r);
    }
    public static int inversionCount(int arr[]) {
        // Code Here
        count = 0;
        mergeSort(arr,0,arr.length-1);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
}
