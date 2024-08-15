class countSort{
    public static void main(String[] args) {
        int[] val={4,3,1,3,1,1,2,2,4,4,3,1,2,2,5};
        int n=val.length;
        int max=val[0];

        for(int i=0;i<n;i++){
            if(max < val[i])
                max=val[i];
        }

        System.err.println(max);
        int[] arr = new int[max+1];
        int count =0;
        for(int i=0; i <n;i++){
            count =val[i];
            arr[count]++;
        }
        for(int i=0; i<max+1;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        
        int val1=0;
        for(int i=0;i<max+1;i++){
                val1=arr[i];
                while(val1 >0){
                    System.out.print(i+" ");
                    val1--;
                }
            }
            System.out.println();

            
        
    }
}