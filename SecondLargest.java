class SecondLargest {
    public static int getSecondLargest(int[] arr) {
    int firstlargest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    int n=arr.length;
    for(int i=0;i<n;i++){
       if(arr[i]>firstlargest){
           secondlargest=firstlargest;
           firstlargest=arr[i];
       }
           
       
          else if(arr[i]>secondlargest && arr[i]!=firstlargest){
               secondlargest=arr[i];
           
       }
       
        }
        if(secondlargest==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secondlargest;
        }
    }
    public static void main(string [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSecondLargest(arr));
    }
    }
