public class inser {
    public static void main(String[] args) {
        int arr[]= {1,6,5,7,11,22,34,45,67,4,3,};
        int n = arr.length;
        int i, j, key;
        for (i=1;i<n;i++){
        key = arr[i];
        j=i-1;
        while(j>=0  && arr[j]>key){
        arr[j+1]=arr[j];
        j=j-1;


        }
        arr[j+1] = key;
        }for(int A=0;A<n;A++);
        System.out.print(arr[A]+"  ");

    }
    
}