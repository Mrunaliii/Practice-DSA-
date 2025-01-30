class SecondLargestElement{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(sle(arr));
    }

    private static int sle(int[] arr){

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i :  arr){
            if(i>max){
                smax = max;
                max = i;
            }
            else if(i>smax && i!=max){
                smax = i;
            }
        }

        if(smax==Integer.MIN_VALUE)     return -1;

        return smax;
    }
}