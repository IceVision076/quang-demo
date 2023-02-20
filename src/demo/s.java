package demo;
import java.util.Scanner;

class BinarySearch  {
    int binarySearch(int a[], int x)
    {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x)
                return m;
            if (a[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]= new int[1000];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of array n =: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter array : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]=");
            a[i]= Integer.parseInt(sc.nextLine());
        }
        System.out.println("Element need to be found x =");
        int x = Integer.parseInt(sc.nextLine());
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(a,x);
        if (result > 0)

            System.out.println("Element found at "
                + "index " + result);
        else
            System.out.println("Element not present");
    }
}
