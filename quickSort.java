public class quickSort {

        public static void quickSort1(int[] arr, int low, int high){
            if(low<high){
                int pi = partition(arr, low, high);
                quickSort1(arr, low, pi-1);
                quickSort1(arr, pi+1, high);
            }
        }
        public static int partition(int[] arr, int low, int high){
            int pivot = arr[high];
            int i = low-1;
            for(int j=low; j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            int temp= arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;


            return i+1;
        }

    public static void main(String[] args) {
        int arr[] = {52, 61, 290, 101, 7, 92, 4};
        quickSort1(arr, 0, arr.length-1);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
