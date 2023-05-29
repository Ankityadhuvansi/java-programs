public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={-16,-3,1,2,3,5,34,55,67,88,99,100,1145,7785,456667};
        int target=-16;
        int ans=binearySearch(arr, target);
        System.out.println(ans);
    }
    static int binearySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+(start-end)/2;
            if (arr[mid]<target)
            {
                end=mid-1;
            }
            else if (arr[mid]>target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
