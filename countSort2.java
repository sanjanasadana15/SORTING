// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {0,4,3,1,3,1,1,2,2,4,4,3,1,2,2,5};
        
        int n = arr.length, mx = arr[0];
        for(int i=0;i<n;i++)
            if(arr[i]>mx)
                mx = arr[i];
        
        int freq[] = new int[mx+1];
        for(int i=0;i<n;i++)
            freq[arr[i]]++;
            
        for(int i=0;i<=mx;i++){
            while(freq[i]-->0)
                System.out.print(i + " ");
        }
    }
}