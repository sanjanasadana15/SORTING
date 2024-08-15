class InsertionSort{
    public static void main(String[] args) {
        int[] arr={2,5,7,4,3,1,9,8};
        int n=arr.length;
        int element =0;
        int j=0;

        for(int i=1; i<n; i++){
            element =arr[i];
            j=i-1;
            while(j>=0 && arr[j] > element){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]= element;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}