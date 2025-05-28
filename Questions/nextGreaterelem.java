import java.util.Stack;

public class nextGreaterelem {
    public static void maxArea(int[] arr){
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        //next smaller r
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                 nsr[i] = s.peek();
            }
            s.push(i);
        }
        //nsl
        s = new Stack<>();
        for(int i = 0;i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area width = j-i-1
        for(int i = 0; i<arr.length; i++){
            int height= arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area  in histogram= " +maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};//heights in histogram
        maxArea(arr);

        // int[] arr = {6, 8, 0, 1, 3};
        // int[] greatest = new int[arr.length];
        // Stack<Integer> s = new Stack<>();
        // for(int i = arr.length-1; i>=0; i--){
        //     //1while
        //     while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
        //         s.pop();
        //     }
        //     if(s.isEmpty()){
        //         greatest[i] = -1;
        //     }
        //     else{
        //         greatest[i] = arr[s.peek()];
        //     }
        //     s.push(i);
        // }
        // for(int i = 0; i<greatest.length; i++){
        //     System.out.println(greatest[i]+" ");
        // }
        // System.out.println();
    }
}
