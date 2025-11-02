class LongestSubsequences {

    // Function to return length of longest subsequence of consecutive integers.
    public static  int longestConsecutive(int[] arr) {
        // code here
        int n=arr.length;
        int count=1;
        int max=1;
        Arrays.sort(arr);
        for(int i =n-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                // handling duplicates
                continue;
            }
            if(arr[i]-arr[i-1]==1){
                count++;
                
                if(count>max){
                    max=count;
                }
            }
            else{
                count=1;
            }
        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nexInt();
        int arr[] = new int [n];
        for(int i=;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestConsecutive(arr));

    }
}