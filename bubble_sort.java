class bubblesort{
    public static void main(String[] args){
        int[] val={4,3,5,7,2,1};
        int n=val.length;
        int temp =0;
        boolean flag;
        for(int round=1; round<=n-1; round++){
            flag = false;
            for(int i=0;i<=n-round-1;i++){
                if(val[i] > val[i+1]){
                    temp=val[i];
                    val[i]=val[i+1];
                    val[i+1]=temp;
                    flag =true;
                }
                
            }
            if(flag == false)
            break;
        } 

        for(int i=0;i<n; i++){
            System.out.print(val[i]+" ");
        }
        System.out.println();
    }
}