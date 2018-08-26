 static int findMissing(int arr[], int size)
    {
       // First separate positive and 
       // negative numbers
       int shift = segregate (arr, size);
       int arr2[] = new int[size-shift];
       int j=0;
       for(int i=shift;i<size;i++)
           {
               arr2[j] = arr[i];
               j++;
           }    
       // Shift the array and call 
       // findMissingPositive for
       // positive part
       return findMissingPositive(arr2, j);
    }
    // main function
    public static void main (String[] args) 
    {
        int arr[] = {0, 10, 2, -10, -20};
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is "+ 
                            missing);