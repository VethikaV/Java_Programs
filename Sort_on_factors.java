class Sort_on_factors{
    public static void main(String [] args){

    }
    public int countfact(int n){
    int count =0;
    int sqrt =(int)Math.sqrt(n);
    for(int i=0;i<=sqrt;i++){
        if(n%i==0)
      count=count+2;
    }
    }
}