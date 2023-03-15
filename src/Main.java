import java.util.Arrays;

public class Main {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double ans;
        int sum=0;
        int m=nums1.length;
        int n=nums2.length;
        int[] array1and2 = new int[m + n];
        System.arraycopy(nums1, 0, array1and2, 0, m);
        System.arraycopy(nums2, 0, array1and2, m, n);
        Arrays.sort(array1and2);
        if((m+n)%2==0){
            sum=(m+n)/2;


            ans=(double)(array1and2[sum]+array1and2[sum-1])/2;
        }else{
            sum=(m+n+1)/2;
            ans=array1and2[sum-1];
        }




        return ans;
    }
    public static void main(String[] args) {
        int [] c={1,4,2,7};
        int [] b={12,3,6,5};
        Main a=new Main();

        System.out.println(a.findMedianSortedArrays(c,b));


    }
}