public class StudentChallenge4 {
    public static void main(String[] args) {
        // Finding Second Largest Element
        int[] A = {12,2,3,4,11,6,7,8,9,10};
        int largest = A[0];
        int secondLargest = A[1];
        for (int i = 0; i <A.length ; i++) {
            if(A[i]>secondLargest){
                if (A[i]>=largest){
                    secondLargest = largest;
                    largest=A[i];
                }else{
                    secondLargest = A[i];
                }
            }
        }
        System.out.println("Largest element is: "+largest);
        System.out.println("Second Largest element is: "+secondLargest );
    }
}
