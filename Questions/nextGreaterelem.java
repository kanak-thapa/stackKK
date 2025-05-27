import java.util.Stack;

public class nextGreaterelem {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] greatest = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            //1while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                greatest[i] = -1;
            }
            else{
                greatest[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i<greatest.length; i++){
            System.out.println(greatest[i]+" ");
        }
        System.out.println();
    }
}
