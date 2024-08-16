class binarySort{
    public static void main(String[] args) {
        int[] arr={1, 0, 1, 1, 0};
        int n=arr.length;
        int zeroes=0;
        for(int i: arr){
            if(i == 0)
                zeroes++;
        }
        int[] arr2= new int[n];
        for(int i=zeroes; i<n; i++){
            arr2[i]=1;
        }

        for(int i=0; i<n;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();
    }
}