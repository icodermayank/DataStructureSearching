import java.util.Scanner;
// this is the simple program to demonstrate the liner search in java.
class LinearSearch{
    public static void main(String [] args){
        int arr [] = {12,4,6,8,9,1,13,4,0,7};

        Scanner s = new Scanner(System.in);
       System.out.println("Enter Key to found: ");
        int key = s.nextInt();

        // performing linear search
        for(int i =0; i<arr.length; i++){
            if(arr[i]== key){
                System.out.println("Element found at position: "+(i+1));
                return;
            }
        }
        System.out.println("Element not found.");
    }
}