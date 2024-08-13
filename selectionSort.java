class selectionsort{
    public static void main(String[] args){
        int[] val= {7,1,2,3,4,5};
        int n=val.length;
        int temp=0; 
        boolean flag =false;
        for(int round=0;round<=n-1;round++){
            flag=false;
            for(int i=round+1;i<=n-1;i++){
                    if(val[round] > val[i]){
                        temp=val[round];
                        val[round]=val[i];
                        val[i]=temp;
                        flag=true;
                    }
            }
            if(flag == false)
                break;
        }

        for(int i=0; i<n; i++){
            System.out.print(val[i]+" ");
        }
        System.out.println();
    }
}